package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.FfY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35181FfY {
    public static boolean A02(AbstractC12990ll abstractC12990ll) {
        return AbstractC167007dF.A1Q(AbstractC31174DnI.A06(abstractC12990ll), 10);
    }

    public static ArrayList A00(UserSession userSession) {
        ArrayList A1E = AbstractC166987dD.A1E();
        int A06 = AbstractC31174DnI.A06(userSession);
        int size = C84613qA.A00(userSession).A02().size();
        AbstractC166997dE.A1W(A1E, A06);
        AbstractC166997dE.A1W(A1E, A06 + size);
        return A1E;
    }

    public static ArrayList A01(UserSession userSession, User user) {
        String id;
        List BOf = C0BQ.A00(userSession).BOf(AbstractC166987dD.A10(userSession));
        HashSet A02 = C84613qA.A00(userSession).A02();
        ArrayList A1E = AbstractC166987dD.A1E();
        if (user == null) {
            id = null;
        } else {
            id = user.getId();
        }
        for (int i = 0; i < BOf.size(); i++) {
            User user2 = (User) BOf.get(i);
            String id2 = user2.getId();
            if (!A02.contains(id2) && !id2.equals(id)) {
                A1E.add(user2);
            }
        }
        return A1E;
    }

    public static boolean A03(UserSession userSession, User user) {
        if (!A01(userSession, user).isEmpty() && C1AD.A06(C06090Tz.A05, 18297260760629955L)) {
            return true;
        }
        return false;
    }
}
