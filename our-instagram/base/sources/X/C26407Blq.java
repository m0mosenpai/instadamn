package X;

import java.util.List;

/* renamed from: X.Blq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26407Blq extends AbstractC51572Yf {
    public final C27990CVn A00;
    public final InterfaceC16620sF A01;
    public final List A02;
    public final InterfaceC16820sZ A03;

    public C26407Blq(C27990CVn c27990CVn, List list, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16620sF interfaceC16620sF) {
        C14360o3.A0B(interfaceC16620sF, 3);
        this.A02 = list;
        this.A00 = c27990CVn;
        this.A01 = interfaceC16620sF;
        this.A03 = interfaceC16820sZ;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        int A00 = AbstractC28406CgC.A00(c76223bS, AbstractC28159Cb6.A07);
        int A002 = AbstractC28406CgC.A00(c76223bS, AbstractC28159Cb6.A08);
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A0d = AbstractC25230BEn.A0d(AbstractC25233BEq.A0R(null, AbstractC25225BEi.A0n(C05F.A04, 0, AbstractC28159Cb6.A00), 0, AbstractC28159Cb6.A01), C05F.A0C, 1.0f, 1);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        A12.A00(new C26540Bnz(this.A03));
        C27990CVn c27990CVn = this.A00;
        if (c27990CVn != null) {
            Integer num = c27990CVn.A01;
            int intValue = num.intValue();
            AbstractC50812Vc abstractC50812Vc = null;
            if (intValue != 0) {
                if (intValue != 1 && intValue != 2) {
                    abstractC50812Vc = new C75723ad();
                } else {
                    CW7 cw7 = c27990CVn.A00;
                    if (cw7 != null) {
                        abstractC50812Vc = new C26332Bkd(cw7, num);
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
        C2Z0 A13 = AbstractC25232BEp.A13(A12);
        for (CVT cvt : this.A02) {
            A13.A00(new C26457Bme(null, null, A0d, AbstractC77623dm.A0F(A13, cvt.A00), null, new D8K(7, cvt, this)));
        }
        AbstractC25227BEk.A1H(A13, A12, A003);
        return new C2WF(null, null, null, A12.A01, false);
    }
}
