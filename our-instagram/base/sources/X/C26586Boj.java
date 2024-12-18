package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.api.schemas.IGAdTransparencyDisclaimerPlacement;
import com.instagram.common.session.UserSession;

/* renamed from: X.Boj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26586Boj extends AbstractC51572Yf {
    public final C120985dq A00;
    public final C37644Ghd A01;
    public final UserSession A02;
    public final InterfaceC60442pS A03;
    public final InterfaceC31011DkA A04;
    public final boolean A05;

    public C26586Boj(C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC31011DkA interfaceC31011DkA, boolean z) {
        AbstractC25229BEm.A1I(c37644Ghd, 4, interfaceC31011DkA);
        this.A02 = userSession;
        this.A03 = interfaceC60442pS;
        this.A00 = c120985dq;
        this.A01 = c37644Ghd;
        this.A05 = z;
        this.A04 = interfaceC31011DkA;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        String str;
        InterfaceC104764ng interfaceC104764ng;
        String str2;
        C38321qM c38321qM;
        String title;
        InterfaceC39541sb injected;
        InterfaceC39541sb injected2;
        InterfaceC104944o7 BeI;
        C14360o3.A0B(c76223bS, 0);
        C120985dq c120985dq = this.A00;
        C38321qM c38321qM2 = c120985dq.A02;
        if (c38321qM2 != null && (injected2 = c38321qM2.A0C.getInjected()) != null && (BeI = injected2.BeI()) != null) {
            str = BeI.AjQ();
        } else {
            str = null;
        }
        C38321qM c38321qM3 = c120985dq.A02;
        if (c38321qM3 != null && (injected = c38321qM3.A0C.getInjected()) != null) {
            interfaceC104764ng = injected.AZB();
        } else {
            interfaceC104764ng = null;
        }
        UserSession userSession = this.A02;
        boolean A06 = C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36323972941426425L);
        if (A06) {
            str2 = AbstractC87103uT.A00(IGAdTransparencyDisclaimerPlacement.A05, AbstractC41071vF.A02(userSession, c120985dq.A02));
        } else {
            str2 = null;
        }
        if (!A06) {
            if (this.A05 && str != null && str.length() > 0) {
                return A03(c76223bS, str);
            }
        } else if (str2 != null && str2.length() > 0) {
            return A03(c76223bS, str2);
        }
        if (interfaceC104764ng != null && (title = interfaceC104764ng.getTitle()) != null && title.length() > 0) {
            C2XE ArD = c76223bS.ArD();
            Context A0E = AbstractC25225BEi.A0E(ArD);
            String title2 = interfaceC104764ng.getTitle();
            if (title2 == null) {
                title2 = "";
            }
            String A00 = AbstractC906141w.A00(A0E, title2, true);
            C75933ay c75933ay = C51722Yv.A02;
            C51722Yv A16 = AbstractC25232BEp.A16(C9CU.A00(AbstractC25233BEq.A0S(null, AbstractC25226BEj.A0m(0, AbstractC77623dm.A07(c76223bS)), 0, AbstractC77623dm.A0D(c76223bS, R.dimen.add_account_icon_circle_radius)), C05F.A15, 2, AbstractC77623dm.A07(c76223bS)), C05F.A0D, "clips_ads_disclaimers_component");
            InterfaceC60442pS interfaceC60442pS = this.A03;
            C51722Yv A03 = AbstractC25396BLn.A03(EnumC71343Hv.A0j, AbstractC25396BLn.A01(EnumC71343Hv.A0d, A16, c120985dq, userSession, interfaceC60442pS), userSession, interfaceC60442pS, C30170DRa.A00(this, interfaceC104764ng, 25));
            C2Z0 A0P = AbstractC167007dF.A0P(ArD);
            A0P.A00(A04(A0P));
            return AbstractC25226BEj.A0k(A05(A0P, A00, Integer.MAX_VALUE), A0P, c76223bS, A03);
        }
        C14360o3.A0B(userSession, 0);
        if (!C18U.A06(C06090Tz.A06, userSession, 36331158421652676L) || (c38321qM = c120985dq.A02) == null || !c38321qM.A6R()) {
            return null;
        }
        C75933ay c75933ay2 = C51722Yv.A02;
        C51722Yv A162 = AbstractC25232BEp.A16(C9CU.A00(AbstractC25233BEq.A0S(null, AbstractC25226BEj.A0m(0, AbstractC77623dm.A07(c76223bS)), 0, AbstractC77623dm.A0D(c76223bS, R.dimen.add_account_icon_circle_radius)), C05F.A15, 2, AbstractC77623dm.A07(c76223bS)), C05F.A0D, "clips_ads_disclaimers_component");
        C2Z0 A0J = AbstractC25233BEq.A0J(c76223bS);
        A0J.A00(A04(A0J));
        return AbstractC25226BEj.A0k(A05(A0J, "", Integer.MAX_VALUE), A0J, c76223bS, A162);
    }

    private final C2WH A03(C2Z1 c2z1, String str) {
        UserSession userSession = this.A02;
        int A00 = CKO.A00(userSession);
        C75933ay c75933ay = C51722Yv.A02;
        long A07 = AbstractC77623dm.A07(c2z1);
        C51722Yv A16 = AbstractC25232BEp.A16(C9CU.A00(AbstractC25233BEq.A0S(null, AbstractC25225BEi.A0n(C05F.A08, 0, A07), 0, AbstractC77623dm.A0D(c2z1, R.dimen.add_account_icon_circle_radius)), C05F.A15, 2, AbstractC77623dm.A07(c2z1)), C05F.A0D, "clips_political_ads_disclaimers_component");
        InterfaceC60442pS interfaceC60442pS = this.A03;
        C51722Yv A03 = AbstractC25396BLn.A03(EnumC71343Hv.A0j, AbstractC25396BLn.A01(EnumC71343Hv.A0d, A16, this.A00, userSession, interfaceC60442pS), userSession, interfaceC60442pS, DRR.A00(this, 23));
        C2Z0 A0L = AbstractC25233BEq.A0L(c2z1);
        A0L.A00(A04(A0L));
        return AbstractC25226BEj.A0k(A05(A0L, str, A00), A0L, c2z1, A03);
    }

    public static final C80393iU A04(C2Z1 c2z1) {
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A0a = AbstractC25233BEq.A0a(C9CU.A00(C9CU.A00(C9CU.A00(null, C05F.A09, 0, AbstractC77623dm.A0A(c2z1)), C05F.A00, 0, AbstractC77623dm.A07(c2z1)), C05F.A01, 0, AbstractC77623dm.A07(c2z1)), C05F.A0C, 0.0f);
        Drawable A0N = AbstractC25228BEl.A0N(c2z1, R.drawable.instagram_info_filled_16);
        AbstractC25231BEo.A0y(A0N, c2z1, R.color.baseline_neutral_80);
        return AbstractC25234BEr.A0O(A0N, c2z1.ArD(), A0a);
    }

    private final C51682Yq A05(C2Z1 c2z1, String str, int i) {
        String str2;
        C38321qM c38321qM;
        C120985dq c120985dq = this.A00;
        C38321qM c38321qM2 = c120985dq.A02;
        String str3 = "";
        if (c38321qM2 == null || (str2 = c38321qM2.A0C.AyB()) == null) {
            str2 = "";
        }
        if (str != null) {
            str3 = str;
        }
        UserSession userSession = this.A02;
        C14360o3.A0B(userSession, 0);
        if (C18U.A06(C06090Tz.A06, userSession, 36331158421652676L) && (c38321qM = c120985dq.A02) != null && c38321qM.A6R() && str2.length() > 0) {
            if (str3.length() > 0) {
                str3 = AnonymousClass001.A0R(str3, " • ");
            }
            str3 = AnonymousClass001.A0R(str3, str2);
        }
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A0h = AbstractC25225BEi.A0h(null, AbstractC25228BEl.A0o(C05F.A0E, AbstractC77703du.A00(EnumC77673dr.A0A)));
        long A09 = AbstractC77623dm.A09(c2z1);
        C2XE ArD = c2z1.ArD();
        int A06 = AbstractC25228BEl.A06(ArD.A0C, c2z1, R.attr.igds_color_link_on_color);
        long A04 = AbstractC25449BNo.A04(userSession);
        int A02 = AbstractC25449BNo.A02(c2z1, userSession);
        long A05 = AbstractC25449BNo.A05(userSession);
        Integer A062 = AbstractC25449BNo.A06(c2z1, userSession);
        Typeface typeface = Typeface.DEFAULT;
        long A0D = AbstractC25229BEm.A0D();
        Integer num = C05F.A00;
        C77723dw A0g = AbstractC25233BEq.A0g(ArD, str3, A06);
        AbstractC25230BEn.A1K(A0g, c2z1.BoZ(), 0, A09);
        A0g.A0T(typeface);
        A0g.A0P(A02);
        AbstractC25234BEr.A18(A0g, c2z1, AbstractC25228BEl.A0A(c2z1, A04), A0D);
        AbstractC25234BEr.A1A(A0g, c2z1.BoZ(), A062, A05);
        AbstractC25234BEr.A1I(A0g, num, false);
        A0g.A0M(i);
        AbstractC25233BEq.A1D(A0h, A0g, false);
        return A0g.A0A();
    }
}
