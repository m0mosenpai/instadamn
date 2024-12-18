package X;

import com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.LUv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48197LUv implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ C1345666g A06;
    public final /* synthetic */ MailboxFutureImpl A07;

    public C48197LUv(C1345666g c1345666g, MailboxFutureImpl mailboxFutureImpl, int i, int i2, int i3, long j, long j2, long j3) {
        this.A06 = c1345666g;
        this.A00 = i;
        this.A07 = mailboxFutureImpl;
        this.A02 = i2;
        this.A01 = i3;
        this.A05 = j;
        this.A04 = j2;
        this.A03 = j3;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        AbstractC1346866s.A04("MailboxInstagramSecureMessage", "loadThreadViewDataWithOptions", this.A00);
        String A0u = AbstractC43592JPx.A0u(C1345666g.A00, 7);
        NotificationScope A00 = C43725JVk.A00(AbstractC43592JPx.A0E(accountSession), this, A0u, 41);
        this.A07.setNotification(A0u, A00);
        MailboxInstagramSecureMessageJNI.dispatchVIIJJJOOZZZZZZ(0, this.A02, this.A01, this.A05, this.A04, this.A03, accountSession, A00, true, false, false, true, true, false);
    }
}
