package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6PL, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6PL {
    public static final String A00(UserSession userSession, InterfaceC60442pS interfaceC60442pS, C41181vS c41181vS) {
        C105824pt c105824pt;
        if (AbstractC75423a9.A02(c41181vS, interfaceC60442pS)) {
            return c41181vS.BzL(userSession);
        }
        if (AbstractC75423a9.A01(c41181vS, interfaceC60442pS)) {
            int ordinal = c41181vS.A0e.ordinal();
            if (ordinal != 1) {
                if ((ordinal != 3 && ordinal != 4) || (c105824pt = c41181vS.A0c) == null) {
                    return null;
                }
                return c105824pt.A0h;
            }
            C38321qM c38321qM = c41181vS.A0b;
            c38321qM.getClass();
            return c38321qM.A0C.getOrganicTrackingToken();
        }
        return null;
    }
}
