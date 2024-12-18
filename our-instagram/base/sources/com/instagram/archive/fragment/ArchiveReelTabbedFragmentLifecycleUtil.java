package com.instagram.archive.fragment;

/* loaded from: classes9.dex */
public final class ArchiveReelTabbedFragmentLifecycleUtil {
    public static void cleanupReferences(ArchiveReelTabbedFragment archiveReelTabbedFragment) {
        archiveReelTabbedFragment.mTabController = null;
        archiveReelTabbedFragment.mTabBar = null;
        archiveReelTabbedFragment.mViewPager = null;
    }
}
