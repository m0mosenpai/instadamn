package com.facebook.fbreact.specs;

import X.C00O;
import X.R3M;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes10.dex */
public abstract class NativeIGShoppingBusinessSignupModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGShoppingSignupReactModule";

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    @ReactMethod
    public abstract void registerGetStarted(Callback callback, Callback callback2);

    @ReactMethod
    public abstract void registerNotInterestedInShopping();

    @ReactMethod
    public abstract void syncShoppingOnboardingState(Callback callback, Callback callback2);

    public NativeIGShoppingBusinessSignupModuleSpec(R3M r3m) {
        throw C00O.createAndThrow();
    }
}
