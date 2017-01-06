package com.lmteixeira.budgetmanager.category;

import com.lmteixeira.budgetmanager.model.Category;

import java.util.List;

/**
 * Created by lteixeira on 06.01.17.
 */

public interface CategoryInteractor {

    interface OnFinishedListener {

        void categoriesLoaded(List<Category> categories);

        void categoryAdded();
    }

    void getCategories(OnFinishedListener listener);

    void addCategory(OnFinishedListener listener);
}
