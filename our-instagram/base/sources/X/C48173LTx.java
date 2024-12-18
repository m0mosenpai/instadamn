package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;

/* renamed from: X.LTx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48173LTx implements MailboxCallback {
    public final /* synthetic */ MailboxCallback A00;
    public final /* synthetic */ AbstractC137276Jg A01;

    public C48173LTx(MailboxCallback mailboxCallback, AbstractC137276Jg abstractC137276Jg) {
        this.A01 = abstractC137276Jg;
        this.A00 = mailboxCallback;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        this.A00.onCompletion(((Mailbox) obj).getSlimMailbox());
    }
}
