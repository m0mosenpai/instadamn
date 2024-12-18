package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public abstract class FY9 {
    public static final User A00(UserSession userSession, EB0 eb0) {
        if (userSession != null) {
            C18A A00 = AnonymousClass189.A00(userSession);
            User A02 = A00.A02(eb0.A04);
            if (A02 != null) {
                int i = eb0.A00;
                if (i != 0) {
                    if (i == 1) {
                        A02.A18(eb0.A08);
                        return A02;
                    }
                    throw AbstractC25230BEn.A0n("Unrecognized interop user type: ", i);
                }
                A02.A0v(eb0.A07);
                return A02;
            }
            User user = new User(eb0.A04, eb0.A05);
            user.A0i(eb0.A01);
            user.A0q(eb0.A03);
            user.A0p(eb0.A02);
            user.A0b(eb0.A00);
            int i2 = eb0.A00;
            if (i2 != 0) {
                if (i2 == 1) {
                    user.A18(eb0.A08);
                } else {
                    throw AbstractC25230BEn.A0n("Unrecognized interop user type: ", i2);
                }
            } else {
                user.A0v(eb0.A07);
            }
            return A00.A01(user, false, false);
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A01(User user, EB0 eb0) {
        eb0.A01 = user.Bhu();
        eb0.A05 = user.getUsername();
        String fullName = user.getFullName();
        if (fullName == null) {
            fullName = "";
        }
        eb0.A03 = fullName;
        eb0.A04 = user.getId();
        eb0.A02 = user.BTC();
        eb0.A00 = user.BJ8();
        eb0.A08 = user.CYY();
        eb0.A07 = user.CQf();
    }
}
