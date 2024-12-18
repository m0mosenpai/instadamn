package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ggk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37589Ggk implements InterfaceC43071ya {
    public boolean A00;
    public long A01;
    public C120985dq A02;
    public final UserSession A03;
    public final C37556GgC A04;

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00af, code lost:
    
        if (java.lang.Long.valueOf(r1) != null) goto L38;
     */
    @Override // X.InterfaceC43071ya
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ATP(X.C59062n7 r9, X.InterfaceC57162jr r10) {
        /*
            r8 = this;
            r7 = 0
            X.C14360o3.A0B(r9, r7)
            r6 = 1
            X.C14360o3.A0B(r10, r6)
            float r5 = r10.CGk(r9)
            X.0do r0 = X.C37727Gj2.A02
            java.lang.Object r3 = r0.getValue()
            X.Gj2 r3 = (X.C37727Gj2) r3
            com.instagram.common.session.UserSession r4 = r8.A03
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36317517612127565(0x8106970065154d, double:3.0306826045903894E-306)
            boolean r2 = X.C18U.A06(r2, r4, r0)
            java.lang.Integer r0 = r10.CFq(r9)
            int r1 = r0.intValue()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r1 == r7) goto L9f
            if (r1 == r6) goto L6b
            java.lang.Object r0 = r9.A04
            X.Ghd r0 = (X.C37644Ghd) r0
            X.3Zb r2 = r0.A0E
            boolean r0 = r8.A00
            if (r0 == 0) goto L57
            if (r2 == 0) goto L57
            boolean r0 = r2.A1l
            if (r0 != 0) goto L57
            r5 = 0
        L41:
            r3.A00 = r5
            java.lang.Object r0 = r9.A03
            X.5dq r0 = (X.C120985dq) r0
            boolean r0 = r0.CdW()
            if (r0 != 0) goto L56
            if (r2 == 0) goto L56
            X.5k9 r0 = X.AbstractC124495k7.A00(r4)
            r0.A00(r2)
        L56:
            return
        L57:
            java.lang.Long r0 = r3.A01
            if (r0 == 0) goto L68
            long r5 = java.lang.System.currentTimeMillis()
            long r0 = r0.longValue()
            long r5 = r5 - r0
            long r0 = r3.A00
            long r5 = r5 + r0
            goto L41
        L68:
            long r5 = r3.A00
            goto L41
        L6b:
            if (r2 == 0) goto L91
            java.lang.Object r1 = r9.A03
            X.5dq r1 = (X.C120985dq) r1
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 != 0) goto L91
            X.5dq r0 = r8.A02
            boolean r0 = X.C14360o3.A0K(r0, r1)
            if (r0 != 0) goto L91
            r8.A02 = r1
            long r1 = r8.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            if (r0 != 0) goto L8b
            long r1 = java.lang.System.currentTimeMillis()
        L8b:
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            r3.A01 = r0
        L91:
            java.lang.Object r0 = r9.A04
            X.Ghd r0 = (X.C37644Ghd) r0
            X.3Zb r1 = r0.A0E
            if (r1 == 0) goto L56
            r0 = 63
            X.C75113Zb.A00(r1, r0)
            return
        L9f:
            if (r2 == 0) goto Ld3
            long r1 = java.lang.System.currentTimeMillis()
            r8.A01 = r1
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 != 0) goto Lb7
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            if (r0 == 0) goto Ld3
        Lb1:
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            r3.A01 = r0
        Lb7:
            java.lang.Object r0 = r9.A03
            X.5dq r0 = (X.C120985dq) r0
            boolean r0 = r0.CdW()
            if (r0 != 0) goto L56
            java.lang.Object r0 = r9.A04
            X.Ghd r0 = (X.C37644Ghd) r0
            X.3Zb r3 = r0.A0E
            if (r3 == 0) goto L56
            X.5k9 r2 = X.AbstractC124495k7.A00(r4)
            r0 = 3000(0xbb8, double:1.482E-320)
            r2.A01(r3, r0)
            return
        Ld3:
            long r1 = java.lang.System.currentTimeMillis()
            goto Lb1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37589Ggk.ATP(X.2n7, X.2jr):void");
    }

    public C37589Ggk(UserSession userSession, C37556GgC c37556GgC) {
        AbstractC167017dG.A1P(userSession, c37556GgC);
        this.A03 = userSession;
        this.A04 = c37556GgC;
        this.A01 = System.currentTimeMillis();
    }
}
