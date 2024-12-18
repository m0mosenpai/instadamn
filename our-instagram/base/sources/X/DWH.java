package X;

/* loaded from: classes5.dex */
public final class DWH extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ EnumC53163NfI A03;
    public final /* synthetic */ C28208Cc5 A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ InterfaceC16660sJ A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DWH(EnumC53163NfI enumC53163NfI, C28208Cc5 c28208Cc5, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, int i, int i2, long j, boolean z, boolean z2) {
        super(2);
        this.A05 = str;
        this.A01 = i;
        this.A03 = enumC53163NfI;
        this.A04 = c28208Cc5;
        this.A02 = j;
        this.A09 = z;
        this.A08 = z2;
        this.A06 = interfaceC16820sZ;
        this.A07 = interfaceC16660sJ;
        this.A00 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        String str = this.A05;
        int i = this.A01;
        AbstractC28509Ci3.A07(A0S, this.A03, this.A04, str, this.A06, this.A07, i, AbstractC25225BEi.A04(this.A00), this.A02, this.A09, this.A08);
        return C0eB.A00;
    }
}
