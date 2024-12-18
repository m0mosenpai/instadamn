package com.facebook.mobileconfig;

import X.C09270dc;
import X.C0U0;
import com.facebook.jni.HybridData;

/* loaded from: classes.dex */
public class MobileConfigOverridesTableHolder implements C0U0 {
    public final HybridData mHybridData;

    @Override // X.C0U0
    public native boolean boolOverrideForParam(long j, boolean z);

    @Override // X.C0U0
    public native double doubleOverrideForParam(long j, double d);

    public native String experimentOverrideForUniverse(String str);

    public native String groupOverrideForUniverse(String str);

    @Override // X.C0U0
    public native boolean hasBoolOverrideForParam(long j);

    @Override // X.C0U0
    public native boolean hasDoubleOverrideForParam(long j);

    @Override // X.C0U0
    public native boolean hasIntOverrideForParam(long j);

    public native boolean hasNullOverrideForParam(long j);

    public native boolean hasOverrideForUniverse(String str);

    @Override // X.C0U0
    public native boolean hasOverridesFile();

    @Override // X.C0U0
    public native boolean hasStringOverrideForParam(long j);

    @Override // X.C0U0
    public native long intOverrideForParam(long j, long j2);

    @Override // X.C0U0
    public native void removeAllOverrides();

    @Override // X.C0U0
    public native void removeOverrideForParam(long j);

    public native void removeOverridesForQEUniverse(String str);

    public native void setOverridesFileUpdatedCallback(MobileConfigUpdateOverridesTableCallback mobileConfigUpdateOverridesTableCallback);

    @Override // X.C0U0
    public native String stringOverrideForParam(long j, String str);

    public native void updateOverrideForBool(long j, boolean z);

    public native void updateOverrideForDouble(long j, double d);

    public native void updateOverrideForInt(long j, long j2);

    public native void updateOverrideForQE(String str, String str2, String str3);

    public native void updateOverrideForString(long j, String str);

    static {
        C09270dc.A03("mobileconfig-jni");
    }

    public MobileConfigOverridesTableHolder(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // X.C0U0
    public void updateOverrideForParam(long j, double d) {
        updateOverrideForDouble(j, d);
    }

    @Override // X.C0U0
    public void updateOverrideForParam(long j, long j2) {
        updateOverrideForInt(j, j2);
    }

    @Override // X.C0U0
    public void updateOverrideForParam(long j, String str) {
        updateOverrideForString(j, str);
    }

    @Override // X.C0U0
    public void updateOverrideForParam(long j, boolean z) {
        updateOverrideForBool(j, z);
    }
}
