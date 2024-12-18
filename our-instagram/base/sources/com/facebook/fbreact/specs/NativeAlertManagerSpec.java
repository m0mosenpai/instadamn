package com.facebook.fbreact.specs;

import X.C00O;
import X.R3M;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes10.dex */
public abstract class NativeAlertManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "AlertManager";

    @ReactMethod
    public abstract void alertWithArgs(ReadableMap readableMap, Callback callback);

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    public NativeAlertManagerSpec(R3M r3m) {
        throw C00O.createAndThrow();
    }
}
