package com.budget.model;

import jakarta.persistence.*;

@Entity
@Table(name="TBL_EXPENSE")
public class Expense {
    private Long id;
    private String userid;
    private int food_expense;
    private int school_expense;
    private int gas;
    private int misc_expense;
    public String current_month;
    public int parent_contr;
    public int salary_monthly;
    public int total_income;
    public int total_expense;
    public String budget_status;

    public int getParent_contr() {
        return parent_contr;
    }

    public void setParent_contr(int parent_contr) {
        this.parent_contr = parent_contr;
    }

    public int getSalary_monthly() {
        return salary_monthly;
    }

    public void setSalary_monthly(int salary_monthly) {
        this.salary_monthly = salary_monthly;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public int getFood_expense() {
        return food_expense;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "id=" + id +
                ", userid='" + userid + '\'' +
                ", food_expense=" + food_expense +
                ", school_expense=" + school_expense +
                ", gas=" + gas +
                ", misc_expense=" + misc_expense +
                ", current_month='" + current_month + '\'' +
                ", parent_contr=" + parent_contr +
                ", salary_monthly=" + salary_monthly +
                '}';
    }

    public void setFood_expense(int food_expense) {
        this.food_expense = food_expense;
    }

    public int getSchool_expense() {
        return school_expense;
    }

    public void setSchool_expense(int school_expense) {
        this.school_expense = school_expense;
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public int getMisc_expense() {
        return misc_expense;
    }

    public void setMisc_expense(int misc_expense) {
        this.misc_expense = misc_expense;
    }

    public String getCurrent_month() {
        return current_month;
    }

    public void setCurrent_month(String current_month) {
        this.current_month = current_month;
    }

    public int getTotal_income() {
        return total_income;
    }

    public void setTotal_income(int total_income) {
        this.total_income = total_income;
    }

    public int getTotal_expense() {
        return total_expense;
    }

    public void setTotal_expense(int total_expense) {
        this.total_expense = total_expense;
    }

    public String getBudget_status() {
        return budget_status;
    }

    public void setBudget_status(String budget_status) {
        this.budget_status = budget_status;
    }
}
