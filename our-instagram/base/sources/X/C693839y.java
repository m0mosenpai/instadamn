package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.39y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C693839y {
    public static final C693939z A02 = new Object();
    public final UserSession A00;
    public final String A01;

    public C693839y(UserSession userSession, String str) {
        this.A00 = userSession;
        this.A01 = str;
    }

    public final Integer A00(C38321qM c38321qM) {
        if (c38321qM.BRp() != EnumC40111tc.A0S) {
            UserSession userSession = this.A00;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (!C18U.A06(c06090Tz, userSession, 36320614278177492L)) {
                if (C18U.A06(c06090Tz, userSession, 36320614278243029L)) {
                    return C05F.A0u;
                }
                if (!AbstractC16830sb.A07("feed_contextual_self_profile", "feed_contextual_profile", "feed_contextual_group_profile").contains(this.A01) || C18U.A06(c06090Tz, userSession, 36320614277194444L)) {
                    if (C18U.A06(c06090Tz, userSession, 36320614276932298L)) {
                        return C05F.A01;
                    }
                    if (C18U.A06(c06090Tz, userSession, 36320614277980881L)) {
                        return C05F.A0C;
                    }
                    if (C18U.A06(c06090Tz, userSession, 36320614278046418L) && A01(c38321qM)) {
                        return C05F.A0N;
                    }
                    if (C18U.A06(c06090Tz, userSession, 36320614278111955L)) {
                        return C05F.A0Y;
                    }
                }
                return C05F.A00;
            }
        }
        return C05F.A0j;
    }

    public final boolean A01(C38321qM c38321qM) {
        long j;
        boolean CdW = c38321qM.CdW();
        UserSession userSession = this.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (CdW) {
            j = 36320614277718734L;
        } else {
            j = 36320614277784271L;
        }
        return C18U.A06(c06090Tz, userSession, j);
    }
}
