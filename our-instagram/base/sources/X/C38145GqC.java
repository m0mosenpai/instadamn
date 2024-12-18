package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GqC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38145GqC {
    public static final C38145GqC A00 = new Object();

    public final C31E A00(UserSession userSession, AnonymousClass318 anonymousClass318, InterfaceC60442pS interfaceC60442pS, C1M1 c1m1) {
        C31B c31b;
        C14360o3.A0B(userSession, 0);
        C37480Gey c37480Gey = new C37480Gey(userSession, 0);
        String sessionId = c1m1.getSessionId();
        boolean A05 = C1P8.A05(userSession);
        String moduleName = interfaceC60442pS.getModuleName();
        if (C14360o3.A0K(moduleName, "explore_popular")) {
            c31b = C31B.A0S;
        } else if (C14360o3.A0K(moduleName, "serp_top")) {
            c31b = C31B.A2a;
        } else {
            C0w9.A03("grid_sponsored_content_logger_factory", AnonymousClass001.A0R("grid logger is used by other surface: ", moduleName));
            c31b = C31B.A2g;
        }
        C38146GqD c38146GqD = new C38146GqD(userSession, anonymousClass318, interfaceC60442pS, c37480Gey, sessionId);
        if (A05) {
            return I9J.A00(userSession, c37480Gey, c31b, c38146GqD, sessionId, sessionId, sessionId);
        }
        C31E A002 = C31J.A00(userSession, c37480Gey, c31b, c38146GqD, sessionId);
        C14360o3.A0A(A002);
        return A002;
    }
}
