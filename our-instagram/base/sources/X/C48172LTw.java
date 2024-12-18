package X;

import com.facebook.messengerencryptedbackupsdirect.mca.MailboxMessengerEncryptedBackupsDirectJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.LTw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48172LTw implements MailboxCallback {
    public final /* synthetic */ K3Q A00;
    public final /* synthetic */ MailboxFutureImpl A01;

    public C48172LTw(K3Q k3q, MailboxFutureImpl mailboxFutureImpl) {
        this.A00 = k3q;
        this.A01 = mailboxFutureImpl;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String A0u = AbstractC43592JPx.A0u(K3Q.A00, 1);
        NotificationScope ED9 = AbstractC43592JPx.A0E(accountSession).ED9(new LVN(this, 27), A0u, 1);
        this.A01.setNotification(A0u, ED9);
        MailboxMessengerEncryptedBackupsDirectJNI.dispatchVOO(11, accountSession, ED9);
    }
}
