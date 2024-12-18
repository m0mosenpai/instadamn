package X;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6d3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC143036d3 implements Runnable {
    public final long A00;
    public final C41781wS A01;
    public final ConcurrentLinkedQueue A02;
    public final Future A03;
    public final ScheduledExecutorService A04;
    public final ThreadFactory A05;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.1wS] */
    public RunnableC143036d3(ThreadFactory threadFactory, TimeUnit timeUnit, long j) {
        long j2;
        ScheduledFuture<?> scheduledFuture;
        if (timeUnit != null) {
            j2 = timeUnit.toNanos(j);
        } else {
            j2 = 0;
        }
        this.A00 = j2;
        this.A02 = new ConcurrentLinkedQueue();
        this.A01 = new Object();
        this.A05 = threadFactory;
        ScheduledExecutorService scheduledExecutorService = null;
        if (timeUnit != null) {
            scheduledExecutorService = Executors.newScheduledThreadPool(1, C143016d1.A05);
            scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, j2, j2, TimeUnit.NANOSECONDS);
        } else {
            scheduledFuture = null;
        }
        this.A04 = scheduledExecutorService;
        this.A03 = scheduledFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.A02;
        if (!concurrentLinkedQueue.isEmpty()) {
            long nanoTime = System.nanoTime();
            Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                C143026d2 c143026d2 = (C143026d2) it.next();
                if (c143026d2.A00 <= nanoTime) {
                    if (concurrentLinkedQueue.remove(c143026d2)) {
                        this.A01.EEm(c143026d2);
                    }
                } else {
                    return;
                }
            }
        }
    }
}
