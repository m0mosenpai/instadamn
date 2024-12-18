package X;

import java.util.List;

/* renamed from: X.Bo2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26543Bo2 extends AbstractC51572Yf {
    public final InterfaceC16620sF A00;
    public final List A01;

    public C26543Bo2(List list, InterfaceC16620sF interfaceC16620sF) {
        C14360o3.A0B(interfaceC16620sF, 2);
        this.A01 = list;
        this.A00 = interfaceC16620sF;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.2Xf, java.lang.Object] */
    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C26518Bnd A03;
        C14360o3.A0B(c76223bS, 0);
        InterfaceC16620sF A02 = AbstractC85303rL.A02(c76223bS, C30482DbR.A00(this, 47));
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A00 = C9CU.A00(C9CU.A00(null, C05F.A01, 0, AbstractC25229BEm.A0I()), C05F.A0F, 0, AbstractC25230BEn.A0K());
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        for (AbstractC27931CSq abstractC27931CSq : this.A01) {
            if (abstractC27931CSq.A04) {
                C30170DRa A002 = C30170DRa.A00(A02, abstractC27931CSq, 2);
                String str = abstractC27931CSq.A02;
                if (str != null) {
                    CVV cvv = new CVV(new Object(), str);
                    C51322Xf c51322Xf = cvv.A00;
                    A03 = A03(A12, abstractC27931CSq, C29896DGk.A00(cvv, A002, 30));
                    AbstractC107374si.A00(A03, c51322Xf);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            } else {
                A03 = A03(A12, abstractC27931CSq, C29896DGk.A00(abstractC27931CSq, A02, 31));
            }
            A12.A00(A03);
        }
        return AbstractC76963ci.A0G(A12, c76223bS, A00);
    }

    public static final C26518Bnd A03(C2Z1 c2z1, AbstractC27931CSq abstractC27931CSq, InterfaceC16820sZ interfaceC16820sZ) {
        C51722Yv A00;
        String A0F = AbstractC77623dm.A0F(c2z1, abstractC27931CSq.A00);
        boolean z = abstractC27931CSq.A05;
        boolean z2 = !z;
        C88 c88 = null;
        C75933ay c75933ay = C51722Yv.A02;
        long doubleToRawLongBits = Double.doubleToRawLongBits(36.0d);
        Integer num = C05F.A01;
        C51722Yv A002 = C9CU.A00(null, num, 0, doubleToRawLongBits);
        if (z2) {
            A00 = C9CU.A00(C9CU.A00(A002, C05F.A00, 0, doubleToRawLongBits), C05F.A0E, 0, AbstractC25230BEn.A0K());
        } else {
            A00 = C9CU.A00(A002, C05F.A0E, 0, AbstractC25230BEn.A0K());
        }
        String str = abstractC27931CSq.A02;
        if (str != null) {
            A00 = AbstractC25232BEp.A16(A00, C05F.A0D, str);
        }
        String str2 = null;
        if (z) {
            str2 = A0F;
        }
        return new C26518Bnd(C9CU.A00(C9CU.A00(null, num, 0, AbstractC28406CgC.A02(c2z1, C05F.A0S)), C05F.A00, 0, AbstractC28406CgC.A02(c2z1, C05F.A0T)), A00, abstractC27931CSq.A01, c88, c88, str2, A0F, interfaceC16820sZ, 536, AbstractC28406CgC.A02(c2z1, C05F.A0W), abstractC27931CSq.A03);
    }
}
