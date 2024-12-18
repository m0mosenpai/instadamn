package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Gfq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37534Gfq extends AbstractC64412w0 {
    public final UserSession A00;
    public final InterfaceC60442pS A01;
    public final String A02;

    @Override // X.AbstractC64412w0
    public final /* bridge */ /* synthetic */ void A00(Object obj, long j, Object obj2) {
        C120985dq c120985dq = (C120985dq) obj;
        C37644Ghd c37644Ghd = (C37644Ghd) obj2;
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        InterfaceC60442pS interfaceC60442pS = this.A01;
        C82713mZ A04 = AbstractC82703mY.A04(c120985dq, interfaceC60442pS, "time_spent");
        A04.A0B(j);
        A04.A7M = String.valueOf(j);
        UserSession userSession = this.A00;
        A04.A0K(userSession, c120985dq.A06());
        A04.A6S = this.A02;
        String str = c120985dq.A06().A0c;
        if (str != null) {
            A04.A5e = str;
        }
        if (C18U.A06(C06090Tz.A06, userSession, 36329964420743771L)) {
            C41712Idi.A01(c120985dq, c37644Ghd, userSession, j);
        }
        C32U.A0H(userSession, A04, interfaceC60442pS);
    }

    public C37534Gfq(UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str) {
        this.A02 = str;
        this.A01 = interfaceC60442pS;
        this.A00 = userSession;
    }
}
