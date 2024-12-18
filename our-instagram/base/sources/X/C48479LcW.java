package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.LcW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48479LcW implements InterfaceC1345866i {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ Mailbox A04;
    public final /* synthetic */ Long A05;
    public final /* synthetic */ Long A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ boolean A0F;
    public final /* synthetic */ boolean A0G;
    public final /* synthetic */ boolean A0H;
    public final /* synthetic */ boolean A0I;

    public C48479LcW(Mailbox mailbox, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, int i3, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A04 = mailbox;
        this.A08 = str;
        this.A0D = str2;
        this.A0F = z;
        this.A00 = i;
        this.A09 = str3;
        this.A01 = i2;
        this.A0E = str4;
        this.A06 = l;
        this.A0I = z2;
        this.A05 = l2;
        this.A0A = str5;
        this.A0B = str6;
        this.A0C = str7;
        this.A03 = j;
        this.A07 = str8;
        this.A02 = i3;
        this.A0G = z3;
        this.A0H = z4;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [com.facebook.msys.mca.MailboxFeature, X.K3S] */
    @Override // X.InterfaceC1345866i
    public final void EpD(C1346766r c1346766r) {
        Mailbox mailbox = this.A04;
        if (!mailbox.isValid()) {
            c1346766r.A02(EnumC46176KcE.A04);
            c1346766r.A00();
            return;
        }
        AbstractC1345065z abstractC1345065z = K3S.A00;
        ?? mailboxFeature = new MailboxFeature(new C137266Jf(mailbox));
        String str = this.A08;
        String str2 = this.A0D;
        boolean z = this.A0F;
        Integer valueOf = Integer.valueOf(this.A00);
        String str3 = this.A09;
        Integer valueOf2 = Integer.valueOf(this.A01);
        String str4 = this.A0E;
        Long l = this.A06;
        boolean z2 = this.A0I;
        Long l2 = this.A05;
        String str5 = this.A0A;
        String str6 = this.A0B;
        String str7 = this.A0C;
        Long valueOf3 = Long.valueOf(this.A03);
        String str8 = this.A07;
        Integer valueOf4 = Integer.valueOf(this.A02);
        boolean z3 = this.A0G;
        boolean z4 = this.A0H;
        JVL jvl = new JVL(c1346766r, 32);
        InterfaceExecutorC135866Co A0H = AbstractC43593JPy.A0H(mailboxFeature);
        MailboxFutureImpl A0I = AbstractC43593JPy.A0I(A0H, jvl);
        AbstractC43594JPz.A1G(A0H, new LV6(A0I, mailboxFeature, valueOf, valueOf2, l, l2, valueOf3, valueOf4, 1, str, str2, str3, str4, str5, str6, str7, str8, z, z2, z3, z4), A0I);
    }
}
