package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;

/* renamed from: X.K3d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45300K3d extends AbstractC137276Jg {
    public final /* synthetic */ Mailbox A00;

    public C45300K3d(Mailbox mailbox) {
        this.A00 = mailbox;
    }

    @Override // X.AbstractC135836Cl
    public final boolean A03(MailboxCallback mailboxCallback) {
        mailboxCallback.onCompletion(this.A00);
        return true;
    }

    @Override // X.AbstractC135836Cl
    public final boolean A04(MailboxCallback mailboxCallback) {
        mailboxCallback.onCompletion(this.A00);
        return true;
    }
}
