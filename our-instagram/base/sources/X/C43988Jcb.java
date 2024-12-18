package X;

/* renamed from: X.Jcb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43988Jcb implements InterfaceC41501vz {
    public final /* synthetic */ JR2 A00;

    public C43988Jcb(JR2 jr2) {
        this.A00 = jr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (r4 == X.C05F.A0C) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    @Override // X.InterfaceC41501vz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onEvent(java.lang.Object r15) {
        /*
            r14 = this;
            r0 = -1436875571(0xffffffffaa5b04cd, float:-1.9452773E-13)
            int r2 = X.C0f9.A03(r0)
            X.LYI r15 = (X.LYI) r15
            r0 = -360978839(0xffffffffea7be669, float:-7.6132115E25)
            int r3 = X.C0f9.A03(r0)
            r1 = 0
            X.C14360o3.A0B(r15, r1)
            java.lang.Integer r4 = r15.A00
            java.lang.Integer r0 = X.C05F.A01
            if (r4 == r0) goto L1f
            java.lang.Integer r0 = X.C05F.A0C
            r7 = 0
            if (r4 != r0) goto L20
        L1f:
            r7 = 1
        L20:
            X.JR2 r5 = r14.A00
            X.JRj r6 = r5.A0q()
            X.C14360o3.A0B(r4, r1)
            X.JcJ r1 = r6.A0E
            java.lang.Integer r0 = r1.A0J
            if (r0 == r4) goto L34
            r1.A0J = r4
            X.C43626JRj.A04(r6)
        L34:
            X.0do r0 = r5.A10
            java.lang.Object r0 = r0.getValue()
            X.3Em r0 = (X.InterfaceC70513Em) r0
            if (r7 == 0) goto Lc1
            r0.APU()
        L41:
            java.lang.Integer r7 = X.C05F.A0C
            if (r4 == r7) goto L90
            java.lang.Integer r0 = X.C05F.A0N
            if (r4 == r0) goto L90
            java.lang.Integer r0 = X.C05F.A00
            if (r4 != r0) goto L64
            X.DqE r0 = r5.A0n
            if (r0 == 0) goto L54
            X.AbstractC31177DnL.A1L(r0)
        L54:
            r0 = 0
            r5.A0n = r0
            com.instagram.common.session.UserSession r6 = r5.A0p()
            r8 = 0
            java.lang.String r7 = "ERROR_SNACK_BAR_HIDE"
        L5f:
            r10 = r8
            r12 = r8
            X.C162337Ov.A0p(r6, r7, r8, r10, r12)
        L64:
            java.lang.Integer r0 = X.C05F.A00
            if (r4 == r0) goto L7a
            X.JYw r0 = X.AbstractC43593JPy.A0c(r5)
            X.3Av r1 = r0.A05
            int r0 = r4.intValue()
            switch(r0) {
                case 0: goto L8d;
                case 1: goto L8a;
                case 2: goto L87;
                default: goto L75;
            }
        L75:
            java.lang.String r0 = "SEQUENCE_ID_FAR_BEHIND_WITH_MANUAL_FETCH"
        L77:
            r1.A07(r0)
        L7a:
            r0 = 997163892(0x3b6f8374, float:0.0036546858)
            X.C0f9.A0A(r0, r3)
            r0 = -2095843912(0xffffffff8313f5b8, float:-4.348149E-37)
            X.C0f9.A0A(r0, r2)
            return
        L87:
            java.lang.String r0 = "SEQUENCE_ID_FAR_BEHIND_WITH_INITIAL_LOADING"
            goto L77
        L8a:
            java.lang.String r0 = "IRIS_QUEUE_STUCK"
            goto L77
        L8d:
            java.lang.String r0 = "ERROR_CLEARED"
            goto L77
        L90:
            X.6i8 r6 = X.AbstractC25229BEm.A0j()
            java.lang.String r0 = "direct_inbox_loading_error"
            r6.A0H = r0
            X.2oe r0 = r5.A1L
            android.content.Context r1 = r0.requireContext()
            r0 = 2131959652(0x7f131f64, float:1.955595E38)
            X.AbstractC25226BEj.A1N(r1, r6, r0)
            if (r4 != r7) goto Lbd
            r6.A06()
        La9:
            X.DqE r1 = r6.A00()
            r5.A0n = r1
            X.1vu r0 = X.C41451vu.A01
            X.AbstractC166997dE.A1O(r0, r1)
            com.instagram.common.session.UserSession r6 = r5.A0p()
            r8 = 0
            java.lang.String r7 = "ERROR_SNACK_BAR_IMRESSION"
            goto L5f
        Lbd:
            r0 = -1
            r6.A01 = r0
            goto La9
        Lc1:
            r0.ARj()
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43988Jcb.onEvent(java.lang.Object):void");
    }
}
