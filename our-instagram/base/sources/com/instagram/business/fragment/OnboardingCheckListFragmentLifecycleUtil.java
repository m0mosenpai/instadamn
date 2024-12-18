package com.instagram.business.fragment;

/* loaded from: classes6.dex */
public final class OnboardingCheckListFragmentLifecycleUtil {
    public static void cleanupReferences(OnboardingCheckListFragment onboardingCheckListFragment) {
        onboardingCheckListFragment.mRecyclerView = null;
        onboardingCheckListFragment.mStepsCompletedTextView = null;
        onboardingCheckListFragment.mProgressBar = null;
        onboardingCheckListFragment.mLayoutContent = null;
        onboardingCheckListFragment.mConfettiView = null;
        onboardingCheckListFragment.mHeadline = null;
        onboardingCheckListFragment.mBusinessNavBar = null;
        onboardingCheckListFragment.mSkipOcButton = null;
        onboardingCheckListFragment.mSkipOcContainer = null;
    }
}
