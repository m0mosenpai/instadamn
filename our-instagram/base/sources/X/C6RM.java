package X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: X.6RM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6RM implements Runnable {
    public int A00;
    public long A01;
    public long A02;
    public boolean A03;
    public long A04;
    public AnonymousClass195 A05;
    public final int A06;
    public final long A07;
    public final Handler A08;
    public final InterfaceC16660sJ A09;
    public final long A0A;
    public final long A0B;
    public final C138996Rg A0C;
    public final C19L A0D;

    public C6RM(C138996Rg c138996Rg, InterfaceC16660sJ interfaceC16660sJ, C19L c19l, int i, long j, long j2, long j3) {
        C14360o3.A0B(c138996Rg, 1);
        this.A0C = c138996Rg;
        this.A0D = c19l;
        this.A0A = j;
        this.A0B = j2;
        this.A07 = j3;
        this.A06 = i;
        this.A09 = interfaceC16660sJ;
        this.A08 = new Handler(Looper.getMainLooper());
    }

    public final void A00() {
        this.A03 = true;
        this.A08.removeCallbacks(this);
        AnonymousClass195 anonymousClass195 = this.A05;
        if (anonymousClass195 != null) {
            this.A01 = SystemClock.uptimeMillis() - this.A04;
            anonymousClass195.AGH(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r9 = this;
            r7 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r7)
            if (r0 == 0) goto L10
            r1 = 1757694281(0x68c44949, float:7.4154856E24)
            java.lang.String r0 = "ResponsiveAndIdleDetector.run"
            X.C0fO.A01(r0, r1)
        L10:
            boolean r0 = r9.A03     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L15
            goto L7e
        L15:
            long r3 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L8b
            long r0 = r9.A02     // Catch: java.lang.Throwable -> L8b
            long r3 = r3 - r0
            long r1 = r9.A0B     // Catch: java.lang.Throwable -> L8b
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L3b
            int r5 = r9.A00     // Catch: java.lang.Throwable -> L8b
            long r3 = (long) r5     // Catch: java.lang.Throwable -> L8b
            long r1 = r9.A0A     // Catch: java.lang.Throwable -> L8b
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L3b
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L8b
            r9.A02 = r0     // Catch: java.lang.Throwable -> L8b
            int r0 = r5 + 1
            r9.A00 = r0     // Catch: java.lang.Throwable -> L8b
            android.os.Handler r0 = r9.A08     // Catch: java.lang.Throwable -> L8b
            r0.post(r9)     // Catch: java.lang.Throwable -> L8b
            goto L74
        L3b:
            X.6Rg r6 = r9.A0C     // Catch: java.lang.Throwable -> L8b
            int r0 = r9.A00     // Catch: java.lang.Throwable -> L8b
            long r4 = (long) r0     // Catch: java.lang.Throwable -> L8b
            long r2 = r9.A0A     // Catch: java.lang.Throwable -> L8b
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 0
            if (r1 > 0) goto L48
            r0 = 1
        L48:
            com.facebook.quicklog.QuickPerformanceLogger r3 = r6.A03     // Catch: java.lang.Throwable -> L8b
            int r2 = r6.A01     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L71
            java.lang.String r1 = "responsive! Waiting for delay..."
        L50:
            r0 = 220138478(0xd1f0bee, float:4.9010018E-31)
            r3.markerPoint(r0, r2, r1)     // Catch: java.lang.Throwable -> L8b
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L8b
            r9.A04 = r0     // Catch: java.lang.Throwable -> L8b
            X.19L r3 = r9.A0D     // Catch: java.lang.Throwable -> L8b
            r1 = 0
            r0 = 47
            X.9Cv r2 = new X.9Cv     // Catch: java.lang.Throwable -> L8b
            r2.<init>(r9, r1, r0)     // Catch: java.lang.Throwable -> L8b
            X.191 r1 = X.AnonymousClass191.A00     // Catch: java.lang.Throwable -> L8b
            java.lang.Integer r0 = X.C05F.A00     // Catch: java.lang.Throwable -> L8b
            X.1Dx r0 = X.AbstractC23641Du.A03(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L8b
            r9.A05 = r0     // Catch: java.lang.Throwable -> L8b
            goto L74
        L71:
            java.lang.String r1 = "not_responsive (hit max pings). Waiting for delay..."
            goto L50
        L74:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r7)
            if (r0 == 0) goto L8a
            r0 = -2143604360(0xffffffff803b3178, float:-5.43604E-39)
            goto L87
        L7e:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r7)
            if (r0 == 0) goto L8a
            r0 = -1453054475(0xffffffffa96425f5, float:-5.0659092E-14)
        L87:
            X.C0fO.A00(r0)
        L8a:
            return
        L8b:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r7)
            if (r0 == 0) goto L98
            r0 = 829283886(0x316dde2e, float:3.4614334E-9)
            X.C0fO.A00(r0)
        L98:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6RM.run():void");
    }
}
