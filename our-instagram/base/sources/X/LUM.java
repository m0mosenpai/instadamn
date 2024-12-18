package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: classes8.dex */
public final class LUM implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C1345666g A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ boolean A04;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AbstractC1346866s.A04("MailboxInstagramSecureMessage", "runInstagramSecureParticipantsUpdateRestrictStatus", this.A00);
        MailboxFutureImpl mailboxFutureImpl = this.A03;
        JRF A00 = JRF.A00(this, 30);
        AbstractC1345065z abstractC1345065z = C1345666g.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, false, 0, 1, "MCAMailboxInstagramSecureMessage", "InstagramSecureParticipantsUpdateRestrictStatus", A00);
    }

    public LUM(C1345666g c1345666g, MailboxFutureImpl mailboxFutureImpl, int i, long j, boolean z) {
        this.A02 = c1345666g;
        this.A00 = i;
        this.A03 = mailboxFutureImpl;
        this.A01 = j;
        this.A04 = z;
    }
}
