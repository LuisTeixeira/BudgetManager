package com.lmteixeira.budgetmanager.dao;

import com.lmteixeira.budgetmanager.model.Category;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lteixeira on 30/12/16.
 */

public class CategoryRepository implements Repository<Category>{

    private List<Category> list;

    public CategoryRepository() {
        list = new ArrayList<>();
    }

    @Override
    public void addElement(Category element) {
        list.add(element);
    }

    @Override
    public List<Category> getElements() {
        return list;
    }
}
