package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* renamed from: X.2MQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2MQ extends C2MJ {
    public final ConnectivityManager A00;
    public final C2MS A01;

    @Override // X.C2MJ
    public final /* bridge */ /* synthetic */ Object A00() {
        return C50X.A00(this.A00);
    }

    @Override // X.C2MJ
    public final void A01() {
        try {
            C48442Kl.A00();
            ConnectivityManager connectivityManager = this.A00;
            C2MS c2ms = this.A01;
            C14360o3.A0B(connectivityManager, 0);
            C14360o3.A0B(c2ms, 1);
            connectivityManager.registerDefaultNetworkCallback(c2ms);
        } catch (IllegalArgumentException | SecurityException e) {
            C48442Kl.A00();
            android.util.Log.e(C50X.A00, "Received exception while registering network callback", e);
        }
    }

    @Override // X.C2MJ
    public final void A02() {
        try {
            C48442Kl.A00();
            ConnectivityManager connectivityManager = this.A00;
            C2MS c2ms = this.A01;
            C14360o3.A0B(connectivityManager, 0);
            C14360o3.A0B(c2ms, 1);
            connectivityManager.unregisterNetworkCallback(c2ms);
        } catch (IllegalArgumentException | SecurityException e) {
            C48442Kl.A00();
            android.util.Log.e(C50X.A00, "Received exception while unregistering network callback", e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.2MS] */
    public C2MQ(Context context, C2LC c2lc) {
        super(context, c2lc);
        Object systemService = super.A01.getSystemService("connectivity");
        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.A00 = (ConnectivityManager) systemService;
        this.A01 = new ConnectivityManager.NetworkCallback() { // from class: X.2MS
            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                C14360o3.A0B(networkCapabilities, 1);
                C48442Kl.A00();
                C2MQ c2mq = C2MQ.this;
                c2mq.A03(C50X.A00(c2mq.A00));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(Network network) {
                C48442Kl.A00();
                C2MQ c2mq = C2MQ.this;
                c2mq.A03(C50X.A00(c2mq.A00));
            }
        };
    }
}
