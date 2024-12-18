package com.facebook.fbreact.specs;

import X.InterfaceC65622ToD;
import X.R3M;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes10.dex */
public abstract class NativeDatePickerAndroidSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "DatePickerAndroid";

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DatePickerAndroid";
    }

    @ReactMethod
    public abstract void open(ReadableMap readableMap, InterfaceC65622ToD interfaceC65622ToD);

    public NativeDatePickerAndroidSpec(R3M r3m) {
        super(r3m);
    }
}
