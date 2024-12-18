package X;

/* loaded from: classes9.dex */
public final class MT4 implements InterfaceC19390xP {
    public final int A00;
    public final long A01;
    public final Object A02;

    public MT4(InterfaceC19390xP interfaceC19390xP, int i, long j) {
        this.A00 = i;
        this.A02 = interfaceC19390xP;
        this.A01 = j;
    }

    @Override // X.InterfaceC19390xP
    public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
        int i;
        int i2 = this.A00;
        InterfaceC19390xP interfaceC19390xP = (InterfaceC19390xP) this.A02;
        long j = this.A01;
        if (i2 != 0) {
            i = 2;
        } else {
            i = 0;
        }
        return AbstractC167017dG.A0i(interfaceC23621Ds, interfaceC19390xP, new C43598JQe(interfaceC19960yQ, j, i));
    }
}
