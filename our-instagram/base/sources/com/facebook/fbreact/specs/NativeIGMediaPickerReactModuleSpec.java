package com.facebook.fbreact.specs;

import X.R3M;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes10.dex */
public abstract class NativeIGMediaPickerReactModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGMediaPickerNativeModule";

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    @ReactMethod
    public abstract void openNativePhotoPicker(double d, boolean z);

    public NativeIGMediaPickerReactModuleSpec(R3M r3m) {
        super(r3m);
    }
}
