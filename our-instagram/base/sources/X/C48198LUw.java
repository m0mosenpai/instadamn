package X;

import com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.LUw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48198LUw implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C1345666g A03;
    public final /* synthetic */ MailboxFutureImpl A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        AbstractC1346866s.A04("MailboxInstagramSecureMessage", "forward", this.A00);
        String A0u = AbstractC43592JPx.A0u(C1345666g.A00, 9);
        NotificationScope A01 = LVN.A01(AbstractC43592JPx.A0E(accountSession), this, A0u, 23);
        this.A04.setNotification(A0u, A01);
        MailboxInstagramSecureMessageJNI.dispatchVJJOOOOOO(7, this.A02, this.A01, accountSession, this.A05, this.A06, this.A07, null, A01);
    }

    public C48198LUw(C1345666g c1345666g, MailboxFutureImpl mailboxFutureImpl, String str, String str2, String str3, int i, long j, long j2) {
        this.A03 = c1345666g;
        this.A00 = i;
        this.A04 = mailboxFutureImpl;
        this.A02 = j;
        this.A01 = j2;
        this.A05 = str;
        this.A06 = str2;
        this.A07 = str3;
    }
}
