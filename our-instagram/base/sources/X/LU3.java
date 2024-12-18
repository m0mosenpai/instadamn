package X;

import com.facebook.advancedcryptotransportpushnotifications.mca.MailboxAdvancedCryptoTransportPushNotificationsJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import java.util.Map;

/* loaded from: classes8.dex */
public final class LU3 implements MailboxCallback {
    public final /* synthetic */ C129575tM A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ Map A02;

    public LU3(C129575tM c129575tM, MailboxFutureImpl mailboxFutureImpl, Map map) {
        this.A00 = c129575tM;
        this.A01 = mailboxFutureImpl;
        this.A02 = map;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String A0u = AbstractC43592JPx.A0u(C129575tM.A00, 2);
        NotificationScope A00 = C43725JVk.A00(AbstractC43592JPx.A0E(accountSession), this, A0u, 0);
        this.A01.setNotification(A0u, A00);
        MailboxAdvancedCryptoTransportPushNotificationsJNI.dispatchVOOO(0, accountSession, this.A02, A00);
    }
}
