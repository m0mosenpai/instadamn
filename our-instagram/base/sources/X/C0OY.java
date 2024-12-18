package X;

import android.os.IBinder;
import android.os.RemoteException;
import android.os.ServiceManager;

/* renamed from: X.0OY, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0OY implements IBinder.DeathRecipient {
    public static C0OY A01;
    public final C0Pe A00;

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        C003801d c003801d = this.A00.A03;
        C02R.A03(c003801d, "Did you call SessionManager.init()?");
        synchronized (c003801d.A02) {
            c003801d.A01.A00.put(206, (byte) 49);
            C003801d.A02(c003801d);
        }
    }

    public C0OY(C0Pe c0Pe) {
        this.A00 = c0Pe;
        A00("activity");
        A00("SurfaceFlinger");
    }

    private void A00(String str) {
        IBinder service = ServiceManager.getService(str);
        if (service != null) {
            try {
                service.linkToDeath(this, 0);
            } catch (RemoteException e) {
                C0K8.A0F("SystemBinderDiedDetector", "linkToDeath failed", e);
                C0PC.A00().DEh("SysBinderLinkToDeath", e, null);
            }
        }
    }
}
