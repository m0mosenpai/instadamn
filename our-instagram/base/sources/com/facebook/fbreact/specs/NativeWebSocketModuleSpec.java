package com.facebook.fbreact.specs;

import X.C00O;
import X.R3M;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes10.dex */
public abstract class NativeWebSocketModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "WebSocketModule";

    @ReactMethod
    public abstract void addListener(String str);

    @ReactMethod
    public abstract void close(double d, String str, double d2);

    @ReactMethod
    public abstract void connect(String str, ReadableArray readableArray, ReadableMap readableMap, double d);

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    @ReactMethod
    public abstract void ping(double d);

    @ReactMethod
    public abstract void removeListeners(double d);

    @ReactMethod
    public abstract void send(String str, double d);

    @ReactMethod
    public abstract void sendBinary(String str, double d);

    public NativeWebSocketModuleSpec(R3M r3m) {
        throw C00O.createAndThrow();
    }
}
