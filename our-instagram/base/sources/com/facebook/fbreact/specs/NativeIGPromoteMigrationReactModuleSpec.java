package com.facebook.fbreact.specs;

import X.R3M;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes10.dex */
public abstract class NativeIGPromoteMigrationReactModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGPromoteMigrationReactModule";

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    @ReactMethod
    public abstract void postDataFromCreateEditAudienceScreen(double d, String str);

    @ReactMethod
    public abstract void postDataFromDestinationWebsiteScreen(double d, String str, String str2);

    public NativeIGPromoteMigrationReactModuleSpec(R3M r3m) {
        super(r3m);
    }
}
