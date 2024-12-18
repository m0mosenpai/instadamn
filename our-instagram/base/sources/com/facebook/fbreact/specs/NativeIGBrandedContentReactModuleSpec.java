package com.facebook.fbreact.specs;

import X.C00O;
import X.InterfaceC65622ToD;
import X.R3M;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes10.dex */
public abstract class NativeIGBrandedContentReactModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGBrandedContentReactModule";

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    @ReactMethod
    public abstract void openAdCreationPartners(double d);

    @ReactMethod
    public abstract void openAllowlistedPartners(double d, ReadableArray readableArray);

    @ReactMethod
    public abstract void openRequestAdCreationAccess(double d);

    @ReactMethod
    public abstract void updateWhitelistSettings(boolean z, boolean z2, String str, String str2, InterfaceC65622ToD interfaceC65622ToD);

    public NativeIGBrandedContentReactModuleSpec(R3M r3m) {
        throw C00O.createAndThrow();
    }
}
