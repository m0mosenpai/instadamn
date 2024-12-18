package X;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0hY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10640hY implements C0OO {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C04140Kg A03;
    public final C0LW A04;
    public final C0Pe A05;
    public final InterfaceC08830cm A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final /* synthetic */ C15170pX A0A;

    public static void A00(final C10640hY c10640hY, int i, long j) {
        final C024209q c024209q = new C024209q(null);
        if (i > 0) {
            c024209q.A01(C0LK.A16, i);
        }
        c024209q.A02(C0LK.A3E, Long.valueOf(j / 1000));
        c024209q.A02(C0LK.A1X, Long.valueOf(System.currentTimeMillis() / 1000));
        c024209q.A03(C0LK.A4x, "unexplained");
        if (C0PD.A03) {
            c024209q.A00(C0LK.A0C, true);
        }
        int i2 = C0M4.A01;
        if (i2 != 2 && !C0M4.A00()) {
            if (i2 == 1) {
                C0LW c0lw = c10640hY.A04;
                C0M6 c0m6 = C0M6.CRITICAL_REPORT;
                c0lw.A0E(c0m6, c10640hY);
                c0lw.A08(c024209q, c0m6, c10640hY);
                Executors.newScheduledThreadPool(1).schedule(new Runnable() { // from class: X.0Op
                    @Override // java.lang.Runnable
                    public final void run() {
                        C10640hY c10640hY2 = C10640hY.this;
                        if (!C0LW.A0J.contains("UnexplainedAppDeathDetector")) {
                            c10640hY2.A04.A0D(C0M6.CRITICAL_REPORT, c10640hY2);
                        }
                    }
                }, 1200L, TimeUnit.MILLISECONDS);
                return;
            }
            return;
        }
        if (C0M4.A03) {
            C04590Mb.A04.execute(new Runnable() { // from class: X.0Oo
                @Override // java.lang.Runnable
                public final void run() {
                    C10640hY c10640hY2 = c10640hY;
                    C024209q c024209q2 = c024209q;
                    C0LW c0lw2 = c10640hY2.A04;
                    C0M6 c0m62 = C0M6.CRITICAL_REPORT;
                    c0lw2.A0E(c0m62, c10640hY2);
                    c0lw2.A08(c024209q2, c0m62, c10640hY2);
                    c0lw2.A0D(c0m62, c10640hY2);
                }
            });
            return;
        }
        C0LW c0lw2 = c10640hY.A04;
        C0M6 c0m62 = C0M6.CRITICAL_REPORT;
        c0lw2.A0E(c0m62, c10640hY);
        c0lw2.A08(c024209q, c0m62, c10640hY);
        c0lw2.A0D(c0m62, c10640hY);
    }

    @Override // X.C0OO
    public final /* synthetic */ C0Z0 BNJ() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
    @Override // X.C0OO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void start() {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10640hY.start():void");
    }

    public C10640hY(C04140Kg c04140Kg, C0LW c0lw, C0Pe c0Pe, C15170pX c15170pX, InterfaceC08830cm interfaceC08830cm, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        this.A0A = c15170pX;
        this.A05 = c0Pe;
        this.A04 = c0lw;
        this.A09 = z;
        this.A02 = i;
        this.A07 = z2;
        this.A00 = i2;
        this.A08 = z3;
        this.A01 = i3;
        this.A06 = interfaceC08830cm;
        this.A03 = c04140Kg;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (r2.toLowerCase(java.util.Locale.US).contains("remove task") == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ java.lang.Boolean A01(long r4, long r6) {
        /*
            r3 = this;
            int r0 = r3.A01
            if (r0 <= 0) goto L41
            r0 = 15000(0x3a98, double:7.411E-320)
            long r6 = r6 + r0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 > 0) goto L41
            X.0Me r0 = X.C04620Me.A03
            if (r0 == 0) goto L47
            int r2 = r0.A01()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r1 < r0) goto L41
            if (r2 == 0) goto L41
            X.0Kg r0 = r3.A03
            X.0Kf r0 = r0.A00(r2)
            if (r0 == 0) goto L41
            java.lang.String r2 = r0.A08()
            int r1 = r0.A03()
            r0 = 10
            if (r1 != r0) goto L41
            if (r2 == 0) goto L41
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r2.toLowerCase(r0)
            java.lang.String r0 = "remove task"
            boolean r0 = r1.contains(r0)
            r1 = 1
            if (r0 != 0) goto L42
        L41:
            r1 = 0
        L42:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L47:
            java.lang.String r1 = "Did you call PreviousSessionHelper.init?"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10640hY.A01(long, long):java.lang.Boolean");
    }

    @Override // X.C0OO
    public final C0OP BW2() {
        return C0OP.A0X;
    }

    @Override // X.C0OO
    public final /* synthetic */ int BDP() {
        return 100000;
    }
}
