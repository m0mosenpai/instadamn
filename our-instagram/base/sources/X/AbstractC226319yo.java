package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.9yo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226319yo {
    public static final boolean A00(UserSession userSession, C55U c55u) {
        C06090Tz c06090Tz;
        long j;
        AbstractC167017dG.A1N(userSession, c55u);
        if (c55u.equals(C208509Kk.A00)) {
            c06090Tz = C06090Tz.A05;
            j = 36329217096499385L;
        } else if (c55u.equals(C81U.A00)) {
            c06090Tz = C06090Tz.A05;
            j = 36329217096564922L;
        } else if (c55u.equals(C128535rM.A00)) {
            c06090Tz = C06090Tz.A05;
            j = 36329217096433848L;
        } else {
            return false;
        }
        boolean A06 = C18U.A06(c06090Tz, userSession, j);
        C14360o3.A0A(Boolean.valueOf(A06));
        return A06;
    }
}
