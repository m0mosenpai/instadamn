package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: classes12.dex */
public final class YBS implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C1345666g A02;
    public final /* synthetic */ MS1 A03;
    public final /* synthetic */ MailboxFutureImpl A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ Number A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AbstractC1346866s.A04("MailboxInstagramSecureMessage", AbstractC43591JPw.A00(1289), this.A00);
        MailboxFutureImpl mailboxFutureImpl = this.A04;
        C73302Xzt c73302Xzt = new C73302Xzt();
        C73393YBd c73393YBd = new C73393YBd(this, 13);
        AbstractC1345065z abstractC1345065z = C1345666g.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, c73302Xzt, 0, 1, "MCAMailboxInstagramSecureMessage", "InstagramXmaSendStandaloneV2", c73393YBd);
    }

    public YBS(C1345666g c1345666g, MS1 ms1, MailboxFutureImpl mailboxFutureImpl, Number number, Number number2, String str, String str2, String str3, String str4, int i, long j) {
        this.A02 = c1345666g;
        this.A00 = i;
        this.A04 = mailboxFutureImpl;
        this.A01 = j;
        this.A0A = str;
        this.A03 = ms1;
        this.A07 = str2;
        this.A08 = str3;
        this.A05 = number;
        this.A06 = number2;
        this.A09 = str4;
    }
}
