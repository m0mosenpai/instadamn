package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Map;

/* renamed from: X.0Id, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC03650Id {
    public static final void A00(UserSession userSession, User user) {
        AnonymousClass088 anonymousClass088 = ((C17110t6) C0BQ.A00(userSession)).A02;
        if (anonymousClass088.A04.containsKey(user)) {
            Map map = anonymousClass088.A01;
            Object obj = map.get(user);
            if (obj != null) {
                map.put(user, obj);
                Map map2 = anonymousClass088.A02;
                map2.put(user, map2.get(user));
                AnonymousClass088.A01(anonymousClass088);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }
}
