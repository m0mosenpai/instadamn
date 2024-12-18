package X;

import com.instagram.common.session.UserSession;
import java.util.Random;

/* loaded from: classes9.dex */
public abstract class OZA {
    public static final Random A00 = new Random();

    public static final boolean A00(UserSession userSession, Integer num) {
        int intValue;
        long j;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36329002349182918L)) {
            return true;
        }
        if (num == null || (intValue = num.intValue()) == -1) {
            return false;
        }
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue == 2) {
                    j = 36329002349838288L;
                } else {
                    throw B4Z.A00();
                }
            } else {
                j = 36329002349313992L;
            }
        } else {
            j = 36329002349772751L;
        }
        return C18U.A06(c06090Tz, userSession, j);
    }

    public static final boolean A01(UserSession userSession, Integer num) {
        int intValue;
        long j;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36329002349248455L)) {
            return true;
        }
        if (num == null || (intValue = num.intValue()) == -1) {
            return false;
        }
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue == 2) {
                    j = 36329002349641677L;
                } else {
                    throw B4Z.A00();
                }
            } else {
                j = 36329002349707214L;
            }
        } else {
            j = 36329002349379529L;
        }
        return C18U.A06(c06090Tz, userSession, j);
    }
}
