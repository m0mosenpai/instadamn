package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.OQg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54909OQg {
    public static final boolean A01(User user) {
        Boolean CVI;
        C14360o3.A0B(user, 0);
        if (user.A1y() && (CVI = user.A03.CVI()) != null && CVI.booleanValue()) {
            return true;
        }
        return false;
    }

    public static final ArrayList A00(UserSession userSession, Collection collection) {
        if (collection == null) {
            return AbstractC166987dD.A1E();
        }
        C18A A00 = AnonymousClass189.A00(userSession);
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            User user = (User) A00.A02.get(it.next());
            if (user != null && A01(user)) {
                A1E.add(user);
            }
        }
        return A1E;
    }
}
