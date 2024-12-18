package com.instagram.archive.fragment;

/* loaded from: classes9.dex */
public final class ArchiveReelPeopleFragmentLifecycleUtil {
    public static void cleanupReferences(ArchiveReelPeopleFragment archiveReelPeopleFragment) {
        archiveReelPeopleFragment.mLoadingSpinner = null;
        archiveReelPeopleFragment.mRecyclerView = null;
        archiveReelPeopleFragment.mLayoutManager = null;
    }
}
