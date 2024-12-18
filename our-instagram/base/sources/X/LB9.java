package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public abstract class LB9 {
    public static final Integer A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (A01(userSession)) {
            return C05F.A01;
        }
        return C05F.A00;
    }

    public static final boolean A01(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C229419w A02 = C18U.A02(userSession, 36314472473889350L);
        if (A02 != null && A02.AhE(C06090Tz.A04, 36314472473889350L) && AbstractC43959Jc8.A01(userSession)) {
            return true;
        }
        return false;
    }
}
