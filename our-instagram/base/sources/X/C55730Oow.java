package X;

import com.facebook.proxyservice.observer.ProxyServiceBroadcaster;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeClientManager;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* renamed from: X.Oow, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55730Oow implements InterfaceC58018Po4, InterfaceC13000lm, InterfaceC13030lp {
    public final UserSession A00;

    @Override // X.InterfaceC58018Po4
    public final void D77(String str, int i, int i2, String str2) {
        C14360o3.A0B(str, 0);
        synchronized (this) {
            C0K8.A0D("proxy_service", "Setting MQTT Proxy.");
            RealtimeClientManager.getInstance(this.A00).setProxy(new Proxy(Proxy.Type.SOCKS, InetSocketAddress.createUnresolved(str, i2)));
        }
    }

    @Override // X.InterfaceC58018Po4
    public final void DAa() {
        synchronized (this) {
            C0K8.A0D("proxy_service", "Clearing MQTT Proxy.");
            RealtimeClientManager.getInstance(this.A00).setProxy(null);
        }
    }

    @Override // X.InterfaceC13030lp
    public final void DyC(boolean z) {
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        ProxyServiceBroadcaster proxyServiceBroadcaster = ProxyServiceBroadcaster.instance;
        synchronized (proxyServiceBroadcaster) {
            proxyServiceBroadcaster.observers.remove(this);
        }
    }

    public C55730Oow(UserSession userSession) {
        this.A00 = userSession;
        C0K8.A0D("proxy_service", "Attach session scoped listener.");
        ProxyServiceBroadcaster.instance.registerObserver(this);
    }
}
