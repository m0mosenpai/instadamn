package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2pI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60342pI {
    public final boolean A00(UserSession userSession) {
        if (AbstractC23021Ah.A00(userSession).A1o() && A01(userSession, false)) {
            return true;
        }
        return false;
    }

    public final boolean A01(UserSession userSession, boolean z) {
        boolean A06;
        C14360o3.A0B(userSession, 0);
        C06090Tz c06090Tz = C06090Tz.A06;
        if (C18U.A06(c06090Tz, userSession, 36322452523067644L)) {
            if (z) {
                A06 = C18U.A06(C06090Tz.A05, userSession, 36322452522936570L);
            } else {
                A06 = C18U.A06(c06090Tz, userSession, 36322452522936570L);
                C14360o3.A0A(Boolean.valueOf(A06));
            }
            if (A06) {
                return true;
            }
        }
        return false;
    }
}
