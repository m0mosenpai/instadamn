package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* loaded from: classes10.dex */
public final class Q1j extends BroadcastReceiver {
    public boolean A00;
    public final /* synthetic */ NetInfoModule A01;

    public Q1j(NetInfoModule netInfoModule) {
        this.A01 = netInfoModule;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int A04 = AbstractC58318PtA.A04(this, context, intent, 2144380569);
        AbstractC167017dG.A1N(context, intent);
        if (C14360o3.A0K(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            this.A01.updateAndSendConnectionType();
        }
        C0f9.A0E(-1410027322, A04, intent);
    }
}
