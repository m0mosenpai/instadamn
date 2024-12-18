package X;

/* renamed from: X.GmL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37924GmL implements InterfaceC43071ya {
    public final InterfaceC16620sF A00;

    public C37924GmL(InterfaceC16620sF interfaceC16620sF) {
        this.A00 = interfaceC16620sF;
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        if (AbstractC37301Gc2.A01(c59062n7, interfaceC57162jr) == AbstractC167017dG.A1a(c59062n7, interfaceC57162jr) && interfaceC57162jr.B0m(c59062n7) >= 250 && interfaceC57162jr.CGk(c59062n7) >= 0.5f) {
            InterfaceC16620sF interfaceC16620sF = this.A00;
            Object obj = c59062n7.A03;
            C14360o3.A06(obj);
            interfaceC16620sF.invoke(obj, Long.valueOf(interfaceC57162jr.B0m(c59062n7)));
        }
    }
}
