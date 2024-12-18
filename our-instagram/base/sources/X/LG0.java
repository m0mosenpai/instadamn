package X;

/* loaded from: classes8.dex */
public final class LG0 {
    public final /* synthetic */ C47952LGm A00;
    public final /* synthetic */ L37 A01;
    public final /* synthetic */ LK0 A02;
    public final /* synthetic */ String A03;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0086, code lost:
    
        if (r1 != 13) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.C46342KfQ r8, java.lang.Integer r9, java.lang.Integer r10) {
        /*
            r7 = this;
            r6 = 0
            java.lang.Throwable r1 = r8.A01
            boolean r0 = r1 instanceof X.C46339KfN
            if (r0 == 0) goto L73
            X.KfN r1 = (X.C46339KfN) r1
            java.lang.Integer r0 = r1.A00
            if (r0 == 0) goto L73
            int r1 = r0.intValue()
            r0 = 2
            if (r1 != r0) goto L65
            X.Kcn r4 = X.EnumC46211Kcn.A0B
        L16:
            java.lang.StringBuilder r2 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "Restore module fetch failure (error: "
            r2.append(r0)
            java.lang.String r5 = r4.A01
            r2.append(r5)
            java.lang.String r0 = ", attempts remaining: "
            r2.append(r0)
            java.lang.String r1 = "null"
            r0 = r9
            if (r9 != 0) goto L2f
            r0 = r1
        L2f:
            r2.append(r0)
            java.lang.String r0 = ", backoff time (s): "
            r2.append(r0)
            if (r10 == 0) goto L3a
            r1 = r10
        L3a:
            java.lang.String r1 = X.AbstractC166997dE.A0v(r1, r2)
            java.lang.String r0 = "VestaLoginClient"
            X.C0K8.A0F(r0, r1, r8)
            X.LGm r0 = r7.A00
            com.facebook.quicklog.LightweightQuickPerformanceLogger r3 = r0.A01
            r2 = 1021649468(0x3ce5223c, float:0.027970426)
            int r1 = r0.A00
            java.lang.String r0 = "fetch_recovery_code_error"
            r3.markerPoint(r2, r1, r0)
            java.lang.String r0 = "fetch_rc_error"
            r3.markerAnnotate(r2, r1, r0, r5)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
            X.LK0 r1 = r7.A02
            X.LGV r0 = new X.LGV
            r0.<init>(r4, r2, r10, r9)
            r1.A05(r0)
            return
        L65:
            r0 = 3
            if (r1 == r0) goto L91
            r0 = 10
            if (r1 == r0) goto L8b
            r0 = 11
            if (r1 != r0) goto L88
            X.Kcn r4 = X.EnumC46211Kcn.A09
            goto L16
        L73:
            java.lang.Integer r0 = r8.A00
            int r1 = r0.intValue()
            r0 = 4
            if (r1 == r0) goto L94
            r0 = 9
            if (r1 == r0) goto L91
            r0 = 8
            if (r1 == r0) goto L8e
            r0 = 13
            if (r1 == r0) goto L8b
        L88:
            X.Kcn r4 = X.EnumC46211Kcn.A07
            goto L16
        L8b:
            X.Kcn r4 = X.EnumC46211Kcn.A05
            goto L16
        L8e:
            X.Kcn r4 = X.EnumC46211Kcn.A0E
            goto L16
        L91:
            X.Kcn r4 = X.EnumC46211Kcn.A08
            goto L16
        L94:
            X.Kcn r4 = X.EnumC46211Kcn.A06
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LG0.A01(X.KfQ, java.lang.Integer, java.lang.Integer):void");
    }

    public LG0(C47952LGm c47952LGm, L37 l37, LK0 lk0, String str) {
        this.A00 = c47952LGm;
        this.A03 = str;
        this.A01 = l37;
        this.A02 = lk0;
    }

    public static void A00(L2C l2c, LG0 lg0, C46342KfQ c46342KfQ) {
        lg0.A01(c46342KfQ, l2c.A00, l2c.A01);
    }
}
