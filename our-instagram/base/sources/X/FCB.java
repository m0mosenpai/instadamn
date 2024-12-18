package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public abstract class FCB {
    /* JADX WARN: Type inference failed for: r4v0, types: [X.1um, X.1ul] */
    public static final C40781ul A00(C16L c16l, UserSession userSession) {
        ?? c40791um = new C40791um();
        if (c16l.A11() == C16R.A0D) {
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                C14360o3.A0A(A0s);
                C14360o3.A0B(A0s, 2);
                if (!"friendship_statuses".equals(A0s)) {
                    C55702hA.A01(c16l, c40791um, A0s);
                } else {
                    while (c16l.A1J() != c16r) {
                        C151516rx c151516rx = new C151516rx(null, null, null, null, null, null, null, false, false);
                        String A0q = c16l.A0q();
                        if (A0q != null) {
                            User A0k = AbstractC31174DnI.A0k(userSession, A0q);
                            c16l.A1J();
                            while (c16l.A1J() != c16r) {
                                C151526ry.A00(c16l, c151516rx, AbstractC166997dE.A0s(c16l));
                            }
                            if (A0k != null) {
                                AbstractC129875tr.A00(userSession).A0C(c151516rx, A0k, null);
                                if (c16l instanceof C07950bF) {
                                    ((C07950bF) c16l).A1U(A0k, true);
                                }
                            }
                        }
                    }
                }
                c16l.A0z();
            }
        } else {
            c16l.A0z();
        }
        return c40791um;
    }
}
