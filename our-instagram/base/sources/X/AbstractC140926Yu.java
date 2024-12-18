package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.6Yu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC140926Yu {
    public static final boolean A00(UserSession userSession, User user) {
        int i;
        long j;
        if (user.CS0(new C150866ql(userSession)) && C18U.A06(C06090Tz.A05, userSession, 36323672294108643L)) {
            C7Uo c7Uo = new C7Uo(userSession);
            String id = user.getId();
            Number number = (Number) C7Uo.A01(c7Uo).get(id);
            if (number != null) {
                i = number.intValue();
            } else {
                i = 0;
            }
            Number number2 = (Number) C7Uo.A00(c7Uo).get(id);
            if (number2 != null) {
                j = number2.longValue();
            } else {
                j = 0;
            }
            if (i < 3) {
                if (C36J.A02(C36H.A04(C36G.A06, System.currentTimeMillis() - j), C36H.A03(C36G.A03, 1)) >= 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
