package X;

/* loaded from: classes10.dex */
public final class TRW implements Runnable {
    public final /* synthetic */ Runnable A00;

    public TRW(Runnable runnable) {
        this.A00 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.run();
    }

    public final String toString() {
        return this.A00.toString();
    }
}
