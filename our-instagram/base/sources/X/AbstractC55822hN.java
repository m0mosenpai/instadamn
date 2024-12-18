package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2hN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC55822hN {
    public static final Integer A00(UserSession userSession) {
        if (userSession != null) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36315537626697081L)) {
                return C05F.A0C;
            }
            if (C18U.A06(c06090Tz, userSession, 36318483973150937L)) {
                return C05F.A00;
            }
        }
        return C05F.A01;
    }

    public static final boolean A01(UserSession userSession) {
        if (A00(userSession) != C05F.A00 || userSession == null) {
            return false;
        }
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36318483973282010L);
        if (Boolean.valueOf(A06) == null || !A06) {
            return false;
        }
        return true;
    }

    public static final boolean A02(UserSession userSession) {
        if (A00(userSession) != C05F.A0C) {
            return false;
        }
        return true;
    }
}
