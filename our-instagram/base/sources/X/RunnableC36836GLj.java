package X;

/* renamed from: X.GLj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36836GLj implements Runnable {
    public final /* synthetic */ C32525EUb A00;

    public RunnableC36836GLj(C32525EUb c32525EUb) {
        this.A00 = c32525EUb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ELH elh = this.A00.A09;
        if (elh.A06()) {
            elh.A0G.setEnabled(true);
            elh.A0E.setEnabled(true);
            elh.A0L = false;
        }
    }
}
