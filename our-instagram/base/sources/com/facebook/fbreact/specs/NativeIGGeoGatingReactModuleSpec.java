package com.facebook.fbreact.specs;

import X.R3M;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes10.dex */
public abstract class NativeIGGeoGatingReactModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGGeoGatingReactModule";

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    @ReactMethod
    public abstract void setupNativeModule();

    @ReactMethod
    public abstract void updateGeoGatingSettings(boolean z, ReadableArray readableArray, String str);

    public NativeIGGeoGatingReactModuleSpec(R3M r3m) {
        super(r3m);
    }
}
