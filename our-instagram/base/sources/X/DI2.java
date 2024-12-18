package X;

/* loaded from: classes5.dex */
public final class DI2 extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DI2(InterfaceC74953Yl interfaceC74953Yl, String str, InterfaceC16660sJ interfaceC16660sJ, int i, int i2, boolean z) {
        super(1);
        this.A00 = i2;
        this.A01 = i;
        this.A04 = str;
        this.A05 = z;
        this.A02 = interfaceC16660sJ;
        this.A03 = interfaceC74953Yl;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        int i = this.A00;
        String A0Q = AbstractC167027dH.A0Q(obj);
        InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) this.A03;
        int length = A0Q.length();
        int i2 = this.A01;
        if (i != 0) {
            if (length > i2) {
                obj3 = new C26179Bi4(this.A04);
            } else if (AbstractC25225BEi.A1Y(A0Q) && this.A05) {
                obj3 = C29181Ctm.A00;
            } else {
                obj3 = C29183Cto.A00;
            }
            interfaceC74953Yl.Egh(obj3);
            AbstractC25225BEi.A1U(this.A02, A0Q);
            return C0eB.A00;
        }
        if (length > i2) {
            obj2 = new C26179Bi4(this.A04);
        } else if (AbstractC25225BEi.A1Y(A0Q) && this.A05) {
            obj2 = C29181Ctm.A00;
        } else {
            obj2 = C29183Cto.A00;
        }
        interfaceC74953Yl.Egh(obj2);
        AbstractC25225BEi.A1U(this.A02, A0Q);
        return C0eB.A00;
    }
}
