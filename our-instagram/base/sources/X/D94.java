package X;

/* loaded from: classes5.dex */
public final class D94 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C5yI A00;
    public final /* synthetic */ InterfaceC132245y2 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D94(C5yI c5yI, InterfaceC132245y2 interfaceC132245y2, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, boolean z4) {
        super(0);
        this.A0A = z;
        this.A00 = c5yI;
        this.A03 = str;
        this.A07 = str2;
        this.A06 = str3;
        this.A02 = str4;
        this.A04 = str5;
        this.A08 = z2;
        this.A05 = str6;
        this.A01 = interfaceC132245y2;
        this.A09 = z3;
        this.A0B = z4;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A0A) {
            this.A00.D6A(this.A03, this.A07, null, this.A06, this.A02, this.A08, this.A04);
        } else {
            C5yI c5yI = this.A00;
            String str = this.A05;
            String str2 = this.A03;
            String str3 = this.A07;
            String str4 = this.A04;
            String str5 = this.A06;
            String str6 = this.A02;
            C6HT c6ht = (C6HT) this.A01;
            c5yI.D86(str, str2, str3, str4, null, str5, str6, c6ht.A08, this.A08, c6ht.A0A, c6ht.A0L, this.A09, this.A0B);
        }
        return C0eB.A00;
    }
}
