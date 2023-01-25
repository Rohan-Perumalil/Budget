package com.budget;

import com.budget.model.Expense;
import com.budget.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    public List<Expense> findAllByUserid(String userid);
}
