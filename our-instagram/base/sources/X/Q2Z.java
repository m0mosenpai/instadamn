package X;

import android.net.ConnectivityManager;
import android.net.Network;

/* loaded from: classes10.dex */
public final class Q2Z extends ConnectivityManager.NetworkCallback {
    public final int A00;
    public final Object A01;

    public Q2Z(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        if (this.A00 != 0) {
            C14360o3.A0B(network, 0);
            super.onAvailable(network);
            ((SWX) this.A01).A01.setNetworkStateConnected();
        } else {
            C63375Sim.A02().post(new TN3(this, true));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        if (this.A00 != 0) {
            C14360o3.A0B(network, 0);
            super.onLost(network);
            ((SWX) this.A01).A01.setNetworkStateDisconnected();
        } else {
            C63375Sim.A02().post(new TN3(this, false));
        }
    }
}
