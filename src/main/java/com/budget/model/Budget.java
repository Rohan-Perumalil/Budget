package com.budget.model;

public class Budget {
    private int total_income;
    private int total_expense;
    private int budget_amt;

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

    public int getBudget_amt() {
        return budget_amt;
    }

    public void setBudget_amt(int budget_amt) {
        this.budget_amt = budget_amt;
    }
}
