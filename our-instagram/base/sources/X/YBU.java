package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: classes12.dex */
public final class YBU implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ C1345666g A04;
    public final /* synthetic */ MailboxFutureImpl A05;
    public final /* synthetic */ Number A06;
    public final /* synthetic */ Number A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ String A0F;
    public final /* synthetic */ String A0G;
    public final /* synthetic */ String A0H;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AbstractC1346866s.A04("MailboxInstagramSecureMessage", AbstractC43591JPw.A00(1287), this.A00);
        MailboxFutureImpl mailboxFutureImpl = this.A05;
        Y01 y01 = new Y01();
        C73393YBd c73393YBd = new C73393YBd(this, 12);
        AbstractC1345065z abstractC1345065z = C1345666g.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, y01, 0, 1, "MCAMailboxInstagramSecureMessage", "InstagramXmaProfileShareClientSend", c73393YBd);
    }

    public YBU(C1345666g c1345666g, MailboxFutureImpl mailboxFutureImpl, Number number, Number number2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, int i2, int i3, long j) {
        this.A04 = c1345666g;
        this.A00 = i;
        this.A05 = mailboxFutureImpl;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = j;
        this.A0H = str;
        this.A0G = str2;
        this.A0A = str3;
        this.A0D = str4;
        this.A0E = str5;
        this.A08 = str6;
        this.A09 = str7;
        this.A06 = number;
        this.A07 = number2;
        this.A0B = str8;
        this.A0F = str9;
        this.A0C = str10;
    }
}
