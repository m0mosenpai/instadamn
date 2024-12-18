package com.facebook.fbreact.specs;

import X.C00O;
import X.InterfaceC65622ToD;
import X.R3M;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes10.dex */
public abstract class NativeShareModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "ShareModule";

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    @ReactMethod
    public abstract void share(ReadableMap readableMap, String str, InterfaceC65622ToD interfaceC65622ToD);

    public NativeShareModuleSpec(R3M r3m) {
        throw C00O.createAndThrow();
    }
}
