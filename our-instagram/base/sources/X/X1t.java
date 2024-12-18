package X;

import android.os.Process;

/* loaded from: classes11.dex */
public final class X1t extends Thread {
    public final /* synthetic */ C68890Vdm A00;

    public X1t(C68890Vdm c68890Vdm) {
        this.A00 = c68890Vdm;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                ((AbstractRunnableC71645Wxs) this.A00.A00.take()).run();
            } catch (InterruptedException unused) {
            }
        }
    }
}
