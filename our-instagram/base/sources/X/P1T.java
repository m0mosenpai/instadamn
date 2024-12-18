package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class P1T implements InterfaceC196338mP {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AbstractC59962oe A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C38321qM A03;
    public final /* synthetic */ OFL A04;
    public final /* synthetic */ ENZ A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public P1T(Context context, AbstractC59962oe abstractC59962oe, UserSession userSession, C38321qM c38321qM, OFL ofl, ENZ enz, String str, boolean z) {
        this.A03 = c38321qM;
        this.A00 = context;
        this.A04 = ofl;
        this.A05 = enz;
        this.A06 = str;
        this.A02 = userSession;
        this.A01 = abstractC59962oe;
        this.A07 = z;
    }

    @Override // X.InterfaceC196338mP
    public final void DeN() {
        C55628OnD.A04(this.A04.A08, false);
        this.A05.A03();
        C9GR.A01(this.A00, "feed_share_auto_xpost_upsell_failure", 2131962508, 0);
    }

    @Override // X.InterfaceC196338mP
    public final void DeO() {
        C38321qM c38321qM = this.A03;
        Context context = this.A00;
        OFL ofl = this.A04;
        ENZ enz = this.A05;
        String str = this.A06;
        C55628OnD.A01(context, this.A01, this.A02, c38321qM, ofl, enz, str, this.A07);
    }
}
