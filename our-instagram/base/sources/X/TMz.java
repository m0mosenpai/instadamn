package X;

import android.os.Process;

/* loaded from: classes10.dex */
public final class TMz implements Runnable {
    public final /* synthetic */ TV6 A00;
    public final /* synthetic */ Runnable A01;

    public TMz(TV6 tv6, Runnable runnable) {
        this.A00 = tv6;
        this.A01 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        this.A01.run();
    }
}
