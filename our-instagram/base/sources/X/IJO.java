package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class IJO {
    public final UserSession A00;
    public final InterfaceC60442pS A01;
    public final C4E9 A02;
    public final C4E5 A03;
    public final boolean A04;

    public IJO(UserSession userSession, InterfaceC60442pS interfaceC60442pS, boolean z) {
        this.A00 = userSession;
        this.A01 = interfaceC60442pS;
        this.A04 = z;
        C06090Tz c06090Tz = C06090Tz.A05;
        C4E5 c4e5 = new C4E5(new C4E6(true), null, null, null, 236, C18U.A06(c06090Tz, userSession, 36330436867212146L), C18U.A06(c06090Tz, userSession, 36330436867277683L), C18U.A06(c06090Tz, userSession, 36327069612849432L));
        this.A03 = c4e5;
        this.A02 = C4E8.A00(userSession, c4e5);
    }
}
