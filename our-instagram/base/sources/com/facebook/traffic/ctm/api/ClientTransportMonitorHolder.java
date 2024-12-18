package com.facebook.traffic.ctm.api;

/* loaded from: classes12.dex */
public final class ClientTransportMonitorHolder {
    public static volatile IClientTransportMonitor ctm;

    public ClientTransportMonitorHolder() {
        throw new UnsupportedOperationException();
    }

    public static IClientTransportMonitor get() {
        return ctm;
    }

    public static void set(IClientTransportMonitor iClientTransportMonitor) {
        ctm = iClientTransportMonitor;
    }
}
