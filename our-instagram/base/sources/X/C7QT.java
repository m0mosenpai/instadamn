package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7QT, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7QT {
    public final UserSession A00;

    public C7QT(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public static final boolean A00(C7QT c7qt, C83403nh c83403nh, boolean z) {
        String str;
        C101584hT c101584hT;
        if (c83403nh.A10 == C2EY.A0q) {
            UserSession userSession = c7qt.A00;
            if (!C14360o3.A0K(userSession.userId, c83403nh.BtE())) {
                C101584hT c101584hT2 = c83403nh.A0e;
                if (c101584hT2 != null) {
                    str = c101584hT2.A09;
                } else {
                    str = null;
                }
                if (C14360o3.A0K(str, "permanent") || ((c101584hT = c83403nh.A0e) != null && c101584hT.A00 > 0)) {
                    C06090Tz c06090Tz = C06090Tz.A05;
                    if (C18U.A06(c06090Tz, userSession, 36325506244686975L)) {
                        if (!z || C18U.A06(c06090Tz, userSession, 36325506245080197L)) {
                            if (!c83403nh.A1S() || C18U.A06(c06090Tz, userSession, 36325506244752512L)) {
                                return true;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
