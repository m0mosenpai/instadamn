package com.facebook.msys.mci;

import X.C1EI;
import X.C1EJ;
import X.C53882dS;

/* loaded from: classes.dex */
public class Proxies {
    public static boolean sConfigured;

    public static native void configureInternal(ProxyProvider proxyProvider);

    public static synchronized void configure(ProxyProvider proxyProvider) {
        synchronized (Proxies.class) {
            if (!sConfigured) {
                sConfigured = true;
                synchronized (C1EJ.class) {
                }
                configureInternal(proxyProvider);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public static boolean isMCPEnabledForProxies(int i) {
        boolean z;
        synchronized (C1EJ.class) {
            C1EI c1ei = C1EJ.A00;
            if (c1ei != null && (i == 1 || i == 9 || i == 5 || i == 6 || i == 15 || i == 16)) {
                boolean z2 = c1ei.A00;
                z = true;
                if (!z2) {
                }
            }
            z = false;
        }
        return z;
    }

    static {
        C53882dS.A00();
    }
}
