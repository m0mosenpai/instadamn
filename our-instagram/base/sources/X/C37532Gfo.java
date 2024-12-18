package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Gfo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37532Gfo extends AbstractC64412w0 {
    public final UserSession A00;
    public final C30W A01;
    public final InterfaceC60442pS A02;
    public final String A03;

    @Override // X.AbstractC64412w0
    public final /* bridge */ /* synthetic */ void A00(Object obj, long j, Object obj2) {
        int i;
        C120985dq c120985dq = (C120985dq) obj;
        C37644Ghd c37644Ghd = (C37644Ghd) obj2;
        AbstractC167007dF.A1K(c120985dq, c37644Ghd);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            C30W c30w = this.A01;
            InterfaceC60442pS interfaceC60442pS = this.A02;
            C75113Zb c75113Zb = c37644Ghd.A0E;
            if (c75113Zb != null) {
                i = c75113Zb.getPosition();
            } else {
                i = -1;
            }
            C82713mZ A01 = c30w.A01(null, c38321qM, interfaceC60442pS, i, j);
            A01.A6S = this.A03;
            UserSession userSession = this.A00;
            if (AbstractC166997dE.A0c(C06090Tz.A06, userSession, 36329964420743771L).booleanValue()) {
                C41712Idi.A01(c120985dq, c37644Ghd, userSession, j);
            }
            C32U.A0F(userSession, A01, c38321qM, interfaceC60442pS, C05F.A00, -1, false);
        }
    }

    public C37532Gfo(UserSession userSession, C30W c30w, InterfaceC60442pS interfaceC60442pS, String str) {
        this.A03 = str;
        this.A02 = interfaceC60442pS;
        this.A01 = c30w;
        this.A00 = userSession;
    }
}
