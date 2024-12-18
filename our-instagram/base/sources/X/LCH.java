package X;

import com.facebook.msys.mca.MailboxFeature;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public abstract class LCH {
    public static final void A01(InterfaceC16660sJ interfaceC16660sJ, UserSession userSession) {
        if (C99Y.A00.A02(userSession, true)) {
            AbstractC1345065z abstractC1345065z = K3X.A00;
            interfaceC16660sJ.invoke(new MailboxFeature((C48163LTn) userSession.A01(C48163LTn.class, new MHH(userSession, 49))));
        } else {
            AbstractC47168Kt3.A00.A01(userSession, EnumC132075xi.A0X, C50367MLu.A01(interfaceC16660sJ, 19));
        }
    }

    public static final void A00(UserSession userSession, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        if (userSession.isStopped()) {
            interfaceC16820sZ.invoke();
        } else if (!C99Y.A00.A02(userSession, true) && !C6E9.A00(userSession, AbstractC20100yh.A00(36325892793513457L), true)) {
            C131225wA.A01.A01(userSession, interfaceC16820sZ, C50367MLu.A01(interfaceC16660sJ, 20));
        } else {
            AbstractC1345065z abstractC1345065z = K3X.A00;
            interfaceC16660sJ.invoke(new MailboxFeature((C48163LTn) userSession.A01(C48163LTn.class, new MHH(userSession, 49))));
        }
    }
}
