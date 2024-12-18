package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.41E, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C41E {
    public static final C41E A00 = new Object();

    public static final boolean A00(UserSession userSession, C38321qM c38321qM) {
        if (!c38321qM.A4y()) {
            if (c38321qM.A50()) {
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 36324977963840125L) || C18U.A06(c06090Tz, userSession, 36324977964036736L)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final boolean A01(UserSession userSession, C38321qM c38321qM) {
        if (c38321qM.A5M() && A00(userSession, c38321qM) && c38321qM.A4i() && C36A.A07(userSession)) {
            return true;
        }
        return false;
    }
}
