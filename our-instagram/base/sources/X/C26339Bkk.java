package X;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.Bkk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26339Bkk extends AbstractC51572Yf {
    public final InterfaceC31137Dmc A00;
    public final C120985dq A01;

    public C26339Bkk(C120985dq c120985dq, InterfaceC31137Dmc interfaceC31137Dmc) {
        C14360o3.A0B(interfaceC31137Dmc, 2);
        this.A01 = c120985dq;
        this.A00 = interfaceC31137Dmc;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C51682Yq c51682Yq;
        C2WH c2wh;
        C14360o3.A0B(c76223bS, 0);
        C38321qM c38321qM = this.A01.A02;
        if (c38321qM != null) {
            InterfaceC109094vY BRN = c38321qM.BRN();
            if (BRN != null) {
                C75933ay c75933ay = C51722Yv.A02;
                long A0I = AbstractC25230BEn.A0I();
                Integer num = C05F.A01;
                C51722Yv A00 = C9CU.A00(null, num, 0, A0I);
                Integer num2 = C05F.A00;
                C51722Yv A002 = C9CU.A00(A00, num2, 0, A0I);
                Drawable A0E = AbstractC77623dm.A0E(c76223bS, AbstractC46598Kjb.A00(BRN.BEg()));
                AbstractC25233BEq.A10(A0E, c76223bS, R.color.design_dark_default_color_on_background);
                C2XE c2xe = c76223bS.A05;
                C80403iV A0Z = AbstractC25231BEo.A0Z(A0E, c2xe);
                A0Z.A0C();
                AbstractC77743dy.A00(A0Z, A002);
                C80393iU A0A = A0Z.A0A();
                long A0L = AbstractC25230BEn.A0L();
                Integer num3 = C05F.A15;
                C51722Yv A003 = C9CU.A00(null, num3, 0, A0L);
                String title = BRN.getTitle();
                int A09 = AbstractC25228BEl.A09(c76223bS, R.color.design_dark_default_color_on_background);
                long A05 = AbstractC77623dm.A05(c76223bS);
                Typeface typeface = Typeface.DEFAULT;
                long A0D = AbstractC25229BEm.A0D();
                C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, title, 0);
                AbstractC25233BEq.A19(c76223bS, A0a, A09, A05);
                A0a.A0S(1);
                AbstractC25234BEr.A0n(typeface, c76223bS, A0a, A0D);
                A0a.A0B();
                AbstractC25234BEr.A1J(A0a, num2, false, true);
                C51682Yq A0X = AbstractC25227BEk.A0X(A003, A0a);
                C51722Yv A0Z2 = AbstractC25233BEq.A0Z(null, num3, 8.0d, 0);
                String description = BRN.getDescription();
                int A092 = AbstractC25228BEl.A09(c76223bS, R.color.baseline_neutral_80);
                long A052 = AbstractC77623dm.A05(c76223bS);
                C77723dw A0a2 = AbstractC25231BEo.A0a(c2xe, null, description, 0);
                AbstractC25233BEq.A19(c76223bS, A0a2, A092, A052);
                A0a2.A0S(1);
                AbstractC25234BEr.A0n(typeface, c76223bS, A0a2, A0D);
                A0a2.A0B();
                AbstractC25234BEr.A1J(A0a2, num2, false, true);
                C51682Yq A0X2 = AbstractC25227BEk.A0X(A0Z2, A0a2);
                InterfaceC109864xE A01 = BFB.A01(BRN);
                if (A01 != null) {
                    C51722Yv A0Q = AbstractC25233BEq.A0Q(null, 24.0d);
                    long A0D2 = AbstractC77623dm.A0D(c76223bS, R.dimen.afi_margin_top);
                    long A0A2 = AbstractC77623dm.A0A(c76223bS);
                    long A0D3 = AbstractC77623dm.A0D(c76223bS, R.dimen.afi_margin_top);
                    long A0A3 = AbstractC77623dm.A0A(c76223bS);
                    C51722Yv A004 = C9CU.A00(C9CU.A00(A0Q, C05F.A0u, 0, A0D2), num3, 0, A0A2);
                    Integer num4 = C05F.A1F;
                    C51722Yv A005 = C9CV.A00(C9CV.A00(AbstractC25234BEr.A0D(A004, AbstractC25225BEi.A0n(num4, 0, A0D3), 0, A0A3), num2, AbstractC77623dm.A0E(c76223bS, R.drawable.misinformation_button_background_selector), 4), num4, new C29912DHa(8, A01, this, c38321qM), 4);
                    int A093 = AbstractC25228BEl.A09(c76223bS, R.color.design_dark_default_color_on_background);
                    long A053 = AbstractC77623dm.A05(c76223bS);
                    C77723dw A0a3 = AbstractC25231BEo.A0a(c2xe, null, A01.getText(), 0);
                    AbstractC25233BEq.A19(c76223bS, A0a3, A093, A053);
                    A0a3.A0S(1);
                    AbstractC25234BEr.A0n(typeface, c76223bS, A0a3, A0D);
                    A0a3.A0B();
                    AbstractC25234BEr.A1J(A0a3, num2, false, true);
                    c51682Yq = AbstractC25227BEk.A0X(A005, A0a3);
                } else {
                    c51682Yq = null;
                }
                InterfaceC109864xE A006 = BFB.A00(BRN);
                if (A006 != null) {
                    EnumC77933eL enumC77933eL = EnumC77933eL.ABSOLUTE;
                    Integer num5 = C05F.A0Y;
                    C51722Yv A0T = AbstractC25233BEq.A0T(C9CV.A00(C9CV.A00(null, num5, enumC77933eL, 3), num2, EnumC77683ds.FLEX_END, 3), AbstractC25230BEn.A0h(c76223bS, num, R.dimen.card_social_context_height, 0), num2, 100.0f, 0);
                    C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
                    C51722Yv A007 = C9CV.A00(C9CV.A00(AbstractC25233BEq.A0T(null, AbstractC25230BEn.A0h(A0P, num, R.dimen.ads_disclosure_footer_top_divider_height, 0), num2, 100.0f, 0), num5, enumC77933eL, 3), num2, EnumC77683ds.FLEX_START, 3);
                    int A03 = AbstractC77623dm.A03(A0P, R.color.grey_2);
                    C2XE c2xe2 = A0P.A00;
                    C26280Bjn A032 = C26658Bpt.A03(c2xe2);
                    A032.A0B(A03);
                    AbstractC77743dy.A00(A032, A007);
                    A0P.A00(A032.A0A());
                    C51722Yv A0d = AbstractC25233BEq.A0d(AbstractC25233BEq.A0Y(null, A0P, num, R.dimen.abc_alert_dialog_button_dimen, 0), new C29912DHa(7, A006, this, c38321qM));
                    int A02 = A0P.BoZ().A02(R.color.design_dark_default_color_on_background);
                    long A054 = AbstractC77623dm.A05(A0P);
                    C77723dw A0a4 = AbstractC25231BEo.A0a(c2xe2, null, A006.getText(), 0);
                    AbstractC25233BEq.A1B(A0P, A0a4, A02, A054);
                    A0a4.A0S(1);
                    AbstractC25234BEr.A0o(typeface, A0P, A0a4, A0D);
                    AbstractC25234BEr.A1I(A0a4, num2, false);
                    A0a4.A0M(1);
                    AbstractC25233BEq.A1D(A0d, A0a4, false);
                    AbstractC25227BEk.A1J(A0P, A0a4);
                    c2wh = AbstractC76963ci.A0G(A0P, c76223bS, A0T);
                } else {
                    c2wh = null;
                }
                long doubleToRawLongBits = Double.doubleToRawLongBits(30.0d);
                C51722Yv A0N = AbstractC25234BEr.A0N(C9CU.A00(C9CU.A00(null, C05F.A0u, 0, doubleToRawLongBits), C05F.A1F, 0, doubleToRawLongBits), num, num2, 100.0f, 0);
                C2Z0 A0P2 = AbstractC167007dF.A0P(c2xe);
                C51722Yv A15 = AbstractC25232BEp.A15(null, C05F.A0Y, EnumC77933eL.ABSOLUTE);
                C2Z0 A0I2 = AbstractC25233BEq.A0I(A0A, A0X, A0P2.A00);
                A0I2.A00(A0X2);
                A0I2.A00(c51682Yq);
                A0P2.A00(AbstractC76963ci.A01(A0I2, A0P2, A15));
                return AbstractC25226BEj.A0l(c2wh, A0P2, c76223bS, A0N);
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
