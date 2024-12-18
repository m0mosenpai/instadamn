package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: classes8.dex */
public final class K3X extends MailboxFeature {
    public static AbstractC1345065z A00 = new C45299K3c(1);

    public final void A00(MailboxCallback mailboxCallback, Number number, String str, String str2) {
        InterfaceExecutorC135866Co A0H = AbstractC43593JPy.A0H(this);
        MailboxFutureImpl A0I = AbstractC43593JPy.A0I(A0H, mailboxCallback);
        AbstractC25231BEo.A1C(A0H, new C48184LUi(this, A0I, number, str, str2, 0), A0I);
    }
}
