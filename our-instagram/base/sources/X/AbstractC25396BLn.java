package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.BLn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25396BLn {
    public static final C51722Yv A00(EnumC71343Hv enumC71343Hv, C51722Yv c51722Yv, InterfaceC30930Dik interfaceC30930Dik, C120985dq c120985dq, UserSession userSession, InterfaceC60442pS interfaceC60442pS, Integer num, boolean z, boolean z2) {
        C14360o3.A0B(c120985dq, 1);
        C14360o3.A0B(interfaceC60442pS, 2);
        C14360o3.A0B(userSession, 3);
        C9CV c9cv = new C9CV(C05F.A00, new C77843eC(C37679GiG.A00, new C37678GiF(enumC71343Hv, interfaceC30930Dik, c120985dq, userSession, interfaceC60442pS, num, z, z2)), 2);
        if (c51722Yv == C51722Yv.A02) {
            c51722Yv = null;
        }
        return new C51722Yv(c51722Yv, c9cv);
    }

    public static final C51722Yv A01(EnumC71343Hv enumC71343Hv, C51722Yv c51722Yv, C120985dq c120985dq, UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        return A00(enumC71343Hv, c51722Yv, null, c120985dq, userSession, interfaceC60442pS, null, false, false);
    }

    public static final C51722Yv A02(EnumC71343Hv enumC71343Hv, C51722Yv c51722Yv, C120985dq c120985dq, UserSession userSession, InterfaceC60442pS interfaceC60442pS, boolean z) {
        return A00(enumC71343Hv, c51722Yv, null, c120985dq, userSession, interfaceC60442pS, null, false, z);
    }

    public static final C51722Yv A03(EnumC71343Hv enumC71343Hv, C51722Yv c51722Yv, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC16660sJ interfaceC16660sJ) {
        return AbstractC25233BEq.A0d(c51722Yv, new C29925DHn(AbstractC167007dF.A06(1, userSession, interfaceC60442pS), new C37616GhB(userSession, interfaceC60442pS), enumC71343Hv, interfaceC16660sJ, null));
    }
}
