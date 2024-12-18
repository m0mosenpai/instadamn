package X;

import com.facebook.advancedcryptotransport.mca.MailboxAdvancedCryptoTransportJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.8w7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C201778w7 implements MailboxCallback {
    public final /* synthetic */ C125815mW A00;
    public final /* synthetic */ MailboxFutureImpl A01;

    public C201778w7(C125815mW c125815mW, MailboxFutureImpl mailboxFutureImpl) {
        this.A00 = c125815mW;
        this.A01 = mailboxFutureImpl;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String str = (String) C125815mW.A00.A00(14);
        NotificationScope ED9 = accountSession.getSessionedNotificationCenterCallbackManager().ED9(new AYZ(this), str, 1);
        this.A01.setNotification(str, ED9);
        MailboxAdvancedCryptoTransportJNI.dispatchVOO(2, accountSession, ED9);
    }
}
