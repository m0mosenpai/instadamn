package X;

import com.facebook.instagrammem.mca.MailboxInstagramMemJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* loaded from: classes8.dex */
public final class LUJ implements MailboxCallback {
    public final /* synthetic */ android.net.Uri A00;
    public final /* synthetic */ android.net.Uri A01;
    public final /* synthetic */ K3X A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ String A04;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String A0u = AbstractC43592JPx.A0u(K3X.A00, 43);
        NotificationScope A01 = LVN.A01(AbstractC43592JPx.A0E(accountSession), this, A0u, 19);
        this.A03.setNotification(A0u, A01);
        MailboxInstagramMemJNI.dispatchVOOOOO(4, accountSession, this.A00, this.A01, this.A04, A01);
    }

    public LUJ(android.net.Uri uri, android.net.Uri uri2, K3X k3x, MailboxFutureImpl mailboxFutureImpl, String str) {
        this.A02 = k3x;
        this.A03 = mailboxFutureImpl;
        this.A00 = uri;
        this.A01 = uri2;
        this.A04 = str;
    }
}
