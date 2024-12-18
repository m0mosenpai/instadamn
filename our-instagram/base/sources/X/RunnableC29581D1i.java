package X;

/* renamed from: X.D1i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC29581D1i implements Runnable {
    public final /* synthetic */ C27951CTn A00;
    public final /* synthetic */ C75113Zb A01;

    public RunnableC29581D1i(C27951CTn c27951CTn, C75113Zb c75113Zb) {
        this.A01 = c75113Zb;
        this.A00 = c27951CTn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C75113Zb c75113Zb = this.A01;
        C3Zk c3Zk = c75113Zb.A3R;
        if (!AbstractC166987dD.A1a(c3Zk.A00)) {
            c3Zk.A00(c75113Zb, AbstractC166997dE.A0b());
            c75113Zb.A1K = "delay";
            this.A00.A01.remove(AbstractC25228BEl.A12(c75113Zb));
        }
    }
}
