package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class PK3 implements GZY {
    public final /* synthetic */ AbstractC59962oe A00;
    public final /* synthetic */ P0F A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    @Override // X.GZY
    public final void onAuthorizeFail() {
    }

    public PK3(AbstractC59962oe abstractC59962oe, P0F p0f, boolean z, boolean z2) {
        this.A01 = p0f;
        this.A00 = abstractC59962oe;
        this.A02 = z;
        this.A03 = z2;
    }

    @Override // X.GZY
    public final void onAuthorizeSuccess(String str, String str2) {
        String str3;
        P0F p0f = this.A01;
        UserSession userSession = p0f.A00;
        if (!C18U.A06(C06090Tz.A05, userSession, 36326541332002763L)) {
            AbstractC59962oe abstractC59962oe = this.A00;
            boolean z = this.A02;
            boolean z2 = this.A03;
            C131995xZ A00 = C196068lw.A00(userSession).A00(C200108tF.A00);
            C46552Bt A002 = AbstractC46542Bs.A00(userSession);
            boolean A02 = C196068lw.A02(A00);
            InterfaceC19610xo ARD = A002.A04.ARD();
            long currentTimeMillis = System.currentTimeMillis();
            if (A02) {
                str3 = "PREFERENCE_CREATOR_REELS_BPL_AUTO_XPOSTING_LAST_CHANGED_MS";
            } else {
                str3 = "PREFERENCE_AUTO_CROSS_POST_TO_FACEBOOK_REELS_LAST_CHANGED_MS";
            }
            ARD.E7G(str3, currentTimeMillis);
            ARD.apply();
            NJR njr = p0f.A02;
            NKM nkm = njr.A0i;
            nkm.A03.A01();
            if (((C51760Mtj) nkm.A06.getValue()).A00 instanceof C52740NVi) {
                OXw.A01(abstractC59962oe.requireContext(), userSession, MSX.A0Z(z2 ? 1 : 0), C05F.A01, C180377zR.A00(userSession), AbstractC166997dE.A0t(userSession), z, njr.A0l);
            }
        }
    }
}
