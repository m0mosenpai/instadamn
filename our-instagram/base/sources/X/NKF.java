package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NKF extends OX6 {
    public C55196Oe3 A00;
    public final C07X A01;
    public final UserSession A02;
    public final AbstractC55082Oac A03;
    public final C23031Ai A04;
    public final InterfaceC19390xP A05;
    public final C05A A06;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r5.A00 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.NKF r5) {
        /*
            X.1Ai r3 = r5.A04
            X.0ry r2 = r3.A0e
            X.0YR[] r1 = X.C23031Ai.A8c
            r0 = 186(0xba, float:2.6E-43)
            boolean r0 = X.AbstractC167017dG.A1b(r3, r2, r1, r0)
            if (r0 != 0) goto L13
            X.Oe3 r0 = r5.A00
            r4 = 1
            if (r0 != 0) goto L14
        L13:
            r4 = 0
        L14:
            X.05A r3 = r5.A06
            java.lang.Object r0 = r3.getValue()
            X.MtP r0 = (X.C51740MtP) r0
            boolean r0 = r0.A01
            if (r4 == r0) goto L3c
            java.lang.Object r0 = r3.getValue()
            X.MtP r0 = (X.C51740MtP) r0
            java.lang.String r2 = r0.A00
            r1 = 4
            X.MtP r0 = new X.MtP
            r0.<init>(r2, r4, r1)
            r3.Egh(r0)
            if (r4 == 0) goto L3c
            X.Oe3 r1 = r5.A00
            if (r1 == 0) goto L3c
            java.lang.String r0 = "IMPRESSION"
            X.C55196Oe3.A04(r1, r0)
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NKF.A00(X.NKF):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NKF(C07X c07x, UserSession userSession, AbstractC55082Oac abstractC55082Oac) {
        super(abstractC55082Oac);
        AbstractC167017dG.A1R(userSession, c07x);
        this.A03 = abstractC55082Oac;
        this.A02 = userSession;
        this.A01 = c07x;
        this.A04 = AbstractC23021Ah.A00(userSession);
        C008002u A1H = AbstractC25225BEi.A1H(new C51740MtP(4));
        this.A06 = A1H;
        this.A05 = A1H;
        AbstractC166987dD.A1Z(new PZZ(this, null, 42), C07Y.A00(this.A01));
    }
}
