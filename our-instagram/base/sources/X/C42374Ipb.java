package X;

/* renamed from: X.Ipb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42374Ipb implements InterfaceC43071ya {
    public final InterfaceC64122vX A00;
    public final C64092vU A01;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        boolean A1R = AbstractC167007dF.A1R(0, c59062n7, interfaceC57162jr);
        C64092vU c64092vU = this.A01;
        C14360o3.A0B(c64092vU, 0);
        Object obj = c59062n7.A03;
        String A0V = AbstractC37300Gc1.A0V(((C45127Jxw) obj).A00);
        if (A0V != null) {
            C82383m1 A00 = c64092vU.A00(A0V);
            int A01 = AbstractC37301Gc2.A01(c59062n7, interfaceC57162jr);
            if (A01 != 0 && A01 != A1R) {
                A00.A04(interfaceC57162jr);
                c64092vU.A01(this.A00, A00, obj, c59062n7.A04);
            } else {
                A00.A03(c59062n7, interfaceC57162jr);
            }
        }
    }

    public C42374Ipb(InterfaceC64122vX interfaceC64122vX, C64092vU c64092vU) {
        this.A01 = c64092vU;
        this.A00 = interfaceC64122vX;
    }
}
