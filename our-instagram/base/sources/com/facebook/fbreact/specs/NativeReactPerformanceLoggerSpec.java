package com.facebook.fbreact.specs;

import X.R3M;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes10.dex */
public abstract class NativeReactPerformanceLoggerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "ReactPerformanceLogger";

    @ReactMethod
    public void finish(String str) {
    }

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    @ReactMethod
    public abstract void logEvents(ReadableMap readableMap);

    public NativeReactPerformanceLoggerSpec(R3M r3m) {
        super(r3m);
    }
}
