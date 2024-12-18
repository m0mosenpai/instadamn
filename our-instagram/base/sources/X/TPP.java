package X;

/* loaded from: classes10.dex */
public final class TPP implements Runnable {
    public final /* synthetic */ C60921Rbb A00;
    public final /* synthetic */ Q0H A01;
    public final /* synthetic */ InterfaceC16660sJ A02;

    public TPP(C60921Rbb c60921Rbb, Q0H q0h, InterfaceC16660sJ interfaceC16660sJ) {
        this.A02 = interfaceC16660sJ;
        this.A01 = q0h;
        this.A00 = c60921Rbb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC16660sJ interfaceC16660sJ = this.A02;
        Q0H q0h = this.A01;
        C60921Rbb c60921Rbb = this.A00;
        interfaceC16660sJ.invoke(new C62744SOl(new Q03(AbstractC06930Yk.A0B(c60921Rbb.A02), AbstractC06930Yk.A0B(c60921Rbb.A01)), q0h));
    }
}
