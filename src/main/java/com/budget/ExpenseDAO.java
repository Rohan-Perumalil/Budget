package com.budget;

import com.budget.model.Expense;
import com.budget.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseDAO {
    @Autowired
    ExpenseRepository expenseRepository;

      public void save(Expense expense){
        expenseRepository.save(expense);
    }

    public List<Expense> findAllByUserid(String  userid){

       return  expenseRepository.findAllByUserid( userid);
    }







}
