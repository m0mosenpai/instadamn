package com.facebook.fbreact.specs;

import X.R3M;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes10.dex */
public abstract class NativeIGBloksNavigationReactModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGBloksNavigationReactModule";

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    @ReactMethod
    public abstract void navigate(double d, String str, String str2, ReadableMap readableMap);

    @ReactMethod
    public abstract void runAction(double d, String str, ReadableMap readableMap);

    public NativeIGBloksNavigationReactModuleSpec(R3M r3m) {
        super(r3m);
    }
}
