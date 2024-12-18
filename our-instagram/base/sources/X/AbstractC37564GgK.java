package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GgK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37564GgK {
    public static final C37789Gk4 A00(UserSession userSession, InterfaceC43589JPu interfaceC43589JPu, String str) {
        int A06 = AbstractC167007dF.A06(1, str, interfaceC43589JPu);
        C1M6 A01 = AbstractC25451Lz.A01(userSession, interfaceC43589JPu);
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A062 = C18U.A06(c06090Tz, userSession, 36318114606684066L);
        boolean A063 = C18U.A06(c06090Tz, userSession, 36318114607208360L);
        boolean A064 = C18U.A06(c06090Tz, userSession, 2342161123821688755L);
        return new C37789Gk4(A01, new C61412r4(userSession, C25361Lq.A00(userSession)), str, new C50253MHi(A01, userSession, str, 26), new C50253MHi(A01, userSession, str, 27), new D8L(5, A01, userSession), new C50253MHi(A01, userSession, str, 28), new C50253MHi(A01, userSession, str, 29), new C50253MHi(A01, userSession, str, 30), new C50253MHi(A01, userSession, str, 31), new C50253MHi(A01, userSession, str, 32), new C50253MHi(A01, userSession, str, 33), new C50253MHi(A01, userSession, str, 22), new C50253MHi(A01, userSession, str, 23), new D8O(A06, A01, userSession, A063), new C50253MHi(A01, userSession, str, 24), new C50253MHi(A01, userSession, str, 25), A062, A063, A064, C18U.A06(c06090Tz, userSession, 36318114606618529L));
    }

    public static final String A02(C120985dq c120985dq) {
        String id;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM == null || (id = c38321qM.getId()) == null) {
            return "n/a";
        }
        return id;
    }

    public static final C64272vm A01(UserSession userSession, EnumC64262vl enumC64262vl, C1M1 c1m1, String str) {
        AbstractC167027dH.A12(userSession, c1m1, str);
        return new C64272vm(userSession, new C64252vk(userSession, new C37565GgL(userSession, c1m1, str), new C64232vi(), EnumC64222vh.A03), enumC64262vl);
    }
}
