package com.lmteixeira.budgetmanager.dao;

import com.lmteixeira.budgetmanager.model.Expense;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lteixeira on 30/12/16.
 */

public class ExpenseRepository implements Repository<Expense> {

    private List<Expense> list;

    public ExpenseRepository(){
        list = new ArrayList<>();
    }

    @Override
    public void addElement(Expense element) {
        list.add(element);
    }

    @Override
    public List<Expense> getElements() {
        return list;
    }
}
