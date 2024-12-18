package com.instagram.debug.devoptions.plugins;

import X.AbstractC33235ElU;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes9.dex */
public interface DeveloperOptionsPlugin {

    /* loaded from: classes9.dex */
    public interface OnPinnedDevOptionInteraction {
        void onPinnedDevOptionRemoved();

        void onPinnedDevOptionSelected();
    }

    Fragment getDeveloperOptionsFragment();

    Fragment getDirectInboxExperimentSwitcherToolFragment();

    Fragment getGraphQLConsistencyFragment();

    Fragment getHomeDeliveryDebugTool();

    Fragment getInjectedMediaToolFragment();

    List getPinnedDevOptions(UserSession userSession, AbstractC33235ElU abstractC33235ElU, OnPinnedDevOptionInteraction onPinnedDevOptionInteraction);

    Fragment getStoriesExperimentSwitcherToolFragment();

    void removePinnedItemInPrefs(String str);
}
