package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6Gt, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6Gt {
    public static final Integer A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        String A04 = C18U.A04(C06090Tz.A05, userSession, 36889637314429795L);
        int hashCode = A04.hashCode();
        if (hashCode != 103067) {
            if (hashCode == 93494179 && A04.equals("badge")) {
                return C05F.A00;
            }
            return null;
        }
        if (A04.equals("hat")) {
            return C05F.A01;
        }
        return null;
    }
}
