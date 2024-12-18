package X;

/* renamed from: X.353, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass353 implements InterfaceC43071ya {
    public final InterfaceC64122vX A00;
    public final C64092vU A01;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        C14360o3.A0B(c59062n7, 0);
        C14360o3.A0B(interfaceC57162jr, 1);
        if (interfaceC57162jr.CFq(c59062n7) == C05F.A00) {
            C64092vU c64092vU = this.A01;
            String id = ((C38321qM) c59062n7.A03).getId();
            if (id != null) {
                c64092vU.A00(id);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        if (interfaceC57162jr.CFq(c59062n7) != C05F.A0C) {
            return;
        }
        C64092vU c64092vU2 = this.A01;
        Object obj = c59062n7.A03;
        String id2 = ((C38321qM) obj).getId();
        if (id2 != null) {
            C82383m1 A00 = c64092vU2.A00(id2);
            A00.A04(interfaceC57162jr);
            c64092vU2.A01(this.A00, A00, obj, c59062n7.A04);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public AnonymousClass353(InterfaceC64122vX interfaceC64122vX, C64092vU c64092vU) {
        this.A00 = interfaceC64122vX;
        this.A01 = c64092vU;
    }
}
