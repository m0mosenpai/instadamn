package X;

/* renamed from: X.Ed9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32867Ed9 extends AbstractC46517KiG {
    @Override // X.AbstractC46517KiG
    public final /* bridge */ /* synthetic */ C43617JRa A00(MNN mnn, InterfaceC37093GWc interfaceC37093GWc) {
        AbstractC33547EsL c32882EdP;
        G5P g5p = (G5P) mnn;
        AbstractC167017dG.A1N(g5p, interfaceC37093GWc);
        InterfaceC132965zL interfaceC132965zL = g5p.A00;
        if (interfaceC132965zL instanceof C132955zK) {
            Object A01 = AbstractC132975zM.A01(interfaceC132965zL);
            C14360o3.A07(A01);
            c32882EdP = new C32883EdQ((E70) A01);
        } else {
            Object A00 = AbstractC132975zM.A00(interfaceC132965zL);
            C14360o3.A07(A00);
            c32882EdP = new C32882EdP((String) A00);
        }
        return new C43617JRa(new E9B(c32882EdP), C16930sl.A00);
    }

    @Override // X.AbstractC46517KiG
    public final Class A01() {
        return G5P.class;
    }
}
