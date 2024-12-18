package com.instagram.profile.fragment;

/* loaded from: classes3.dex */
public final class UserDetailTabControllerLifecycleUtil {
    public static void cleanupReferences(UserDetailTabController userDetailTabController) {
        userDetailTabController.mViewHolder = null;
        userDetailTabController.mOverFlowFollowButton = null;
        userDetailTabController.mUpsellFollowButtonView = null;
        userDetailTabController.mPVFollowSecondaryCTAView = null;
        userDetailTabController.mUserDetailEmptyStateController = null;
        userDetailTabController.mOpalSwitchIndicatorHelper = null;
    }
}
