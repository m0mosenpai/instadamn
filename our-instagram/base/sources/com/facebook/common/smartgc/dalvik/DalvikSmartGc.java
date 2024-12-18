package com.facebook.common.smartgc.dalvik;

import X.AbstractC166987dD;
import X.C09170dP;
import X.C0Hi;
import X.C62627SJk;
import X.InterfaceC65204Tfn;
import X.InterfaceC65540TmD;
import android.content.Context;

/* loaded from: classes10.dex */
public class DalvikSmartGc implements InterfaceC65540TmD {
    public static final boolean CAN_RUN_ON_THIS_PLATFORM;
    public static final boolean HAD_ERROR_INITING;

    public static native void nativeBadTimeToDoGc(boolean z, int i, boolean z2, boolean z3, boolean z4);

    public static native void nativeConcurrentGc(boolean z, int i);

    public static native String nativeGetErrorMessage();

    public static native boolean nativeInitialize();

    public static native void nativeManualGcComplete();

    public static native void nativeManualGcConcurrent();

    public static native void nativeManualGcForAlloc();

    public static native void nativeNotAsBadTimeToDoGc();

    @Override // X.InterfaceC65540TmD
    public void setUpHook(Context context, C62627SJk c62627SJk) {
    }

    static {
        boolean z;
        boolean z2 = !C0Hi.A00;
        CAN_RUN_ON_THIS_PLATFORM = z2;
        if (z2) {
            C09170dP.A0C("dalviksmartgc");
            z = !nativeInitialize();
        } else {
            z = false;
        }
        HAD_ERROR_INITING = z;
    }

    @Override // X.InterfaceC65540TmD
    public /* bridge */ /* synthetic */ void badTimeToDoGc(InterfaceC65204Tfn interfaceC65204Tfn) {
        if (CAN_RUN_ON_THIS_PLATFORM) {
            throw AbstractC166987dD.A15("disableGcConcurrent");
        }
        throw AbstractC166987dD.A14("This platform is not supported");
    }

    @Override // X.InterfaceC65540TmD
    public void notAsBadTimeToDoGc() {
        if (CAN_RUN_ON_THIS_PLATFORM) {
            nativeNotAsBadTimeToDoGc();
            return;
        }
        throw AbstractC166987dD.A14("This platform is not supported");
    }
}
