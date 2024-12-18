package X;

import com.facebook.R;

/* renamed from: X.BkE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26307BkE extends AbstractC51572Yf {
    public final C169207gt A00;
    public final C25814BbV A01;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        int i;
        String str;
        C14360o3.A0B(c76223bS, 0);
        C169207gt c169207gt = this.A00;
        int intValue = c169207gt.A02.intValue();
        if (intValue != 1) {
            if (intValue != 0 && intValue != 2) {
                throw B4Z.A00();
            }
            int intValue2 = c169207gt.A04.intValue();
            if (intValue2 != 0) {
                if (intValue2 == 1) {
                    i = 2131965664;
                } else {
                    throw B4Z.A00();
                }
            } else {
                C2XE c2xe = c76223bS.A05;
                C14360o3.A0B(c2xe, 0);
                int intValue3 = c169207gt.A03.intValue();
                int i2 = c169207gt.A00;
                if (intValue3 != 0) {
                    str = AbstractC27603CFz.A00(c2xe, c169207gt, i2, R.plurals.view_x_previous_replies, 2131976861);
                } else {
                    str = AbstractC27603CFz.A00(c2xe, c169207gt, i2, R.plurals.view_x_more_replies, 2131976861);
                }
                C75933ay c75933ay = C51722Yv.A02;
                long doubleToRawLongBits = Double.doubleToRawLongBits(54.0d);
                long A0L = AbstractC25230BEn.A0L();
                long A0D = AbstractC25229BEm.A0D();
                long A0B = AbstractC25229BEm.A0B();
                C51722Yv A0F = AbstractC25234BEr.A0F(null, AbstractC25225BEi.A0n(C05F.A0u, 0, doubleToRawLongBits), 0, A0D);
                Integer num = C05F.A1F;
                C51722Yv A00 = C9CV.A00(AbstractC25234BEr.A0D(A0F, AbstractC25225BEi.A0n(num, 0, A0L), 0, A0B), num, new C50368MLv(this, 38), 4);
                C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
                C51722Yv A002 = C9CU.A00(null, C05F.A01, 0, Double.doubleToRawLongBits(1.0d));
                long doubleToRawLongBits2 = Double.doubleToRawLongBits(33.0d);
                Integer num2 = C05F.A00;
                C51722Yv A003 = C9CU.A00(C9CU.A00(A002, num2, 0, doubleToRawLongBits2), C05F.A09, 0, Double.doubleToRawLongBits(9.0d));
                C2XE ArD = A12.ArD();
                AbstractC25227BEk.A1G(AbstractC167007dF.A0P(ArD), A12, C9CV.A00(A003, num2, AbstractC25225BEi.A0i(AbstractC25228BEl.A06(ArD.A0C, A12, R.attr.igds_color_separator)), 4));
                return AbstractC25226BEj.A0k(new C26293Bk0(str), A12, c76223bS, A00);
            }
        } else {
            i = 2131963549;
        }
        str = AbstractC77623dm.A0F(c76223bS, i);
        C75933ay c75933ay2 = C51722Yv.A02;
        long doubleToRawLongBits3 = Double.doubleToRawLongBits(54.0d);
        long A0L2 = AbstractC25230BEn.A0L();
        long A0D2 = AbstractC25229BEm.A0D();
        long A0B2 = AbstractC25229BEm.A0B();
        C51722Yv A0F2 = AbstractC25234BEr.A0F(null, AbstractC25225BEi.A0n(C05F.A0u, 0, doubleToRawLongBits3), 0, A0D2);
        Integer num3 = C05F.A1F;
        C51722Yv A004 = C9CV.A00(AbstractC25234BEr.A0D(A0F2, AbstractC25225BEi.A0n(num3, 0, A0L2), 0, A0B2), num3, new C50368MLv(this, 38), 4);
        C2Z0 A122 = AbstractC25232BEp.A12(c76223bS);
        C51722Yv A0022 = C9CU.A00(null, C05F.A01, 0, Double.doubleToRawLongBits(1.0d));
        long doubleToRawLongBits22 = Double.doubleToRawLongBits(33.0d);
        Integer num22 = C05F.A00;
        C51722Yv A0032 = C9CU.A00(C9CU.A00(A0022, num22, 0, doubleToRawLongBits22), C05F.A09, 0, Double.doubleToRawLongBits(9.0d));
        C2XE ArD2 = A122.ArD();
        AbstractC25227BEk.A1G(AbstractC167007dF.A0P(ArD2), A122, C9CV.A00(A0032, num22, AbstractC25225BEi.A0i(AbstractC25228BEl.A06(ArD2.A0C, A122, R.attr.igds_color_separator)), 4));
        return AbstractC25226BEj.A0k(new C26293Bk0(str), A122, c76223bS, A004);
    }

    public C26307BkE(C169207gt c169207gt, C25814BbV c25814BbV) {
        AbstractC167017dG.A1P(c169207gt, c25814BbV);
        this.A00 = c169207gt;
        this.A01 = c25814BbV;
    }
}
