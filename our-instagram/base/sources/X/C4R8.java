package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4R8, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4R8 {
    public static final boolean A00(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 1);
        C06090Tz c06090Tz = C06090Tz.A05;
        if ((!C18U.A06(c06090Tz, userSession, 36327585008859846L) || !new C11L(C18U.A04(c06090Tz, userSession, 36890534962332544L)).A08(str)) && !C18U.A06(c06090Tz, userSession, 36327585009253066L)) {
            return false;
        }
        return true;
    }

    public static final boolean A01(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 1);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36327585009121993L) && new C11L(C18U.A04(c06090Tz, userSession, 36890534962594689L)).A08(str)) {
            return true;
        }
        return false;
    }
}
