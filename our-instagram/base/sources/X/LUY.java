package X;

import com.facebook.instagramreverb.mca.MailboxInstagramReverbJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* loaded from: classes8.dex */
public final class LUY implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ K3Y A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ Number A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        AbstractC1346866s.A04("MailboxInstagramReverb", "deleteThread", this.A00);
        String A0u = AbstractC43592JPx.A0u(K3Y.A00, 4);
        NotificationScope A00 = C43725JVk.A00(AbstractC43592JPx.A0E(accountSession), this, A0u, 35);
        this.A02.setNotification(A0u, A00);
        MailboxInstagramReverbJNI.dispatchVOOOOO(2, accountSession, this.A05, this.A03, this.A04, A00);
    }

    public LUY(K3Y k3y, MailboxFutureImpl mailboxFutureImpl, Number number, String str, String str2, int i) {
        this.A01 = k3y;
        this.A00 = i;
        this.A02 = mailboxFutureImpl;
        this.A05 = str;
        this.A03 = number;
        this.A04 = str2;
    }
}
