package com.facebook.common.smartgc.art;

import X.AbstractC166987dD;
import X.C09170dP;
import X.C15U;
import X.C23161Av;
import X.C62627SJk;
import X.C63988SxK;
import X.InterfaceC65204Tfn;
import X.InterfaceC65540TmD;
import android.content.Context;
import android.util.Log;

/* loaded from: classes10.dex */
public class ArtSmartGc implements InterfaceC65540TmD {
    public static final boolean CAN_RUN_ON_THIS_PLATFORM;
    public static final Object LOCK;
    public static String sDataDir;
    public static Boolean sHadErrorInitalizing;
    public static boolean sSetUpHookInited;
    public static C62627SJk sSetupSmartGcConfig;

    public static native void nativeBadTimeToDoGc(boolean z, boolean z2, boolean z3);

    public static native String nativeGetErrorMessage();

    public static native boolean nativeInitialize(String str, int i, int i2, int i3, boolean z, boolean z2);

    public static native void nativeNotAsBadTimeToDoGc();

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (android.os.Build.VERSION.SDK_INT > 28) goto L6;
     */
    static {
        /*
            boolean r0 = X.C0Hi.A00
            if (r0 == 0) goto Lb
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r0 = 1
            if (r2 <= r1) goto Lc
        Lb:
            r0 = 0
        Lc:
            com.facebook.common.smartgc.art.ArtSmartGc.CAN_RUN_ON_THIS_PLATFORM = r0
            java.lang.Object r0 = X.AbstractC58318PtA.A0b()
            com.facebook.common.smartgc.art.ArtSmartGc.LOCK = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.smartgc.art.ArtSmartGc.<clinit>():void");
    }

    public static boolean validateAndInitIfIsPlatformSupported() {
        if (sHadErrorInitalizing == null) {
            synchronized (LOCK) {
                if (sHadErrorInitalizing == null) {
                    if (sDataDir != null) {
                        try {
                            C09170dP.A0C("artsmartgc");
                            boolean z = false;
                            int[] A00 = C15U.A00("(HeapTaskDaemon)", "(GCDaemon)", "(HeapTrimmerDaem)");
                            if (!nativeInitialize(sDataDir, A00[0], A00[1], A00[2], false, false)) {
                                z = true;
                            }
                            sHadErrorInitalizing = Boolean.valueOf(z);
                        } catch (UnsatisfiedLinkError e) {
                            Log.e("ArtSmartGc", "Cannot Init ART Smart GC", e);
                            sHadErrorInitalizing = true;
                        }
                    } else {
                        throw AbstractC166987dD.A14("setupHook must be called first");
                    }
                }
            }
        }
        return !sHadErrorInitalizing.booleanValue();
    }

    @Override // X.InterfaceC65540TmD
    public /* bridge */ /* synthetic */ void badTimeToDoGc(InterfaceC65204Tfn interfaceC65204Tfn) {
        C63988SxK c63988SxK = (C63988SxK) interfaceC65204Tfn;
        if (validateAndInitIfIsPlatformSupported()) {
            nativeBadTimeToDoGc(c63988SxK.A00, c63988SxK.A02, c63988SxK.A01);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.SJk, java.lang.Object] */
    @Override // X.InterfaceC65540TmD
    public void setUpHook(Context context, C62627SJk c62627SJk) {
        if (!sSetUpHookInited) {
            sDataDir = C23161Av.A00(context).AXd(null, 1658227862).getAbsolutePath();
            sSetupSmartGcConfig = new Object();
            sSetUpHookInited = true;
        }
    }

    @Override // X.InterfaceC65540TmD
    public void notAsBadTimeToDoGc() {
        if (validateAndInitIfIsPlatformSupported()) {
            nativeNotAsBadTimeToDoGc();
        }
    }
}
