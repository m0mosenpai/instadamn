package com.facebook.fbreact.specs;

import X.R3M;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes10.dex */
public abstract class NativeIGPostInsightsReactModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGPostInsightsReactModule";

    @ReactMethod
    public abstract void didFinishLoading(double d);

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    @ReactMethod
    public abstract void toggleNavigationBar(double d, boolean z);

    public NativeIGPostInsightsReactModuleSpec(R3M r3m) {
        super(r3m);
    }
}
