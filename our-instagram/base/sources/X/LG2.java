package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LG2 {
    public static final Integer[] A04;
    public static final Integer[] A05;
    public final UserSession A02;
    public final String A03;
    public final C41761wQ A01 = AbstractC31174DnI.A0S();
    public LI2 A00 = new LI2();

    static {
        Integer num = C05F.A00;
        Integer num2 = C05F.A01;
        A05 = new Integer[]{num, num2, C05F.A0C};
        A04 = new Integer[]{num, num2};
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(java.util.ArrayList r14) {
        /*
            r13 = this;
            X.LI2 r2 = r13.A00
            r6 = 0
            com.instagram.common.session.UserSession r4 = r13.A02
            X.0Tz r3 = X.C06090Tz.A06
            r0 = 36597648257518453(0x82055e00010b75, double:3.2078383527311565E-306)
            int r11 = X.AbstractC25225BEi.A07(r3, r4, r0)
            r0 = 36597648257649527(0x82055e00030b77, double:3.207838352814048E-306)
            int r10 = X.AbstractC25225BEi.A07(r3, r4, r0)
            r0 = 36597648257715064(0x82055e00040b78, double:3.207838352855494E-306)
            int r5 = X.AbstractC25225BEi.A07(r3, r4, r0)
            if (r5 < 0) goto L5b
            java.lang.Integer[] r1 = X.LG2.A05
            r0 = 3
            if (r5 >= r0) goto L5b
            r7 = r1[r5]
        L2b:
            r0 = 36597648257911673(0x82055e00070b79, double:3.2078383529798304E-306)
            int r3 = X.AbstractC25225BEi.A07(r3, r4, r0)
            if (r3 < 0) goto L56
            java.lang.Integer[] r1 = X.LG2.A04
            r0 = 2
            if (r3 >= r0) goto L56
            r8 = r1[r3]
        L3d:
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36316173281333343(0x81055e0009105f, double:3.029832444382938E-306)
            boolean r12 = X.C18U.A06(r3, r4, r0)
            X.JxD r6 = new X.JxD
            r9 = r14
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0 = 44
            X.MHJ r0 = X.MHJ.A00(r13, r0)
            monitor-enter(r2)
            goto L60
        L56:
            java.lang.Integer[] r0 = X.LG2.A04
            r8 = r0[r6]
            goto L3d
        L5b:
            java.lang.Integer[] r0 = X.LG2.A05
            r7 = r0[r6]
            goto L2b
        L60:
            r2.A02 = r6     // Catch: java.lang.Throwable -> L95
            r2.A03 = r0     // Catch: java.lang.Throwable -> L95
            X.LI2.A01(r2)     // Catch: java.lang.Throwable -> L95
            monitor-exit(r2)
            boolean r0 = X.AbstractC25226BEj.A1b(r14)
            if (r0 == 0) goto L94
            java.lang.String r0 = r13.A03
            java.lang.String r3 = ""
            if (r0 == 0) goto L88
            com.instagram.user.model.User r0 = X.AbstractC31174DnI.A0k(r4, r0)
            if (r0 == 0) goto L80
            java.lang.String r1 = r0.getFullName()
            if (r1 != 0) goto L81
        L80:
            r1 = r3
        L81:
            X.Ktz r0 = new X.Ktz
            r0.<init>(r1)
        L86:
            monitor-enter(r2)
            goto L8e
        L88:
            X.Ktz r0 = new X.Ktz
            r0.<init>(r3)
            goto L86
        L8e:
            r2.A01 = r0     // Catch: java.lang.Throwable -> L95
            X.LI2.A01(r2)     // Catch: java.lang.Throwable -> L95
            monitor-exit(r2)
        L94:
            return
        L95:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LG2.A00(java.util.ArrayList):void");
    }

    public LG2(UserSession userSession, String str) {
        this.A02 = userSession;
        this.A03 = str;
    }
}
