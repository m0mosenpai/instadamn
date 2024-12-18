package X;

/* renamed from: X.BoB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26552BoB extends AbstractC51572Yf {
    public final C27990CVn A00;
    public final InterfaceC16660sJ A01;
    public final InterfaceC16660sJ A02;
    public final InterfaceC16660sJ A03;

    public C26552BoB(C27990CVn c27990CVn, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3) {
        C14360o3.A0B(interfaceC16660sJ2, 3);
        this.A00 = c27990CVn;
        this.A03 = interfaceC16660sJ;
        this.A02 = interfaceC16660sJ2;
        this.A01 = interfaceC16660sJ3;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        int A00 = AbstractC28406CgC.A00(c76223bS, AbstractC28159Cb6.A07);
        int A002 = AbstractC28406CgC.A00(c76223bS, AbstractC28159Cb6.A08);
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A0R = AbstractC25233BEq.A0R(null, AbstractC25225BEi.A0n(C05F.A04, 0, AbstractC28159Cb6.A00), 0, AbstractC28159Cb6.A01);
        Integer num = C05F.A0C;
        C51722Yv A0d = AbstractC25230BEn.A0d(A0R, num, 0.0f, 1);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        C27990CVn c27990CVn = this.A00;
        if (c27990CVn != null) {
            Integer num2 = c27990CVn.A01;
            int intValue = num2.intValue();
            AbstractC50812Vc abstractC50812Vc = null;
            if (intValue != 0) {
                if (intValue != 1 && intValue != 2) {
                    abstractC50812Vc = new C75723ad();
                } else {
                    CW7 cw7 = c27990CVn.A00;
                    if (cw7 != null) {
                        abstractC50812Vc = new C26332Bkd(cw7, num2);
                    }
                }
            } else {
                String str = c27990CVn.A02;
                if (str != null) {
                    abstractC50812Vc = new C26303BkA(str);
                }
            }
            A12.A00(abstractC50812Vc);
        }
        C51722Yv A003 = C9CU.A00(C9CU.A00(AbstractC25232BEp.A16(null, C05F.A00, AbstractC28159Cb6.A00(A12, Integer.valueOf(A002), 16.0f, A00)), C05F.A06, 0, AbstractC28159Cb6.A03), C05F.A0G, 0, AbstractC28159Cb6.A02);
        Integer num3 = null;
        C2Z0 A0P = AbstractC167007dF.A0P(A12.A00);
        if (c27990CVn != null) {
            num3 = c27990CVn.A01;
        }
        if (num3 == C05F.A01 || (c27990CVn != null && c27990CVn.A01 == num)) {
            A0P.A00(new C26457Bme(A03(A0P, C87.A0I, null, AbstractC77623dm.A0F(A0P, 2131966469)), null, A0d, AbstractC77623dm.A0F(A0P, 2131966563), null, C29905DGt.A01(this, 20)));
        }
        A0P.A00(new C26457Bme(A03(A0P, C87.A0O, null, AbstractC77623dm.A0F(A0P, 2131966472)), null, A0d, AbstractC77623dm.A0F(A0P, 2131966473), null, C29905DGt.A01(this, 21)));
        AbstractC25230BEn.A1H(new C26457Bme(A03(A0P, C87.A0N, null, AbstractC77623dm.A0F(A0P, 2131966471)), A03(A0P, C87.A0F, C87.A0E, AbstractC77623dm.A0F(A0P, 2131966468)), A0d, AbstractC77623dm.A0F(A0P, 2131966450), null, C29905DGt.A01(this, 22)), A0P, A12, A003);
        return new C2WF(null, null, null, A12.A01, false);
    }

    public static final C26511BnW A03(C2Z1 c2z1, C87 c87, C87 c872, String str) {
        return new C26511BnW(null, c87, c872, null, Integer.valueOf(AbstractC28406CgC.A00(c2z1, C88.A0Z)), str, null, 12, true);
    }
}
