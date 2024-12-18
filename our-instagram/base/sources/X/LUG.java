package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: classes8.dex */
public final class LUG implements MailboxCallback {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ K3Z A03;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl = this.A02;
        JRF A00 = JRF.A00(this, 50);
        AbstractC1345065z abstractC1345065z = K3Z.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, false, 0, 1, "MCAMailboxShim", "SHIMTransportHybridMuteCallsForThreadUntil", A00);
    }

    public LUG(MailboxFutureImpl mailboxFutureImpl, K3Z k3z, long j, long j2) {
        this.A03 = k3z;
        this.A02 = mailboxFutureImpl;
        this.A00 = j;
        this.A01 = j2;
    }
}
