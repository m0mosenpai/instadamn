package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.firebase.iid.FirebaseInstanceId;

/* loaded from: classes10.dex */
public final class Q1P extends BroadcastReceiver {
    public RunnableC64706TQn A00;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i;
        NetworkInfo activeNetworkInfo;
        int A04 = AbstractC58318PtA.A04(this, context, intent, -98332995);
        RunnableC64706TQn runnableC64706TQn = this.A00;
        if (runnableC64706TQn == null) {
            i = -446118876;
        } else {
            C63342Shx c63342Shx = runnableC64706TQn.A00.A02;
            C63342Shx.A01(c63342Shx);
            ConnectivityManager connectivityManager = (ConnectivityManager) c63342Shx.A00.getSystemService("connectivity");
            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) {
                android.util.Log.isLoggable("FirebaseInstanceId", 3);
                FirebaseInstanceId.A04(this.A00, 0L);
                C63342Shx c63342Shx2 = this.A00.A00.A02;
                C63342Shx.A01(c63342Shx2);
                c63342Shx2.A00.unregisterReceiver(this);
                this.A00 = null;
                i = -1336453422;
            } else {
                i = -400368065;
            }
        }
        C0f9.A0E(i, A04, intent);
    }
}
