package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.fbpay.w3c.client.W3CClient$IsReadyToPayCallbackWithConnection;
import java.util.concurrent.CountDownLatch;
import org.chromium.IsReadyToPayService;

/* renamed from: X.SkM, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ServiceConnectionC63443SkM implements ServiceConnection {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public ServiceConnectionC63443SkM(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        if (this.A00 != 0) {
            super.onBindingDied(componentName);
            return;
        }
        C22935A9f c22935A9f = (C22935A9f) this.A02;
        c22935A9f.A05 = false;
        ((CountDownLatch) this.A01).countDown();
        QuickPerformanceLogger quickPerformanceLogger = c22935A9f.A01;
        quickPerformanceLogger.markerPoint(47654742, "binding_died");
        quickPerformanceLogger.markerEnd(47654742, (short) 3);
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        if (this.A00 != 0) {
            super.onNullBinding(componentName);
            return;
        }
        C22935A9f c22935A9f = (C22935A9f) this.A02;
        c22935A9f.A05 = true;
        ((CountDownLatch) this.A01).countDown();
        QuickPerformanceLogger quickPerformanceLogger = c22935A9f.A01;
        quickPerformanceLogger.markerPoint(47654742, "service_connected");
        quickPerformanceLogger.markerEnd(47654742, (short) 2);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, org.chromium.IsReadyToPayService$Stub$Proxy] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IsReadyToPayService isReadyToPayService;
        if (this.A00 != 0) {
            C14360o3.A0B(iBinder, 1);
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("org.chromium.IsReadyToPayService");
                if (queryLocalInterface != null && (queryLocalInterface instanceof IsReadyToPayService)) {
                    isReadyToPayService = (IsReadyToPayService) queryLocalInterface;
                } else {
                    ?? obj = new Object();
                    int A03 = C0f9.A03(586524218);
                    obj.A00 = iBinder;
                    C0f9.A0A(1489811786, A03);
                    isReadyToPayService = obj;
                }
                isReadyToPayService.Cba(new W3CClient$IsReadyToPayCallbackWithConnection(this, (C2GP) this.A02, (OHy) this.A01));
                return;
            } catch (RemoteException unused) {
                ((OHy) this.A01).A00(false);
                C2GP.A02(this, (C2GP) this.A02);
                return;
            }
        }
        C22935A9f c22935A9f = (C22935A9f) this.A02;
        c22935A9f.A05 = true;
        ((CountDownLatch) this.A01).countDown();
        QuickPerformanceLogger quickPerformanceLogger = c22935A9f.A01;
        quickPerformanceLogger.markerPoint(47654742, "service_connected");
        quickPerformanceLogger.markerEnd(47654742, (short) 2);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (this.A00 == 0) {
            C22935A9f c22935A9f = (C22935A9f) this.A02;
            c22935A9f.A05 = false;
            ((CountDownLatch) this.A01).countDown();
            QuickPerformanceLogger quickPerformanceLogger = c22935A9f.A01;
            quickPerformanceLogger.markerPoint(47654742, "service_disconnected");
            quickPerformanceLogger.markerEnd(47654742, (short) 3);
        }
    }
}
