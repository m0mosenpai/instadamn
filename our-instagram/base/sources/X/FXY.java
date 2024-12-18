package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class FXY {
    public static final C35038FcB A01(UserSession userSession, int i) {
        C14360o3.A0B(userSession, 0);
        if (i > 0) {
            return new C35038FcB(C006802i.A0p, userSession, i);
        }
        return null;
    }

    public static final C35038FcB A00(UserSession userSession) {
        return new C35038FcB(C006802i.A0p, userSession, C35038FcB.A03.getAndIncrement());
    }
}
