package X;

/* loaded from: classes5.dex */
public final class D8Q extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D8Q(Object obj, String str, int i, int i2) {
        super(0);
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
        this.A03 = str;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        int i = this.A00;
        Object obj = this.A02;
        switch (i) {
            case 2:
                EIx.A04((EIx) obj, this.A03, this.A01);
                break;
            case 3:
                super/*X.1CN*/.A0m(this.A03, this.A01);
                break;
            default:
                ((InterfaceC16620sF) obj).invoke(Integer.valueOf(this.A01), this.A03);
                break;
        }
        return C0eB.A00;
    }
}
