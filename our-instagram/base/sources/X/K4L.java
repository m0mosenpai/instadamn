package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;

/* loaded from: classes8.dex */
public final class K4L extends AbstractRunnableC94874Os {
    public final /* synthetic */ C135826Ck A00;
    public final /* synthetic */ MailboxCallback A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K4L(C135826Ck c135826Ck, MailboxCallback mailboxCallback) {
        super("LazyMailbox-runWithMailbox");
        this.A00 = c135826Ck;
        this.A01 = mailboxCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Mailbox mailbox = this.A00.A02;
        if (mailbox != null) {
            this.A01.onCompletion(mailbox);
        }
    }
}
