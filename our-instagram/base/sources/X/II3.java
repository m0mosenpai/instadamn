package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class II3 {
    public final UserSession A00;
    public final InterfaceC60442pS A01;
    public final C4E9 A02;
    public final C4E5 A03;

    public II3(UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        this.A00 = userSession;
        this.A01 = interfaceC60442pS;
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36330436867212146L);
        boolean A062 = C18U.A06(c06090Tz, userSession, 36330436867277683L);
        Integer num = null;
        C4E5 c4e5 = new C4E5(new C4E6(true), num, num, num, 492, A06, A062, false);
        this.A03 = c4e5;
        this.A02 = C4E8.A00(userSession, c4e5);
    }
}
