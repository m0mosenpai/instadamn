package com.facebook.fbreact.specs;

import X.AbstractC166987dD;
import X.R3M;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class NativeNavigationSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "Navigation";

    @ReactMethod
    public abstract void clearRightBarButton(double d);

    @ReactMethod
    public abstract void dismiss(double d, ReadableMap readableMap);

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    @ReactMethod
    public abstract void getSavedInstanceState(double d, String str, Callback callback);

    public abstract Map getTypedExportedConstants();

    @ReactMethod
    public abstract void navigate(double d, String str, ReadableMap readableMap);

    @ReactMethod
    public abstract void openURL(double d, String str);

    @ReactMethod
    public abstract void pop(double d);

    @ReactMethod
    public abstract void popToScreen(double d, double d2);

    @ReactMethod
    public void present(double d, String str) {
    }

    @ReactMethod
    public abstract void reloadReact();

    @ReactMethod
    public void replaceTarget(double d, String str, String str2) {
    }

    @ReactMethod
    public void setBadgeConfig(ReadableMap readableMap) {
    }

    @ReactMethod
    public abstract void setBarLeftAction(double d, ReadableMap readableMap);

    @ReactMethod
    public abstract void setBarPrimaryAction(double d, ReadableMap readableMap);

    @ReactMethod
    public abstract void setBarTitle(double d, String str);

    @ReactMethod
    public abstract void setBarTitleWithConfig(double d, ReadableMap readableMap);

    @ReactMethod
    public abstract void setInstanceStateToSave(double d, String str, ReadableMap readableMap);

    @ReactMethod
    public void setRouteStack(double d, ReadableArray readableArray) {
    }

    @ReactMethod
    public void setSections(ReadableArray readableArray) {
    }

    @ReactMethod
    public void updateAppRegistryConfiguration(String str) {
    }

    @ReactMethod
    public abstract void updateNativeRoutesConfiguration(String str);

    public NativeNavigationSpec(R3M r3m) {
        super(r3m);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public final Map getConstants() {
        return AbstractC166987dD.A1G();
    }
}
