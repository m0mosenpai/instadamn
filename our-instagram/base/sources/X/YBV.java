package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: classes12.dex */
public final class YBV implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ long A06;
    public final /* synthetic */ C1345666g A07;
    public final /* synthetic */ MailboxFutureImpl A08;
    public final /* synthetic */ Number A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ String A0F;
    public final /* synthetic */ String A0G;
    public final /* synthetic */ String A0H;
    public final /* synthetic */ String A0I;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AbstractC1346866s.A04("MailboxInstagramSecureMessage", AbstractC43591JPw.A00(1291), this.A01);
        MailboxFutureImpl mailboxFutureImpl = this.A08;
        Y03 y03 = new Y03();
        C73393YBd c73393YBd = new C73393YBd(this, 6);
        AbstractC1345065z abstractC1345065z = C1345666g.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, y03, 0, 1, "MCAMailboxInstagramSecureMessage", "InstagramXmaStoryReplyClientSend", c73393YBd);
    }

    public YBV(C1345666g c1345666g, MailboxFutureImpl mailboxFutureImpl, Number number, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, int i2, int i3, int i4, int i5, long j, long j2) {
        this.A07 = c1345666g;
        this.A01 = i;
        this.A08 = mailboxFutureImpl;
        this.A04 = i2;
        this.A00 = i3;
        this.A02 = i4;
        this.A03 = i5;
        this.A05 = j;
        this.A06 = j2;
        this.A0I = str;
        this.A0H = str2;
        this.A0G = str3;
        this.A09 = number;
        this.A0E = str4;
        this.A0C = str5;
        this.A0D = str6;
        this.A0A = str7;
        this.A0F = str8;
        this.A0B = str9;
    }
}
