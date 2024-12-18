package X;

import com.facebook.advancedcryptotransport.mca.MailboxAdvancedCryptoTransportJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.LTv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48171LTv implements MailboxCallback {
    public final /* synthetic */ C125815mW A00;
    public final /* synthetic */ MailboxFutureImpl A01;

    public C48171LTv(C125815mW c125815mW, MailboxFutureImpl mailboxFutureImpl) {
        this.A00 = c125815mW;
        this.A01 = mailboxFutureImpl;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String A0u = AbstractC43592JPx.A0u(C125815mW.A00, 12);
        NotificationScope ED9 = AbstractC43592JPx.A0E(accountSession).ED9(new LVN(this, 0), A0u, 1);
        this.A01.setNotification(A0u, ED9);
        MailboxAdvancedCryptoTransportJNI.dispatchVOO(1, accountSession, ED9);
    }
}
