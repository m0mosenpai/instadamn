package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.NwP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54127NwP {
    public static final C54984OTs A00(UserSession userSession) {
        if (C54984OTs.A03 == null) {
            C54984OTs.A03 = new C54984OTs(userSession);
        }
        C54984OTs c54984OTs = C54984OTs.A03;
        if (c54984OTs == null) {
            C14360o3.A0F("instance");
            throw C00O.createAndThrow();
        }
        return c54984OTs;
    }
}
