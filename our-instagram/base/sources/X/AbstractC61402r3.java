package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.2r3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC61402r3 {
    public static final C61422r5 A00(UserSession userSession, InterfaceC60442pS interfaceC60442pS, C1M1 c1m1) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c1m1, 2);
        C1M6 A01 = AbstractC25451Lz.A01(userSession, c1m1);
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36318114606684066L);
        boolean A062 = C18U.A06(c06090Tz, userSession, 36318114607208360L);
        boolean A063 = C18U.A06(c06090Tz, userSession, 2342161123821623218L);
        return new C61422r5(interfaceC60442pS, A01, new C61412r4(userSession, C25361Lq.A00(userSession)), new C9FM(29, interfaceC60442pS, userSession, A01), new C9FM(30, interfaceC60442pS, userSession, A01), new C9FM(31, interfaceC60442pS, userSession, A01), new C9FM(32, interfaceC60442pS, userSession, A01), new C9F9(16, A01, userSession), new C9FM(33, interfaceC60442pS, userSession, A01), new C9FM(34, interfaceC60442pS, userSession, A01), new C9FM(35, interfaceC60442pS, userSession, A01), new C9FM(36, interfaceC60442pS, userSession, A01), new C9FM(24, interfaceC60442pS, userSession, A01), new C9FM(25, interfaceC60442pS, userSession, A01), new C9F9(15, interfaceC60442pS, userSession), new C9FM(26, interfaceC60442pS, userSession, A01), new C9FM(27, interfaceC60442pS, userSession, A01), new C9FM(28, interfaceC60442pS, userSession, A01), new C9FH(7, userSession, A01, A062), A06, A062, A063, C18U.A06(c06090Tz, userSession, 36316727331525243L), C18U.A06(c06090Tz, userSession, 36318114605963159L));
    }

    public static final String A01(UserSession userSession, C38321qM c38321qM) {
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36318114606356381L);
        User A2E = c38321qM.A2E(userSession);
        if (A06) {
            if (A2E == null) {
                throw new IllegalStateException("Required value was null.");
            }
        } else if (A2E == null) {
            C18950wb.A01.AEp(AnonymousClass001.A0R("Fail to extract author id from media for signal data, media id: ", c38321qM.getId()), 817894654).report();
            return "";
        }
        return A2E.getId();
    }
}
