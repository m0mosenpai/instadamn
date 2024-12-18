package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.0Dk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC03270Dk {
    @Deprecated(message = "Use Kotlin unsafe cast (as)", replaceWith = @ReplaceWith(expression = "session as UserSession", imports = {}))
    public static final UserSession A00(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 0);
        if (abstractC12990ll instanceof UserSession) {
            return (UserSession) abstractC12990ll;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Deprecated(message = "Use Kotlin safe cast (as?)", replaceWith = @ReplaceWith(expression = "session as? UserSession", imports = {}))
    public static final UserSession A01(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 0);
        if (abstractC12990ll instanceof UserSession) {
            return (UserSession) abstractC12990ll;
        }
        return null;
    }

    public static final List A03(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        InterfaceC02900Bo A00 = C0BQ.A00(userSession);
        String str = userSession.userId;
        C14360o3.A0B(str, 0);
        return ((C17110t6) A00).A02.A04(str);
    }

    public static final String A02(AbstractC12990ll abstractC12990ll) {
        UserSession userSession;
        if (!(abstractC12990ll instanceof UserSession) || (userSession = (UserSession) abstractC12990ll) == null) {
            return null;
        }
        return userSession.userId;
    }
}
