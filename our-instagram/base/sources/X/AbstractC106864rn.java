package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4rn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC106864rn {
    public static final boolean A00(UserSession userSession, Integer num) {
        boolean z;
        C06090Tz c06090Tz;
        long j;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue == 2) {
                    z = false;
                    c06090Tz = C06090Tz.A06;
                    if (!C18U.A06(c06090Tz, userSession, 36321722378495719L)) {
                        return false;
                    }
                    j = 36321722380199678L;
                } else {
                    throw new RuntimeException();
                }
            } else {
                z = false;
                c06090Tz = C06090Tz.A06;
                if (!C18U.A06(c06090Tz, userSession, 36321722378495719L)) {
                    return false;
                }
                j = 36321722379282160L;
            }
        } else {
            z = false;
            c06090Tz = C06090Tz.A06;
            if (!C18U.A06(c06090Tz, userSession, 36321722378495719L)) {
                return false;
            }
            j = 36321722379216623L;
        }
        if (C18U.A06(c06090Tz, userSession, j)) {
            return true;
        }
        return z;
    }
}
