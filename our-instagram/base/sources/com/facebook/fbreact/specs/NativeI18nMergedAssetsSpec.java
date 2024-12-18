package com.facebook.fbreact.specs;

import X.C00O;
import X.R3M;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes10.dex */
public abstract class NativeI18nMergedAssetsSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "I18nMergedAssets";

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getString(double d);

    public NativeI18nMergedAssetsSpec(R3M r3m) {
        throw C00O.createAndThrow();
    }
}
