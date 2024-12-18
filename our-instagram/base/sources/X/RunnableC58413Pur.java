package X;

import android.os.Process;

/* renamed from: X.Pur, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC58413Pur implements Runnable {
    public final Runnable A00;

    public RunnableC58413Pur(Runnable runnable) {
        this.A00 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.A00.run();
    }
}
