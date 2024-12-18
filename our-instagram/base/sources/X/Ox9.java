package X;

/* loaded from: classes9.dex */
public final class Ox9 implements InterfaceC43071ya {
    public boolean A00;
    public final O58 A01;
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(C57319Pcf.A00);
    public final Runnable A03 = new PLA(this);

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        AbstractC167007dF.A1K(c59062n7, interfaceC57162jr);
        int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
        if (intValue != 0) {
            if (intValue == 2) {
                MSW.A09(this.A02).postDelayed(this.A03, 1000L);
                return;
            }
            return;
        }
        MSW.A09(this.A02).removeCallbacks(this.A03);
    }

    public Ox9(O58 o58) {
        this.A01 = o58;
    }
}
