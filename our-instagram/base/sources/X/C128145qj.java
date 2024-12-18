package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.instagram.common.session.UserSession;

/* renamed from: X.5qj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C128145qj {
    public final void A00(C133255zr c133255zr, UserSession userSession, InterfaceC16660sJ interfaceC16660sJ, int i, long j) {
        C14360o3.A0B(c133255zr, 0);
        C14360o3.A0B(userSession, 3);
        if (C18U.A06(C06090Tz.A05, userSession, 36326133310043814L)) {
            if (C08730cb.A00(userSession).A00().A00() < i) {
                C25621Ms c25621Ms = new C25621Ms(userSession, -2);
                c25621Ms.A09(C05F.A01);
                c25621Ms.A0B("direct_v2/set_e2ee_eligibility/");
                c25621Ms.A0P(null, C40781ul.class, C55702hA.class, false);
                c25621Ms.A0D("e2ee_eligibility", i);
                C1ON A0N = c25621Ms.A0N();
                A0N.A00 = new C32220EDt(interfaceC16660sJ, userSession);
                C1GJ.A03(A0N);
                return;
            }
            interfaceC16660sJ.invoke(true);
            return;
        }
        AYW ayw = new AYW(interfaceC16660sJ);
        InterfaceExecutorC135866Co ASj = c133255zr.mMailboxApiHandleMetaProvider.ASj(2);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASj);
        mailboxFutureImpl.Ecq(ayw);
        if (ASj.ELJ(new LUE(c133255zr, mailboxFutureImpl, i, j))) {
            return;
        }
        mailboxFutureImpl.cancel(false);
    }
}
