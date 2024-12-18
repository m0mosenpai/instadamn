package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.77x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1581277x {
    public final UserSession A00;

    public C1581277x(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final boolean A00(AnonymousClass541 anonymousClass541) {
        long j;
        C14360o3.A0B(anonymousClass541, 0);
        if (!anonymousClass541.A02) {
            return false;
        }
        UserSession userSession = this.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36320030161641392L)) {
            return false;
        }
        AbstractC46718Klb abstractC46718Klb = AbstractC46718Klb.$redex_init_class;
        int ordinal = anonymousClass541.ordinal();
        if (ordinal != 6) {
            if (ordinal != 9) {
                if (ordinal != 7) {
                    if (ordinal != 8) {
                        return false;
                    }
                    j = 36320030161510318L;
                } else {
                    j = 36320030161379244L;
                }
            } else {
                j = 36320030161444781L;
            }
        } else {
            j = 36320030161575855L;
        }
        return C18U.A06(c06090Tz, userSession, j);
    }
}
