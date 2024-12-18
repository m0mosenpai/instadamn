package com.facebook.fbreact.specs;

import X.C00O;
import X.R3M;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class NativeIGReactDimensionsSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGReactDimensions";

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    public abstract Map getTypedExportedConstants();

    public NativeIGReactDimensionsSpec(R3M r3m) {
        throw C00O.createAndThrow();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public final Map getConstants() {
        throw C00O.createAndThrow();
    }
}
