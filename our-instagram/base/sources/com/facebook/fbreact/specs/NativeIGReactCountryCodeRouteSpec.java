package com.facebook.fbreact.specs;

import X.InterfaceC65622ToD;
import X.R3M;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes10.dex */
public abstract class NativeIGReactCountryCodeRouteSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGReactCountryCodeRoute";

    @ReactMethod
    public abstract void extractCountryCodeAndNumber(String str, InterfaceC65622ToD interfaceC65622ToD);

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    @ReactMethod
    public abstract void presentCountryCodeSelector(String str, Callback callback);

    public NativeIGReactCountryCodeRouteSpec(R3M r3m) {
        super(r3m);
    }
}
