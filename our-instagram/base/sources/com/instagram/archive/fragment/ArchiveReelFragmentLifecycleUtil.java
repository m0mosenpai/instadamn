package com.instagram.archive.fragment;

/* loaded from: classes9.dex */
public final class ArchiveReelFragmentLifecycleUtil {
    public static void cleanupReferences(ArchiveReelFragment archiveReelFragment) {
        archiveReelFragment.mFastScrollStubHolder = null;
        archiveReelFragment.mEmptyStateView = null;
        archiveReelFragment.mContextualNavigationAnimationTargetView = null;
        archiveReelFragment.mViewPortObserver = null;
        archiveReelFragment.mDropFrameWatcher = null;
    }
}
