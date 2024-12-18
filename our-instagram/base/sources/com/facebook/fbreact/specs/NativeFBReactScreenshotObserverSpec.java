package com.facebook.fbreact.specs;

import X.C00O;
import X.R3M;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes10.dex */
public abstract class NativeFBReactScreenshotObserverSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "FBReactScreenshotObserver";

    @ReactMethod
    public abstract void addListener(String str);

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    @ReactMethod
    public abstract void removeListeners(double d);

    @ReactMethod
    public abstract void startObserving();

    @ReactMethod
    public abstract void stopObserving();

    public NativeFBReactScreenshotObserverSpec(R3M r3m) {
        throw C00O.createAndThrow();
    }
}
