package X;

/* renamed from: X.2Xx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC51502Xx implements Runnable {
    public Throwable A00;

    public abstract void A00();

    public AbstractRunnableC51502Xx() {
        Throwable th;
        if (C2V3.enableThreadTracingStacktrace) {
            Thread currentThread = Thread.currentThread();
            th = new Throwable(AnonymousClass001.A0r("Runnable instantiated on thread id: ", ", name: ", currentThread.getName(), currentThread.getId()));
        } else {
            th = null;
        }
        this.A00 = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            A00();
        } catch (Throwable th) {
            Throwable th2 = this.A00;
            if (th2 != null) {
                android.util.Log.w("LithoThreadTracing", "--- start debug trace");
                android.util.Log.w("LithoThreadTracing", "Thread tracing stacktrace", th2);
                android.util.Log.w("LithoThreadTracing", "--- end debug trace");
            }
            throw th;
        }
    }
}
