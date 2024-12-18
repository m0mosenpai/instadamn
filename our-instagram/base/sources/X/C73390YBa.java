package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.YBa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73390YBa implements MailboxCallback {
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
    public final /* synthetic */ String A0A;
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
    public final /* synthetic */ String A0N;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AbstractC1346866s.A04("MailboxInstagramSecureMessage", AbstractC43591JPw.A00(1286), this.A01);
        MailboxFutureImpl mailboxFutureImpl = this.A07;
        Y00 y00 = new Y00();
        C73393YBd c73393YBd = new C73393YBd(this, 11);
        AbstractC1345065z abstractC1345065z = C1345666g.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, y00, 0, 1, "MCAMailboxInstagramSecureMessage", "InstagramXmaPostShareClientSend", c73393YBd);
    }

    public C73390YBa(C1345666g c1345666g, MailboxFutureImpl mailboxFutureImpl, Number number, Number number2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i, int i2, int i3, int i4, int i5, long j) {
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
        this.A0J = str3;
        this.A0K = str4;
        this.A0E = str5;
        this.A0A = str6;
        this.A0D = str7;
        this.A0N = str8;
        this.A0G = str9;
        this.A0H = str10;
        this.A0B = str11;
        this.A0C = str12;
        this.A08 = number;
        this.A09 = number2;
        this.A0I = str13;
        this.A0F = str14;
    }
}
