package X;

import android.os.Process;

/* renamed from: X.TXz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64873TXz extends Thread {
    public final int A00;

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.A00);
        super.run();
    }

    public C64873TXz(Runnable runnable, String str, int i) {
        super(runnable, str);
        this.A00 = i;
    }
}
