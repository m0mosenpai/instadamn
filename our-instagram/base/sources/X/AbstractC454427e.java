package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.27e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC454427e {
    public static final C454527f A00(UserSession userSession) {
        C454527f c454527f = (C454527f) userSession.A00(C454527f.class);
        if (c454527f == null) {
            return new C454527f(userSession);
        }
        return c454527f;
    }
}
