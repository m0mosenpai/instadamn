package X;

/* renamed from: X.Bo4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26545Bo4 extends AbstractC51572Yf {
    public static final long A02;
    public static final long A03;
    public static final long A04;
    public static final long A07;
    public final CW3 A00;
    public final InterfaceC16660sJ A01;
    public static final long A06 = AbstractC25229BEm.A0F();
    public static final long A05 = Double.doubleToRawLongBits(96.0d);

    public C26545Bo4(CW3 cw3, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 2);
        this.A00 = cw3;
        this.A01 = interfaceC16660sJ;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        int A00 = AbstractC28406CgC.A00(c76223bS, C88.A0d);
        long j = A04;
        long A0M = AbstractC25230BEn.A0M();
        C2XE c2xe = c76223bS.A05;
        BSB bsb = new BSB(c2xe, new BSA());
        BSA bsa = bsb.A01;
        bsa.A0C = true;
        bsa.A02 = A00;
        bsa.A00 = AbstractC25228BEl.A07(c76223bS, j);
        bsa.A01 = AbstractC25228BEl.A07(c76223bS, A0M);
        bsa.A03 = Integer.MIN_VALUE;
        bsa.A06 = 922746880;
        bsa.A05 = 50331648;
        bsa.A04 = -1;
        bsa.A0A = false;
        bsa.A0B = false;
        bsa.A08 = false;
        bsa.A09 = false;
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A002 = C9CU.A00(null, C05F.A06, 0, A06);
        long j2 = A05;
        Integer num = C05F.A0Y;
        C51722Yv A003 = C9CU.A00(A002, num, 0, j2);
        EnumC77683ds enumC77683ds = EnumC77683ds.CENTER;
        C3e8 c3e8 = C3e8.FLEX_START;
        EnumC77683ds enumC77683ds2 = EnumC77683ds.FLEX_START;
        C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
        CW3 cw3 = this.A00;
        String str = cw3.A01;
        Integer num2 = C05F.A0G;
        C88 c88 = C88.A0Z;
        long j3 = A02;
        C93E c93e = C93E.TEXT_START;
        A0P.A00(new C26567BoQ(null, c93e, c88, str, num2, 0, j3, j3));
        String str2 = cw3.A03;
        long j4 = A03;
        A0P.A00(new C26567BoQ(C9CU.A00(null, C05F.A08, 0, A07), c93e, c88, str2, num, 2, j4, j4));
        BSB.A01(AbstractC76963ci.A06(A0P, c76223bS, A003, enumC77683ds, enumC77683ds2, c3e8, false), bsb);
        return new C26555BoE(bsa, c75933ay, new C29472Cym(C05F.A01, C05F.A00, C05F.A0C), C29905DGt.A01(this, 0), null);
    }

    static {
        long A0K = AbstractC25230BEn.A0K();
        A02 = A0K;
        A03 = AbstractC25229BEm.A0B();
        A07 = A0K;
        A04 = AbstractC25230BEn.A0L();
    }
}
