package com.facebook.fbreact.specs;

import X.InterfaceC65622ToD;
import X.R3M;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes10.dex */
public abstract class NativePermissionsAndroidSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "PermissionsAndroid";

    @ReactMethod
    public abstract void checkPermission(String str, InterfaceC65622ToD interfaceC65622ToD);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public abstract void requestMultiplePermissions(ReadableArray readableArray, InterfaceC65622ToD interfaceC65622ToD);

    @ReactMethod
    public abstract void requestPermission(String str, InterfaceC65622ToD interfaceC65622ToD);

    @ReactMethod
    public abstract void shouldShowRequestPermissionRationale(String str, InterfaceC65622ToD interfaceC65622ToD);

    public NativePermissionsAndroidSpec(R3M r3m) {
        super(r3m);
    }
}
