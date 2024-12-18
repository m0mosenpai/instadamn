package X;

/* renamed from: X.WwZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71582WwZ implements Runnable {
    public final /* synthetic */ C189448aO A00;
    public final /* synthetic */ U79 A01;
    public final /* synthetic */ C67864Uzv A02;

    public RunnableC71582WwZ(C189448aO c189448aO, U79 u79, C67864Uzv c67864Uzv) {
        this.A01 = u79;
        this.A00 = c189448aO;
        this.A02 = c67864Uzv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        U79 u79 = this.A01;
        C189478aR c189478aR = u79.A00;
        if (c189478aR == null) {
            C189478aR A00 = this.A00.A00();
            A00.A02(u79.A03, this.A02);
            u79.A00 = A00;
            return;
        }
        c189478aR.A0G(this.A02, this.A00, false, true);
    }
}
