package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1Lz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC25451Lz {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.1M1, X.1M0, java.lang.Object] */
    public static final C1M6 A00(UserSession userSession) {
        if (C18U.A06(C06090Tz.A05, userSession, 36317659339429324L)) {
            ?? obj = new Object();
            obj.A00 = "not_available";
            return new C1M4(userSession, obj);
        }
        return new C71013Gn();
    }

    public static final C1M6 A01(UserSession userSession, C1M1 c1m1) {
        if (C18U.A06(C06090Tz.A05, userSession, 36317659339429324L)) {
            return new C1M4(userSession, c1m1);
        }
        return new C71013Gn();
    }
}
