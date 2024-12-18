package X;

import android.net.ConnectivityManager;
import android.os.Looper;

/* loaded from: classes8.dex */
public final class M1N implements Runnable {
    public final /* synthetic */ C26141Ov A00;

    public M1N(C26141Ov c26141Ov) {
        this.A00 = c26141Ov;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C26141Ov c26141Ov = this.A00;
        c26141Ov.A0C("onUserSessionWillEnd");
        Looper.myQueue().removeIdleHandler(c26141Ov.A06);
        if (C18U.A06(C06090Tz.A05, c26141Ov.A08, 36328993758592950L)) {
            if (c26141Ov.A0O) {
                ConnectivityManager connectivityManager = c26141Ov.A00;
                if (connectivityManager != null) {
                    connectivityManager.unregisterNetworkCallback(c26141Ov.A04);
                }
                c26141Ov.A0O = false;
                return;
            }
            return;
        }
        if (!c26141Ov.A01) {
            return;
        }
        c26141Ov.A03.unregisterReceiver(c26141Ov.A02);
        c26141Ov.A01 = false;
    }
}
