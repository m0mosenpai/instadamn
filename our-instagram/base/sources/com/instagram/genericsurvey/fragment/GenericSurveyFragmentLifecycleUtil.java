package com.instagram.genericsurvey.fragment;

/* loaded from: classes7.dex */
public final class GenericSurveyFragmentLifecycleUtil {
    public static void cleanupReferences(GenericSurveyFragment genericSurveyFragment) {
        genericSurveyFragment.endScreenViewStub = null;
        genericSurveyFragment.endScreen = null;
        genericSurveyFragment.contentContainer = null;
        genericSurveyFragment.retryViewStub = null;
        genericSurveyFragment.retryView = null;
        genericSurveyFragment.loadingSpinner = null;
        genericSurveyFragment.navbarController = null;
    }
}
