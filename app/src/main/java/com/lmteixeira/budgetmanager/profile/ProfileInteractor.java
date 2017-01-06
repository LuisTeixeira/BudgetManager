package com.lmteixeira.budgetmanager.profile;

import com.lmteixeira.budgetmanager.model.Profile;

import java.util.List;

/**
 * Created by lteixeira on 31/12/16.
 */

public interface ProfileInteractor {

    interface OnFinishedListener {
        void profilesLoaded(List<Profile> profiles);

        void profileAdded();
    }

    void getProfiles(OnFinishedListener listener);

    void addProfile(OnFinishedListener listener);
}
