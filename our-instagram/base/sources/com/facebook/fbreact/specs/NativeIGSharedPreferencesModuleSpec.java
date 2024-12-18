package com.facebook.fbreact.specs;

import X.InterfaceC65622ToD;
import X.R3M;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes10.dex */
public abstract class NativeIGSharedPreferencesModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGSharedPreferencesModule";

    @ReactMethod
    public abstract void getBoolean(String str, String str2, boolean z, InterfaceC65622ToD interfaceC65622ToD);

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    @ReactMethod
    public abstract void getString(String str, String str2, String str3, InterfaceC65622ToD interfaceC65622ToD);

    public NativeIGSharedPreferencesModuleSpec(R3M r3m) {
        super(r3m);
    }
}
