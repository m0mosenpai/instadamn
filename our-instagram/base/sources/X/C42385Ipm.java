package X;

/* renamed from: X.Ipm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42385Ipm implements InterfaceC43071ya {
    public final C38321qM A00;
    public final C3Y7 A01;
    public final C75113Zb A02;
    public final C33P A03;

    public C42385Ipm(C38321qM c38321qM, C3Y7 c3y7, C75113Zb c75113Zb, C33P c33p) {
        this.A03 = c33p;
        this.A00 = c38321qM;
        this.A02 = c75113Zb;
        this.A01 = c3y7;
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        int A01 = AbstractC37301Gc2.A01(c59062n7, interfaceC57162jr);
        if (A01 != 0) {
            if (A01 == 2) {
                this.A03.A0C("scroll");
            }
        } else {
            this.A03.A09(this.A00, this.A01, this.A02, new C4QP(), false);
        }
    }
}
