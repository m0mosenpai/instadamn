package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.facebook.push.fbns.ipc.IFbnsAIDLService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.3Ux, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74183Ux {
    public final Context A03;
    public IFbnsAIDLService A01 = null;
    public Integer A02 = C05F.A00;
    public int A00 = 0;
    public final ServiceConnection A04 = new ServiceConnection() { // from class: X.3Uy
        /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, com.facebook.push.fbns.ipc.IFbnsAIDLService$Stub$Proxy] */
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IFbnsAIDLService iFbnsAIDLService;
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                C0K8.A0C("FbnsAIDLClientManager", "This operation should be run on UI thread");
            }
            C74183Ux c74183Ux = C74183Ux.this;
            if (iBinder == null) {
                iFbnsAIDLService = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.push.fbns.ipc.IFbnsAIDLService");
                if (queryLocalInterface != null && (queryLocalInterface instanceof IFbnsAIDLService)) {
                    iFbnsAIDLService = (IFbnsAIDLService) queryLocalInterface;
                } else {
                    ?? obj = new Object();
                    int A03 = C0f9.A03(502217712);
                    obj.A00 = iBinder;
                    C0f9.A0A(1131072382, A03);
                    iFbnsAIDLService = obj;
                }
            }
            synchronized (c74183Ux) {
                c74183Ux.A01 = iFbnsAIDLService;
                c74183Ux.A02 = C05F.A0C;
                c74183Ux.notifyAll();
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                C0K8.A0C("FbnsAIDLClientManager", "This operation should be run on UI thread");
            }
            C74183Ux c74183Ux = C74183Ux.this;
            synchronized (c74183Ux) {
                c74183Ux.A01 = null;
                c74183Ux.A02 = C05F.A00;
            }
        }
    };
    public final ExecutorService A05 = Executors.newFixedThreadPool(5);

    public static void A00(C74183Ux c74183Ux) {
        synchronized (c74183Ux) {
            int i = c74183Ux.A00 - 1;
            c74183Ux.A00 = i;
            if (i == 0) {
                c74183Ux.A01 = null;
                c74183Ux.A02 = C05F.A00;
                c74183Ux.A03.unbindService(c74183Ux.A04);
            }
        }
        Thread.currentThread().getId();
    }

    public final void finalize() {
        this.A05.shutdown();
    }

    public C74183Ux(Context context) {
        this.A03 = context;
    }
}
