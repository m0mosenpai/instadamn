package com.facebook.fbreact.specs;

import X.C00O;
import X.R3M;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes10.dex */
public abstract class NativeIGInsightsStoryPresenterReactModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGInsightsStoryPresenterReactModule";

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    @ReactMethod
    public abstract void openStoryViewerForMediaIDs(ReadableArray readableArray, String str, double d, String str2);

    public NativeIGInsightsStoryPresenterReactModuleSpec(R3M r3m) {
        throw C00O.createAndThrow();
    }
}
