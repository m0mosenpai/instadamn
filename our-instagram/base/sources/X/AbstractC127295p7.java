package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.5p7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC127295p7 {
    public static final C127305p8 A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (C127305p8.A02 == null) {
            C127305p8.A02 = new C127305p8(userSession);
        }
        C127305p8 c127305p8 = C127305p8.A02;
        if (c127305p8 == null) {
            C14360o3.A0F("instance");
            throw C00O.createAndThrow();
        }
        return c127305p8;
    }
}
