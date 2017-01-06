package com.lmteixeira.budgetmanager.profile;

import java.util.List;

/**
 * Created by lteixeira on 31/12/16.
 */

public interface ProfileInteractor {

    interface OnFinishedListenet {
        void profilesLoaded(List<String> profiles);
    }

    void getProfiles();

    
}
