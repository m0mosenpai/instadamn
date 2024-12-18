package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;

/* renamed from: X.Bmc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26455Bmc extends AbstractC51572Yf {
    public final String A00;
    public final boolean A01;
    public final boolean A02;
    public final CW2 A03;
    public final String A04;
    public final boolean A05;

    public C26455Bmc(CW2 cw2, String str, String str2, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
        this.A03 = cw2;
        this.A05 = z;
        this.A01 = z2;
        this.A02 = z3;
        this.A04 = str2;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        String str;
        double d;
        Integer num;
        InterfaceC51732Yw A0n;
        C14360o3.A0B(c76223bS, 0);
        Object A00 = AbstractC77183d4.A00(c76223bS, C29896DGk.A00(c76223bS, this, 34), new Object[0]);
        Drawable A002 = AbstractC27723CKq.A00(c76223bS, C29910DGy.A01(c76223bS, 18), new Object[0]);
        CW2 cw2 = this.A03;
        if (cw2 != null) {
            str = cw2.A00;
        } else {
            str = null;
        }
        boolean z = this.A02;
        if (z) {
            d = 20.0d;
        } else {
            d = 16.0d;
        }
        long doubleToRawLongBits = Double.doubleToRawLongBits(d);
        C75933ay c75933ay = C51722Yv.A02;
        Integer num2 = C05F.A00;
        C51722Yv A0d = AbstractC25230BEn.A0d(null, num2, 100.0f, 0);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        boolean z2 = this.A05;
        if (z2 && !this.A01) {
            A12.A00(new C26302Bk9(C9CU.A00(AbstractC25234BEr.A0L(null, num2, 0, AbstractC25229BEm.A0I()), C05F.A0E, 0, AbstractC25229BEm.A0F())));
        }
        C51722Yv A0d2 = AbstractC25230BEn.A0d(null, num2, 100.0f, 0);
        Integer num3 = C05F.A01;
        C51722Yv A0d3 = AbstractC25230BEn.A0d(A0d2, num3, 75.0f, 0);
        int i = 32;
        if (z2) {
            i = 16;
        }
        long A0A = AbstractC25225BEi.A0A(i);
        Integer num4 = C05F.A0u;
        Integer num5 = num4;
        C51722Yv A003 = C9CV.A00(AbstractC25234BEr.A0D(AbstractC25234BEr.A0F(A0d3, AbstractC25225BEi.A0n(num4, 0, doubleToRawLongBits), 0, A0A), AbstractC25225BEi.A0n(C05F.A1F, 0, doubleToRawLongBits), 0, doubleToRawLongBits), num2, A00, 4);
        C2Z0 A13 = AbstractC25232BEp.A13(A12);
        String str2 = this.A04;
        if (str2 != null && !AbstractC001900j.A0T(str2)) {
            if (!z) {
                if (this.A01) {
                    num5 = C05F.A0Y;
                } else {
                    num5 = C05F.A0K;
                }
            }
            C88 c88 = C88.A0S;
            long A0K = AbstractC25230BEn.A0K();
            EnumC27373C6c enumC27373C6c = EnumC27373C6c.A04;
            InterfaceC30923Dia A01 = AbstractC28337CeP.A01(A13);
            A13.A00(new C26567BoQ(AbstractC171007jr.A00(c75933ay, C28351CfB.A00(A01).EKJ(enumC27373C6c, A01.CSM())), C93E.TEXT_START, c88, str2, num5, 2, A0K, A0K));
        }
        if (z) {
            num = C05F.A04;
            A0n = AbstractC25225BEi.A0m(num3, 1.0f, 1);
        } else {
            if (this.A01) {
                num = C05F.A0H;
            } else {
                num = C05F.A0L;
            }
            A0n = AbstractC25225BEi.A0n(C05F.A0N, 0, Double.doubleToRawLongBits(160.0d));
        }
        C51722Yv A0h = AbstractC25225BEi.A0h(null, A0n);
        long A0M = AbstractC25230BEn.A0M();
        Integer num6 = C05F.A08;
        C51722Yv A0b = AbstractC25233BEq.A0b(C9CU.A00(null, num6, 0, A0M), num2, 0);
        C2Z0 A0K2 = AbstractC25233BEq.A0K(A13);
        String str3 = this.A00;
        C88 c882 = C88.A0S;
        long A0K3 = AbstractC25230BEn.A0K();
        C93E c93e = C93E.TEXT_START;
        A0K2.A00(new C26567BoQ(A0h, c93e, c882, str3, num, 2, A0K3, A0K3));
        if (z) {
            C51722Yv A0B = AbstractC25234BEr.A0B(C9CU.A00(AbstractC25233BEq.A0Z(AbstractC25232BEp.A15(AbstractC25232BEp.A14(null, 0, AbstractC25229BEm.A0F()), num2, EnumC77683ds.FLEX_END), num3, 32.0d, 0), C05F.A04, 0, AbstractC25230BEn.A0L()), AbstractC25225BEi.A0m(num3, 0.0f, 1), 0.0f);
            GradientDrawable A0O = AbstractC25228BEl.A0O(0);
            A0O.setColor(AbstractC28406CgC.A00(A0K2, C88.A0v));
            A0O.setCornerRadius(AbstractC25232BEp.A0m(A0K2, 20.0d));
            C51722Yv A004 = C9CV.A00(A0B, num2, A0O, 4);
            C2Z0 A132 = AbstractC25232BEp.A13(A0K2);
            A132.A00(new C26567BoQ(null, null, C88.A0a, AbstractC77623dm.A0F(A132, 2131966571), num4, 0, 248));
            AbstractC25226BEj.A1R(A132, A0K2, A004);
        }
        AbstractC25227BEk.A1G(A0K2, A13, A0b);
        if (this.A01 && str != null && str.length() != 0) {
            String A0G = AbstractC77623dm.A0G(A13, str, 2131966495);
            C51722Yv A0Z = AbstractC25233BEq.A0Z(AbstractC25233BEq.A0b(null, num2, 0), num6, 6.0d, 0);
            C2Z0 A133 = AbstractC25232BEp.A13(A13);
            A133.A00(new C26567BoQ(C9CU.A00(null, C05F.A0N, 0, Double.doubleToRawLongBits(140.0d)), c93e, C88.A0j, A0G, num3, 1, A0M, A0M));
            if (cw2 != null && cw2.A01) {
                long A0E = AbstractC25229BEm.A0E();
                A133.A00(new C26611Bp8(A002, ImageView.ScaleType.CENTER_CROP, AbstractC25232BEp.A14(C9CU.A00(C9CU.A00(C9CU.A00(null, num2, 0, A0E), num3, 0, A0E), C05F.A0F, 0, AbstractC25229BEm.A0G()), 0, A0K3), 0, false));
            }
            A13.A00(AbstractC76963ci.A0H(A133, A13, A0Z));
        }
        A12.A00(AbstractC76963ci.A02(A13, A12, A003));
        return AbstractC76963ci.A02(A12, c76223bS, A0d);
    }
}
