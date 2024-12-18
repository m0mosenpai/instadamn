package X;

/* renamed from: X.WpB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71173WpB implements XBX {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C71173WpB(C6FG c6fg, C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, int i) {
        this.A00 = i;
        this.A03 = interfaceC103384lE;
        this.A01 = c6fg;
        this.A02 = c6fq;
    }

    @Override // X.XBX
    public final boolean Cyt() {
        InterfaceC103384lE interfaceC103384lE = (InterfaceC103384lE) this.A03;
        C6FX c6fx = new C6FX();
        c6fx.A01(this.A01);
        C131845xK.A00((C6FQ) this.A02, c6fx.A00(), interfaceC103384lE);
        return true;
    }
}
