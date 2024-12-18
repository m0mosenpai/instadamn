package com.facebook.fbreact.specs;

import X.C00O;
import X.R3M;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes10.dex */
public abstract class NativeIGShoppingCatalogSettingsModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGShoppingCatalogSettingsModule";

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    @ReactMethod
    public abstract void launchCatalogSelectionPage(double d, String str, String str2, String str3);

    @ReactMethod
    public abstract void selectCatalog(String str, String str2, Callback callback, Callback callback2);

    public NativeIGShoppingCatalogSettingsModuleSpec(R3M r3m) {
        throw C00O.createAndThrow();
    }
}
