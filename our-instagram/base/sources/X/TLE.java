package X;

/* loaded from: classes10.dex */
public final class TLE implements Runnable {
    public final Runnable A00;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.A00.run();
        } catch (Exception e) {
            android.util.Log.e(AnonymousClass001.A0R("TransportRuntime.", "Executor"), "Background execution failure.", e);
        }
    }

    public TLE(Runnable runnable) {
        this.A00 = runnable;
    }
}
