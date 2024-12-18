package X;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6cq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C142906cq extends AbstractC150996r0 {
    public static final ThreadFactoryC142916cr A02;
    public static final ScheduledExecutorService A03;
    public final ThreadFactory A00;
    public final AtomicReference A01;

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        A03 = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
        A02 = new ThreadFactoryC142916cr("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public C142906cq() {
        ThreadFactoryC142916cr threadFactoryC142916cr = A02;
        AtomicReference atomicReference = new AtomicReference();
        this.A01 = atomicReference;
        this.A00 = threadFactoryC142916cr;
        boolean z = AbstractC142926cs.A02;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, threadFactoryC142916cr);
        if (z) {
            scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
        }
        atomicReference.lazySet(scheduledThreadPoolExecutor);
    }
}
