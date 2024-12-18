package X;

/* renamed from: X.Bme, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26457Bme extends AbstractC51572Yf {
    public final AbstractC50812Vc A00;
    public final AbstractC50812Vc A01;
    public final String A02;
    public final C51722Yv A03;
    public final String A04;
    public final InterfaceC16820sZ A05;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C2WH c2wh;
        C14360o3.A0B(c76223bS, 0);
        C51722Yv c51722Yv = this.A03;
        String str = this.A04;
        C2Z0 A0P = AbstractC167007dF.A0P(c76223bS.ArD());
        AbstractC50812Vc abstractC50812Vc = this.A00;
        if (abstractC50812Vc != null) {
            C75933ay c75933ay = C51722Yv.A02;
            c2wh = AbstractC76963ci.A0I(AbstractC25232BEp.A11(abstractC50812Vc, A0P.A00), A0P, C9CU.A00(AbstractC25233BEq.A0a(null, C05F.A0C, 0.0f), C05F.A1F, 0, AbstractC28159Cb6.A06));
        } else {
            c2wh = null;
        }
        A0P.A00(c2wh);
        C2XE c2xe = A0P.A00;
        C2Z0 A0P2 = AbstractC167007dF.A0P(c2xe);
        Integer num = C05F.A07;
        C88 c88 = C88.A0Z;
        C93E c93e = C93E.TEXT_START;
        long A0M = AbstractC25230BEn.A0M();
        long A0K = AbstractC25230BEn.A0K();
        A0P2.A00(new C26567BoQ(null, c93e, c88, str, num, 0, A0M, A0K));
        String str2 = this.A02;
        if (str2 != null && str2.length() != 0) {
            A0P2.A00(new C26567BoQ(null, c93e, C88.A0i, str2, C05F.A0N, 0, A0M, A0K));
        }
        A0P.A00(AbstractC76963ci.A00(A0P2));
        C75933ay c75933ay2 = C51722Yv.A02;
        Integer num2 = C05F.A01;
        C51722Yv A0d = AbstractC25230BEn.A0d(AbstractC25230BEn.A0d(null, num2, 1.0f, 1), C05F.A0C, 0.0f, 1);
        C2Z0 A0P3 = AbstractC167007dF.A0P(c2xe);
        A0P3.A00(this.A01);
        A0P.A00(AbstractC76963ci.A0B(A0P3, A0P, A0d));
        C2WH A0C = AbstractC76963ci.A0C(A0P, c76223bS, c51722Yv);
        C29472Cym c29472Cym = new C29472Cym(num2, num2, num2);
        InterfaceC16820sZ interfaceC16820sZ = this.A05;
        if (interfaceC16820sZ == null) {
            interfaceC16820sZ = C29840DEg.A00;
        }
        return new C26555BoE(A0C, c75933ay2, c29472Cym, interfaceC16820sZ, null);
    }

    public C26457Bme(AbstractC50812Vc abstractC50812Vc, AbstractC50812Vc abstractC50812Vc2, C51722Yv c51722Yv, String str, String str2, InterfaceC16820sZ interfaceC16820sZ) {
        this.A03 = c51722Yv;
        this.A04 = str;
        this.A02 = str2;
        this.A00 = abstractC50812Vc;
        this.A01 = abstractC50812Vc2;
        this.A05 = interfaceC16820sZ;
    }
}
