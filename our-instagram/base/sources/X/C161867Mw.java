package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7Mw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161867Mw {
    public static final boolean A01(UserSession userSession, C81613kW c81613kW) {
        if (c81613kW != null && c81613kW.A03(userSession)) {
            return true;
        }
        return false;
    }

    public static final boolean A02(C81613kW c81613kW) {
        return c81613kW != null && c81613kW.A01();
    }

    public final boolean A03(UserSession userSession, C81613kW c81613kW) {
        C14360o3.A0B(userSession, 1);
        if (!A02(c81613kW) && !A01(userSession, c81613kW)) {
            return false;
        }
        return true;
    }

    public static final C161857Mv A00(UserSession userSession) {
        return (C161857Mv) userSession.A01(C161857Mv.class, new C9EW(userSession, 13));
    }
}
