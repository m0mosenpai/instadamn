package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.LUa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48176LUa implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ C1345666g A04;
    public final /* synthetic */ MailboxFutureImpl A05;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AbstractC1346866s.A04("MailboxInstagramSecureMessage", "runInstagramSecureParticipantUpdateAdminStatus", this.A01);
        MailboxFutureImpl mailboxFutureImpl = this.A05;
        JRF A00 = JRF.A00(this, 29);
        AbstractC1345065z abstractC1345065z = C1345666g.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, false, 0, 1, "MCAMailboxInstagramSecureMessage", "InstagramSecureParticipantUpdateAdminStatus", A00);
    }

    public C48176LUa(C1345666g c1345666g, MailboxFutureImpl mailboxFutureImpl, int i, int i2, long j, long j2) {
        this.A04 = c1345666g;
        this.A01 = i;
        this.A05 = mailboxFutureImpl;
        this.A00 = i2;
        this.A03 = j;
        this.A02 = j2;
    }
}
