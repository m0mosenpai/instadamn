package com.instagram.business.fragment;

/* loaded from: classes6.dex */
public final class SuggestBusinessFragmentLifecycleUtil {
    public static void cleanupReferences(SuggestBusinessFragment suggestBusinessFragment) {
        suggestBusinessFragment.mBusinessNavBar = null;
        suggestBusinessFragment.mBusinessNavBarHelper = null;
        suggestBusinessFragment.mStepperHeader = null;
        suggestBusinessFragment.mRecyclerView = null;
        suggestBusinessFragment.mLoadingSpinner = null;
        suggestBusinessFragment.mActionBarService = null;
    }
}
