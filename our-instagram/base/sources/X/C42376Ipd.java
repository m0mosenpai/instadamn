package X;

/* renamed from: X.Ipd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42376Ipd implements InterfaceC43071ya {
    public final InterfaceC64122vX A00;
    public final C64092vU A01;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        boolean A1R = AbstractC167007dF.A1R(0, c59062n7, interfaceC57162jr);
        C64092vU c64092vU = this.A01;
        Object obj = c59062n7.A03;
        String id = ((C1NI) obj).getId();
        if (id != null) {
            C82383m1 A00 = c64092vU.A00(id);
            int A01 = AbstractC37301Gc2.A01(c59062n7, interfaceC57162jr);
            if (A01 != 0 && A01 != A1R) {
                A00.A04(interfaceC57162jr);
                c64092vU.A01(this.A00, A00, obj, c59062n7.A04);
                return;
            } else {
                A00.A03(c59062n7, interfaceC57162jr);
                return;
            }
        }
        throw AbstractC166997dE.A0g();
    }

    public C42376Ipd(InterfaceC64122vX interfaceC64122vX, C64092vU c64092vU) {
        this.A01 = c64092vU;
        this.A00 = interfaceC64122vX;
    }
}
