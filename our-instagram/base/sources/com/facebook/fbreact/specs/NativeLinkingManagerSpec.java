package com.facebook.fbreact.specs;

import X.C00O;
import X.InterfaceC65622ToD;
import X.R3M;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes10.dex */
public abstract class NativeLinkingManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "LinkingManager";

    @ReactMethod
    public abstract void addListener(String str);

    @ReactMethod
    public abstract void canOpenURL(String str, InterfaceC65622ToD interfaceC65622ToD);

    @ReactMethod
    public abstract void getInitialURL(InterfaceC65622ToD interfaceC65622ToD);

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    @ReactMethod
    public abstract void openSettings(InterfaceC65622ToD interfaceC65622ToD);

    @ReactMethod
    public abstract void openURL(String str, InterfaceC65622ToD interfaceC65622ToD);

    @ReactMethod
    public abstract void removeListeners(double d);

    public NativeLinkingManagerSpec(R3M r3m) {
        throw C00O.createAndThrow();
    }
}
