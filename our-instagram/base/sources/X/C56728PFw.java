package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.PFw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56728PFw implements GZR {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AbstractC59962oe A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C38321qM A03;
    public final /* synthetic */ C54622OAx A04;
    public final /* synthetic */ OFL A05;
    public final /* synthetic */ ENZ A06;
    public final /* synthetic */ String A07;

    @Override // X.GZR
    public final void onAuthorizeFail() {
    }

    public C56728PFw(Context context, AbstractC59962oe abstractC59962oe, UserSession userSession, C38321qM c38321qM, C54622OAx c54622OAx, OFL ofl, ENZ enz, String str) {
        this.A05 = ofl;
        this.A04 = c54622OAx;
        this.A06 = enz;
        this.A00 = context;
        this.A01 = abstractC59962oe;
        this.A02 = userSession;
        this.A03 = c38321qM;
        this.A07 = str;
    }

    @Override // X.GZR
    public final void onAuthorizeSuccess(String str) {
        OFL ofl = this.A05;
        C54622OAx c54622OAx = this.A04;
        ENZ enz = this.A06;
        Context context = this.A00;
        AbstractC59962oe abstractC59962oe = this.A01;
        UserSession userSession = this.A02;
        C196068lw.A00(userSession).A01(C55628OnD.A01, new P1U(context, abstractC59962oe, userSession, this.A03, c54622OAx, ofl, enz, this.A07, false), "likes_sheet");
    }
}
