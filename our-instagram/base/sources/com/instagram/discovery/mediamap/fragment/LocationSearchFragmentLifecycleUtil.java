package com.instagram.discovery.mediamap.fragment;

/* loaded from: classes11.dex */
public final class LocationSearchFragmentLifecycleUtil {
    public static void cleanupReferences(LocationSearchFragment locationSearchFragment) {
        locationSearchFragment.mContainer = null;
        locationSearchFragment.mSearchLayoutManager = null;
        locationSearchFragment.mSearchBarController = null;
        locationSearchFragment.mSearchEditText = null;
        locationSearchFragment.mSearchFieldSeparator = null;
        locationSearchFragment.mSearchCancelButton = null;
        locationSearchFragment.mRecyclerView = null;
        locationSearchFragment.mRefinementsController = null;
        locationSearchFragment.mShowHideKeyboardDebouncer = null;
    }
}
