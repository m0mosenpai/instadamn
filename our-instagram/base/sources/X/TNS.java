package X;

import android.os.Process;

/* loaded from: classes10.dex */
public final class TNS implements Runnable {
    public final /* synthetic */ TVD A00;
    public final /* synthetic */ Runnable A01;

    public TNS(TVD tvd, Runnable runnable) {
        this.A00 = tvd;
        this.A01 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.A00.A00);
        this.A01.run();
    }
}
