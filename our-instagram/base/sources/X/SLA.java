package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* loaded from: classes10.dex */
public final class SLA {
    public final ConnectivityManager A00;
    public final InterfaceC19390xP A01;

    public final EnumC61109RfP A00() {
        ConnectivityManager connectivityManager = this.A00;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16)) {
            if (networkCapabilities.hasTransport(1)) {
                return EnumC61109RfP.A04;
            }
            return EnumC61109RfP.A03;
        }
        return EnumC61109RfP.A02;
    }

    public SLA(Context context) {
        Object systemService = context.getSystemService((Class<Object>) ConnectivityManager.class);
        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.A00 = (ConnectivityManager) systemService;
        this.A01 = C0JE.A00(new MCH(this, (InterfaceC23621Ds) null, 11));
    }
}
