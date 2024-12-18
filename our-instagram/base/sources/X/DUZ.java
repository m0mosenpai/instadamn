package X;

/* loaded from: classes5.dex */
public final class DUZ extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ InterfaceC16660sJ A03;
    public final /* synthetic */ InterfaceC16620sF A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DUZ(String str, String str2, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF, int i, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A02 = str;
        this.A03 = interfaceC16660sJ;
        this.A05 = z;
        this.A07 = z2;
        this.A04 = interfaceC16620sF;
        this.A01 = str2;
        this.A06 = z3;
        this.A00 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        String str = this.A02;
        InterfaceC16660sJ interfaceC16660sJ = this.A03;
        boolean z = this.A05;
        boolean z2 = this.A07;
        InterfaceC16620sF interfaceC16620sF = this.A04;
        AbstractC28486Che.A02(A0S, str, this.A01, interfaceC16660sJ, interfaceC16620sF, AbstractC25225BEi.A04(this.A00), z, z2, this.A06);
        return C0eB.A00;
    }
}
