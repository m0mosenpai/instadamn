package com.facebook.fbreact.specs;

import X.InterfaceC65657Tqj;
import X.R3M;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes10.dex */
public abstract class NativeSafeAreaSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "SafeArea";

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SafeArea";
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract InterfaceC65657Tqj safeAreaInsets();

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean setSupportsOrientationChange(boolean z);

    public NativeSafeAreaSpec(R3M r3m) {
        super(r3m);
    }
}
