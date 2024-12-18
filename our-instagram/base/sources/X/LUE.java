package X;

import com.facebook.instagramuser.mca.MailboxInstagramUserJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* loaded from: classes8.dex */
public final class LUE implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C133255zr A02;
    public final /* synthetic */ MailboxFutureImpl A03;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String A0u = AbstractC43592JPx.A0u(C133255zr.A00, 1);
        NotificationScope ED9 = AbstractC43592JPx.A0E(accountSession).ED9(new LVL(this, A0u), A0u, 1);
        this.A03.setNotification(A0u, ED9);
        MailboxInstagramUserJNI.dispatchVIJOO(1, this.A00, this.A01, accountSession, ED9);
    }

    public LUE(C133255zr c133255zr, MailboxFutureImpl mailboxFutureImpl, int i, long j) {
        this.A02 = c133255zr;
        this.A03 = mailboxFutureImpl;
        this.A00 = i;
        this.A01 = j;
    }
}
