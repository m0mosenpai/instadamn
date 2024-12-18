package X;

/* loaded from: classes5.dex */
public final class BOC implements Runnable {
    public final /* synthetic */ C124515k9 A00;
    public final /* synthetic */ C75113Zb A01;

    public BOC(C124515k9 c124515k9, C75113Zb c75113Zb) {
        this.A01 = c75113Zb;
        this.A00 = c124515k9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C75113Zb c75113Zb = this.A01;
        if (!c75113Zb.A1k) {
            if (true != c75113Zb.A2A) {
                c75113Zb.A2A = true;
                C75113Zb.A00(c75113Zb, 33);
            }
            c75113Zb.A1K = "delay";
            this.A00.A00.remove(AbstractC25228BEl.A12(c75113Zb));
        }
    }
}
