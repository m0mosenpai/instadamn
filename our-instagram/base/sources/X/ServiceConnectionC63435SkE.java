package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: X.SkE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ServiceConnectionC63435SkE implements ServiceConnection {
    public final /* synthetic */ C63186Sel A00;

    public /* synthetic */ ServiceConnectionC63435SkE(C63186Sel c63186Sel) {
        this.A00 = c63186Sel;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C63186Sel c63186Sel = this.A00;
        c63186Sel.A06.A01("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        c63186Sel.A01().post(new RPG(iBinder, this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C63186Sel c63186Sel = this.A00;
        c63186Sel.A06.A01("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        c63186Sel.A01().post(new RPE(this));
    }
}
