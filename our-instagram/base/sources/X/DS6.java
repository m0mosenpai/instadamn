package X;

/* loaded from: classes5.dex */
public final class DS6 extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final boolean A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DS6(boolean z, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A02 = z;
        this.A01 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                AbstractC28462ChE.A05(this.A02, AbstractC25226BEj.A0S(obj, obj2), AbstractC25225BEi.A04(this.A01));
                break;
            case 1:
                CHZ.A00(this.A02, AbstractC25226BEj.A0S(obj, obj2), AbstractC25225BEi.A04(this.A01));
                break;
            default:
                AbstractC28439Cgn.A04(this.A02, AbstractC25226BEj.A0S(obj, obj2), AbstractC25225BEi.A04(this.A01));
                break;
        }
        return C0eB.A00;
    }
}
