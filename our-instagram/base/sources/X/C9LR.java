package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.9LR, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9LR {
    public static final boolean A00(UserSession userSession, String str) {
        C06090Tz c06090Tz;
        long j;
        C14360o3.A0B(userSession, 0);
        if (str != null) {
            if (str.equals("324984895725671")) {
                c06090Tz = C06090Tz.A05;
                j = 36317367281652843L;
            } else if (str.equals("389287015265096")) {
                c06090Tz = C06090Tz.A05;
                j = 36317367281718380L;
            } else {
                return false;
            }
            if (C18U.A06(c06090Tz, userSession, j) || C18U.A06(C06090Tz.A06, userSession, 36327533469317790L)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
