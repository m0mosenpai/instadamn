package X;

/* renamed from: X.36L, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C36L {
    public long A00 = -1;
    public final Integer A01;

    public final long A00(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr, C64092vU c64092vU) {
        C14360o3.A0B(c64092vU, 0);
        String id = ((C38321qM) c59062n7.A03).getId();
        if (id == null) {
            return 0L;
        }
        int intValue = this.A01.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue == 2) {
                    if (this.A00 < 0) {
                        return 0L;
                    }
                    return interfaceC57162jr.B0m(c59062n7) - this.A00;
                }
                throw new RuntimeException();
            }
            return c64092vU.A00(id).A01(interfaceC57162jr);
        }
        return interfaceC57162jr.B0m(c59062n7);
    }

    public final void A01(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr, C64092vU c64092vU) {
        C14360o3.A0B(c64092vU, 0);
        String id = ((C38321qM) c59062n7.A03).getId();
        if (id != null && this.A00 < 0) {
            long A01 = c64092vU.A00(id).A01(interfaceC57162jr);
            if (A01 > 0) {
                this.A00 = interfaceC57162jr.B0m(c59062n7) - A01;
            }
        }
    }

    public C36L(Integer num) {
        this.A01 = num;
    }
}
