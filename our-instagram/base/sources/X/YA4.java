package X;

import android.content.Context;
import android.util.Pair;
import com.facebook.rsys.networkinfo.gen.NetworkInfoCallback;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Timer;

/* loaded from: classes12.dex */
public final class YA4 implements C1HW, InterfaceC15680qO {
    public int A00;
    public int A01;
    public int A02;
    public Pair A03;
    public C23441Cg A04;
    public C1EQ A05;
    public NetworkInfoCallback A06;
    public Timer A07;
    public Integer A08;
    public final long A09;
    public final long A0A;
    public final UserSession A0B;
    public final HashMap A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final Context A0F;
    public final C108404uR A0G;

    public static final synchronized void A00(NetworkInfoCallback networkInfoCallback, YA4 ya4) {
        synchronized (ya4) {
            HashMap hashMap = ya4.A0C;
            hashMap.clear();
            if (ya4.A0D) {
                ya4.A01(hashMap);
                networkInfoCallback.onUpdateRadioSignals(6, hashMap);
            }
        }
    }

    private final synchronized void A01(HashMap hashMap) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        C1EQ c1eq = this.A05;
        Integer num6 = null;
        if (c1eq != null) {
            num = Integer.valueOf(c1eq.A05);
        } else {
            num = null;
        }
        AbstractC72642XjV.A00(num, hashMap, AbstractC72658XkY.A04, 11);
        C1EQ c1eq2 = this.A05;
        if (c1eq2 != null) {
            num2 = Integer.valueOf(c1eq2.A06);
        } else {
            num2 = null;
        }
        AbstractC72642XjV.A00(num2, hashMap, AbstractC72658XkY.A05, 12);
        C1EQ c1eq3 = this.A05;
        if (c1eq3 != null) {
            num3 = Integer.valueOf(c1eq3.A08);
        } else {
            num3 = null;
        }
        AbstractC72642XjV.A00(num3, hashMap, AbstractC72658XkY.A07, 14);
        C1EQ c1eq4 = this.A05;
        if (c1eq4 != null) {
            num4 = Integer.valueOf(c1eq4.A07);
        } else {
            num4 = null;
        }
        AbstractC72642XjV.A00(num4, hashMap, AbstractC72658XkY.A06, 13);
        C1EQ c1eq5 = this.A05;
        if (c1eq5 != null) {
            num5 = Integer.valueOf(c1eq5.A00);
        } else {
            num5 = null;
        }
        AbstractC72642XjV.A00(num5, hashMap, AbstractC72658XkY.A00, 15);
        C1EQ c1eq6 = this.A05;
        if (c1eq6 != null) {
            num6 = Integer.valueOf(c1eq6.A04);
        }
        AbstractC72642XjV.A00(num6, hashMap, AbstractC72658XkY.A02, 8);
        AbstractC72642XjV.A00(Integer.valueOf(this.A02), hashMap, AbstractC72658XkY.A08, 6);
        AbstractC72642XjV.A00(Integer.valueOf(this.A01), hashMap, AbstractC72658XkY.A03, 9);
        AbstractC72642XjV.A00(Integer.valueOf(this.A00), hashMap, AbstractC72658XkY.A01, 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0049 A[Catch: all -> 0x004d, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0014, B:8:0x0018, B:10:0x001e, B:12:0x0033, B:14:0x0049), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final synchronized boolean A02(X.YA4 r5, java.util.HashMap r6) {
        /*
            monitor-enter(r5)
            X.4uR r2 = r5.A0G     // Catch: java.lang.Throwable -> L4d
            X.4uQ r1 = r2.A02     // Catch: java.lang.Throwable -> L4d
            r0 = 3882(0xf2a, float:5.44E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)     // Catch: java.lang.Throwable -> L4d
            boolean r0 = r1.hasPermission(r0)     // Catch: java.lang.Throwable -> L4d
            r0 = r0 ^ 1
            r4 = 0
            if (r0 != 0) goto L2f
            android.net.wifi.WifiManager r0 = r2.A01     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L2f
            android.net.wifi.WifiInfo r1 = r2.A01()     // Catch: java.lang.Throwable -> L2f java.lang.Throwable -> L4d
            if (r1 == 0) goto L2f
            int r0 = r1.getRssi()     // Catch: java.lang.Throwable -> L2f java.lang.Throwable -> L4d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L2f java.lang.Throwable -> L4d
            int r0 = r1.getFrequency()     // Catch: java.lang.Throwable -> L2f java.lang.Throwable -> L4d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L2f java.lang.Throwable -> L4d
            goto L31
        L2f:
            r2 = 0
            r3 = r4
        L31:
            r1 = 21
            X.17u r0 = X.AbstractC72658XkY.A0A     // Catch: java.lang.Throwable -> L4d
            X.AbstractC72642XjV.A00(r3, r6, r0, r1)     // Catch: java.lang.Throwable -> L4d
            r1 = 22
            X.17u r0 = X.AbstractC72658XkY.A09     // Catch: java.lang.Throwable -> L4d
            X.AbstractC72642XjV.A00(r2, r6, r0, r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.Integer r0 = r5.A08     // Catch: java.lang.Throwable -> L4d
            boolean r0 = X.C14360o3.A0K(r3, r0)     // Catch: java.lang.Throwable -> L4d
            r0 = r0 ^ 1
            if (r0 == 0) goto L4b
            r5.A08 = r3     // Catch: java.lang.Throwable -> L4d
        L4b:
            monitor-exit(r5)
            return r0
        L4d:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.YA4.A02(X.YA4, java.util.HashMap):boolean");
    }

    public final synchronized void A03() {
        C23441Cg c23441Cg = this.A04;
        if (c23441Cg != null) {
            c23441Cg.A0K.remove(this);
        }
        C15670qN.A00(this);
        this.A06 = null;
        Timer timer = this.A07;
        if (timer != null) {
            timer.cancel();
        }
        this.A07 = null;
    }

    @Override // X.C1HW
    public final synchronized void onCellSignalStrengthChanged(C1EQ c1eq) {
        this.A05 = c1eq;
        NetworkInfoCallback networkInfoCallback = this.A06;
        if (networkInfoCallback != null) {
            A00(networkInfoCallback, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (A02(r4, r2) != false) goto L19;
     */
    @Override // X.InterfaceC15680qO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void onConnectionChanged(android.net.NetworkInfo r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            android.content.Context r0 = r4.A0F     // Catch: java.lang.Throwable -> L6e
            android.util.Pair r3 = X.AbstractC15820qc.A02(r0)     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r2 = r3.first     // Catch: java.lang.Throwable -> L6e
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r1 = r3.second     // Catch: java.lang.Throwable -> L6e
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L6e
            android.util.Pair r0 = r4.A03     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r0 = r0.first     // Catch: java.lang.Throwable -> L6e
            boolean r0 = X.C14360o3.A0K(r2, r0)     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto L23
            android.util.Pair r0 = r4.A03     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r0 = r0.second     // Catch: java.lang.Throwable -> L6e
            boolean r0 = X.C14360o3.A0K(r1, r0)     // Catch: java.lang.Throwable -> L6e
            if (r0 != 0) goto L6c
        L23:
            r4.A03 = r3     // Catch: java.lang.Throwable -> L6e
            java.lang.String r1 = "wifi"
            boolean r0 = X.C14360o3.A0K(r2, r1)     // Catch: java.lang.Throwable -> L6e
            if (r0 != 0) goto L35
            java.lang.String r0 = "mobile"
            boolean r0 = X.C14360o3.A0K(r2, r0)     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto L6c
        L35:
            com.facebook.rsys.networkinfo.gen.NetworkInfoCallback r3 = r4.A06     // Catch: java.lang.Throwable -> L6e
            if (r3 == 0) goto L6c
            java.util.HashMap r2 = r4.A0C     // Catch: java.lang.Throwable -> L6e
            r2.clear()     // Catch: java.lang.Throwable -> L6e
            android.util.Pair r0 = r4.A03     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r0 = r0.first     // Catch: java.lang.Throwable -> L6e
            boolean r0 = X.C14360o3.A0K(r0, r1)     // Catch: java.lang.Throwable -> L6e
            r1 = 1
            if (r0 == 0) goto L57
            boolean r0 = r4.A0E     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto L6c
            boolean r0 = A02(r4, r2)     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto L6c
        L53:
            r3.onUpdateRadioSignals(r1, r2)     // Catch: java.lang.Throwable -> L6e
            goto L6c
        L57:
            android.util.Pair r0 = r4.A03     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r1 = r0.second     // Catch: java.lang.Throwable -> L6e
            java.lang.String r0 = "lte"
            boolean r0 = X.C14360o3.A0K(r1, r0)     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto L6c
            boolean r0 = r4.A0D     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto L6c
            r4.A01(r2)     // Catch: java.lang.Throwable -> L6e
            r1 = 6
            goto L53
        L6c:
            monitor-exit(r4)
            return
        L6e:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.YA4.onConnectionChanged(android.net.NetworkInfo):void");
    }

    public YA4(Context context, UserSession userSession) {
        AbstractC167017dG.A1P(context, userSession);
        this.A0F = context;
        this.A0B = userSession;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A09 = C18U.A01(c06090Tz, userSession, 36610266871502873L);
        this.A0A = C18U.A01(c06090Tz, userSession, 36610266871437336L);
        this.A0E = C18U.A06(c06090Tz, userSession, 36328791894933293L);
        this.A0D = C18U.A06(c06090Tz, userSession, 36328791894867756L);
        this.A0C = AbstractC166987dD.A1G();
        C108404uR A00 = C108364uN.A00(context);
        C14360o3.A07(A00);
        this.A0G = A00;
        this.A03 = AbstractC15820qc.A03(C18150uz.A0B.A01().A03());
        this.A02 = -1;
        this.A00 = -1;
    }

    @Override // X.C1HW
    public final void onCellIdentityChanged(C1HX c1hx) {
    }
}
