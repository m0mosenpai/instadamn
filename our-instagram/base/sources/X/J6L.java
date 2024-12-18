package X;

/* loaded from: classes7.dex */
public final class J6L implements InterfaceC19390xP {
    public final int A00;
    public final Object A01;

    public J6L(InterfaceC19390xP interfaceC19390xP, int i) {
        this.A00 = i;
        this.A01 = interfaceC19390xP;
    }

    @Override // X.InterfaceC19390xP
    public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
        int i;
        int i2 = this.A00;
        InterfaceC19390xP interfaceC19390xP = (InterfaceC19390xP) this.A01;
        switch (i2) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 12;
                break;
            case 3:
                i = 13;
                break;
            default:
                i = 16;
                break;
        }
        Object collect = interfaceC19390xP.collect(new J6P(interfaceC19960yQ, i), interfaceC23621Ds);
        if (collect != C1JX.A02) {
            return C0eB.A00;
        }
        return collect;
    }
}
