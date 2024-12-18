package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6E9, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6E9 {
    public static final boolean A00(UserSession userSession, C0tH c0tH, boolean z) {
        C06090Tz c06090Tz;
        long j = c0tH.mobileConfigSpecifier;
        if (z) {
            c06090Tz = C06090Tz.A05;
        } else {
            c06090Tz = C06090Tz.A06;
        }
        C14360o3.A0A(c06090Tz);
        return C18U.A06(c06090Tz, userSession, j);
    }
}
