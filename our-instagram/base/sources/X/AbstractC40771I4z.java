package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.I4z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40771I4z {
    public static final IM8 A00(C38748H4o c38748H4o, UserSession userSession, User user) {
        User CDj;
        AbstractC167017dG.A1N(userSession, c38748H4o);
        C37771pE c37771pE = c38748H4o.A02;
        Reel reel = null;
        C1N9 c1n9 = null;
        if (c37771pE != null) {
            C1NB A01 = AbstractC37741pB.A01(userSession, c37771pE);
            if (A01 == null) {
                if (user != null) {
                    c1n9 = new C1N9(user);
                }
                A01 = c1n9;
            }
            User A0Y = AbstractC166997dE.A0Y(userSession);
            if (A01 != null && (CDj = A01.CDj()) != null) {
                user = CDj;
            }
            reel = AbstractC37301Gc2.A0M(userSession).A0H(c37771pE, A01, C14360o3.A0K(A0Y, user));
        }
        return new IM8(c38748H4o.A00, c38748H4o.A01, reel);
    }
}
