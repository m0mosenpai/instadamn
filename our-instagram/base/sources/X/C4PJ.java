package X;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import org.webrtc.NetworkMonitor;

/* renamed from: X.4PJ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4PJ extends C4PK {
    public final C4PL A00;
    public final C4P3 A01;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.4PL] */
    public C4PJ(C4P3 c4p3) {
        C14360o3.A0B(c4p3, 1);
        this.A01 = c4p3;
        this.A00 = new ConnectivityManager.NetworkCallback() { // from class: X.4PL
            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(Network network) {
                C14360o3.A0B(network, 0);
                super.onAvailable(network);
                final C4P2 c4p2 = C4PJ.this.A01.A00;
                c4p2.A03.A01(new Runnable() { // from class: X.4PT
                    @Override // java.lang.Runnable
                    public final void run() {
                        C20H c20h = C4P2.this.A00;
                        if (c20h != null) {
                            c20h.onNetworkAvailable();
                        }
                    }
                });
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                C14360o3.A0B(network, 0);
                C14360o3.A0B(networkCapabilities, 1);
                try {
                    super.onCapabilitiesChanged(network, networkCapabilities);
                    boolean z = true;
                    boolean hasTransport = networkCapabilities.hasTransport(1);
                    boolean hasTransport2 = networkCapabilities.hasTransport(0);
                    if (!networkCapabilities.hasTransport(3) && !networkCapabilities.hasTransport(2) && !networkCapabilities.hasTransport(4)) {
                        z = false;
                    }
                    C4PJ c4pj = C4PJ.this;
                    final int i = hasTransport;
                    if (hasTransport2) {
                        i = (hasTransport ? 1 : 0) | 2;
                    }
                    if (z) {
                        i = (i == true ? 1 : 0) | 4;
                    }
                    final C4P2 c4p2 = c4pj.A01.A00;
                    c4p2.A03.A01(new Runnable() { // from class: X.4PU
                        @Override // java.lang.Runnable
                        public final void run() {
                            C14360o3.A0B(C05F.A0C, 0);
                            C20H c20h = C4P2.this.A00;
                            if (c20h != null) {
                                c20h.onNetworkInterfaceChanged(i);
                            }
                        }
                    });
                } catch (SecurityException e) {
                    C0K8.A0F(NetworkMonitor.TAG, "Error getting network information.", e);
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(Network network) {
                C14360o3.A0B(network, 0);
                super.onLost(network);
                C4P2 c4p2 = C4PJ.this.A01.A00;
                c4p2.A03.A01(new RunnableC24266ApX(c4p2));
            }
        };
    }
}
