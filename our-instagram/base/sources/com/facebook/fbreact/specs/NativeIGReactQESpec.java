package com.facebook.fbreact.specs;

import X.R3M;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes9.dex */
public abstract class NativeIGReactQESpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGReactQE";

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean booleanValueForDeviceConfiguration(String str, String str2, boolean z);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean booleanValueForUserConfiguration(String str, String str2, boolean z);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract Double doubleValueForDeviceConfiguration(String str, String str2, boolean z);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract Double doubleValueForUserConfiguration(String str, String str2, boolean z);

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract Double integerValueForDeviceConfiguration(String str, String str2, boolean z);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract Double integerValueForUserConfiguration(String str, String str2, boolean z);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean mobileConfigBooleanValueForDeviceConfiguration(double d, double d2, boolean z);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean mobileConfigBooleanValueForDeviceConfiguration_IG4A_MIGRATION(String str, String str2, double d, double d2, boolean z);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean mobileConfigBooleanValueForUserConfiguration(double d, double d2, boolean z);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean mobileConfigBooleanValueForUserConfiguration_IG4A_MIGRATION(String str, String str2, double d, double d2, boolean z);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract Double mobileConfigDoubleValueForDeviceConfiguration(double d, double d2, boolean z);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract Double mobileConfigDoubleValueForDeviceConfiguration_IG4A_MIGRATION(String str, String str2, double d, double d2, boolean z);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract Double mobileConfigDoubleValueForUserConfiguration(double d, double d2, boolean z);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract Double mobileConfigDoubleValueForUserConfiguration_IG4A_MIGRATION(String str, String str2, double d, double d2, boolean z);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract Double mobileConfigIntegerValueForDeviceConfiguration(double d, double d2, boolean z);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract Double mobileConfigIntegerValueForDeviceConfiguration_IG4A_MIGRATION(String str, String str2, double d, double d2, boolean z);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract Double mobileConfigIntegerValueForUserConfiguration(double d, double d2, boolean z);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract Double mobileConfigIntegerValueForUserConfiguration_IG4A_MIGRATION(String str, String str2, double d, double d2, boolean z);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String mobileConfigStringValueForDeviceConfiguration(double d, double d2, boolean z);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String mobileConfigStringValueForDeviceConfiguration_IG4A_MIGRATION(String str, String str2, double d, double d2, boolean z);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String mobileConfigStringValueForUserConfiguration(double d, double d2, boolean z);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String mobileConfigStringValueForUserConfiguration_IG4A_MIGRATION(String str, String str2, double d, double d2, boolean z);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String stringValueForDeviceConfiguration(String str, String str2, boolean z);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String stringValueForUserConfiguration(String str, String str2, boolean z);

    public NativeIGReactQESpec(R3M r3m) {
        super(r3m);
    }
}
