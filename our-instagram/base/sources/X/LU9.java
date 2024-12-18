package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.StandaloneDatabaseHandle;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import com.facebook.standalonedatabase.mca.MailboxStandaloneDatabaseJNI;

/* loaded from: classes8.dex */
public final class LU9 implements MailboxCallback {
    public final /* synthetic */ MailboxFutureImpl A00;
    public final /* synthetic */ StandaloneDatabaseHandle A01;
    public final /* synthetic */ C135646Bq A02;

    public LU9(MailboxFutureImpl mailboxFutureImpl, StandaloneDatabaseHandle standaloneDatabaseHandle, C135646Bq c135646Bq) {
        this.A02 = c135646Bq;
        this.A00 = mailboxFutureImpl;
        this.A01 = standaloneDatabaseHandle;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String A0u = AbstractC43592JPx.A0u(C135646Bq.A00, 0);
        NotificationScope ED9 = AbstractC43592JPx.A0E(accountSession).ED9(new LVN(this, 39), A0u, 1);
        this.A00.setNotification(A0u, ED9);
        MailboxStandaloneDatabaseJNI.dispatchVOOO(1, accountSession, this.A01, ED9);
    }
}
