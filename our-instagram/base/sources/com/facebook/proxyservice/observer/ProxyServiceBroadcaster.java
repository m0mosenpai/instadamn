package com.facebook.proxyservice.observer;

import X.AbstractC166987dD;
import X.InterfaceC58018Po4;
import X.OG3;
import java.util.List;

/* loaded from: classes9.dex */
public class ProxyServiceBroadcaster {
    public static final OG3 Companion = new Object();
    public static final ProxyServiceBroadcaster instance = new ProxyServiceBroadcaster();
    public int httpProxyPort;
    public boolean isProxyMode;
    public int socksProxyPort;
    public String clientAddress = "";
    public String clientRegion = "";
    public String proxyAddress = "";
    public final List observers = AbstractC166987dD.A1E();

    public final synchronized String getProxyAddress() {
        return this.proxyAddress;
    }

    public final synchronized int getSocksProxyPort() {
        return this.socksProxyPort;
    }

    public final synchronized void registerObserver(InterfaceC58018Po4 interfaceC58018Po4) {
        if (this.isProxyMode) {
            interfaceC58018Po4.D77(this.proxyAddress, this.httpProxyPort, this.socksProxyPort, this.clientAddress);
        }
        this.observers.add(interfaceC58018Po4);
    }

    public static final ProxyServiceBroadcaster getInstance() {
        return instance;
    }
}
