package com.facebook.fbreact.specs;

import X.InterfaceC65622ToD;
import X.R3M;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes10.dex */
public abstract class NativeFBLinkingAndroidSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "FBLinkingAndroid";

    @ReactMethod
    public abstract void canOpenURL(String str, String str2, InterfaceC65622ToD interfaceC65622ToD);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "FBLinkingAndroid";
    }

    @ReactMethod
    public abstract void openURL(String str, String str2, InterfaceC65622ToD interfaceC65622ToD);

    public NativeFBLinkingAndroidSpec(R3M r3m) {
        super(r3m);
    }
}
