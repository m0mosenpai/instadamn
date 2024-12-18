package X;

import android.os.Process;

/* loaded from: classes10.dex */
public final class TY4 extends Thread {
    public final int A00;

    public TY4(Runnable runnable, String str) {
        super(runnable, str);
        this.A00 = 9;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.A00);
        super.run();
    }
}
