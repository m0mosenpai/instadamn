package X;

/* loaded from: classes9.dex */
public final class PVH implements InterfaceC19390xP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public PVH(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = str;
    }

    @Override // X.InterfaceC19390xP
    public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
        InterfaceC19390xP interfaceC19390xP;
        InterfaceC19960yQ c37007GRz;
        if (this.A00 != 0) {
            interfaceC19390xP = (InterfaceC19390xP) this.A01;
            c37007GRz = new MY6(39, this.A02, interfaceC19960yQ);
        } else {
            interfaceC19390xP = (InterfaceC19390xP) this.A02;
            c37007GRz = new C37007GRz(interfaceC19960yQ, this.A01, this.A03, 2);
        }
        return AbstractC167017dG.A0i(interfaceC23621Ds, interfaceC19390xP, c37007GRz);
    }
}
