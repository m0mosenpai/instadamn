package X;

/* renamed from: X.Bl0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26355Bl0 extends AbstractC51572Yf {
    public final BX7 A00;
    public final CharSequence A01;
    public final InterfaceC16820sZ A02;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C2WF A04;
        InterfaceC30923Dia A00 = AbstractC28337CeP.A00(c76223bS);
        BX7 bx7 = this.A00;
        C29475Cyp c29475Cyp = (C29475Cyp) AbstractC77183d4.A00(c76223bS, C29890DGe.A00(this, 6), new Object[]{bx7});
        C51762Yz A002 = AbstractC77073ct.A00(c76223bS, C29890DGe.A00(this, 5));
        BX4 bx4 = (BX4) AbstractC77183d4.A00(c76223bS, new MEB(37, AbstractC77183d4.A00(c76223bS, DH2.A01(AbstractC77183d4.A00(c76223bS, DEC.A00, new Object[0]), A00, c76223bS, 7), new Object[]{A00}), AbstractC85303rL.A00(c76223bS, new C29895DGj(47, A002, this)), this, c76223bS, A00), new Object[0]);
        Object A003 = DH2.A00(c76223bS, A00, this, new Object[]{A00}, 6);
        AbstractC77183d4.A00(c76223bS, DEB.A00, new Object[0]);
        if (AbstractC25229BEm.A1W(A002)) {
            A04 = null;
        } else {
            C75933ay c75933ay = C51722Yv.A02;
            C51722Yv A004 = C9CU.A00(null, C05F.A09, 0, AbstractC25229BEm.A0B());
            C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
            AbstractC77363dM.A00(A12);
            A12.A00(C29478Cys.A00(c29475Cyp));
            A04 = AbstractC76963ci.A04(A12, c76223bS, A004);
        }
        C75933ay c75933ay2 = C51722Yv.A02;
        C51722Yv A16 = AbstractC25232BEp.A16(C9CU.A00(null, C05F.A01, 0, Double.doubleToRawLongBits(36.0d)), C05F.A00, A003);
        long A0L = AbstractC25230BEn.A0L();
        C51722Yv A005 = C9CU.A00(C9CU.A00(A16, C05F.A0u, 0, A0L), C05F.A1F, 0, A0L);
        C2Z0 A122 = AbstractC25232BEp.A12(c76223bS);
        C51722Yv A006 = C9CU.A00(null, C05F.A09, 0, AbstractC25229BEm.A0B());
        C2XE c2xe = A122.A00;
        C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
        A0P.A00(new C26450BmX(EnumC72438Xdi.CIRCLE_HANDLE, null, EnumC27423C8q.SIZE_16, EnumC27424C8r.OUTLINE, EnumC72394Xcg.A1W, null));
        A122.A00(AbstractC76963ci.A04(A0P, A122, A006));
        C2Z0 A0P2 = AbstractC167007dF.A0P(c2xe);
        A0P2.A00(new C26598Bov(bx7, bx4));
        A122.A00(AbstractC76963ci.A04(A0P2, A122, null));
        return AbstractC25227BEk.A0W(A04, A122, c76223bS, A005);
    }

    public C26355Bl0(BX7 bx7, CharSequence charSequence, InterfaceC16820sZ interfaceC16820sZ) {
        AbstractC167017dG.A1P(charSequence, bx7);
        this.A01 = charSequence;
        this.A00 = bx7;
        this.A02 = interfaceC16820sZ;
    }
}
