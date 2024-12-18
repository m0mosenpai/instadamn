package com.facebook.fbreact.specs;

import X.R3M;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes10.dex */
public abstract class NativeExceptionsManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "ExceptionsManager";

    @ReactMethod
    public void dismissRedbox() {
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ExceptionsManager";
    }

    @ReactMethod
    public void reportException(ReadableMap readableMap) {
    }

    @ReactMethod
    public abstract void reportFatalException(String str, ReadableArray readableArray, double d);

    @ReactMethod
    public abstract void reportSoftException(String str, ReadableArray readableArray, double d);

    @ReactMethod
    public abstract void updateExceptionMessage(String str, ReadableArray readableArray, double d);

    public NativeExceptionsManagerSpec(R3M r3m) {
        super(r3m);
    }
}
