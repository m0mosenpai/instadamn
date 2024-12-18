package X;

/* loaded from: classes5.dex */
public final class DVO extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ InterfaceC16620sF A02;
    public final /* synthetic */ InterfaceC16620sF A03;
    public final /* synthetic */ C5Hc A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DVO(String str, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, C5Hc c5Hc, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        super(2);
        this.A04 = c5Hc;
        this.A02 = interfaceC16620sF;
        this.A05 = z;
        this.A06 = z2;
        this.A07 = z3;
        this.A08 = z4;
        this.A03 = interfaceC16620sF2;
        this.A01 = str;
        this.A00 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        C5Hc c5Hc = this.A04;
        InterfaceC16620sF interfaceC16620sF = this.A02;
        boolean z = this.A05;
        boolean z2 = this.A06;
        boolean z3 = this.A07;
        boolean z4 = this.A08;
        AbstractC28486Che.A03(A0S, this.A01, interfaceC16620sF, this.A03, c5Hc, AbstractC25225BEi.A04(this.A00), z, z2, z3, z4);
        return C0eB.A00;
    }
}
