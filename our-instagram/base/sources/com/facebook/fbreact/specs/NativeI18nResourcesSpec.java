package com.facebook.fbreact.specs;

import X.R3M;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes10.dex */
public abstract class NativeI18nResourcesSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "I18nResources";

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getOverrideContent(String str);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getTranslation(String str, ReadableArray readableArray);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean isEnabled();

    public NativeI18nResourcesSpec(R3M r3m) {
        super(r3m);
    }
}
