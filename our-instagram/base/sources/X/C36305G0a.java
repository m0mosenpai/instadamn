package X;

/* renamed from: X.G0a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36305G0a implements InterfaceC43071ya {
    public final GZ0 A00;

    public C36305G0a(GZ0 gz0) {
        this.A00 = gz0;
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        AbstractC167017dG.A1N(c59062n7, interfaceC57162jr);
        Integer CFq = interfaceC57162jr.CFq(c59062n7);
        C14360o3.A07(CFq);
        if ((CFq == C05F.A00 || CFq == C05F.A01) && interfaceC57162jr.CGk(c59062n7) > 0.3f) {
            GZ0 gz0 = this.A00;
            Object obj = c59062n7.A03;
            C14360o3.A06(obj);
            gz0.DNR((YP3) obj);
            return;
        }
        if (CFq != C05F.A0C) {
            return;
        }
        GZ0 gz02 = this.A00;
        Object obj2 = c59062n7.A03;
        C14360o3.A06(obj2);
        gz02.DNS((YP3) obj2);
    }
}
