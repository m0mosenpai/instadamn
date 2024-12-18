package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Map;

/* renamed from: X.BwL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27041BwL extends AbstractC61132qb {
    public final UserSession A00;
    public final User A01;
    public final String A02;
    public final Map A03;

    public C27041BwL(UserSession userSession, User user, String str, Map map) {
        AbstractC167027dH.A0a(1, userSession, map, user, str);
        this.A00 = userSession;
        this.A03 = map;
        this.A01 = user;
        this.A02 = str;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new C25839Bbu(userSession, new C150866ql(userSession), this.A01, this.A02, this.A03);
    }
}
