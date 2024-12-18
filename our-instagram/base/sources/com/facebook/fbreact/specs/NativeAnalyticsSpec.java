package com.facebook.fbreact.specs;

import X.R3M;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes10.dex */
public abstract class NativeAnalyticsSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "Analytics";

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    @ReactMethod
    public abstract void logCounter(String str, double d);

    @ReactMethod
    public abstract void logEvent(String str, ReadableMap readableMap, String str2);

    @ReactMethod
    public abstract void logRealtimeEvent(String str, ReadableMap readableMap, String str2);

    public NativeAnalyticsSpec(R3M r3m) {
        super(r3m);
    }
}
