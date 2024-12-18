package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public abstract class CK3 {
    public static final boolean A00(UserSession userSession, Integer num, Integer num2) {
        long j;
        C14360o3.A0B(userSession, 1);
        if (num == null || num.intValue() == 0) {
            return false;
        }
        int intValue = num2.intValue();
        C06090Tz c06090Tz = C06090Tz.A05;
        if (intValue != 0) {
            j = 36324999438611083L;
        } else {
            j = 36324999438545546L;
        }
        return C18U.A06(c06090Tz, userSession, j);
    }
}
