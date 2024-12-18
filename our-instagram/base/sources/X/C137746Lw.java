package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6Lw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137746Lw {
    public static final C137756Lx A00(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 1);
        if (userSession.isStopped() && C18U.A06(C06090Tz.A05, userSession, 36317569145771375L)) {
            C137766Ly c137766Ly = C137766Ly.A0L;
            C14360o3.A08(c137766Ly);
            return new C137756Lx(new C42221xC(C137776Lz.A00), userSession, c137766Ly);
        }
        return (C137756Lx) AbstractC41851wZ.A00(userSession).A01(C137756Lx.class, new C207429Fv(str, userSession, 25));
    }

    public final C137756Lx A01(UserSession userSession, EnumC132075xi enumC132075xi) {
        C14360o3.A0B(userSession, 0);
        return A00(userSession, enumC132075xi.A00);
    }
}
