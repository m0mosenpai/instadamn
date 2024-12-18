package com.facebook.msys.mci;

import X.AbstractC09780fb;
import X.C1EJ;
import X.C53882dS;

/* loaded from: classes.dex */
public class JsonSerialization {
    public static boolean sInitialized;

    public static native void nativeInitialize();

    public static synchronized boolean initialize() {
        boolean z;
        int i;
        synchronized (JsonSerialization.class) {
            AbstractC09780fb.A01("JsonSerialization.initialize", 1276323159);
            try {
                if (sInitialized) {
                    z = false;
                    i = -1039187552;
                } else {
                    nativeInitialize();
                    z = true;
                    sInitialized = true;
                    i = 1579119685;
                }
                AbstractC09780fb.A00(i);
            } catch (Throwable th) {
                AbstractC09780fb.A00(1228065072);
                throw th;
            }
        }
        return z;
    }

    public static boolean isMCPEnabledForJsonSerialization() {
        synchronized (C1EJ.class) {
        }
        return false;
    }

    static {
        C53882dS.A00();
    }
}
