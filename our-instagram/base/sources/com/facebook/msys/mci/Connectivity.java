package com.facebook.msys.mci;

import X.AbstractC12290kX;
import X.AbstractC15820qc;
import X.C1335160w;
import X.C14360o3;
import X.C53882dS;
import X.InterfaceC16820sZ;
import android.content.Context;

/* loaded from: classes.dex */
public class Connectivity {
    public static C1335160w sConnectivityHandler;
    public static boolean sInitialized;

    public static native void nativeInitialize();

    public static synchronized void ensureInitialized() {
        synchronized (Connectivity.class) {
            if (sConnectivityHandler == null) {
                throw new IllegalStateException("Connectivity is not initialized");
            }
        }
    }

    public static synchronized int getDgwState(String str) {
        synchronized (Connectivity.class) {
            ensureInitialized();
        }
        return 1;
    }

    public static synchronized int getMqttState() {
        int i;
        synchronized (Connectivity.class) {
            ensureInitialized();
            InterfaceC16820sZ interfaceC16820sZ = sConnectivityHandler.A00;
            i = 1;
            if (interfaceC16820sZ != null) {
                if (((Boolean) interfaceC16820sZ.invoke()).booleanValue()) {
                }
            }
            i = 2;
        }
        return i;
    }

    public static synchronized int getNetworkState() {
        int i;
        synchronized (Connectivity.class) {
            ensureInitialized();
            Context context = AbstractC12290kX.A00;
            C14360o3.A07(context);
            boolean A0F = AbstractC15820qc.A0F(context);
            i = 2;
            if (A0F) {
                i = 1;
            }
        }
        return i;
    }

    static {
        C53882dS.A00();
    }
}
