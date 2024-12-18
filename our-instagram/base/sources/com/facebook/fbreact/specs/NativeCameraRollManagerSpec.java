package com.facebook.fbreact.specs;

import X.InterfaceC65622ToD;
import X.R3M;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes10.dex */
public abstract class NativeCameraRollManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "CameraRollManager";

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public abstract void getPhotos(ReadableMap readableMap, InterfaceC65622ToD interfaceC65622ToD);

    @ReactMethod
    public abstract void saveToCameraRoll(String str, String str2, InterfaceC65622ToD interfaceC65622ToD);

    public NativeCameraRollManagerSpec(R3M r3m) {
        super(r3m);
    }
}
