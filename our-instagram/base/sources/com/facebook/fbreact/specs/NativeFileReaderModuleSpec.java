package com.facebook.fbreact.specs;

import X.C00O;
import X.InterfaceC65622ToD;
import X.R3M;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes10.dex */
public abstract class NativeFileReaderModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "FileReaderModule";

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    @ReactMethod
    public abstract void readAsDataURL(ReadableMap readableMap, InterfaceC65622ToD interfaceC65622ToD);

    @ReactMethod
    public abstract void readAsText(ReadableMap readableMap, String str, InterfaceC65622ToD interfaceC65622ToD);

    public NativeFileReaderModuleSpec(R3M r3m) {
        throw C00O.createAndThrow();
    }
}
