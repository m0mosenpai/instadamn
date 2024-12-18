package X;

import android.os.Process;

/* renamed from: X.TOz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64668TOz implements Runnable {
    public final int A00;
    public final Runnable A01;

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10 - this.A00);
        this.A01.run();
    }

    public RunnableC64668TOz(int i, Runnable runnable) {
        this.A01 = runnable;
        this.A00 = i;
    }
}
