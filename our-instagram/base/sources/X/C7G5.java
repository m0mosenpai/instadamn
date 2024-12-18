package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7G5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7G5 {
    public static final C7G5 A00 = new Object();

    public final Integer A00(UserSession userSession) {
        long A01 = C18U.A01(C06090Tz.A05, userSession, 36606285437212054L);
        if (A01 == 5) {
            return C05F.A01;
        }
        if (A01 == 7) {
            return C05F.A0C;
        }
        return C05F.A00;
    }

    public final boolean A01(UserSession userSession) {
        if (A00(userSession) != C05F.A0C) {
            return false;
        }
        return true;
    }
}
