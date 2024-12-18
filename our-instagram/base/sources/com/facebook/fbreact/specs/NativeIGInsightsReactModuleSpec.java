package com.facebook.fbreact.specs;

import X.C00O;
import X.R3M;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes10.dex */
public abstract class NativeIGInsightsReactModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGInsightsReactModule";

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    @ReactMethod
    public abstract void navigateToCreatePromotion();

    @ReactMethod
    public abstract void navigateToSeeMorePromotions();

    @ReactMethod
    public abstract void navigateToSingleFeedView(String str);

    @ReactMethod
    public abstract void navigateToStoriesCamera();

    @ReactMethod
    public abstract void navigateToTopPostsCamera();

    @ReactMethod
    public abstract void onFilterChangedInsightsAccountGrowth(double d, double d2);

    @ReactMethod
    public abstract void showInsightsFilterView(String str, String str2, String str3, String str4, String str5);

    public NativeIGInsightsReactModuleSpec(R3M r3m) {
        throw C00O.createAndThrow();
    }
}
