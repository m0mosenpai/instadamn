package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GsC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38267GsC {
    public static final C38274GsJ A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (C38274GsJ.A04 == null) {
            C38274GsJ.A04 = new C38274GsJ(userSession);
        }
        C38274GsJ c38274GsJ = C38274GsJ.A04;
        if (c38274GsJ == null) {
            C14360o3.A0F("instance");
            throw C00O.createAndThrow();
        }
        return c38274GsJ;
    }
}
