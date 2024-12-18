package X;

/* loaded from: classes5.dex */
public final class DTE extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ InterfaceC16660sJ A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DTE(InterfaceC16660sJ interfaceC16660sJ, int i, int i2, int i3, boolean z, boolean z2) {
        super(2);
        this.A05 = z;
        this.A02 = i;
        this.A04 = z2;
        this.A03 = interfaceC16660sJ;
        this.A00 = i2;
        this.A01 = i3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        boolean z = this.A05;
        AbstractC28438Cgm.A04(A0S, this.A03, this.A02, AbstractC25225BEi.A04(this.A00), this.A01, z, this.A04);
        return C0eB.A00;
    }
}
