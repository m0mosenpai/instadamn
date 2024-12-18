package X;

import com.instagram.common.session.UserSession;
import kotlin.Deprecated;

/* renamed from: X.JeV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44106JeV {
    @Deprecated(message = "Will block to wait for Mailbox. Remove with Legacy Armadillo.")
    public static final C137266Jf A00(UserSession userSession) {
        return new C137266Jf(((C131225wA) AbstractC43593JPy.A0b(userSession).A01(C131225wA.class, new C9E3(userSession, 21))).A00);
    }

    @Deprecated(message = "Use IgAccountSessionMailboxApiHandleMetaProvider to create a MailboxApiHandleMetaProvider to run sync")
    public final void A01(UserSession userSession, EnumC132075xi enumC132075xi, InterfaceC16660sJ interfaceC16660sJ) {
        if (AbstractC94034Kn.A00(userSession) && !C99Y.A00.A02(userSession, true)) {
            M8M.A00(userSession, enumC132075xi, interfaceC16660sJ);
        } else {
            interfaceC16660sJ.invoke(JVC.A00.A00(userSession));
        }
    }
}
