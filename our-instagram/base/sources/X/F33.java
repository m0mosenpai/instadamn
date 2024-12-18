package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;

/* loaded from: classes6.dex */
public abstract class F33 {
    public static final boolean A00(UserSession userSession, Capabilities capabilities, E70 e70) {
        boolean z;
        C81543kP c81543kP = e70.A0E;
        if (c81543kP != null) {
            z = c81543kP.A0Q;
        } else {
            z = false;
        }
        if (!capabilities.A00(EnumC2054697t.A0V) || !C18U.A06(C06090Tz.A06, userSession, 36314485358594687L)) {
            return false;
        }
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36310314945413132L) || e70.A0n || z) {
            return false;
        }
        return AbstractC31176DnK.A1a(c06090Tz, userSession, 36314485360364163L);
    }
}
