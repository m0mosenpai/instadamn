package X;

import android.os.Process;

/* loaded from: classes10.dex */
public final class TNV implements Runnable {
    public final /* synthetic */ C1WG A00;
    public final /* synthetic */ Runnable A01;

    public TNV(C1WG c1wg, Runnable runnable) {
        this.A00 = c1wg;
        this.A01 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Process.setThreadPriority(10);
        } catch (Throwable unused) {
        }
        this.A01.run();
    }
}
