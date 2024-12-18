package X;

/* loaded from: classes5.dex */
public final class DVP extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ InterfaceC16820sZ A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DVP(String str, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4) {
        super(2);
        this.A08 = z;
        this.A05 = z2;
        this.A06 = z3;
        this.A07 = z4;
        this.A02 = i;
        this.A03 = str;
        this.A01 = i2;
        this.A04 = interfaceC16820sZ;
        this.A00 = i3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        boolean z = this.A08;
        boolean z2 = this.A05;
        boolean z3 = this.A06;
        boolean z4 = this.A07;
        int i = this.A02;
        CXX.A01(A0S, this.A03, this.A04, i, this.A01, AbstractC25225BEi.A04(this.A00), z, z2, z3, z4);
        return C0eB.A00;
    }
}
