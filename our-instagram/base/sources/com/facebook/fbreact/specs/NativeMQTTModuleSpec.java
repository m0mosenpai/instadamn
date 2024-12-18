package com.facebook.fbreact.specs;

import X.C00O;
import X.R3M;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes10.dex */
public abstract class NativeMQTTModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "MQTTModule";

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    @ReactMethod
    public abstract void subscribe(String str, String str2);

    @ReactMethod
    public abstract void unsubscribe(String str);

    public NativeMQTTModuleSpec(R3M r3m) {
        throw C00O.createAndThrow();
    }
}
