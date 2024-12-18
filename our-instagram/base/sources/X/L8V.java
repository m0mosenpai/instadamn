package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.List;

/* loaded from: classes8.dex */
public final class L8V {
    public final K3W A00;
    public final K3T A01;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.K3W, com.facebook.msys.mca.MailboxFeature] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.K3T, com.facebook.msys.mca.MailboxFeature] */
    public L8V(Mailbox mailbox) {
        C14360o3.A0B(mailbox, 1);
        AbstractC1345065z abstractC1345065z = K3T.A00;
        ?? mailboxFeature = new MailboxFeature(new C137266Jf(mailbox));
        AbstractC1345065z abstractC1345065z2 = K3W.A00;
        ?? mailboxFeature2 = new MailboxFeature(new C137266Jf(mailbox));
        this.A01 = mailboxFeature;
        this.A00 = mailboxFeature2;
    }

    public final LK0 A00(String str) {
        LK0 A00 = LK0.A00();
        K3W k3w = this.A00;
        JRS A002 = JRS.A00(A00, 16);
        InterfaceExecutorC135866Co A0H = AbstractC43593JPy.A0H(k3w);
        MailboxFutureImpl A0I = AbstractC43593JPy.A0I(A0H, A002);
        AbstractC43594JPz.A1G(A0H, new LUF(k3w, A0I, str, 4), A0I);
        return A00;
    }

    public final LK0 A01(String str, List list) {
        LK0 A00 = LK0.A00();
        K3W k3w = this.A00;
        JRS A002 = JRS.A00(A00, 20);
        InterfaceExecutorC135866Co A0H = AbstractC43593JPy.A0H(k3w);
        MailboxFutureImpl A0I = AbstractC43593JPy.A0I(A0H, A002);
        AbstractC25231BEo.A1C(A0H, new LVH(k3w, A0I, list, str, 0), A0I);
        return A00;
    }
}
