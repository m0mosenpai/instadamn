package X;

import com.facebook.msys.mca.MailboxCallback;

/* loaded from: classes8.dex */
public final class K4R extends AbstractRunnableC94874Os {
    public final /* synthetic */ MailboxCallback A00;
    public final /* synthetic */ C137266Jf A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K4R(MailboxCallback mailboxCallback, C137266Jf c137266Jf) {
        super("MailboxProvider");
        this.A01 = c137266Jf;
        this.A00 = mailboxCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.onCompletion(this.A01.A00);
    }
}
