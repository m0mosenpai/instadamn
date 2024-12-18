package com.facebook.fbreact.specs;

import X.C00O;
import X.R3M;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes10.dex */
public abstract class NativeI18nAssetsSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "I18nAssets";

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getAssetContent(String str);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract double getDictionarySize();

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getString(String str);

    @ReactMethod
    public abstract void invalidateCaches();

    @ReactMethod
    public abstract void resetDictionary();

    public NativeI18nAssetsSpec(R3M r3m) {
        throw C00O.createAndThrow();
    }
}
