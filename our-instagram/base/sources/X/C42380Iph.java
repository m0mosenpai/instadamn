package X;

/* renamed from: X.Iph, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42380Iph implements InterfaceC43071ya {
    public final InterfaceC16620sF A00;
    public final InterfaceC16620sF A01;
    public final InterfaceC16620sF A02;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        InterfaceC16620sF interfaceC16620sF;
        boolean A1R = AbstractC167007dF.A1R(0, c59062n7, interfaceC57162jr);
        int A01 = AbstractC37301Gc2.A01(c59062n7, interfaceC57162jr);
        if (A01 != A1R) {
            if (A01 != 0) {
                if (A01 == 2) {
                    interfaceC16620sF = this.A01;
                } else {
                    throw B4Z.A00();
                }
            } else {
                interfaceC16620sF = this.A00;
            }
        } else {
            interfaceC16620sF = this.A02;
        }
        interfaceC16620sF.invoke(c59062n7, interfaceC57162jr);
    }

    public C42380Iph(InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, InterfaceC16620sF interfaceC16620sF3) {
        this.A02 = interfaceC16620sF;
        this.A00 = interfaceC16620sF2;
        this.A01 = interfaceC16620sF3;
    }
}
