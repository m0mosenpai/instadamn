package com.facebook.fbreact.specs;

import X.R3M;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class NativeDeviceInfoSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "DeviceInfo";

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public abstract Map getTypedExportedConstants();

    public NativeDeviceInfoSpec(R3M r3m) {
        super(r3m);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public final Map getConstants() {
        return getTypedExportedConstants();
    }
}
