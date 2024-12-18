package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import com.facebook.standalonedatabase.mca.MailboxStandaloneDatabase$SchemaDeployerCallback;
import com.facebook.standalonedatabase.mca.MailboxStandaloneDatabaseJNI;

/* renamed from: X.6Bv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C135686Bv implements MailboxCallback {
    public final /* synthetic */ MailboxFutureImpl A00;
    public final /* synthetic */ MailboxStandaloneDatabase$SchemaDeployerCallback A01;
    public final /* synthetic */ C135646Bq A02;
    public final /* synthetic */ String A03;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String str = (String) C135646Bq.A00.A00(1);
        NotificationScope ED9 = accountSession.getSessionedNotificationCenterCallbackManager().ED9(new C43656JSo(this), str, 1);
        this.A00.setNotification(str, ED9);
        MailboxStandaloneDatabaseJNI.dispatchVOOOOO(0, accountSession, "IGDWellbeingDatabase", this.A03, this.A01, ED9);
    }

    public C135686Bv(MailboxFutureImpl mailboxFutureImpl, MailboxStandaloneDatabase$SchemaDeployerCallback mailboxStandaloneDatabase$SchemaDeployerCallback, C135646Bq c135646Bq, String str) {
        this.A02 = c135646Bq;
        this.A00 = mailboxFutureImpl;
        this.A03 = str;
        this.A01 = mailboxStandaloneDatabase$SchemaDeployerCallback;
    }
}
