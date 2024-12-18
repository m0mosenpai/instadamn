package X;

/* renamed from: X.WpA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71172WpA implements XBX {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C71172WpA(C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 1:
            case 2:
                this.A01 = interfaceC103384lE;
                this.A02 = c6fq;
                break;
            default:
                this.A02 = interfaceC103384lE;
                this.A01 = c6fq;
                break;
        }
    }

    @Override // X.XBX
    public final boolean Cyt() {
        if (3 - this.A00 != 0) {
            InterfaceC103384lE interfaceC103384lE = (InterfaceC103384lE) this.A01;
            C6FX c6fx = new C6FX();
            C6FQ c6fq = (C6FQ) this.A02;
            c6fx.A01(c6fq.A03);
            AbstractC25227BEk.A1M(c6fq, c6fx, interfaceC103384lE);
            return true;
        }
        InterfaceC103384lE interfaceC103384lE2 = (InterfaceC103384lE) this.A02;
        C131845xK.A00((C6FQ) this.A01, C6FW.A01, interfaceC103384lE2);
        return true;
    }
}
