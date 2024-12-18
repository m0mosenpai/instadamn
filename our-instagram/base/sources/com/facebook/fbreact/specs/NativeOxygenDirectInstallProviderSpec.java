package com.facebook.fbreact.specs;

import X.C00O;
import X.R3M;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes10.dex */
public abstract class NativeOxygenDirectInstallProviderSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "OxygenDirectInstallProvider";

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    @ReactMethod
    public abstract void install(String str, double d, Callback callback, Callback callback2);

    public NativeOxygenDirectInstallProviderSpec(R3M r3m) {
        throw C00O.createAndThrow();
    }
}
