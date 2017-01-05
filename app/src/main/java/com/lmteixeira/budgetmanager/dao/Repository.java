package com.lmteixeira.budgetmanager.dao;

import java.util.List;

/**
 * Created by lteixeira on 30/12/16.
 */

public interface Repository<T> {

    void addElement(T element);

    List<T> getElements();
}
