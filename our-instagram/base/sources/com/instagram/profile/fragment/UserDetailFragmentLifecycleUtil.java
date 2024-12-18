package com.instagram.profile.fragment;

/* loaded from: classes6.dex */
public final class UserDetailFragmentLifecycleUtil {
    public static void cleanupReferences(UserDetailFragment userDetailFragment) {
        userDetailFragment.mTopAccountInsightsDialog = null;
        userDetailFragment.mWelcomeToBusinessDialog = null;
        userDetailFragment.mRemoveFollowerDialog = null;
        userDetailFragment.mRequestFollowDialog = null;
    }
}
