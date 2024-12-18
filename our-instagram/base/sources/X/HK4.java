package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class HK4 extends AbstractC64412w0 {
    public final UserSession A00;
    public final InterfaceC60442pS A01;
    public final String A02;

    @Override // X.AbstractC64412w0
    public final /* bridge */ /* synthetic */ void A00(Object obj, long j, Object obj2) {
        C120985dq c120985dq = (C120985dq) obj;
        C37644Ghd c37644Ghd = (C37644Ghd) obj2;
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        C40971v4 A07 = c120985dq.A07();
        if (A07 != null) {
            String A0R = AnonymousClass001.A0R("instagram_ad_", "time_spent");
            InterfaceC60442pS interfaceC60442pS = this.A01;
            C82713mZ c82713mZ = new C82713mZ(null, interfaceC60442pS, A0R);
            c82713mZ.A0B(j);
            UserSession userSession = this.A00;
            c82713mZ.A0K(userSession, A07);
            c82713mZ.A6S = this.A02;
            c82713mZ.A5d = A07.A0f;
            if (AbstractC166997dE.A0c(C06090Tz.A06, userSession, 36329964420743771L).booleanValue()) {
                C41712Idi.A01(c120985dq, c37644Ghd, userSession, j);
            }
            C32U.A0H(userSession, c82713mZ, interfaceC60442pS);
        }
    }

    public HK4(UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str) {
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = interfaceC60442pS;
    }
}
