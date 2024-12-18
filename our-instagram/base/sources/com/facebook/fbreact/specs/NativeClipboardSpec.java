package com.facebook.fbreact.specs;

import X.InterfaceC65622ToD;
import X.R3M;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes10.dex */
public abstract class NativeClipboardSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "Clipboard";

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Clipboard";
    }

    @ReactMethod
    public abstract void getString(InterfaceC65622ToD interfaceC65622ToD);

    @ReactMethod
    public abstract void setString(String str);

    public NativeClipboardSpec(R3M r3m) {
        super(r3m);
    }
}
