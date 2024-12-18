package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.BTy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25611BTy extends AbstractC51572Yf {
    public final C120985dq A00;
    public final InterfaceC31137Dmc A01;
    public final UserSession A02;

    public C25611BTy(C120985dq c120985dq, UserSession userSession, InterfaceC31137Dmc interfaceC31137Dmc) {
        C14360o3.A0B(interfaceC31137Dmc, 3);
        this.A00 = c120985dq;
        this.A02 = userSession;
        this.A01 = interfaceC31137Dmc;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        InterfaceC109094vY BRN;
        InterfaceC109864xE A02;
        int color;
        C80393iU c80393iU;
        Integer num;
        C51682Yq c51682Yq;
        C80393iU A0O;
        String str;
        String light;
        C14360o3.A0B(c76223bS, 0);
        C120985dq c120985dq = this.A00;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null && (BRN = c38321qM.BRN()) != null && (A02 = BFB.A02(BRN)) != null) {
            int A00 = AbstractC28293Cdf.A00(AbstractC77363dM.A00(c76223bS), A02, AbstractC53242c7.A07(AbstractC77363dM.A00(c76223bS)));
            Context A002 = AbstractC77363dM.A00(c76223bS);
            int A09 = AbstractC53242c7.A09(AbstractC77363dM.A00(c76223bS));
            InterfaceC31126Dm9 Brd = A02.Brd();
            if (Brd != null) {
                if (AbstractC72723Nt.A00(A002)) {
                    light = Brd.getDark();
                } else {
                    light = Brd.getLight();
                }
                color = Color.parseColor(light);
            } else {
                color = A002.getColor(A09);
            }
            Typeface create = Typeface.create("sans-serif-medium", 0);
            long A07 = AbstractC77623dm.A07(c76223bS);
            long A08 = AbstractC77623dm.A08(c76223bS);
            long A0D = AbstractC77623dm.A0D(c76223bS, R.dimen.abc_dialog_padding_top_material);
            InterfaceC109884xG BEg = A02.BEg();
            if (BEg != null) {
                C75933ay c75933ay = C51722Yv.A02;
                C51722Yv A0a = AbstractC25233BEq.A0a(C9CU.A00(null, C05F.A0u, 0, A07), C05F.A0C, 0.0f);
                Drawable A0N = AbstractC25228BEl.A0N(c76223bS, AbstractC46598Kjb.A00(BEg));
                AbstractC166997dE.A1F(A0N, A00);
                c80393iU = AbstractC25234BEr.A0O(A0N, c76223bS.A05, A0a);
            } else {
                c80393iU = null;
            }
            C75933ay c75933ay2 = C51722Yv.A02;
            Integer num2 = C05F.A01;
            C51722Yv A0e = AbstractC25233BEq.A0e(num2, 1.0f, 1);
            Integer num3 = C05F.A0C;
            C51722Yv A0d = AbstractC25230BEn.A0d(A0e, num3, 1.0f, 1);
            String text = A02.getText();
            long A0r = AbstractC25232BEp.A0r(12.0f);
            if (C14360o3.A0K(A02.CeI(), true)) {
                num = num3;
            } else {
                num = C05F.A00;
            }
            long A0D2 = AbstractC25229BEm.A0D();
            Integer num4 = C05F.A00;
            C2XE c2xe = c76223bS.A05;
            C77723dw A03 = C51682Yq.A03(c2xe, 0);
            A03.A0W(text);
            A03.A0V(null);
            AbstractC25233BEq.A19(c76223bS, A03, A00, A0r);
            A03.A0S(0);
            AbstractC25234BEr.A0n(create, c76223bS, A03, A0D2);
            AbstractC25230BEn.A1M(A03, num, num4);
            AbstractC25230BEn.A1J(A03, 1.33f, false);
            A03.A0E();
            AbstractC25233BEq.A1D(A0d, A03, false);
            C51682Yq A0A = A03.A0A();
            String secondaryText = A02.getSecondaryText();
            if (secondaryText != null) {
                C51722Yv A0N2 = AbstractC25234BEr.A0N(C9CU.A00(null, C05F.A08, 0, A08), num2, num3, 1.0f, 1);
                Integer num5 = num4;
                if (C14360o3.A0K(A02.CeI(), true)) {
                    num5 = num3;
                }
                C77723dw A0a2 = AbstractC25231BEo.A0a(c2xe, null, secondaryText, 0);
                AbstractC25233BEq.A19(c76223bS, A0a2, color, A0r);
                A0a2.A0S(0);
                AbstractC25234BEr.A0n(create, c76223bS, A0a2, A0D2);
                A0a2.A0X(num5);
                AbstractC25234BEr.A1D(A0a2, num4, 1.33f, false, true);
                c51682Yq = AbstractC25230BEn.A0g(null, A0N2, A0a2);
            } else {
                c51682Yq = null;
            }
            C51722Yv A003 = C9CU.A00(null, C05F.A07, 0, A07);
            Integer num6 = C05F.A08;
            C2WF A032 = AbstractC76963ci.A03(AbstractC25233BEq.A0I(A0A, c51682Yq, c2xe), c76223bS, AbstractC25234BEr.A0E(A003, AbstractC25225BEi.A0n(num6, 0, A07), 0, A07));
            if (!C14360o3.A0K(A02.BBL(), true)) {
                A0O = null;
            } else {
                C51722Yv A0T = AbstractC25233BEq.A0T(C9CU.A00(null, C05F.A0u, 0, A0D), AbstractC25225BEi.A0n(C05F.A1F, 0, A0D), num3, 0.0f, 1);
                Drawable A0N3 = AbstractC25228BEl.A0N(c76223bS, R.drawable.instagram_chevron_right_pano_outline_16);
                Context context = c2xe.A0C;
                AbstractC166997dE.A1F(A0N3, context.getResources().getColor(AbstractC53242c7.A0B(context)));
                A0O = AbstractC25234BEr.A0O(A0N3, c2xe, A0T);
            }
            C51722Yv A0e2 = AbstractC25230BEn.A0e(AbstractC25231BEo.A0Y(C9CV.A00(AbstractC25233BEq.A0S(null, AbstractC25225BEi.A0n(num6, 0, AbstractC77623dm.A0B(c76223bS)), 0, AbstractC77623dm.A04(c76223bS)), num4, AbstractC77623dm.A0E(c76223bS, R.drawable.clips_viewer_inform_banner_background), 4), C30170DRa.A00(this, A02, 37)), num4, DRT.A00(this, 37), null);
            InterfaceC31137Dmc interfaceC31137Dmc = this.A01;
            if (!interfaceC31137Dmc.CT2(c120985dq) && !interfaceC31137Dmc.CT3(c120985dq)) {
                str = null;
            } else {
                str = "trans_key_inform_banner";
            }
            return AbstractC25227BEk.A0W(A0O, AbstractC25233BEq.A0I(c80393iU, A032, c2xe), c76223bS, AbstractC25231BEo.A0W(c2xe, A0e2, EnumC76913cd.GLOBAL, str));
        }
        return null;
    }
}
