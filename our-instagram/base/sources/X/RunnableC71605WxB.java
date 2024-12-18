package X;

/* renamed from: X.WxB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71605WxB implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ InterfaceC59242nQ A01;
    public final /* synthetic */ C2nP A02;
    public final /* synthetic */ C70426WVe A03;
    public final /* synthetic */ Object A04;

    public RunnableC71605WxB(InterfaceC59242nQ interfaceC59242nQ, C2nP c2nP, C70426WVe c70426WVe, Object obj, long j) {
        this.A00 = j;
        this.A01 = interfaceC59242nQ;
        this.A03 = c70426WVe;
        this.A02 = c2nP;
        this.A04 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = this.A00;
        InterfaceC59242nQ interfaceC59242nQ = this.A01;
        UN4 un4 = (UN4) interfaceC59242nQ;
        if (j == un4.BGi()) {
            C70426WVe c70426WVe = this.A03;
            C1W1 A01 = c70426WVe.A00.A01(this.A02, this.A04);
            synchronized (un4) {
                if (j == un4.BGi()) {
                    C1W1 c1w1 = un4.A03;
                    if (c1w1 != null && c1w1 != A01) {
                        c1w1.A04();
                    }
                    un4.A03 = A01;
                }
            }
            A01.A06((InterfaceC58722mV) interfaceC59242nQ, c70426WVe.A02);
        }
    }
}
