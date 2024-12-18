package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* renamed from: X.BnC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26491BnC extends AbstractC51572Yf {
    public final C27988CVl A00;
    public final InterfaceC16660sJ A01;
    public final InterfaceC16620sF A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final C51722Yv A06;
    public final C7N A07;

    public C26491BnC(C51722Yv c51722Yv, C7N c7n, C27988CVl c27988CVl, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF, boolean z, boolean z2, boolean z3) {
        AbstractC167007dF.A1H(c7n, 4, interfaceC16660sJ);
        this.A00 = c27988CVl;
        this.A03 = z;
        this.A04 = z2;
        this.A07 = c7n;
        this.A05 = z3;
        this.A02 = interfaceC16620sF;
        this.A01 = interfaceC16660sJ;
        this.A06 = c51722Yv;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        Bitmap bitmap;
        String str;
        C14360o3.A0B(c76223bS, 0);
        C27988CVl c27988CVl = this.A00;
        if (c27988CVl != null) {
            bitmap = c27988CVl.A01;
        } else {
            bitmap = null;
        }
        Drawable drawable = (Drawable) AbstractC77183d4.A00(c76223bS, C29896DGk.A00(c76223bS, this, 16), new Object[]{bitmap});
        if (c27988CVl != null) {
            str = c27988CVl.A02.A04;
        } else {
            str = null;
        }
        CVV cvv = (CVV) AbstractC77183d4.A00(c76223bS, DEO.A00, new Object[]{str});
        C75933ay c75933ay = C51722Yv.A02;
        long A0J = AbstractC25229BEm.A0J();
        C51722Yv A00 = AbstractC25234BEr.A0E(null, AbstractC25226BEj.A0m(0, A0J), 0, A0J).A00(this.A06);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        C2Z0 A13 = AbstractC25232BEp.A13(A12);
        long A02 = AbstractC28406CgC.A02(A13, C05F.A0X);
        C51722Yv A002 = C9CU.A00(null, C05F.A0G, 0, AbstractC25229BEm.A0F());
        float f = this.A07.A00;
        Integer num = C05F.A0Y;
        C51722Yv A0d = AbstractC25230BEn.A0d(A002, num, f, 1);
        Integer num2 = C05F.A01;
        A13.A00(new C26472Bmt(drawable, AbstractC25230BEn.A0d(A0d, num2, 100.0f, 0), C29890DGe.A00(this, 31), DQO.A00, A02));
        C3e8 c3e8 = C3e8.FLEX_END;
        EnumC77683ds enumC77683ds = EnumC77683ds.FLEX_END;
        C51722Yv A15 = AbstractC25232BEp.A15(AbstractC25233BEq.A0Z(null, num2, 100.0d, 0), num, EnumC77933eL.ABSOLUTE);
        long A0J2 = AbstractC25230BEn.A0J();
        C51722Yv A003 = C9CU.A00(C9CU.A00(A15, C05F.A0N, 1, A0J2), num, 1, A0J2);
        C2Z0 A132 = AbstractC25232BEp.A13(A13);
        C51322Xf c51322Xf = cvv.A00;
        String str2 = cvv.A01;
        C29896DGk A004 = C29896DGk.A00(cvv, this, 15);
        C87 c87 = C87.A0X;
        int A005 = AbstractC28406CgC.A00(A132, C88.A0l);
        int EKE = C28351CfB.A00(AbstractC28337CeP.A01(A132)).EKE(C88.A0R, false);
        String A0F = AbstractC77623dm.A0F(A132, 2131966503);
        long A0H = AbstractC25229BEm.A0H();
        C26511BnW c26511BnW = new C26511BnW(AbstractC25232BEp.A16(C9CU.A00(C9CU.A00(null, C05F.A00, 0, A0H), num2, 0, A0H), C05F.A0D, str2), c87, null, Integer.valueOf(A005), Integer.valueOf(EKE), A0F, A004, 40, true);
        AbstractC107374si.A00(c26511BnW, c51322Xf);
        A132.A00(c26511BnW);
        A13.A00(AbstractC76963ci.A0J(A132, A13, A003, null, enumC77683ds, null, c3e8, null, false));
        return AbstractC25226BEj.A0l(AbstractC76963ci.A0A(A13, A12), A12, c76223bS, A00);
    }
}
