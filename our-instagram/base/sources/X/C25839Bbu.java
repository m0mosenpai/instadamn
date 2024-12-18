package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Map;

/* renamed from: X.Bbu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25839Bbu extends AbstractC52922bZ {
    public final UserSession A00;
    public final C150866ql A01;
    public final User A02;
    public final String A03;
    public final Map A04;
    public final C05A A05;
    public final C0UO A06;

    public C25839Bbu(UserSession userSession, C150866ql c150866ql, User user, String str, Map map) {
        AbstractC25234BEr.A0j(1, userSession, map, user, str);
        this.A00 = userSession;
        this.A01 = c150866ql;
        this.A04 = map;
        this.A02 = user;
        this.A03 = str;
        C008002u A1H = AbstractC25225BEi.A1H(new C32063E6p("", 0, 0, true, false, false));
        this.A05 = A1H;
        this.A06 = AbstractC208910l.A02(A1H);
    }
}
