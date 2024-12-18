package X;

/* loaded from: classes5.dex */
public final class DSX extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final String A02;
    public final boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DSX(String str, boolean z, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A02 = str;
        this.A03 = z;
        this.A01 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        switch (i) {
            case 0:
                AbstractC28439Cgn.A00(A0S, this.A02, AbstractC25225BEi.A04(this.A01), this.A03);
                break;
            case 1:
                AbstractC28439Cgn.A01(A0S, this.A02, AbstractC25225BEi.A04(this.A01), this.A03);
                break;
            case 2:
                AbstractC28394Cg0.A02(A0S, this.A02, AbstractC25225BEi.A04(this.A01), this.A03);
                break;
            case 3:
                AbstractC28509Ci3.A0E(A0S, this.A02, AbstractC25225BEi.A04(this.A01), this.A03);
                break;
            default:
                AbstractC28478ChW.A03(A0S, this.A02, AbstractC25225BEi.A04(this.A01), this.A03);
                break;
        }
        return C0eB.A00;
    }
}
