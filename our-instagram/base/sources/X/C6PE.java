package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6PE, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6PE {
    public static final C6PF A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (C6PF.A03 == null) {
            C6PF.A03 = new C6PF(userSession);
        }
        C6PF c6pf = C6PF.A03;
        if (c6pf == null) {
            C14360o3.A0F("instance");
            throw C00O.createAndThrow();
        }
        return c6pf;
    }
}
