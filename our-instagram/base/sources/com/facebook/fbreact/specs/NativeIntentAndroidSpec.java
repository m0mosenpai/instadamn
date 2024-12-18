package com.facebook.fbreact.specs;

import X.InterfaceC65622ToD;
import X.R3M;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes10.dex */
public abstract class NativeIntentAndroidSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IntentAndroid";

    @ReactMethod
    public abstract void canOpenURL(String str, InterfaceC65622ToD interfaceC65622ToD);

    @ReactMethod
    public abstract void getInitialURL(InterfaceC65622ToD interfaceC65622ToD);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public abstract void openSettings(InterfaceC65622ToD interfaceC65622ToD);

    @ReactMethod
    public abstract void openURL(String str, InterfaceC65622ToD interfaceC65622ToD);

    @ReactMethod
    public abstract void sendIntent(String str, ReadableArray readableArray, InterfaceC65622ToD interfaceC65622ToD);

    public NativeIntentAndroidSpec(R3M r3m) {
        super(r3m);
    }
}
