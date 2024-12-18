package X;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public final class TUz implements RejectedExecutionHandler {
    public final AtomicBoolean A00 = new AtomicBoolean();

    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        try {
            threadPoolExecutor.getQueue().put(runnable);
        } catch (InterruptedException unused) {
            AbstractC58318PtA.A18();
        }
        this.A00.getAndSet(true);
    }
}
