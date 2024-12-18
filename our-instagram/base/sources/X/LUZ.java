package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: classes8.dex */
public final class LUZ implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C1345666g A03;
    public final /* synthetic */ MailboxFutureImpl A04;
    public final /* synthetic */ String A05;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AbstractC1346866s.A04("MailboxInstagramSecureMessage", "runInstagramEditMessageClientSend", this.A00);
        MailboxFutureImpl mailboxFutureImpl = this.A04;
        JRF A00 = JRF.A00(this, 27);
        AbstractC1345065z abstractC1345065z = C1345666g.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, false, 0, 1, "MCAMailboxInstagramSecureMessage", "InstagramEditMessageClientSend", A00);
    }

    public LUZ(C1345666g c1345666g, MailboxFutureImpl mailboxFutureImpl, String str, int i, long j, long j2) {
        this.A03 = c1345666g;
        this.A00 = i;
        this.A04 = mailboxFutureImpl;
        this.A02 = j;
        this.A01 = j2;
        this.A05 = str;
    }
}
