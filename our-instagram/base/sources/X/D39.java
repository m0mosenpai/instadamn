package X;

/* loaded from: classes5.dex */
public final class D39 implements InterfaceC19390xP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public D39(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj3;
        this.A01 = obj2;
        this.A03 = obj;
    }

    @Override // X.InterfaceC19390xP
    public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
        InterfaceC19390xP interfaceC19390xP;
        BTR btr;
        Object obj;
        Object obj2;
        int i;
        switch (this.A00) {
            case 0:
                interfaceC19390xP = (InterfaceC19390xP) this.A02;
                btr = new BTR(3, this.A01, this.A03, interfaceC19960yQ);
                break;
            case 1:
                interfaceC19390xP = (InterfaceC19390xP) this.A03;
                obj = this.A02;
                obj2 = this.A01;
                i = 8;
                btr = new BTR(i, obj2, interfaceC19960yQ, obj);
                break;
            default:
                interfaceC19390xP = (InterfaceC19390xP) this.A03;
                obj = this.A02;
                obj2 = this.A01;
                i = 9;
                btr = new BTR(i, obj2, interfaceC19960yQ, obj);
                break;
        }
        Object collect = interfaceC19390xP.collect(btr, interfaceC23621Ds);
        if (collect != C1JX.A02) {
            return C0eB.A00;
        }
        return collect;
    }
}
