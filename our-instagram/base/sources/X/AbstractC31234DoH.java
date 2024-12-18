package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.DoH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31234DoH {
    public static final boolean A00(UserSession userSession, int i) {
        C14360o3.A0B(userSession, 1);
        C06090Tz c06090Tz = C06090Tz.A06;
        if (C18U.A06(c06090Tz, userSession, 36324389553189005L)) {
            boolean z = false;
            if (i == 0) {
                if (C18U.A06(c06090Tz, userSession, 36324389553254542L)) {
                    Boolean bool = (Boolean) AbstractC31237DoK.A00(userSession).A03.getValue();
                    if (bool != null) {
                        z = bool.booleanValue();
                    }
                    return !z;
                }
            } else {
                if (i == 2) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }
}
