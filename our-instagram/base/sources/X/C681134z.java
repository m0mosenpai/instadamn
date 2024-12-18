package X;

/* renamed from: X.34z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C681134z implements InterfaceC43071ya {
    public final C64092vU A00;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        C14360o3.A0B(c59062n7, 0);
        C14360o3.A0B(interfaceC57162jr, 1);
        C64092vU c64092vU = this.A00;
        String id = ((C38321qM) c59062n7.A03).getId();
        if (id != null) {
            C82383m1 A00 = c64092vU.A00(id);
            int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
            if (intValue != 0 && intValue != 1) {
                A00.A04(interfaceC57162jr);
                return;
            } else {
                A00.A03(c59062n7, interfaceC57162jr);
                return;
            }
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C681134z(C64092vU c64092vU) {
        this.A00 = c64092vU;
    }
}
