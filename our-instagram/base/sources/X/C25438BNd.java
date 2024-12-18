package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.BNd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25438BNd extends AbstractC51572Yf {
    public final C120985dq A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final String A03;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C120985dq c120985dq;
        C38321qM c38321qM;
        InterfaceC43580JMo A0t;
        Integer BF1;
        InterfaceC43580JMo A0t2;
        String iconicHorizonWorldDeeplink;
        C38321qM c38321qM2;
        int A09;
        C14360o3.A0B(c76223bS, 0);
        UserSession userSession = this.A01;
        if (!C18U.A06(C06090Tz.A05, userSession, 36328989463297967L) && (c38321qM = (c120985dq = this.A00).A02) != null && (A0t = AbstractC25226BEj.A0t(c38321qM)) != null && (BF1 = A0t.BF1()) != null) {
            int intValue = BF1.intValue();
            C38321qM c38321qM3 = c120985dq.A02;
            if (c38321qM3 != null && (A0t2 = AbstractC25226BEj.A0t(c38321qM3)) != null && (iconicHorizonWorldDeeplink = A0t2.getIconicHorizonWorldDeeplink()) != null && (c38321qM2 = c120985dq.A02) != null && c38321qM2.A6h(userSession)) {
                String str = this.A03;
                if (str != null) {
                    A09 = Color.parseColor(str);
                } else {
                    A09 = AbstractC25228BEl.A09(c76223bS, R.color.grey_2_20_transparent);
                }
                C208169Ja c208169Ja = new C208169Ja(GradientDrawable.Orientation.TOP_BOTTOM);
                C2XE c2xe = c76223bS.A05;
                Context A0E = AbstractC25225BEi.A0E(c2xe);
                c208169Ja.setCornerRadius(AbstractC13690mv.A00(A0E, 8.0f));
                c208169Ja.setColor(A09);
                Drawable A0N = AbstractC25228BEl.A0N(c76223bS, R.drawable.instagram_app_horizon_pano_filled_16);
                AbstractC25233BEq.A10(A0N, c76223bS, R.color.audio_bar_action_color_enabled);
                C75933ay c75933ay = C51722Yv.A02;
                long A0D = AbstractC77623dm.A0D(c76223bS, R.dimen.accent_edge_thickness);
                Integer num = C05F.A0D;
                C80393iU A0O = AbstractC25234BEr.A0O(A0N, c2xe, C9CU.A00(C9CU.A00(null, num, 0, A0D), C05F.A15, 0, AbstractC77623dm.A08(c76223bS)));
                String A0F = AbstractC77623dm.A0F(c76223bS, 2131956190);
                int A092 = AbstractC25228BEl.A09(c76223bS, AbstractC53242c7.A0E(A0E));
                long A0r = AbstractC25232BEp.A0r(14.0f);
                Typeface typeface = Typeface.DEFAULT;
                long A0D2 = AbstractC25229BEm.A0D();
                Integer num2 = C05F.A00;
                C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, A0F, R.style.igds_emphasized_body_1);
                AbstractC25233BEq.A19(c76223bS, A0a, A092, A0r);
                A0a.A0S(0);
                AbstractC25234BEr.A0n(typeface, c76223bS, A0a, A0D2);
                A0a.A0X(num2);
                A0a.A0C();
                A0a.A0Y(num2);
                AbstractC25230BEn.A1J(A0a, 1.0f, false);
                A0a.A0E();
                AbstractC25229BEm.A1F(A0a);
                A0a.A06(null);
                C51682Yq A0A = A0a.A0A();
                C51722Yv A00 = C9CU.A00(null, C05F.A0E, 0, AbstractC77623dm.A06(c76223bS));
                int A093 = AbstractC25228BEl.A09(c76223bS, AbstractC53242c7.A0E(A0E));
                C77723dw A0a2 = AbstractC25231BEo.A0a(c2xe, null, " • ", R.style.igds_emphasized_body_1);
                AbstractC25233BEq.A19(c76223bS, A0a2, A093, A0r);
                A0a2.A0S(0);
                AbstractC25234BEr.A0n(typeface, c76223bS, A0a2, A0D2);
                A0a2.A0X(num2);
                AbstractC25234BEr.A1D(A0a2, num2, 1.0f, false, true);
                C51682Yq A0g = AbstractC25230BEn.A0g(null, A00, A0a2);
                C51722Yv A0d = AbstractC25230BEn.A0d(null, C05F.A01, 1.0f, 1);
                String A0G = AbstractC77623dm.A0G(c76223bS, BF1, 2131956191);
                int A03 = AbstractC25232BEp.A03(A0E, c76223bS, R.attr.igds_color_secondary_text_on_media);
                C77723dw A0a3 = AbstractC25231BEo.A0a(c2xe, null, A0G, R.style.igds_body_1);
                AbstractC25233BEq.A19(c76223bS, A0a3, A03, A0r);
                A0a3.A0S(0);
                AbstractC25234BEr.A0n(typeface, c76223bS, A0a3, A0D2);
                A0a3.A0X(num2);
                AbstractC25234BEr.A1D(A0a3, num2, 1.0f, false, true);
                C51682Yq A0g2 = AbstractC25230BEn.A0g(null, A0d, A0a3);
                Drawable A0N2 = AbstractC25228BEl.A0N(c76223bS, R.drawable.chevron_right);
                AbstractC25233BEq.A10(A0N2, c76223bS, R.color.audio_bar_action_color_enabled);
                C80403iV A0Z = AbstractC25231BEo.A0Z(A0N2, c2xe);
                A0Z.A0C();
                C80393iU A0A2 = A0Z.A0A();
                C51722Yv A002 = C9CU.A00(AbstractC25233BEq.A0V(C9CV.A00(AbstractC25230BEn.A0d(null, C05F.A0C, 0.0f, 1), num, "clips_iconic_entrypoints_component_tag", 4), AbstractC25225BEi.A0o(C05F.A0B, Integer.valueOf(R.id.clips_iconic_entrypoints_component), 4), num2, c208169Ja, 4), C05F.A08, 0, AbstractC77623dm.A06(c76223bS));
                C51722Yv A0Y = AbstractC25231BEo.A0Y(AbstractC25230BEn.A0e(C9CU.A00(C9CU.A00(C9CU.A00(A002, C05F.A05, 0, AbstractC77623dm.A0D(c76223bS, R.dimen.album_music_sticker_text_vertical_padding)), C05F.A02, 0, AbstractC77623dm.A04(c76223bS)), C05F.A03, 0, AbstractC77623dm.A07(c76223bS)), C05F.A0Y, DRT.A00(this, 36), null), new MI7(this, c76223bS, iconicHorizonWorldDeeplink, 43));
                C2Z0 A0I = AbstractC25233BEq.A0I(A0O, A0A, c2xe);
                if (intValue > 0) {
                    A0I.A00(A0g);
                    A0I.A00(A0g2);
                }
                return AbstractC25226BEj.A0k(A0A2, A0I, c76223bS, A0Y);
            }
        }
        return null;
    }

    public C25438BNd(C120985dq c120985dq, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str) {
        this.A00 = c120985dq;
        this.A01 = userSession;
        this.A03 = str;
        this.A02 = interfaceC60442pS;
    }
}
