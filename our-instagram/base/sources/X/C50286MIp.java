package X;

import com.facebook.msys.mca.Mailbox;

/* renamed from: X.MIp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50286MIp extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ Long A04;
    public final /* synthetic */ Long A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ boolean A0E;
    public final /* synthetic */ boolean A0F;
    public final /* synthetic */ boolean A0G;
    public final /* synthetic */ boolean A0H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50286MIp(Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, int i3, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        super(1);
        this.A07 = str;
        this.A0C = str2;
        this.A0E = z;
        this.A00 = i;
        this.A08 = str3;
        this.A01 = i2;
        this.A0D = str4;
        this.A05 = l;
        this.A0H = z2;
        this.A04 = l2;
        this.A09 = str5;
        this.A0A = str6;
        this.A0B = str7;
        this.A03 = j;
        this.A06 = str8;
        this.A02 = i3;
        this.A0F = z3;
        this.A0G = z4;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        C14360o3.A0B(mailbox, 0);
        C5Fn A00 = AbstractC137146It.A00("insert sync path notification");
        String str = this.A07;
        String str2 = this.A0C;
        boolean z = this.A0E;
        int i = this.A00;
        String str3 = this.A08;
        int i2 = this.A01;
        String str4 = this.A0D;
        Long l = this.A05;
        boolean z2 = this.A0H;
        return C42221xC.A07(new C48479LcW(mailbox, l, this.A04, str, str2, str3, str4, this.A09, this.A0A, this.A0B, this.A06, i, i2, this.A02, this.A03, z, z2, this.A0F, this.A0G), A00);
    }
}
