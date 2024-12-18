package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* loaded from: classes6.dex */
public final class EfM extends C33H {
    public final /* synthetic */ C54212eX A00;

    public EfM(C54212eX c54212eX) {
        this.A00 = c54212eX;
    }

    @Override // X.C33H, X.C33I
    public final void Dto(C5SW c5sw) {
        this.A00.A06();
    }

    @Override // X.C33H, X.C33I
    public final void Dtq(C5SW c5sw) {
        C18720vz c18720vz = AbstractC12960li.A00;
        InterfaceC19630xq A0q = AbstractC31172DnG.A0q(c18720vz);
        AbstractC167017dG.A1L(A0q.ARD(), A0q, "preference_long_press_avatar_show_mac_account_switcher_tooltip_impressions", 0);
        C19740y2 A00 = AbstractC19730y1.A00(c18720vz);
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC19610xo A0P = AbstractC31171DnF.A0P(A00);
        A0P.E7G("preference_long_press_avatar_show_mac_account_switcher_tooltip_last_impression_time", currentTimeMillis);
        A0P.apply();
        C54212eX c54212eX = this.A00;
        Map map = C54212eX.A0V;
        UserSession userSession = c54212eX.A0J;
        if (userSession != null) {
            C31514Dsy.A07(userSession, "long_press");
        }
    }
}
