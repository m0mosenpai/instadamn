package X;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6d1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C143016d1 extends AbstractC150996r0 {
    public static final RunnableC143036d3 A03;
    public static final C143026d2 A04;
    public static final ThreadFactoryC142916cr A05;
    public static final ThreadFactoryC142916cr A06;
    public final ThreadFactory A00 = A06;
    public final AtomicReference A01;
    public static final TimeUnit A07 = TimeUnit.SECONDS;
    public static final long A02 = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    /* JADX WARN: Type inference failed for: r0v5, types: [X.6d2, X.6cx] */
    static {
        ?? c142976cx = new C142976cx(new ThreadFactoryC142916cr("RxCachedThreadSchedulerShutdown", 5, false));
        c142976cx.A00 = 0L;
        A04 = c142976cx;
        c142976cx.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        ThreadFactoryC142916cr threadFactoryC142916cr = new ThreadFactoryC142916cr("RxCachedThreadScheduler", max, false);
        A06 = threadFactoryC142916cr;
        A05 = new ThreadFactoryC142916cr("RxCachedWorkerPoolEvictor", max, false);
        RunnableC143036d3 runnableC143036d3 = new RunnableC143036d3(threadFactoryC142916cr, null, 0L);
        A03 = runnableC143036d3;
        runnableC143036d3.A01.dispose();
        Future future = runnableC143036d3.A03;
        if (future != null) {
            future.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = runnableC143036d3.A04;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public C143016d1() {
        RunnableC143036d3 runnableC143036d3 = A03;
        this.A01 = new AtomicReference(runnableC143036d3);
        long j = A02;
        RunnableC143036d3 runnableC143036d32 = new RunnableC143036d3(this.A00, A07, j);
        if (!C1EM.A00(runnableC143036d3, runnableC143036d32, this.A01)) {
            runnableC143036d32.A01.dispose();
            Future future = runnableC143036d32.A03;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = runnableC143036d32.A04;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }
    }
}
