package com.facebook.fbreact.specs;

import X.R3M;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class NativeI18nSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "I18n";

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getOverrideContent(String str);

    public abstract Map getTypedExportedConstants();

    @ReactMethod
    public abstract void setLocale(String str);

    public NativeI18nSpec(R3M r3m) {
        super(r3m);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public final Map getConstants() {
        return getTypedExportedConstants();
    }
}
