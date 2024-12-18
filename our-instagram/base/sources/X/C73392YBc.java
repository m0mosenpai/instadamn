package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.YBc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73392YBc implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ int A05;
    public final /* synthetic */ int A06;
    public final /* synthetic */ long A07;
    public final /* synthetic */ long A08;
    public final /* synthetic */ C1345666g A09;
    public final /* synthetic */ MailboxFutureImpl A0A;
    public final /* synthetic */ Number A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ String A0G;
    public final /* synthetic */ String A0H;
    public final /* synthetic */ String A0I;
    public final /* synthetic */ String A0J;
    public final /* synthetic */ String A0L;
    public final /* synthetic */ String A0M;
    public final /* synthetic */ String A0N;
    public final /* synthetic */ String A0O;
    public final /* synthetic */ String A0K = "ig_sticker";
    public final /* synthetic */ String A0F = "";

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AbstractC1346866s.A04("MailboxInstagramSecureMessage", AbstractC43591JPw.A00(1288), this.A01);
        MailboxFutureImpl mailboxFutureImpl = this.A0A;
        Y0C y0c = new Y0C();
        C73393YBd c73393YBd = new C73393YBd(this, 14);
        AbstractC1345065z abstractC1345065z = C1345666g.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, y0c, 0, 1, "MCAMailboxInstagramSecureMessage", "InstagramXmaReplyWithStickerClientSend", c73393YBd);
    }

    public C73392YBc(C1345666g c1345666g, MailboxFutureImpl mailboxFutureImpl, Number number, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, long j2) {
        this.A09 = c1345666g;
        this.A01 = i;
        this.A0A = mailboxFutureImpl;
        this.A04 = i2;
        this.A00 = i3;
        this.A05 = i4;
        this.A06 = i5;
        this.A02 = i6;
        this.A03 = i7;
        this.A07 = j;
        this.A08 = j2;
        this.A0M = str;
        this.A0L = str2;
        this.A0B = number;
        this.A0D = str3;
        this.A0N = str4;
        this.A0O = str5;
        this.A0H = str6;
        this.A0G = str7;
        this.A0J = str8;
        this.A0I = str9;
        this.A0E = str10;
        this.A0C = str11;
    }
}
