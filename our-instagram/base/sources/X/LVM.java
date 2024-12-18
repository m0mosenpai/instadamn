package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.Map;

/* loaded from: classes8.dex */
public final class LVM implements InterfaceC124965l1 {
    public final /* synthetic */ Mailbox A00;
    public final /* synthetic */ MailboxFutureImpl A01;

    public LVM(Mailbox mailbox, MailboxFutureImpl mailboxFutureImpl) {
        this.A00 = mailbox;
        this.A01 = mailboxFutureImpl;
    }

    @Override // X.InterfaceC124965l1
    public final void Dh3(Map map) {
        this.A01.setResult(null);
    }
}
