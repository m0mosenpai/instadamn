package X;

import android.os.IBinder;
import android.os.RemoteException;

/* renamed from: X.0OW, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0OW implements IBinder.DeathRecipient {
    public IBinder A00;
    public IBinder A01;
    public String A02;
    public final /* synthetic */ C0OX A03;

    public C0OW(IBinder iBinder, IBinder iBinder2, C0OX c0ox, String str) {
        this.A03 = c0ox;
        this.A02 = str;
        this.A01 = iBinder;
        this.A00 = iBinder2;
        try {
            iBinder2.linkToDeath(this, 0);
        } catch (RemoteException e) {
            C0PC.A00().DEh("ContentProviderRecord", e, null);
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        C0OX c0ox = this.A03;
        C003801d c003801d = c0ox.A01.A03;
        C02R.A03(c003801d, "Did you call SessionManager.init()?");
        c003801d.A0A(System.currentTimeMillis(), this.A02, true);
        c0ox.A02.remove(this.A01);
    }
}
