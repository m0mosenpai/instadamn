package X;

/* renamed from: X.ABl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22986ABl {
    public C179297xf[] A01;
    public final A51 A03;
    public final InterfaceC174767qC A05;
    public volatile boolean A06;
    public final C23439AaC A04 = new C23439AaC(this);
    public final InterfaceC179337xj A02 = AXH.A00;
    public int A00 = -1;

    public final void A00() {
        if (!this.A06) {
            InterfaceC174767qC interfaceC174767qC = this.A05;
            C23439AaC c23439AaC = this.A04;
            interfaceC174767qC.EFz(c23439AaC);
            synchronized (c23439AaC) {
                if (c23439AaC.A00 != null) {
                    c23439AaC.A00 = null;
                    c23439AaC.A01 = false;
                }
            }
            return;
        }
        C23439AaC c23439AaC2 = this.A04;
        synchronized (c23439AaC2) {
            c23439AaC2.A01 = true;
        }
        this.A05.A9h(c23439AaC2, 1);
    }

    public C22986ABl(InterfaceC174767qC interfaceC174767qC, A51 a51) {
        this.A05 = interfaceC174767qC;
        this.A03 = a51;
    }
}
