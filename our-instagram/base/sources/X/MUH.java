package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public abstract class MUH {
    public static final MUR A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (MUR) userSession.A01(MUR.class, new C57518Pfs(userSession, 18));
    }

    public static MUR A01(MUI mui) {
        return A00(mui.getSession());
    }
}
