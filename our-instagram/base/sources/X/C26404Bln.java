package X;

/* renamed from: X.Bln, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26404Bln extends AbstractC51572Yf {
    public final int A00;
    public final C28266CdB A01;
    public final InterfaceC16660sJ A02;
    public final InterfaceC16620sF A03;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        CVV cvv = (CVV) C29910DGy.A00(c76223bS, this, new Object[]{Integer.valueOf(this.A00), this.A01.A03}, 5);
        C3e8 c3e8 = C3e8.FLEX_END;
        C75933ay c75933ay = C51722Yv.A02;
        Integer num = C05F.A00;
        C51722Yv A0h = AbstractC25225BEi.A0h(null, AbstractC25228BEl.A0m(num, 0));
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        if (this.A02 != null) {
            C3e8 c3e82 = C3e8.CENTER;
            EnumC77683ds enumC77683ds = EnumC77683ds.CENTER;
            long A0F = AbstractC25229BEm.A0F();
            C51722Yv A0D = AbstractC25234BEr.A0D(null, AbstractC25227BEk.A0Y(0, A0F), 0, AbstractC25230BEn.A0L());
            C2Z0 A13 = AbstractC25232BEp.A13(A12);
            String A0F2 = AbstractC77623dm.A0F(A13, 2131966478);
            C29910DGy A01 = C29910DGy.A01(this, 4);
            C88 c88 = C88.A0S;
            Integer num2 = C05F.A0E;
            C88 c882 = C88.A0g;
            long A0D2 = AbstractC25229BEm.A0D();
            long A0M = AbstractC25230BEn.A0M();
            A13.A00(new C26572BoV(C9CU.A00(null, C05F.A01, 0, AbstractC25230BEn.A0I()), c88, c882, C88.A05, A0F2, num2, null, A01, A0D2, A0M, A0M));
            A12.A00(AbstractC76963ci.A0J(A13, A12, A0D, null, enumC77683ds, null, c3e82, null, false));
        }
        EnumC77683ds enumC77683ds2 = EnumC77683ds.FLEX_END;
        long doubleToRawLongBits = Double.doubleToRawLongBits(100.0d);
        Integer num3 = C05F.A01;
        C51722Yv A00 = C9CU.A00(null, num3, 0, doubleToRawLongBits);
        EnumC77933eL enumC77933eL = EnumC77933eL.ABSOLUTE;
        Integer num4 = C05F.A0Y;
        C51722Yv A15 = AbstractC25232BEp.A15(A00, num4, enumC77933eL);
        long A0E = AbstractC25229BEm.A0E();
        C51722Yv A002 = C9CU.A00(C9CU.A00(A15, C05F.A0N, 1, A0E), num4, 1, A0E);
        C2Z0 A132 = AbstractC25232BEp.A13(A12);
        C51322Xf c51322Xf = cvv.A00;
        String str = cvv.A01;
        C29896DGk A003 = C29896DGk.A00(cvv, this, 32);
        C87 c87 = C87.A0X;
        int A004 = AbstractC28406CgC.A00(A132, C88.A0l);
        int EKE = C28351CfB.A00(AbstractC28337CeP.A01(A132)).EKE(C88.A0R, false);
        String A0F3 = AbstractC77623dm.A0F(A132, 2131966503);
        long A0H = AbstractC25229BEm.A0H();
        C26511BnW c26511BnW = new C26511BnW(AbstractC25232BEp.A16(C9CU.A00(C9CU.A00(null, num, 0, A0H), num3, 0, A0H), C05F.A0D, str), c87, null, Integer.valueOf(A004), Integer.valueOf(EKE), A0F3, A003, 40, true);
        AbstractC107374si.A00(c26511BnW, c51322Xf);
        A132.A00(c26511BnW);
        A12.A00(AbstractC76963ci.A0J(A132, A12, A002, null, enumC77683ds2, null, c3e8, null, false));
        return AbstractC76963ci.A02(A12, c76223bS, A0h);
    }

    public C26404Bln(C28266CdB c28266CdB, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF, int i) {
        this.A01 = c28266CdB;
        this.A00 = i;
        this.A02 = interfaceC16660sJ;
        this.A03 = interfaceC16620sF;
    }
}
