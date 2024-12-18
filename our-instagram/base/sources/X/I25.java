package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public abstract class I25 {
    public static final boolean A00(UserSession userSession, HBC hbc) {
        Integer num;
        H4K h4k = hbc.A03;
        if (h4k != null) {
            num = Integer.valueOf(h4k.A00);
        } else {
            num = null;
        }
        if (C5MB.A00.A01(num)) {
            if (hbc.A0B.size() != 1) {
                return false;
            }
            C06090Tz c06090Tz = C06090Tz.A06;
            if (!C18U.A06(c06090Tz, userSession, 36312874749003144L) && !C18U.A06(c06090Tz, userSession, 36312874755098058L)) {
                return false;
            }
            return true;
        }
        if (num == null || num.intValue() != 7) {
            return false;
        }
        return AbstractC31177DnL.A1U(C06090Tz.A06, userSession, 36312874749789584L);
    }
}
