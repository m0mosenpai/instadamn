package com.facebook.fbreact.specs;

import X.C00O;
import X.R3M;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes10.dex */
public abstract class NativeLeadGenHelperSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "LeadGenHelper";

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    @ReactMethod
    public abstract void onAppPrepareToClose();

    @ReactMethod
    public abstract void onScroll(double d);

    @ReactMethod
    public abstract void openAdUrl(String str, String str2, double d, double d2, String str3);

    @ReactMethod
    public abstract void openDialer(String str, String str2, double d, double d2, String str3);

    @ReactMethod
    public abstract void submitForm(String str, String str2);

    public NativeLeadGenHelperSpec(R3M r3m) {
        throw C00O.createAndThrow();
    }
}
