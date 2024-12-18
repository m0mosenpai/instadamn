package X;

import android.os.Process;

/* loaded from: classes10.dex */
public final class TY0 extends Thread {
    public final /* synthetic */ TV2 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TY0(TV2 tv2, Runnable runnable) {
        super(runnable);
        this.A00 = tv2;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(9);
        super.run();
    }
}
