package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes8.dex */
public final class LEG {
    public final UserSession A00;
    public final C6XI A01;

    public static final C45062Jwr A00(C45039JwU c45039JwU, LEG leg) {
        String str = c45039JwU.A03;
        User user = c45039JwU.A02;
        C45055Jwk c45055Jwk = c45039JwU.A01;
        long j = c45055Jwk.A01;
        return new C45062Jwr(AbstractC25225BEi.A0t(c45055Jwk.A04), C1OU.A01(leg.A00, user), user, str, (int) c45039JwU.A00, 1, j, c45039JwU.A04, C6XI.A02(user));
    }

    public LEG(UserSession userSession, C6XI c6xi) {
        AbstractC167017dG.A1P(userSession, c6xi);
        this.A00 = userSession;
        this.A01 = c6xi;
    }
}
