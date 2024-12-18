package X;

import com.facebook.instagrammem.mca.MailboxInstagramMemJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import java.util.List;

/* loaded from: classes8.dex */
public final class LUX implements MailboxCallback {
    public final /* synthetic */ long A00;
    public final /* synthetic */ K3X A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ List A05;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String A0u = AbstractC43592JPx.A0u(K3X.A00, 48);
        NotificationScope A00 = C43725JVk.A00(AbstractC43592JPx.A0E(accountSession), this, A0u, 23);
        this.A02.setNotification(A0u, A00);
        MailboxInstagramMemJNI.dispatchVJOOOOO(14, this.A00, accountSession, this.A03, this.A05, this.A04, A00);
    }

    public LUX(K3X k3x, MailboxFutureImpl mailboxFutureImpl, String str, String str2, List list, long j) {
        this.A01 = k3x;
        this.A02 = mailboxFutureImpl;
        this.A00 = j;
        this.A03 = str;
        this.A05 = list;
        this.A04 = str2;
    }
}
