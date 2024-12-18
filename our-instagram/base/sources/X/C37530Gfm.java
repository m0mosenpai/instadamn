package X;

/* renamed from: X.Gfm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37530Gfm implements InterfaceC43071ya {
    public final InterfaceC64122vX A00;
    public final C64092vU A01;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        C14360o3.A0B(c59062n7, 0);
        C14360o3.A0B(interfaceC57162jr, 1);
        C120985dq c120985dq = (C120985dq) c59062n7.A03;
        Object obj = c120985dq.A02;
        C75113Zb c75113Zb = ((C37644Ghd) c59062n7.A04).A0E;
        if (obj != null && c75113Zb != null) {
            C64092vU c64092vU = this.A01;
            C82383m1 A00 = c64092vU.A00(c120985dq.getId());
            A00.A06 = c120985dq.A06;
            int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
            if (intValue != 0 && intValue != 1) {
                A00.A04(interfaceC57162jr);
                if (c120985dq.CdW()) {
                    obj = c120985dq.A06();
                }
                c64092vU.A01(this.A00, A00, obj, c75113Zb);
                return;
            }
            A00.A03(c59062n7, interfaceC57162jr);
        }
    }

    public C37530Gfm(InterfaceC64122vX interfaceC64122vX, C64092vU c64092vU) {
        this.A01 = c64092vU;
        this.A00 = interfaceC64122vX;
    }
}
