package com.lmteixeira.budgetmanager.dao;

import com.lmteixeira.budgetmanager.model.Profile;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lteixeira on 30/12/16.
 */

public class ProfileRepository implements Repository<Profile>{

    private List<Profile> list;

    public ProfileRepository() {
        list = new ArrayList<>();
    }

    @Override
    public void addElement(Profile profile) {
        list.add(profile);
    }

    @Override
    public List<Profile> getElements() {
        return list;
    }
}
