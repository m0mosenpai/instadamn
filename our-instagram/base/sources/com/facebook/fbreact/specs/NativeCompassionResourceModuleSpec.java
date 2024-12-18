package com.facebook.fbreact.specs;

import X.R3M;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes10.dex */
public abstract class NativeCompassionResourceModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "CompassionResourceModule";

    @ReactMethod
    public abstract void closeCompassionResource(double d);

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    public NativeCompassionResourceModuleSpec(R3M r3m) {
        super(r3m);
    }
}
