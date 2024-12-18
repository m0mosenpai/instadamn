package com.facebook.fbreact.specs;

import X.R3M;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class NativeDialogManagerAndroidSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "DialogManagerAndroid";

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public abstract Map getTypedExportedConstants();

    @ReactMethod
    public abstract void showAlert(ReadableMap readableMap, Callback callback, Callback callback2);

    @Override // com.facebook.react.bridge.BaseJavaModule
    public final Map getConstants() {
        return DialogModule.CONSTANTS;
    }

    public NativeDialogManagerAndroidSpec(R3M r3m) {
        super(r3m);
    }
}
