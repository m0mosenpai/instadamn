package instagram.features.devoptions.plugins;

import X.AbstractC167027dH;
import X.AbstractC33235ElU;
import X.C14360o3;
import X.N5R;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.helper.DevOptionsHelper;
import com.instagram.debug.devoptions.plugins.DeveloperOptionsPlugin;
import com.instagram.debug.devoptions.release.DeveloperOptionsFragment;
import com.instagram.debug.devoptions.release.DirectInboxExperimentSwitcherToolFragment;
import com.instagram.debug.devoptions.release.HomeDeliveryDebugToolFragment;
import com.instagram.debug.devoptions.release.PinnedDeveloperOptionsUtil;
import com.instagram.debug.devoptions.release.StoriesExperimentSwitcherToolFragment;
import com.instagram.debug.devoptions.section.localinjection.InjectMediaToolFragment;
import java.util.List;

/* loaded from: classes10.dex */
public final class DeveloperOptionsPluginImpl {
    public static final DeveloperOptionsPluginImpl INSTANCE = new Object();

    public final void removePinnedItemInPrefs(String str) {
        C14360o3.A0B(str, 0);
        DevOptionsHelper.Companion.removePinnedItemInPrefs(str);
    }

    public final Fragment getDeveloperOptionsFragment() {
        return new DeveloperOptionsFragment();
    }

    public final Fragment getDirectInboxExperimentSwitcherToolFragment() {
        return new DirectInboxExperimentSwitcherToolFragment();
    }

    public final Fragment getGraphQLConsistencyFragment() {
        return new N5R();
    }

    public final Fragment getHomeDeliveryDebugTool() {
        return new HomeDeliveryDebugToolFragment();
    }

    public final Fragment getInjectedMediaToolFragment() {
        return new InjectMediaToolFragment();
    }

    public final Fragment getStoriesExperimentSwitcherToolFragment() {
        return new StoriesExperimentSwitcherToolFragment();
    }

    public final List getPinnedDevOptions(UserSession userSession, AbstractC33235ElU abstractC33235ElU, DeveloperOptionsPlugin.OnPinnedDevOptionInteraction onPinnedDevOptionInteraction) {
        AbstractC167027dH.A12(userSession, abstractC33235ElU, onPinnedDevOptionInteraction);
        return PinnedDeveloperOptionsUtil.getPinnedDevOptions(userSession, abstractC33235ElU, onPinnedDevOptionInteraction);
    }
}
