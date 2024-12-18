package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7NG, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7NG {
    public static final boolean A01(UserSession userSession, int i) {
        C06090Tz c06090Tz;
        long j;
        C14360o3.A0B(userSession, 0);
        if (!A00(i)) {
            return true;
        }
        if (i != 29) {
            if (i != 32 && i != 62) {
                return false;
            }
            c06090Tz = C06090Tz.A05;
            j = 36315859749506710L;
        } else {
            c06090Tz = C06090Tz.A05;
            j = 36316495405322694L;
        }
        return C18U.A06(c06090Tz, userSession, j);
    }

    public static final boolean A00(int i) {
        if (i != 29 && !C4GR.A01(i) && !C4GR.A02(i)) {
            return false;
        }
        return true;
    }
}
