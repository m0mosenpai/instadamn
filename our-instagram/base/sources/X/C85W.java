package X;

/* renamed from: X.85W, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C85W implements Runnable {
    public final /* synthetic */ C85V A00;
    public final /* synthetic */ C150686qP A01;
    public final /* synthetic */ InterfaceC142616cN A02;

    public C85W(C85V c85v, C150686qP c150686qP, InterfaceC142616cN interfaceC142616cN) {
        this.A01 = c150686qP;
        this.A02 = interfaceC142616cN;
        this.A00 = c85v;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C150156pL c150156pL;
        C150686qP c150686qP = this.A01;
        if (c150686qP.A0B != null) {
            c150156pL = c150686qP.A0B;
        } else {
            C150686qP.A00(c150686qP);
            c150156pL = c150686qP.A0B;
            c150156pL.getClass();
        }
        c150156pL.A04(this.A02);
        this.A00.DCz(c150686qP.A0B);
    }
}
