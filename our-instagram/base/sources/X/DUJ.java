package X;

/* loaded from: classes5.dex */
public final class DUJ extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;
    public final boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DUJ(Object obj, Object obj2, Object obj3, int i, int i2, boolean z, boolean z2) {
        super(2);
        this.A00 = i2;
        this.A03 = obj;
        this.A02 = obj2;
        this.A04 = obj3;
        this.A06 = z;
        this.A05 = z2;
        this.A01 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        switch (i) {
            case 0:
                AbstractC28476ChU.A05(A0S, (C6R) this.A02, (InterfaceC16820sZ) this.A03, (InterfaceC16660sJ) this.A04, AbstractC25225BEi.A04(this.A01), this.A06, this.A05);
                break;
            case 1:
                C5Hc c5Hc = (C5Hc) this.A04;
                boolean z = this.A06;
                boolean z2 = this.A05;
                AbstractC28465ChH.A04(A0S, (InterfaceC16820sZ) this.A02, (InterfaceC16660sJ) this.A03, c5Hc, AbstractC25225BEi.A04(this.A01), z, z2);
                break;
            default:
                AbstractC28508Ci2.A0E(A0S, (InterfaceC16820sZ) this.A03, (InterfaceC16820sZ) this.A02, (InterfaceC16820sZ) this.A04, AbstractC25225BEi.A04(this.A01), this.A06, this.A05);
                break;
        }
        return C0eB.A00;
    }
}
