package X;

import com.facebook.instagrammem.mca.MailboxInstagramMemJNI;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.LUm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48188LUm implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final long A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        if (this.A00 != 0) {
            AbstractC1346866s.A04("MailboxTam", "runTamClientPollCreate", this.A01);
            MailboxFutureImpl mailboxFutureImpl = (MailboxFutureImpl) this.A04;
            LEF lef = new LEF(null, null);
            JRF A00 = JRF.A00(this, 53);
            AbstractC1345065z abstractC1345065z = K3a.A00;
            MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, lef, 0, 1, "MCAMailboxTam", "TamClientPollCreate", A00);
            return;
        }
        AccountSession accountSession = (AccountSession) obj;
        String A0u = AbstractC43592JPx.A0u(K3X.A00, 55);
        NotificationScope A002 = C43725JVk.A00(AbstractC43592JPx.A0E(accountSession), this, A0u, 27);
        AbstractC43592JPx.A1P(A002, this.A04, A0u);
        MailboxInstagramMemJNI.dispatchVIIJOOOOZ(2, this.A01, 2, this.A02, accountSession, this.A06, this.A05, A002, true);
    }

    public C48188LUm(Object obj, Object obj2, Object obj3, String str, int i, int i2, long j) {
        this.A00 = i2;
        this.A03 = obj;
        this.A04 = obj2;
        this.A01 = i;
        this.A02 = j;
        this.A06 = str;
        this.A05 = obj3;
    }
}
