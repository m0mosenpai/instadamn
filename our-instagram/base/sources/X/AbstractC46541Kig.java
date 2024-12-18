package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.Kig, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46541Kig {
    /* JADX WARN: Type inference failed for: r4v0, types: [X.K3W, com.facebook.msys.mca.MailboxFeature] */
    public static final void A00(C135656Br c135656Br, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(c135656Br, 0);
        ?? mailboxFeature = new MailboxFeature(c135656Br);
        JRS A00 = JRS.A00(interfaceC16660sJ, 0);
        InterfaceExecutorC135866Co A0H = AbstractC43593JPy.A0H(mailboxFeature);
        MailboxFutureImpl A0I = AbstractC43593JPy.A0I(A0H, A00);
        AbstractC25231BEo.A1C(A0H, new C44176Jff((K3W) mailboxFeature, A0I, 15), A0I);
    }
}
