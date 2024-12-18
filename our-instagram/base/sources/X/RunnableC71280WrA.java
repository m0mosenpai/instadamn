package X;

/* renamed from: X.WrA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71280WrA implements Runnable {
    public final /* synthetic */ W2Y A00;

    public RunnableC71280WrA(W2Y w2y) {
        this.A00 = w2y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            try {
                W2Y w2y = this.A00;
                C69571Vra c69571Vra = w2y.A03;
                C5J3 c5j3 = c69571Vra.A02;
                VJB vjb = c5j3.A03;
                long now = vjb.A01.now();
                c69571Vra.A00 = now;
                c5j3.A02(w2y.A01, now + vjb.A00);
            } catch (Exception e) {
                C0K8.A0K("ZeroCarrierSignalControllerBase", AbstractC111324zv.A00(680), e);
            }
        } finally {
            W2Y.A00(this.A00);
        }
    }
}
