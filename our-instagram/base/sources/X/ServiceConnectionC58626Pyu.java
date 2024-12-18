package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: X.Pyu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ServiceConnectionC58626Pyu implements ServiceConnection {
    public final /* synthetic */ C48402Kh A00;

    public /* synthetic */ ServiceConnectionC58626Pyu(C48402Kh c48402Kh) {
        this.A00 = c48402Kh;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C48402Kh c48402Kh = this.A00;
        c48402Kh.A06.A03("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        c48402Kh.A01().post(new C58634Pz2(iBinder, this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C48402Kh c48402Kh = this.A00;
        c48402Kh.A06.A03("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        c48402Kh.A01().post(new RP2(this));
    }
}
