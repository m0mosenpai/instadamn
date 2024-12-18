package X;

import java.util.Queue;

/* renamed from: X.TKr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64580TKr implements Runnable {
    public final /* synthetic */ C64148T0z A00;

    public RunnableC64580TKr(C64148T0z c64148T0z) {
        this.A00 = c64148T0z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C64148T0z c64148T0z = this.A00;
        ExecutorC64806TUu executorC64806TUu = C64148T0z.A0E;
        c64148T0z.A09.set(false);
        while (true) {
            Queue queue = c64148T0z.A08;
            if (!queue.isEmpty()) {
                ((Runnable) queue.remove()).run();
            } else {
                return;
            }
        }
    }
}
