package com.facebook.react.modules.deviceinfo;

import X.AbstractC167007dF;
import X.AbstractC58319PtB;
import X.C14360o3;
import X.C63356SiD;
import X.InterfaceC65542TmH;
import X.R3M;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.facebook.fbreact.specs.NativeDeviceInfoSpec;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import java.util.Map;

@ReactModule(name = NativeDeviceInfoSpec.NAME)
/* loaded from: classes10.dex */
public final class DeviceInfoModule extends NativeDeviceInfoSpec implements InterfaceC65542TmH {
    public float fontScale;
    public ReadableMap previousDisplayMetrics;
    public R3M reactApplicationContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceInfoModule(R3M r3m) {
        super(r3m);
        C14360o3.A0B(r3m, 1);
        C63356SiD.A04(r3m);
        this.fontScale = AbstractC58319PtB.A08(r3m).fontScale;
        r3m.A0A(this);
        this.reactApplicationContext = r3m;
    }

    @Override // X.InterfaceC65542TmH
    public void onHostDestroy() {
    }

    @Override // X.InterfaceC65542TmH
    public void onHostPause() {
    }

    public final void emitUpdateDimensionsEvent() {
        R3M r3m = this.reactApplicationContext;
        if (r3m != null) {
            if (r3m.A0F()) {
                WritableNativeMap A01 = C63356SiD.A01(this.fontScale);
                ReadableMap readableMap = this.previousDisplayMetrics;
                if (readableMap == null) {
                    this.previousDisplayMetrics = A01.copy();
                    return;
                } else {
                    if (C14360o3.A0K(A01, readableMap)) {
                        return;
                    }
                    this.previousDisplayMetrics = A01.copy();
                    r3m.A0E("didUpdateDimensions", A01);
                    return;
                }
            }
            ReactSoftExceptionLogger.logSoftException(NativeDeviceInfoSpec.NAME, new RuntimeException("No active CatalystInstance, cannot emitUpdateDimensionsEvent"));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeDeviceInfoSpec
    public Map getTypedExportedConstants() {
        WritableNativeMap A01 = C63356SiD.A01(this.fontScale);
        this.previousDisplayMetrics = A01.copy();
        return AbstractC167007dF.A0n("Dimensions", A01.toHashMap());
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        R3M r3m = this.reactApplicationContext;
        if (r3m != null) {
            r3m.A0B(this);
        }
    }

    @Override // X.InterfaceC65542TmH
    public void onHostResume() {
        Resources resources;
        Configuration configuration;
        float f;
        Float valueOf;
        R3M r3m = this.reactApplicationContext;
        if (r3m != null && (resources = r3m.getResources()) != null && (configuration = resources.getConfiguration()) != null && (valueOf = Float.valueOf((f = configuration.fontScale))) != null && !C14360o3.A0I(valueOf, this.fontScale)) {
            this.fontScale = f;
            emitUpdateDimensionsEvent();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceInfoModule(Context context) {
        super(null);
        C14360o3.A0B(context, 1);
        this.reactApplicationContext = null;
        C63356SiD.A04(context);
        this.fontScale = AbstractC58319PtB.A08(context).fontScale;
    }
}
