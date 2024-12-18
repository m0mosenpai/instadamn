package X;

import android.os.SystemClock;

/* renamed from: X.TNz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64643TNz implements Runnable {
    public final Runnable A00;
    public final /* synthetic */ ExecutorC64806TUu A01;

    public RunnableC64643TNz(ExecutorC64806TUu executorC64806TUu, Runnable runnable) {
        this.A01 = executorC64806TUu;
        this.A00 = runnable;
        SystemClock.uptimeMillis();
    }

    @Override // java.lang.Runnable
    public final void run() {
        SystemClock.uptimeMillis();
        ExecutorC64806TUu executorC64806TUu = this.A01;
        SystemClock.currentThreadTimeMillis();
        this.A00.run();
        SystemClock.currentThreadTimeMillis();
        SystemClock.uptimeMillis();
        synchronized (executorC64806TUu) {
            executorC64806TUu.A00 = false;
        }
        ExecutorC64806TUu.A01(executorC64806TUu);
    }
}
