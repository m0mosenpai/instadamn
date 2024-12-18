package X;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.TZu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64919TZu extends AbstractExecutorService implements InterfaceExecutorServiceC58314Pt6 {
    public final RunnableC64557TJu A00;
    public final String A01;
    public final BlockingQueue A02;
    public final Executor A03;
    public final AtomicInteger A04;
    public final AtomicInteger A05;
    public volatile int A06;

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        if (runnable != null) {
            BlockingQueue blockingQueue = this.A02;
            if (blockingQueue.offer(runnable)) {
                int size = blockingQueue.size();
                AtomicInteger atomicInteger = this.A04;
                int i = atomicInteger.get();
                if (size > i) {
                    atomicInteger.compareAndSet(i, size);
                }
                A00(this);
            }
        } else {
            throw AbstractC166987dD.A15("runnable parameter is null");
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    public C64919TZu(Executor executor) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.A01 = "SerialExecutor";
        this.A03 = executor;
        this.A06 = 1;
        this.A02 = linkedBlockingQueue;
        this.A00 = new RunnableC64557TJu(this);
        this.A05 = MSW.A1C(0);
        this.A04 = MSW.A1C(0);
    }

    public static void A00(C64919TZu c64919TZu) {
        int i;
        AtomicInteger atomicInteger = c64919TZu.A05;
        do {
            i = atomicInteger.get();
            if (i >= c64919TZu.A06) {
                return;
            }
        } while (!atomicInteger.compareAndSet(i, i + 1));
        c64919TZu.A03.execute(c64919TZu.A00);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw AbstractC43592JPx.A11();
    }
}
