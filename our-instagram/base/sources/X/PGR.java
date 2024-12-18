package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class PGR implements InterfaceC57991Pnb {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AbstractC59962oe A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C38321qM A03;
    public final /* synthetic */ C196208mB A04;
    public final /* synthetic */ OFL A05;
    public final /* synthetic */ ENZ A06;
    public final /* synthetic */ String A07;

    public PGR(Context context, AbstractC59962oe abstractC59962oe, UserSession userSession, C38321qM c38321qM, C196208mB c196208mB, OFL ofl, ENZ enz, String str) {
        this.A05 = ofl;
        this.A06 = enz;
        this.A03 = c38321qM;
        this.A00 = context;
        this.A07 = str;
        this.A02 = userSession;
        this.A01 = abstractC59962oe;
        this.A04 = c196208mB;
    }

    @Override // X.InterfaceC57991Pnb
    public final void E33(Integer num) {
        int A03 = AbstractC43592JPx.A03(num, 0);
        if (A03 != 0) {
            if (A03 == 1) {
                OFL ofl = this.A05;
                C55628OnD.A04(ofl.A08, true);
                ENZ enz = this.A06;
                enz.A03();
                C38321qM c38321qM = this.A03;
                Context context = this.A00;
                String str = this.A07;
                C55628OnD.A00(context, this.A01, this.A02, c38321qM, ofl, enz, str, false);
                return;
            }
            return;
        }
        OFL ofl2 = this.A05;
        C55628OnD.A04(ofl2.A08, true);
        ENZ enz2 = this.A06;
        enz2.A03();
        C38321qM c38321qM2 = this.A03;
        Context context2 = this.A00;
        String str2 = this.A07;
        UserSession userSession = this.A02;
        C55628OnD.A00(context2, this.A01, userSession, c38321qM2, ofl2, enz2, str2, true);
        this.A04.A01(userSession, "likes_sheet", true);
    }
}
