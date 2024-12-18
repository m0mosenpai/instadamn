package X;

/* renamed from: X.D1j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC29582D1j implements Runnable {
    public final /* synthetic */ C123625ib A00;
    public final /* synthetic */ C75113Zb A01;

    public RunnableC29582D1j(C123625ib c123625ib, C75113Zb c75113Zb) {
        this.A01 = c75113Zb;
        this.A00 = c123625ib;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C75113Zb c75113Zb = this.A01;
        if (!c75113Zb.A1i) {
            c75113Zb.A1i = true;
            C75113Zb.A00(c75113Zb, 76);
            this.A00.A00.remove(AbstractC25228BEl.A12(c75113Zb));
        }
    }
}
