package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class PK5 implements GZY {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AbstractC59962oe A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C54472O5a A03;
    public final /* synthetic */ C54722OEz A04;
    public final /* synthetic */ ENZ A05;

    public PK5(Context context, AbstractC59962oe abstractC59962oe, UserSession userSession, C54472O5a c54472O5a, C54722OEz c54722OEz, ENZ enz) {
        this.A02 = userSession;
        this.A01 = abstractC59962oe;
        this.A04 = c54722OEz;
        this.A03 = c54472O5a;
        this.A00 = context;
        this.A05 = enz;
    }

    @Override // X.GZY
    public final void onAuthorizeFail() {
        MSY.A1F(this.A04.A06);
    }

    @Override // X.GZY
    public final void onAuthorizeSuccess(String str, String str2) {
        UserSession userSession = this.A02;
        if (!C18U.A06(C06090Tz.A05, userSession, 36322396688361688L)) {
            AbstractC59962oe abstractC59962oe = this.A01;
            C196068lw.A00(userSession).A01(C55202OeD.A01, new P1P(3, abstractC59962oe, userSession), "reels_row_share");
            C54722OEz c54722OEz = this.A04;
            MSY.A1F(c54722OEz.A06);
            C55202OeD.A01(this.A00, abstractC59962oe, userSession, new C54563O8p(this.A03.A00, false), c54722OEz, this.A05);
        }
    }
}
