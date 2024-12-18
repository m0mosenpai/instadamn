package X;

/* loaded from: classes5.dex */
public final class DTW extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;
    public final boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DTW(Object obj, Object obj2, int i, int i2, boolean z, boolean z2) {
        super(2);
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = obj2;
        this.A04 = z;
        this.A05 = z2;
        this.A01 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        if (i != 0) {
            CYz.A00(A0S, (InterfaceC16660sJ) this.A02, (C5Hc) this.A03, AbstractC25225BEi.A04(this.A01), this.A04, this.A05);
        } else {
            boolean z = this.A05;
            boolean z2 = this.A04;
            AbstractC28465ChH.A05(A0S, (InterfaceC16820sZ) this.A03, (InterfaceC16620sF) this.A02, AbstractC25225BEi.A04(this.A01), z, z2);
        }
        return C0eB.A00;
    }
}
