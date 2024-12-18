package com.facebook.fbreact.specs;

import X.InterfaceC65622ToD;
import X.R3M;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes10.dex */
public abstract class NativeNetInfoSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "NetInfo";

    @ReactMethod
    public abstract void addListener(String str);

    @ReactMethod
    public abstract void getCurrentConnectivity(InterfaceC65622ToD interfaceC65622ToD);

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    @ReactMethod
    public abstract void isConnectionMetered(InterfaceC65622ToD interfaceC65622ToD);

    @ReactMethod
    public abstract void removeListeners(double d);

    public NativeNetInfoSpec(R3M r3m) {
        super(r3m);
    }
}
