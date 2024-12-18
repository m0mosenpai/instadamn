package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.YBb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73391YBb implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ int A05;
    public final /* synthetic */ int A06;
    public final /* synthetic */ long A07;
    public final /* synthetic */ C1345666g A08;
    public final /* synthetic */ MailboxFutureImpl A09;
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
    public final /* synthetic */ String A0N;
    public final /* synthetic */ boolean A0O;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AbstractC1346866s.A04("MailboxInstagramSecureMessage", AbstractC43591JPw.A00(1290), this.A01);
        MailboxFutureImpl mailboxFutureImpl = this.A09;
        Y02 y02 = new Y02();
        C73393YBd c73393YBd = new C73393YBd(this, 10);
        AbstractC1345065z abstractC1345065z = C1345666g.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, y02, 0, 1, "MCAMailboxInstagramSecureMessage", "InstagramXmaStoryMentionClientSend", c73393YBd);
    }

    public C73391YBb(C1345666g c1345666g, MailboxFutureImpl mailboxFutureImpl, Number number, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, boolean z) {
        this.A08 = c1345666g;
        this.A01 = i;
        this.A09 = mailboxFutureImpl;
        this.A06 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A00 = i5;
        this.A04 = i6;
        this.A05 = i7;
        this.A07 = j;
        this.A0N = str;
        this.A0M = str2;
        this.A0J = str3;
        this.A0A = number;
        this.A0K = str4;
        this.A0E = str5;
        this.A0D = str6;
        this.A0C = str7;
        this.A0B = str8;
        this.A0H = str9;
        this.A0I = str10;
        this.A0L = str11;
        this.A0G = str12;
        this.A0F = str13;
        this.A0O = z;
    }
}
