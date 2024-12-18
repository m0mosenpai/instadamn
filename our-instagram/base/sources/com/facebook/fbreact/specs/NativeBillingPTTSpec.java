package com.facebook.fbreact.specs;

import X.InterfaceC65622ToD;
import X.R3M;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class NativeBillingPTTSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "BillingPTT";

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    @ReactMethod
    public abstract void getPTT(String str, ReadableMap readableMap, ReadableMap readableMap2, String str2, String str3, InterfaceC65622ToD interfaceC65622ToD);

    public abstract Map getTypedExportedConstants();

    public NativeBillingPTTSpec(R3M r3m) {
        super(r3m);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public final Map getConstants() {
        return getTypedExportedConstants();
    }
}
