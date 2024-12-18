package X;

/* renamed from: X.GLi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36835GLi implements Runnable {
    public final /* synthetic */ C32525EUb A00;

    public RunnableC36835GLi(C32525EUb c32525EUb) {
        this.A00 = c32525EUb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ELH elh = this.A00.A09;
        if (elh.A06()) {
            elh.A0G.setEnabled(false);
            elh.A0E.setEnabled(false);
        }
    }
}
