package X;

import android.net.ConnectivityManager;
import android.net.Network;

/* loaded from: classes10.dex */
public final class Q2Y extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ SLA A00;
    public final /* synthetic */ InterfaceC71543Iw A01;

    public Q2Y(SLA sla, InterfaceC71543Iw interfaceC71543Iw) {
        this.A01 = interfaceC71543Iw;
        this.A00 = sla;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.A01.F8s(this.A00.A00());
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.A01.F8s(EnumC61109RfP.A02);
    }
}
