package X;

import android.os.Process;

/* renamed from: X.TXv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64870TXv extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        super.run();
    }
}
