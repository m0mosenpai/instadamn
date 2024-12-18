package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: classes12.dex */
public final class YBY implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ C1345666g A06;
    public final /* synthetic */ MailboxFutureImpl A07;
    public final /* synthetic */ Number A08;
    public final /* synthetic */ Number A09;
    public final /* synthetic */ Number A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ String A0F;
    public final /* synthetic */ String A0G;
    public final /* synthetic */ String A0H;
    public final /* synthetic */ String A0I;
    public final /* synthetic */ String A0J;
    public final /* synthetic */ String A0K;
    public final /* synthetic */ String A0L;
    public final /* synthetic */ String A0M;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AbstractC1346866s.A04("MailboxInstagramSecureMessage", AbstractC43591JPw.A00(1292), this.A01);
        MailboxFutureImpl mailboxFutureImpl = this.A07;
        Y04 y04 = new Y04();
        C73393YBd c73393YBd = new C73393YBd(this, 9);
        AbstractC1345065z abstractC1345065z = C1345666g.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, y04, 0, 1, "MCAMailboxInstagramSecureMessage", "InstagramXmaStoryShareClientSend", c73393YBd);
    }

    public YBY(C1345666g c1345666g, MailboxFutureImpl mailboxFutureImpl, Number number, Number number2, Number number3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, int i2, int i3, int i4, int i5, long j) {
        this.A06 = c1345666g;
        this.A01 = i;
        this.A07 = mailboxFutureImpl;
        this.A04 = i2;
        this.A00 = i3;
        this.A02 = i4;
        this.A03 = i5;
        this.A05 = j;
        this.A0M = str;
        this.A0L = str2;
        this.A0K = str3;
        this.A0A = number;
        this.A0I = str4;
        this.A0D = str5;
        this.A0G = str6;
        this.A0H = str7;
        this.A0B = str8;
        this.A0C = str9;
        this.A08 = number2;
        this.A09 = number3;
        this.A0E = str10;
        this.A0J = str11;
        this.A0F = str12;
    }
}
