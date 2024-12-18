package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;

/* loaded from: classes12.dex */
public final class YBP implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ C1345666g A05;
    public final /* synthetic */ MailboxFutureImpl A06;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AbstractC1346866s.A04("MailboxInstagramSecureMessage", AbstractC111324zv.A00(2675), this.A01);
        MailboxFutureImpl mailboxFutureImpl = this.A06;
        MailboxNullable A0J = AbstractC43593JPy.A0J();
        C73393YBd c73393YBd = new C73393YBd(this, 3);
        AbstractC1345065z abstractC1345065z = C1345666g.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, A0J, 0, 0, "MCAMailboxInstagramSecureMessage", "InstagramSecureMessageAttachmentList", c73393YBd);
    }

    public YBP(C1345666g c1345666g, MailboxFutureImpl mailboxFutureImpl, int i, int i2, int i3, long j, long j2) {
        this.A05 = c1345666g;
        this.A01 = i;
        this.A06 = mailboxFutureImpl;
        this.A02 = i2;
        this.A00 = i3;
        this.A04 = j;
        this.A03 = j2;
    }
}
