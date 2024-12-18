package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Kqd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47020Kqd {
    public static final boolean A00(UserSession userSession, C45078Jx7 c45078Jx7, boolean z) {
        C06090Tz c06090Tz;
        if (c45078Jx7.A02 == C05F.A0C) {
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            String valueOf = String.valueOf(c45078Jx7.A00);
            String name = c45078Jx7.A01.name();
            C14360o3.A0B(name, 1);
            if (!A00.A01.getBoolean(AnonymousClass001.A0u("proactive_warning_banner_dismissed/userid/", valueOf, "/flowtype/", name), false)) {
                if (z) {
                    c06090Tz = C06090Tz.A05;
                } else {
                    c06090Tz = C06090Tz.A06;
                }
                if (C18U.A06(c06090Tz, userSession, 36320932104643582L)) {
                    return true;
                }
            }
        }
        return false;
    }
}
