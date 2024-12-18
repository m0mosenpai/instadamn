package com.facebook.fbreact.specs;

import X.C00O;
import X.R3M;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class NativeBlobModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "BlobModule";

    @ReactMethod
    public abstract void addNetworkingHandler();

    @ReactMethod
    public abstract void addWebSocketHandler(double d);

    @ReactMethod
    public abstract void createFromParts(ReadableArray readableArray, String str);

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    public abstract Map getTypedExportedConstants();

    @ReactMethod
    public abstract void release(String str);

    @ReactMethod
    public abstract void removeWebSocketHandler(double d);

    @ReactMethod
    public abstract void sendOverSocket(ReadableMap readableMap, double d);

    public NativeBlobModuleSpec(R3M r3m) {
        throw C00O.createAndThrow();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public final Map getConstants() {
        throw C00O.createAndThrow();
    }
}
