package X;

import android.os.Process;

/* loaded from: classes4.dex */
public final class B0C implements Runnable {
    public static final B0C A00 = new B0C();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(-10);
    }
}
