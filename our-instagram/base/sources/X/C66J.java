package X;

import com.facebook.core.mca.MailboxCoreJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.66J, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C66J implements MailboxCallback {
    public final /* synthetic */ C1344865x A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ Number A02;
    public final /* synthetic */ String A03;

    public C66J(C1344865x c1344865x, MailboxFutureImpl mailboxFutureImpl, Number number, String str) {
        this.A00 = c1344865x;
        this.A01 = mailboxFutureImpl;
        this.A02 = number;
        this.A03 = str;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String str = (String) C1344865x.A00.A00(50);
        NotificationScope ED9 = accountSession.getSessionedNotificationCenterCallbackManager().ED9(new JWR(this, str), str, 1);
        this.A01.setNotification(str, ED9);
        MailboxCoreJNI.dispatchVOOOO(29, accountSession, this.A02, this.A03, ED9);
    }
}
