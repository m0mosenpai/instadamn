package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: classes8.dex */
public final class M4M implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C48518LdG A01;

    public M4M(C48518LdG c48518LdG, long j) {
        this.A01 = c48518LdG;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C47934LFh A00 = AbstractC46904Kol.A00(this.A01.A02);
        long j = this.A00;
        MailboxFeature mailboxFeature = new MailboxFeature(JVC.A00.A00(A00.A00));
        InterfaceExecutorC135866Co A0H = AbstractC43593JPy.A0H(mailboxFeature);
        MailboxFutureImpl A0D = AbstractC43592JPx.A0D(A0H);
        AbstractC43594JPz.A1G(A0H, new LVG(j, mailboxFeature, 7, A0D), A0D);
        A0D.addResultCallback(new JVL(A00, 24));
    }
}
