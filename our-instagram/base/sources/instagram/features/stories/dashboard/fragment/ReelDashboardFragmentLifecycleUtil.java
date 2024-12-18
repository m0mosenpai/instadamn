package instagram.features.stories.dashboard.fragment;

/* loaded from: classes7.dex */
public final class ReelDashboardFragmentLifecycleUtil {
    public static void cleanupReferences(ReelDashboardFragment reelDashboardFragment) {
        reelDashboardFragment.mContainer = null;
        reelDashboardFragment.mEmptyView = null;
        reelDashboardFragment.mImageViewPager = null;
        reelDashboardFragment.mListViewPager = null;
        reelDashboardFragment.mScrollOwner = null;
        reelDashboardFragment.mPagerAdapter = null;
        reelDashboardFragment.mListAdapter = null;
    }
}
