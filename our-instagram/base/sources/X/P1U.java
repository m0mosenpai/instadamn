package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class P1U implements InterfaceC196338mP {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AbstractC59962oe A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C38321qM A03;
    public final /* synthetic */ C54622OAx A04;
    public final /* synthetic */ OFL A05;
    public final /* synthetic */ ENZ A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    @Override // X.InterfaceC196338mP
    public final /* synthetic */ void DeN() {
    }

    public P1U(Context context, AbstractC59962oe abstractC59962oe, UserSession userSession, C38321qM c38321qM, C54622OAx c54622OAx, OFL ofl, ENZ enz, String str, boolean z) {
        this.A05 = ofl;
        this.A04 = c54622OAx;
        this.A06 = enz;
        this.A00 = context;
        this.A01 = abstractC59962oe;
        this.A02 = userSession;
        this.A03 = c38321qM;
        this.A07 = str;
        this.A08 = z;
    }

    @Override // X.InterfaceC196338mP
    public final void DeO() {
        OFL ofl = this.A05;
        C54622OAx c54622OAx = this.A04;
        ENZ enz = this.A06;
        Context context = this.A00;
        AbstractC59962oe abstractC59962oe = this.A01;
        UserSession userSession = this.A02;
        C38321qM c38321qM = this.A03;
        String str = this.A07;
        boolean z = this.A08;
        c54622OAx.A00 = true;
        enz.A03();
        C38321qM c38321qM2 = c54622OAx.A02;
        if (c38321qM2.A1m() != EnumC76753cN.A05 && c38321qM2.A1m() != EnumC76753cN.A06) {
            C55628OnD.A04(ofl.A08, true);
            enz.A03();
            if (!C18U.A06(C06090Tz.A05, userSession, 36326541332461522L)) {
                if (!AbstractC54211Nxp.A00(abstractC59962oe.requireActivity(), context, abstractC59962oe, C82G.A0Z, userSession, new PGC(context, abstractC59962oe, userSession, c38321qM, ofl, enz, str))) {
                    z = false;
                } else {
                    return;
                }
            }
            C55628OnD.A01(context, abstractC59962oe, userSession, c38321qM, ofl, enz, str, z);
        }
    }
}
