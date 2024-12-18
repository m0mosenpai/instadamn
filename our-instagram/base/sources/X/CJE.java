package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public abstract class CJE {
    public static final Integer A00(UserSession userSession, C38321qM c38321qM, EnumC71153Hb enumC71153Hb) {
        C06090Tz c06090Tz;
        long j;
        if (!c38321qM.CdW()) {
            return C05F.A0C;
        }
        if (AbstractC41071vF.A0O(userSession, c38321qM) && CJ8.A00(userSession, enumC71153Hb)) {
            c06090Tz = C06090Tz.A06;
            j = 36312874749003144L;
        } else {
            c06090Tz = C06090Tz.A06;
            j = 36312874755098058L;
        }
        if (C18U.A06(c06090Tz, userSession, j)) {
            return C05F.A01;
        }
        return C05F.A00;
    }
}
