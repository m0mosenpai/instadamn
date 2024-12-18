package X;

/* renamed from: X.MVc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50591MVc implements InterfaceC19390xP {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C50591MVc(String str, InterfaceC19390xP interfaceC19390xP, int i) {
        this.A00 = i;
        this.A01 = interfaceC19390xP;
        this.A02 = str;
    }

    @Override // X.InterfaceC19390xP
    public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
        InterfaceC19960yQ c9it;
        int i = this.A00;
        InterfaceC19390xP interfaceC19390xP = (InterfaceC19390xP) this.A01;
        String str = this.A02;
        if (i != 0) {
            c9it = new PVP(str, interfaceC19960yQ, 1);
        } else {
            c9it = new C9IT(str, interfaceC19960yQ, 0);
        }
        return AbstractC167017dG.A0i(interfaceC23621Ds, interfaceC19390xP, c9it);
    }
}
