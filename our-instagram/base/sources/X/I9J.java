package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public abstract class I9J {
    public static final C31E A00(UserSession userSession, C31A c31a, C31B c31b, C31E c31e, String str, String str2, String str3) {
        C31E c31k;
        AbstractC25233BEq.A0w(1, str, str2, str3);
        if (C1P9.A00(userSession).booleanValue() && C18U.A06(C06090Tz.A05, userSession, 36323715244699156L)) {
            c31k = new C42965IzH(userSession, C31L.A00.A00(userSession), c31a, c31b, c31e, C42968IzK.A00, (C451225r) userSession.A01(C451225r.class, C451125q.A00), str3);
        } else {
            c31k = new C31K(userSession, C31L.A00.A00(userSession), c31a, c31b, c31e, C42966IzI.A00, (C451225r) userSession.A01(C451225r.class, C451125q.A00), str3);
        }
        return c31k;
    }
}
