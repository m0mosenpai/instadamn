package X;

import java.util.concurrent.BlockingQueue;

/* renamed from: X.TJu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64557TJu implements Runnable {
    public final /* synthetic */ C64919TZu A00;

    public RunnableC64557TJu(C64919TZu c64919TZu) {
        this.A00 = c64919TZu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C64919TZu c64919TZu = this.A00;
            BlockingQueue blockingQueue = c64919TZu.A02;
            Runnable runnable = (Runnable) blockingQueue.poll();
            if (runnable != null) {
                runnable.run();
            }
            c64919TZu.A05.decrementAndGet();
            if (!blockingQueue.isEmpty()) {
                C64919TZu.A00(c64919TZu);
            }
        } catch (Throwable th) {
            C64919TZu c64919TZu2 = this.A00;
            c64919TZu2.A05.decrementAndGet();
            if (!c64919TZu2.A02.isEmpty()) {
                C64919TZu.A00(c64919TZu2);
            }
            throw th;
        }
    }
}
