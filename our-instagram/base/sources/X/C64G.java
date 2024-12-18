package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.64G, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C64G implements ServiceConnection, C64H {
    public ComponentName A01;
    public IBinder A02;
    public boolean A03;
    public final C64F A04;
    public final /* synthetic */ C61m A06;
    public final Map A05 = new HashMap();
    public int A00 = 2;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (r11 != null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(java.lang.String r17) {
        /*
            r16 = this;
            r0 = 3
            r12 = r16
            r12.A00 = r0
            android.os.StrictMode$VmPolicy r4 = android.os.StrictMode.getVmPolicy()
            boolean r0 = X.C64I.A01()
            if (r0 == 0) goto L1f
            android.os.StrictMode$VmPolicy$Builder r0 = new android.os.StrictMode$VmPolicy$Builder
            r0.<init>(r4)
            android.os.StrictMode$VmPolicy$Builder r0 = r0.permitUnsafeIntentLaunch()
            android.os.StrictMode$VmPolicy r0 = r0.build()
            android.os.StrictMode.setVmPolicy(r0)
        L1f:
            X.61m r2 = r12.A06     // Catch: java.lang.Throwable -> Lae
            X.63x r13 = r2.A01     // Catch: java.lang.Throwable -> Lae
            android.content.Context r10 = r2.A00     // Catch: java.lang.Throwable -> Lae
            X.64F r3 = r12.A04     // Catch: java.lang.Throwable -> Lae
            java.lang.String r6 = "ConnectionStatusConfig"
            java.lang.String r5 = r3.A01     // Catch: java.lang.Throwable -> Lae
            if (r5 == 0) goto L5a
            boolean r0 = r3.A03     // Catch: java.lang.Throwable -> Lae
            r9 = 0
            if (r0 == 0) goto L7d
            android.os.Bundle r8 = new android.os.Bundle     // Catch: java.lang.Throwable -> Lae
            r8.<init>()     // Catch: java.lang.Throwable -> Lae
            java.lang.String r0 = "serviceActionBundleKey"
            r8.putString(r0, r5)     // Catch: java.lang.Throwable -> Lae
            android.content.ContentResolver r7 = r10.getContentResolver()     // Catch: java.lang.IllegalArgumentException -> L4b java.lang.Throwable -> Lae
            android.net.Uri r1 = X.C64F.A04     // Catch: java.lang.IllegalArgumentException -> L4b java.lang.Throwable -> Lae
            java.lang.String r0 = "serviceIntentCall"
            android.os.Bundle r1 = r7.call(r1, r0, r9, r8)     // Catch: java.lang.IllegalArgumentException -> L4b java.lang.Throwable -> Lae
            if (r1 == 0) goto L70
            goto L66
        L4b:
            r0 = move-exception
            java.lang.String r1 = r0.toString()     // Catch: java.lang.Throwable -> Lae
            java.lang.String r0 = "Dynamic intent resolution failed: "
            java.lang.String r0 = r0.concat(r1)     // Catch: java.lang.Throwable -> Lae
            android.util.Log.w(r6, r0)     // Catch: java.lang.Throwable -> Lae
            goto L70
        L5a:
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> Lae
            r1.<init>()     // Catch: java.lang.Throwable -> Lae
            android.content.ComponentName r0 = r3.A00     // Catch: java.lang.Throwable -> Lae
            android.content.Intent r11 = r1.setComponent(r0)     // Catch: java.lang.Throwable -> Lae
            goto L88
        L66:
            java.lang.String r0 = "serviceResponseIntentKey"
            android.os.Parcelable r11 = r1.getParcelable(r0)     // Catch: java.lang.Throwable -> Lae
            android.content.Intent r11 = (android.content.Intent) r11     // Catch: java.lang.Throwable -> Lae
            if (r11 != 0) goto L88
        L70:
            java.lang.String r1 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> Lae
            java.lang.String r0 = "Dynamic lookup for intent failed for action: "
            java.lang.String r0 = r0.concat(r1)     // Catch: java.lang.Throwable -> Lae
            android.util.Log.w(r6, r0)     // Catch: java.lang.Throwable -> Lae
        L7d:
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> Lae
            r1.<init>(r5)     // Catch: java.lang.Throwable -> Lae
            java.lang.String r0 = r3.A02     // Catch: java.lang.Throwable -> Lae
            android.content.Intent r11 = r1.setPackage(r0)     // Catch: java.lang.Throwable -> Lae
        L88:
            r15 = 4225(0x1081, float:5.92E-42)
            r1 = 1
            r14 = r17
            boolean r0 = X.C1341263x.A01(r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> Lae
            r12.A03 = r0     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto La4
            android.os.Handler r0 = r2.A04     // Catch: java.lang.Throwable -> Lae
            android.os.Message r3 = r0.obtainMessage(r1, r3)     // Catch: java.lang.Throwable -> Lae
            android.os.Handler r2 = r2.A04     // Catch: java.lang.Throwable -> Lae
            r0 = 300000(0x493e0, double:1.482197E-318)
            r2.sendMessageDelayed(r3, r0)     // Catch: java.lang.Throwable -> Lae
            goto Laa
        La4:
            r0 = 2
            r12.A00 = r0     // Catch: java.lang.Throwable -> Lae
            r13.A02(r10, r12)     // Catch: java.lang.IllegalArgumentException -> Laa java.lang.Throwable -> Lae
        Laa:
            android.os.StrictMode.setVmPolicy(r4)
            return
        Lae:
            r0 = move-exception
            android.os.StrictMode.setVmPolicy(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64G.A00(java.lang.String):void");
    }

    public C64G(C64F c64f, C61m c61m) {
        this.A06 = c61m;
        this.A04 = c64f;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C61m c61m = this.A06;
        synchronized (c61m.A02) {
            c61m.A04.removeMessages(1, this.A04);
            this.A02 = iBinder;
            this.A01 = componentName;
            Iterator it = this.A05.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.A00 = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C61m c61m = this.A06;
        synchronized (c61m.A02) {
            c61m.A04.removeMessages(1, this.A04);
            this.A02 = null;
            this.A01 = componentName;
            Iterator it = this.A05.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
            }
            this.A00 = 2;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }
}
