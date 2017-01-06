package com.lmteixeira.budgetmanager.expense;

import com.lmteixeira.budgetmanager.model.Expense;
import com.lmteixeira.budgetmanager.profile.ProfileInteractor;

import java.util.List;

/**
 * Created by lteixeira on 06.01.17.
 */

public interface ExpenseInteractor {

    interface OnFinishedListner {

        void expensesLoaded(List<Expense> expenses);

        void expenseAdded();
    }

    void getExpenses(OnFinishedListner listner);

    void addExpense(OnFinishedListner listner);
}
