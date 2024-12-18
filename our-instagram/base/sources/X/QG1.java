package X;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final class QG1 extends C64927Ta2 {
    public QG1(BlockingQueue blockingQueue, ThreadFactory threadFactory, TimeUnit timeUnit) {
        super(5, 128, 1L, timeUnit, blockingQueue, threadFactory);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th) {
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void beforeExecute(Thread thread, Runnable runnable) {
    }
}
