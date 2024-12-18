package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.FcO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35051FcO {
    public static final void A00(UserSession userSession, boolean z) {
        C18A A00 = AnonymousClass189.A00(userSession);
        User A02 = A00.A02(userSession.userId);
        if (A02 == null) {
            A02 = AbstractC166997dE.A0Y(userSession);
        }
        if (!z) {
            A02.A03.ESR(false);
        }
        A02.A03.Ecz(Boolean.valueOf(z));
        A00.A03(A02);
        A02.A0c(userSession);
    }

    public static final boolean A01(UserSession userSession) {
        User A02 = AnonymousClass189.A00(userSession).A02(userSession.userId);
        if (A02 == null) {
            A02 = AbstractC166997dE.A0Y(userSession);
        }
        if (C18U.A06(C06090Tz.A05, userSession, 36322929265683190L) && !A02.A2L()) {
            return true;
        }
        return false;
    }

    public static final boolean A02(UserSession userSession, C7TT c7tt) {
        Object obj;
        boolean A1Y = AbstractC25229BEm.A1Y(c7tt);
        List list = c7tt.A0b;
        User A10 = AbstractC166987dD.A10(userSession);
        if (c7tt.A08 == 1003) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (AbstractC25225BEi.A1a(((User) obj).getId(), userSession.userId)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            User user = (User) obj;
            if (user != null) {
                Map map = c7tt.A0e;
                if (map == null) {
                    map = C16920sk.A00;
                    C14360o3.A0C(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
                }
                boolean A1T = AbstractC167007dF.A1T((Boolean) map.get(A10.getId()));
                boolean A1T2 = AbstractC167007dF.A1T((Boolean) map.get(user.getId()));
                if (!A1T || !A1T2) {
                    return false;
                }
                return true;
            }
        }
        return A1Y;
    }
}
