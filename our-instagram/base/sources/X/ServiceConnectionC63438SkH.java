package X;

import android.content.ComponentName;
import android.content.ServiceConnection;

/* renamed from: X.SkH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ServiceConnectionC63438SkH implements ServiceConnection {
    public final /* synthetic */ C63305ShB A00;
    public final /* synthetic */ boolean A01;

    public ServiceConnectionC63438SkH(C63305ShB c63305ShB, boolean z) {
        this.A00 = c63305ShB;
        this.A01 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if (r3.isEmpty() != false) goto L28;
     */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.facebook.browser.lite.ipc.BrowserLiteCallback$Stub$Proxy, java.lang.Object] */
    @Override // android.content.ServiceConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onServiceConnected(android.content.ComponentName r7, android.os.IBinder r8) {
        /*
            r6 = this;
            X.ShB r4 = r6.A00
            if (r8 != 0) goto L18
            r2 = 0
        L5:
            r4.A06 = r2
            X.LK0 r0 = r4.A07
            if (r0 == 0) goto Le
            r0.A05(r2)
        Le:
            X.SH1 r5 = r4.A05
            if (r5 == 0) goto L5c
            com.facebook.browser.lite.ipc.BrowserLiteCallback r0 = r4.A06
            r3 = 0
            if (r0 == 0) goto L4f
            goto L3c
        L18:
            java.lang.String r0 = "com.facebook.browser.lite.ipc.BrowserLiteCallback"
            android.os.IInterface r2 = r8.queryLocalInterface(r0)
            if (r2 == 0) goto L27
            boolean r0 = r2 instanceof com.facebook.browser.lite.ipc.BrowserLiteCallback
            if (r0 == 0) goto L27
            com.facebook.browser.lite.ipc.BrowserLiteCallback r2 = (com.facebook.browser.lite.ipc.BrowserLiteCallback) r2
            goto L5
        L27:
            com.facebook.browser.lite.ipc.BrowserLiteCallback$Stub$Proxy r2 = new com.facebook.browser.lite.ipc.BrowserLiteCallback$Stub$Proxy
            r2.<init>()
            r0 = 1327775068(0x4f243d5c, float:2.7554847E9)
            int r1 = X.C0f9.A03(r0)
            r2.A00 = r8
            r0 = -138292883(0xfffffffff7c1d16d, float:-7.862195E33)
            X.C0f9.A0A(r0, r1)
            goto L5
        L3c:
            java.util.ArrayList r0 = r0.BfY()     // Catch: android.os.RemoteException -> L47
            if (r0 == 0) goto L4f
            java.util.HashSet r3 = X.AbstractC31171DnF.A0k(r0)     // Catch: android.os.RemoteException -> L47
            goto L4f
        L47:
            r2 = move-exception
            java.lang.String r1 = "BrowserLiteCallbacker"
            java.lang.String r0 = "Error in getPrefetchedInitialUrlKeys"
            X.C0K8.A0J(r1, r0, r2)
        L4f:
            monitor-enter(r5)
            if (r3 == 0) goto L58
            boolean r0 = r3.isEmpty()     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L59
        L58:
            r3 = 0
        L59:
            r5.A01 = r3     // Catch: java.lang.Throwable -> L79
            monitor-exit(r5)
        L5c:
            boolean r0 = r6.A01
            if (r0 == 0) goto L6a
            r0 = 1
            X.QDW r1 = new X.QDW
            r1.<init>(r4, r0)
            r0 = 0
            X.C63305ShB.A02(r1, r4, r0)
        L6a:
            r5 = r4
            monitor-enter(r5)
            X.SAg r0 = r4.A04     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L77
            X.0hu r1 = X.C0LK.A70     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = "alive"
            X.C0L6.A05(r1, r0)     // Catch: java.lang.Throwable -> L79
        L77:
            monitor-exit(r5)
            return
        L79:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ServiceConnectionC63438SkH.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C63305ShB c63305ShB = this.A00;
        synchronized (c63305ShB) {
            C62407SAg c62407SAg = c63305ShB.A04;
            if (c62407SAg != null) {
                C0L6.A05(C0LK.A70, "dead");
                int i = c62407SAg.A00 + 1;
                c62407SAg.A00 = i;
                C0L6.A05(C0LK.A6z, String.valueOf(i));
            }
        }
        c63305ShB.A07 = null;
    }
}
