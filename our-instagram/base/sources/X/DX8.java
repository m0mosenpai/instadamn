package X;

/* loaded from: classes5.dex */
public final class DX8 extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C5XO A03;
    public final /* synthetic */ InterfaceC30801Dgc A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ InterfaceC16820sZ A08;
    public final /* synthetic */ InterfaceC16620sF A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DX8(C5XO c5xo, InterfaceC30801Dgc interfaceC30801Dgc, Integer num, Integer num2, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16620sF interfaceC16620sF, int i, int i2, int i3, boolean z, boolean z2) {
        super(2);
        this.A0A = z;
        this.A07 = str;
        this.A04 = interfaceC30801Dgc;
        this.A03 = c5xo;
        this.A0B = z2;
        this.A02 = i;
        this.A06 = num;
        this.A09 = interfaceC16620sF;
        this.A05 = num2;
        this.A08 = interfaceC16820sZ;
        this.A00 = i2;
        this.A01 = i3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        boolean z = this.A0A;
        String str = this.A07;
        InterfaceC30801Dgc interfaceC30801Dgc = this.A04;
        C5XO c5xo = this.A03;
        boolean z2 = this.A0B;
        int i = this.A02;
        AbstractC28505Chy.A03(c5xo, A0S, interfaceC30801Dgc, this.A06, this.A05, str, this.A08, this.A09, i, AbstractC25225BEi.A04(this.A00), this.A01, z, z2);
        return C0eB.A00;
    }
}
