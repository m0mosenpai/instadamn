package X;

/* renamed from: X.BoP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26566BoP extends AbstractC51572Yf {
    public final C45 A00;
    public final InterfaceC16660sJ A01;
    public final InterfaceC16620sF A02;
    public final float A03;
    public final long A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r8 == X.C05F.A0C) goto L14;
     */
    @Override // X.AbstractC51572Yf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC50812Vc A0Y(X.C76223bS r34) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26566BoP.A0Y(X.3bS):X.2Vc");
    }

    public C26566BoP(C45 c45, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF, float f, long j, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(interfaceC16660sJ, 8);
        this.A00 = c45;
        this.A05 = z;
        this.A06 = z2;
        this.A07 = z3;
        this.A03 = f;
        this.A04 = j;
        this.A02 = interfaceC16620sF;
        this.A01 = interfaceC16660sJ;
    }

    private final C2WF A03(C2Z1 c2z1) {
        long A02 = AbstractC28406CgC.A02(c2z1, C05F.A0Z);
        C75933ay c75933ay = C51722Yv.A02;
        Integer num = C05F.A00;
        boolean z = false;
        String str = null;
        C51722Yv A0h = AbstractC25225BEi.A0h(null, AbstractC25225BEi.A0m(num, 100.0f, 0));
        Integer num2 = C05F.A01;
        C51722Yv A0d = AbstractC25230BEn.A0d(A0h, num2, 100.0f, 0);
        EnumC77933eL enumC77933eL = EnumC77933eL.ABSOLUTE;
        Integer num3 = C05F.A0Y;
        C51722Yv A00 = C9CV.A00(A0d, num3, enumC77933eL, 3);
        C2Z0 A0L = AbstractC25233BEq.A0L(c2z1);
        C45 c45 = this.A00;
        if (c45.A08 && (c45.A02 instanceof C3T) && (c45.A01 instanceof C29492Cz6)) {
            C51722Yv A002 = C9CV.A00(null, num3, enumC77933eL, 3);
            long A0L2 = AbstractC25230BEn.A0L();
            C51722Yv A003 = C9CU.A00(C9CU.A00(A002, C05F.A0C, 1, A0L2), C05F.A0N, 1, A0L2);
            C2Z0 A13 = AbstractC25232BEp.A13(A0L);
            C87 c87 = C87.A0Y;
            C88 c88 = C88.A0t;
            C88 c882 = C88.A0s;
            C51722Yv A004 = C9CU.A00(C9CU.A00(null, num2, 0, A02), num, 0, A02);
            long doubleToRawLongBits = Double.doubleToRawLongBits(36.0d);
            AbstractC25231BEo.A1A(new C26518Bnd(A004, C9CU.A00(C9CU.A00(null, num2, 0, doubleToRawLongBits), num, 0, doubleToRawLongBits), c87, c88, c882, str, str, C29890DGe.A00(this, 47), 736, 0L, z), A13, A0L, A003);
        }
        if (c45.A07 && (c45.A02 instanceof C3T) && (c45.A01 instanceof C29492Cz6)) {
            C51722Yv A005 = C9CV.A00(null, num3, enumC77933eL, 3);
            long A0L3 = AbstractC25230BEn.A0L();
            C51722Yv A006 = C9CU.A00(C9CU.A00(A005, C05F.A0N, 1, A0L3), num3, 1, A0L3);
            C2Z0 A132 = AbstractC25232BEp.A13(A0L);
            C87 c872 = C87.A0T;
            C51722Yv A007 = C9CU.A00(C9CU.A00(null, num2, 0, A02), num, 0, A02);
            C88 c883 = C88.A0t;
            C88 c884 = C88.A0s;
            long doubleToRawLongBits2 = Double.doubleToRawLongBits(36.0d);
            AbstractC25231BEo.A1A(new C26518Bnd(A007, C9CU.A00(C9CU.A00(null, num2, 0, doubleToRawLongBits2), num, 0, doubleToRawLongBits2), c872, c883, c884, str, str, C29890DGe.A00(this, 48), 736, 0L, z), A132, A0L, A006);
        }
        return AbstractC76963ci.A03(A0L, c2z1, A00);
    }
}
