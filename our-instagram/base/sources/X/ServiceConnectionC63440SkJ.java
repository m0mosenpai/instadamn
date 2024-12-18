package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.fbpay.w3c.ipc.BaseFBPaymentServiceImpl$handler$1;

/* renamed from: X.SkJ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ServiceConnectionC63440SkJ implements ServiceConnection {
    public final /* synthetic */ C02N A00;
    public final /* synthetic */ C2GP A01;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C14360o3.A0B(iBinder, 1);
        try {
            C2GP c2gp = this.A01;
            synchronized (c2gp) {
                c2gp.A03 = iBinder;
            }
            this.A00.accept(iBinder);
            BaseFBPaymentServiceImpl$handler$1.A00(iBinder).A86(c2gp.A0A);
            BaseFBPaymentServiceImpl$handler$1.A00(iBinder).A7s(c2gp.A09);
            BaseFBPaymentServiceImpl$handler$1.A00(iBinder).A8B(c2gp.A0B);
        } catch (RemoteException unused) {
        }
    }

    public ServiceConnectionC63440SkJ(C02N c02n, C2GP c2gp) {
        this.A01 = c2gp;
        this.A00 = c02n;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C2GP c2gp = this.A01;
        synchronized (c2gp) {
            c2gp.A01 = null;
            c2gp.A03 = null;
        }
    }
}
