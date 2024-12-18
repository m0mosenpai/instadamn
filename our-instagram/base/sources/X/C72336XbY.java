package X;

/* renamed from: X.XbY, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72336XbY extends C6D6 {
    public final int A00;
    public final C6D4 A01;
    public final Integer A02;

    @Override // X.AbstractC42051wv
    public final void A02(InterfaceC42071wx interfaceC42071wx) {
        InterfaceC42071wx yky;
        InterfaceC42061ww interfaceC42061ww = super.A00;
        C6D4 c6d4 = this.A01;
        if (!C6JA.A00(interfaceC42061ww, interfaceC42071wx, c6d4)) {
            Integer num = this.A02;
            if (num == C05F.A00) {
                yky = new YKX(new XML(interfaceC42071wx), c6d4, this.A00);
            } else {
                yky = new YKY(interfaceC42071wx, c6d4, this.A00, AbstractC167007dF.A1X(num, C05F.A0C));
            }
            interfaceC42061ww.EpF(yky);
        }
    }

    public C72336XbY(InterfaceC42061ww interfaceC42061ww, C6D4 c6d4, Integer num, int i) {
        super(interfaceC42061ww);
        this.A01 = c6d4;
        this.A02 = num;
        this.A00 = Math.max(8, i);
    }
}
