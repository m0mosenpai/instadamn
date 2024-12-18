package com.instagram.archive.fragment;

/* loaded from: classes11.dex */
public final class ArchiveReelMapFragmentLifecycleUtil {
    public static void cleanupReferences(ArchiveReelMapFragment archiveReelMapFragment) {
        archiveReelMapFragment.mMapView = null;
        archiveReelMapFragment.mFacebookMap = null;
        archiveReelMapFragment.mLoadingPillController = null;
        archiveReelMapFragment.mMapPrivacyMessageController = null;
        archiveReelMapFragment.mClusterOverlay = null;
    }
}
