package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.JYu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43807JYu {
    public static final boolean A00(UserSession userSession) {
        if (!AbstractC43805JYs.A00(userSession)) {
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            InterfaceC16530ry interfaceC16530ry = A00.A3c;
            C0YR[] c0yrArr = C23031Ai.A8c;
            if (AbstractC167017dG.A1b(A00, interfaceC16530ry, c0yrArr, 435)) {
                C23031Ai A002 = AbstractC23021Ah.A00(userSession);
                AbstractC167007dF.A1L(A002, A002.A3c, c0yrArr, 435, false);
            }
        }
        C23031Ai A003 = AbstractC23021Ah.A00(userSession);
        if (!AbstractC167017dG.A1b(A003, A003.A3c, C23031Ai.A8c, 435) && AbstractC43805JYs.A00(userSession)) {
            return true;
        }
        return false;
    }

    public static final boolean A01(UserSession userSession) {
        if (!AbstractC43805JYs.A01(userSession)) {
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            if (AbstractC167017dG.A1b(A00, A00.A3d, C23031Ai.A8c, 436)) {
                AbstractC23021Ah.A00(userSession).A1U(false);
            }
        }
        C23031Ai A002 = AbstractC23021Ah.A00(userSession);
        if (!AbstractC167017dG.A1b(A002, A002.A3d, C23031Ai.A8c, 436) && AbstractC43805JYs.A01(userSession)) {
            return true;
        }
        return false;
    }

    public static final boolean A02(UserSession userSession) {
        if (!AbstractC43805JYs.A02(userSession)) {
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            InterfaceC16530ry interfaceC16530ry = A00.A3e;
            C0YR[] c0yrArr = C23031Ai.A8c;
            if (AbstractC167017dG.A1b(A00, interfaceC16530ry, c0yrArr, 434)) {
                C23031Ai A002 = AbstractC23021Ah.A00(userSession);
                AbstractC167007dF.A1L(A002, A002.A3e, c0yrArr, 434, false);
            }
        }
        C23031Ai A003 = AbstractC23021Ah.A00(userSession);
        if (!AbstractC167017dG.A1b(A003, A003.A3e, C23031Ai.A8c, 434) && AbstractC43805JYs.A02(userSession)) {
            return true;
        }
        return false;
    }
}
