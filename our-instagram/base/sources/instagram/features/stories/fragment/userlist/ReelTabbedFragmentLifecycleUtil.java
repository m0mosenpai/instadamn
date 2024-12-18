package instagram.features.stories.fragment.userlist;

/* loaded from: classes7.dex */
public final class ReelTabbedFragmentLifecycleUtil {
    public static void cleanupReferences(ReelTabbedFragment reelTabbedFragment) {
        reelTabbedFragment.mTabController = null;
        reelTabbedFragment.mTabBar = null;
        reelTabbedFragment.mViewPager = null;
    }
}
