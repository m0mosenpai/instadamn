package X;

/* loaded from: classes6.dex */
public final class GOG implements Runnable {
    public final /* synthetic */ C32525EUb A00;
    public final /* synthetic */ Runnable A01;

    public GOG(C32525EUb c32525EUb, Runnable runnable) {
        this.A00 = c32525EUb;
        this.A01 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.A00.A05.A06()) {
            this.A01.run();
        }
    }
}
