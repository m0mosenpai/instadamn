package com.instagram.debug.devoptions.plugins;

import X.AbstractC33235ElU;
import X.N5R;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.plugins.DeveloperOptionsPlugin;
import com.instagram.debug.devoptions.section.localinjection.InjectMediaToolFragment;
import instagram.features.devoptions.plugins.DeveloperOptionsPluginImpl;
import java.util.List;

/* loaded from: classes10.dex */
public class DeveloperOptionsPluginStatic {
    public static Fragment getDeveloperOptionsFragment() {
        return DeveloperOptionsPluginImpl.INSTANCE.getDeveloperOptionsFragment();
    }

    public static Fragment getDirectInboxExperimentSwitcherToolFragment() {
        return DeveloperOptionsPluginImpl.INSTANCE.getDirectInboxExperimentSwitcherToolFragment();
    }

    public static Fragment getGraphQLConsistencyFragment() {
        return new N5R();
    }

    public static Fragment getHomeDeliveryDebugTool() {
        return DeveloperOptionsPluginImpl.INSTANCE.getHomeDeliveryDebugTool();
    }

    public static Fragment getInjectedMediaToolFragment() {
        return new InjectMediaToolFragment();
    }

    public static List getPinnedDevOptions(UserSession userSession, AbstractC33235ElU abstractC33235ElU, DeveloperOptionsPlugin.OnPinnedDevOptionInteraction onPinnedDevOptionInteraction) {
        return DeveloperOptionsPluginImpl.INSTANCE.getPinnedDevOptions(userSession, abstractC33235ElU, onPinnedDevOptionInteraction);
    }

    public static Fragment getStoriesExperimentSwitcherToolFragment() {
        return DeveloperOptionsPluginImpl.INSTANCE.getStoriesExperimentSwitcherToolFragment();
    }

    public static void removePinnedItemInPrefs(String str) {
        DeveloperOptionsPluginImpl.INSTANCE.removePinnedItemInPrefs(str);
    }
}
