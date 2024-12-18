package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.LUu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48196LUu implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C1345666g A03;
    public final /* synthetic */ MailboxFutureImpl A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AbstractC1346866s.A04("MailboxInstagramSecureMessage", "runInstagramReactionSetOptimistic", this.A00);
        MailboxFutureImpl mailboxFutureImpl = this.A04;
        Boolean A0a = AbstractC166997dE.A0a();
        JRF A00 = JRF.A00(this, 24);
        AbstractC1345065z abstractC1345065z = C1345666g.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, A0a, 1000, 1, "MCAMailboxInstagramSecureMessage", "InstagramReactionSetOptimistic", A00);
    }

    public C48196LUu(C1345666g c1345666g, MailboxFutureImpl mailboxFutureImpl, Number number, String str, String str2, int i, int i2, long j) {
        this.A03 = c1345666g;
        this.A00 = i;
        this.A04 = mailboxFutureImpl;
        this.A01 = i2;
        this.A02 = j;
        this.A07 = str;
        this.A06 = str2;
        this.A05 = number;
    }
}
