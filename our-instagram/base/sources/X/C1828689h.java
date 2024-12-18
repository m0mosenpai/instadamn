package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.89h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1828689h {
    public final UserSession A00;
    public final C55U A01;

    public C1828689h(UserSession userSession, C55U c55u, String str) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(c55u, 3);
        this.A00 = userSession;
        this.A01 = c55u;
    }

    public static final boolean A00(C1828689h c1828689h, String str) {
        UserSession userSession;
        C06090Tz c06090Tz;
        long j;
        C55U c55u = c1828689h.A01;
        if (C14360o3.A0K(c55u, C208509Kk.A00) || C14360o3.A0K(c55u, C81T.A00) || (c55u instanceof C81V)) {
            return true;
        }
        if (c55u instanceof C128535rM) {
            userSession = c1828689h.A00;
            c06090Tz = C06090Tz.A05;
            j = 36330484111786882L;
        } else if (c55u instanceof C81S) {
            userSession = c1828689h.A00;
            c06090Tz = C06090Tz.A05;
            j = 36330484111917956L;
        } else if (c55u instanceof C1811481q) {
            userSession = c1828689h.A00;
            c06090Tz = C06090Tz.A05;
            j = 36330484111852419L;
        } else {
            C0f5 AEp = C18950wb.A01.AEp("unsupported_destination", 817894773);
            AEp.ABW("camera_destination", c55u.A02);
            AEp.ABW("calling_method", str);
            AEp.ABW("nav_chain", String.valueOf(C1QM.A00.A02.A00));
            AEp.report();
            return false;
        }
        return C18U.A06(c06090Tz, userSession, j);
    }
}
