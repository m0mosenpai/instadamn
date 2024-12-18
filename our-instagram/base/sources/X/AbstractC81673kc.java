package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3kc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC81673kc {
    public static final C81663kb A00(UserSession userSession, C126455ng c126455ng) {
        C14360o3.A0B(c126455ng, 1);
        C80693iy c80693iy = new C80693iy();
        c80693iy.A1U = C17060sy.A01.A01(userSession);
        if (c80693iy.A1W == null) {
            c80693iy.A1W = false;
        }
        C81663kb c81663kb = new C81663kb(userSession, c80693iy);
        AbstractC31407DrC.A00(c126455ng, c81663kb);
        A02(c81663kb);
        return c81663kb;
    }

    public static final C81663kb A01(UserSession userSession, C81663kb c81663kb) {
        C80693iy c80693iy = c81663kb.A02;
        try {
            c80693iy.A1U = C17060sy.A01.A01(userSession);
            c80693iy.A29 = AbstractC81683kd.A07(userSession, c81663kb.BSH());
            return c81663kb;
        } catch (NullPointerException e) {
            AbstractC46834KnT.A00(userSession).A01(c81663kb, e);
            return null;
        }
    }

    public static final void A02(C81663kb c81663kb) {
        if (!c81663kb.CVQ()) {
            c81663kb.BSH();
        }
    }
}
