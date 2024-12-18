package X;

import android.content.ComponentName;
import android.content.ServiceConnection;

/* renamed from: X.SkP, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ServiceConnectionC63446SkP implements ServiceConnection {
    public static final String A01 = C48442Kl.A01("ListenableWorkerImplSession");
    public final C49182Nr A00 = new Object();

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        C48442Kl.A00();
        android.util.Log.w(A01, "Binding died");
        this.A00.A08(AbstractC166987dD.A18("Binding died"));
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        C48442Kl.A00();
        android.util.Log.e(A01, "Unable to bind to service");
        this.A00.A08(AbstractC166987dD.A18(AbstractC167017dG.A0n(componentName, "Cannot bind to service ", AbstractC166987dD.A1C())));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0016, code lost:
    
        if (r0 != false) goto L5;
     */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.work.multiprocess.IListenableWorkerImpl$Stub$Proxy, java.lang.Object] */
    @Override // android.content.ServiceConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            X.C48442Kl.A00()
            if (r5 != 0) goto Lc
            r2 = 0
        L6:
            X.2Nr r0 = r3.A00
            r0.A07(r2)
            return
        Lc:
            java.lang.String r0 = androidx.work.multiprocess.IListenableWorkerImpl.A00
            android.os.IInterface r2 = r5.queryLocalInterface(r0)
            if (r2 == 0) goto L19
            boolean r0 = r2 instanceof androidx.work.multiprocess.IListenableWorkerImpl
            if (r0 == 0) goto L19
            goto L6
        L19:
            androidx.work.multiprocess.IListenableWorkerImpl$Stub$Proxy r2 = new androidx.work.multiprocess.IListenableWorkerImpl$Stub$Proxy
            r2.<init>()
            r0 = 1831782174(0x6d2ec71e, float:3.3806944E27)
            int r1 = X.C0f9.A03(r0)
            r2.A00 = r5
            r0 = -1197377167(0xffffffffb8a17971, float:-7.6996985E-5)
            X.C0f9.A0A(r0, r1)
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ServiceConnectionC63446SkP.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C48442Kl.A00();
        android.util.Log.w(A01, "Service disconnected");
        this.A00.A08(AbstractC166987dD.A18("Service disconnected"));
    }
}
