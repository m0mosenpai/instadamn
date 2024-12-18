package X;

import com.facebook.core.mca.MailboxCoreJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* loaded from: classes8.dex */
public final class LUC implements MailboxCallback {
    public final /* synthetic */ C1344865x A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public LUC(C1344865x c1344865x, MailboxFutureImpl mailboxFutureImpl, String str, boolean z) {
        this.A00 = c1344865x;
        this.A01 = mailboxFutureImpl;
        this.A02 = str;
        this.A03 = z;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String A0u = AbstractC43592JPx.A0u(C1344865x.A00, 7);
        NotificationScope A00 = C43725JVk.A00(AbstractC43592JPx.A0E(accountSession), this, A0u, 1);
        this.A01.setNotification(A0u, A00);
        MailboxCoreJNI.dispatchVOOOZ(52, accountSession, this.A02, A00, this.A03);
    }
}
