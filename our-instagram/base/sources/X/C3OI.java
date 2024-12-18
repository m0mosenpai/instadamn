package X;

/* renamed from: X.3OI, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3OI extends C3O7 {
    public int A05 = 0;
    public int A02 = 0;
    public int A04 = 0;
    public int A03 = 0;
    public int A06 = 0;
    public int A07 = 0;
    public boolean A0A = false;
    public int A01 = 0;
    public int A00 = 0;
    public C56132i1 A08 = new Object();
    public InterfaceC56272iG A09 = null;

    public final void A0d(C56082hw c56082hw, Integer num, Integer num2, int i, int i2) {
        InterfaceC56272iG interfaceC56272iG;
        C56082hw c56082hw2;
        while (true) {
            interfaceC56272iG = this.A09;
            if (interfaceC56272iG != null || (c56082hw2 = this.A0h) == null) {
                break;
            } else {
                this.A09 = ((C56062hu) c56082hw2).A08;
            }
        }
        C56132i1 c56132i1 = this.A08;
        c56132i1.A06 = num;
        c56132i1.A07 = num2;
        c56132i1.A00 = i;
        c56132i1.A05 = i2;
        interfaceC56272iG.Cp9(c56082hw, c56132i1);
        c56082hw.A0I(c56132i1.A04);
        c56082hw.A0H(c56132i1.A03);
        c56082hw.A0q = c56132i1.A08;
        c56082hw.A0G(c56132i1.A02);
    }
}
