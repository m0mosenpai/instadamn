package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* loaded from: classes8.dex */
public final class LE1 {
    public final C18920wW A00;

    public LE1(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }

    public static final void A00(LE1 le1, String str, Map map) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(le1.A00, "igd_pro_campaign_view_event");
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1C(A0f, str);
            AbstractC31174DnI.A1G(A0f, map);
        }
    }
}
