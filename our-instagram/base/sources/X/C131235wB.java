package X;

import com.facebook.msys.mca.Mailbox;
import com.instagram.common.session.UserSession;
import java.util.function.Consumer;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.5wB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131235wB {
    public static final void A00(InterfaceC41521w1 interfaceC41521w1, UserSession userSession) {
        C131225wA c131225wA;
        if (interfaceC41521w1 != null && !userSession.isStopped()) {
            C41871wb A01 = AbstractC41851wZ.A01(userSession);
            if (A01.A05(C131225wA.class) && (c131225wA = (C131225wA) A01.A00(C131225wA.class)) != null) {
                c131225wA.A00.mStoredProcedureChangedListeners.remove(interfaceC41521w1);
            }
        }
    }

    @Deprecated(message = "Use runAsync with errorCallback instead", replaceWith = @ReplaceWith(expression = "runAsync(userSession, callback, errorCallback)", imports = {}))
    public final void A02(InterfaceC16660sJ interfaceC16660sJ, UserSession userSession) {
        A01(userSession, C131245wC.A00, interfaceC16660sJ);
    }

    public final void A01(UserSession userSession, InterfaceC16820sZ interfaceC16820sZ, final InterfaceC16660sJ interfaceC16660sJ) {
        if (userSession.isStopped()) {
            C0K8.A0C("IgMailbox", "UserSession is stopped, cannot run async callback");
            interfaceC16820sZ.invoke();
            return;
        }
        final C41871wb A00 = AbstractC41851wZ.A00(userSession);
        if (A00.A05(C131225wA.class)) {
            interfaceC16660sJ.invoke(((C131225wA) AbstractC41851wZ.A00(userSession).A01(C131225wA.class, new C9E3(userSession, 21))).A00);
        } else {
            C1334460n.A01(userSession, "IgMailbox.getAsync").A03(new Consumer() { // from class: X.5wD
                @Override // java.util.function.Consumer
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    Mailbox mailbox = (Mailbox) obj;
                    C14360o3.A0A(mailbox);
                    A04(C131225wA.class, new C131225wA(mailbox));
                    interfaceC16660sJ.invoke(mailbox);
                }
            });
        }
    }
}
