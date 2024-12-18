package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Looper;
import com.google.android.gms.internal.gtm.zzce;

/* renamed from: X.SkL, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ServiceConnectionC63442SkL implements ServiceConnection {
    public volatile zzce A00;
    public volatile boolean A01;
    public final /* synthetic */ C60689RMh A02;

    public ServiceConnectionC63442SkL(C60689RMh c60689RMh) {
        this.A02 = c60689RMh;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:15|(1:17)(1:29)|18|(3:20|(1:22)(1:24)|23)|25|26|23) */
    @Override // android.content.ServiceConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onServiceConnected(android.content.ComponentName r6, android.os.IBinder r7) {
        /*
            r5 = this;
            java.lang.String r2 = "AnalyticsServiceConnection.onServiceConnected"
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r1 != r0) goto L8a
            monitor-enter(r5)
            if (r7 != 0) goto L1b
            X.RMh r2 = r5.A02     // Catch: java.lang.Throwable -> L82
            java.lang.String r1 = "Service connected with null binder"
            r0 = 6
            X.AbstractC63371Sic.A09(r2, r1, r0)     // Catch: java.lang.Throwable -> L82
            r5.notifyAll()     // Catch: java.lang.Throwable -> L87
            goto L80
        L1b:
            r2 = 0
            java.lang.String r4 = r7.getInterfaceDescriptor()     // Catch: android.os.RemoteException -> L4a java.lang.Throwable -> L82
            java.lang.String r1 = "com.google.android.gms.analytics.internal.IAnalyticsService"
            boolean r0 = r1.equals(r4)     // Catch: android.os.RemoteException -> L4a java.lang.Throwable -> L82
            if (r0 == 0) goto L42
            android.os.IInterface r1 = r7.queryLocalInterface(r1)     // Catch: android.os.RemoteException -> L4a java.lang.Throwable -> L82
            boolean r0 = r1 instanceof com.google.android.gms.internal.gtm.zzce     // Catch: android.os.RemoteException -> L4a java.lang.Throwable -> L82
            if (r0 == 0) goto L3c
            com.google.android.gms.internal.gtm.zzce r1 = (com.google.android.gms.internal.gtm.zzce) r1     // Catch: android.os.RemoteException -> L4a java.lang.Throwable -> L82
        L32:
            r2 = r1
            X.RMh r3 = r5.A02     // Catch: android.os.RemoteException -> L4a java.lang.Throwable -> L82
            java.lang.String r1 = "Bound to IAnalyticsService interface"
            r0 = 2
            X.AbstractC63371Sic.A09(r3, r1, r0)     // Catch: android.os.RemoteException -> L4a java.lang.Throwable -> L82
            goto L52
        L3c:
            com.google.android.gms.internal.gtm.zzcf r1 = new com.google.android.gms.internal.gtm.zzcf     // Catch: android.os.RemoteException -> L4a java.lang.Throwable -> L82
            r1.<init>(r7)     // Catch: android.os.RemoteException -> L4a java.lang.Throwable -> L82
            goto L32
        L42:
            X.RMh r3 = r5.A02     // Catch: android.os.RemoteException -> L4a java.lang.Throwable -> L82
            java.lang.String r0 = "Got binder with a wrong descriptor"
            r3.A0G(r0, r4)     // Catch: android.os.RemoteException -> L4a java.lang.Throwable -> L82
            goto L70
        L4a:
            X.RMh r3 = r5.A02     // Catch: java.lang.Throwable -> L82
            java.lang.String r1 = "Service connect failed to get IAnalyticsService"
            r0 = 6
            X.AbstractC63371Sic.A09(r3, r1, r0)     // Catch: java.lang.Throwable -> L82
        L52:
            if (r2 == 0) goto L70
            boolean r0 = r5.A01     // Catch: java.lang.Throwable -> L82
            if (r0 != 0) goto L6d
            java.lang.String r1 = "onServiceConnected received after the timeout limit"
            r0 = 5
            X.AbstractC63371Sic.A09(r3, r1, r0)     // Catch: java.lang.Throwable -> L82
            X.SX6 r0 = X.C63335Shm.A00(r3)     // Catch: java.lang.Throwable -> L82
            X.TOc r1 = new X.TOc     // Catch: java.lang.Throwable -> L82
            r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> L82
            X.Ta3 r0 = r0.A02     // Catch: java.lang.Throwable -> L82
            r0.submit(r1)     // Catch: java.lang.Throwable -> L82
            goto L7d
        L6d:
            r5.A00 = r2     // Catch: java.lang.Throwable -> L82
            goto L7d
        L70:
            X.63x r2 = X.C1341263x.A00()     // Catch: java.lang.IllegalArgumentException -> L7d java.lang.Throwable -> L82
            X.Shm r0 = r3.A00     // Catch: java.lang.IllegalArgumentException -> L7d java.lang.Throwable -> L82
            android.content.Context r1 = r0.A00     // Catch: java.lang.IllegalArgumentException -> L7d java.lang.Throwable -> L82
            X.SkL r0 = r3.A01     // Catch: java.lang.IllegalArgumentException -> L7d java.lang.Throwable -> L82
            r2.A02(r1, r0)     // Catch: java.lang.IllegalArgumentException -> L7d java.lang.Throwable -> L82
        L7d:
            r5.notifyAll()     // Catch: java.lang.Throwable -> L87
        L80:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L87
            return
        L82:
            r0 = move-exception
            r5.notifyAll()     // Catch: java.lang.Throwable -> L87
            throw r0     // Catch: java.lang.Throwable -> L87
        L87:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L87
            throw r0
        L8a:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ServiceConnectionC63442SkL.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            SX6 A00 = C63335Shm.A00(this.A02);
            A00.A02.submit(new RunnableC64646TOd(componentName, this));
            return;
        }
        throw AbstractC166987dD.A14("AnalyticsServiceConnection.onServiceDisconnected");
    }
}
