package X;

/* renamed from: X.3QH, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3QH implements Runnable {
    public final /* synthetic */ C1W1 A00;
    public final /* synthetic */ InterfaceC58722mV A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public C3QH(C1W1 c1w1, InterfaceC58722mV interfaceC58722mV, boolean z, boolean z2) {
        this.A00 = c1w1;
        this.A03 = z;
        this.A01 = interfaceC58722mV;
        this.A02 = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.A03) {
            this.A01.DFy(this.A00);
            return;
        }
        boolean z = this.A02;
        InterfaceC58722mV interfaceC58722mV = this.A01;
        C1W1 c1w1 = this.A00;
        if (z) {
            return;
        }
        interfaceC58722mV.DVf(c1w1);
    }
}
