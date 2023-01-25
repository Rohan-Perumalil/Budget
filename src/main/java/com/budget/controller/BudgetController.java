package com.budget.controller;

import com.budget.ExpenseDAO;
import com.budget.UserDAO;
import com.budget.model.Budget;
import com.budget.model.Expense;
import com.budget.model.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.net.http.HttpRequest;
import java.util.List;

@Controller
public class BudgetController {
    @Autowired
    UserDAO userDAO;
    @Autowired
    ExpenseDAO expenseDAO;

    @GetMapping("/")
    public String index() {

        return "index";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/newuser")
    public String newUser() {
        return "newuser";
    }
    @GetMapping("/expense")
    public String expense(@ModelAttribute Expense expense, HttpServletRequest httpRequest) {

        return "expense";
    }
    @GetMapping("/allbudget")
    public String allexpense(Model model) {
       List<Expense> expenses = expenseDAO.findAllByUserid("rohanp@gmail.com");
        model.addAttribute("expenses", expenses);
        return "allBudgets";
    }


    @PostMapping("/expensesave")
    public String expenseSubmit(@ModelAttribute Expense expense, Model model){
         expense = calculateExpense(expense);
         model.addAttribute(expense);
        model.addAttribute("total_expense",expense.getTotal_expense());
        model.addAttribute("misc_expense",expense.getMisc_expense());
        model.addAttribute("food_expense",expense.getFood_expense());
        model.addAttribute("gas",expense.getGas());
        model.addAttribute("school_expense",expense.getSchool_expense());
        model.addAttribute("userid",expense.getUserid());
        model.addAttribute("school_expense",expense.getSchool_expense());
        model.addAttribute("salary_monthly",expense.getSalary_monthly());
        model.addAttribute("parent_contr",expense.getParent_contr());
        model.addAttribute("total_income",expense.getTotal_income());
        model.addAttribute("budget_status",expense.getBudget_status());
        model.addAttribute("current_month",expense.getCurrent_month());
        return "afterExpense";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute User user) {
        System.out.println(user);
        userDAO.save(user);
        return "newuser";
    }
    @PostMapping("/loginsubmit")
    public String loginSubmit(@ModelAttribute User user, Model model) {
        System.out.println(user);
        User userFromdb = userDAO.findByUserId(user);
        if(userFromdb.getUserid().equalsIgnoreCase(user.getUserid() )&&
                userFromdb.getPswd().equalsIgnoreCase(user.getPswd() )){
            model.addAttribute("userid",userFromdb.getUserid());
            return "/expense";

        }
        return "/login";
    }




    private Expense  calculateExpense(Expense expense){
       int total = expense.getFood_expense()+expense.getSchool_expense()+expense.getMisc_expense()+expense.getGas();
       expense.setTotal_expense(total);
       expense.setTotal_income(expense.getParent_contr()+expense.getSalary_monthly());
       if(total > (expense.getParent_contr()+expense.getSalary_monthly())){
           expense.setBudget_status("OVER BUDGET");
       }else{
           expense.setBudget_status("UNDER BUDGET");
       }
       expenseDAO.save(expense);
      return  expense;
    }

}
