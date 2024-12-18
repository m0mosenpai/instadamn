package X;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6cx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C142976cx extends AbstractC151006r1 implements InterfaceC41801wU {
    public final ScheduledExecutorService A00;
    public volatile boolean A01;

    public final RunnableC207539Gg A02(InterfaceC41821wW interfaceC41821wW, Runnable runnable, TimeUnit timeUnit, long j) {
        Future schedule;
        AbstractC42141x4.A01(runnable, "run is null");
        RunnableC207539Gg runnableC207539Gg = new RunnableC207539Gg(interfaceC41821wW, runnable);
        if (interfaceC41821wW != null && !interfaceC41821wW.A7o(runnableC207539Gg)) {
            return runnableC207539Gg;
        }
        try {
            if (j <= 0) {
                schedule = this.A00.submit((Callable) runnableC207539Gg);
            } else {
                schedule = this.A00.schedule((Callable) runnableC207539Gg, j, timeUnit);
            }
            runnableC207539Gg.A00(schedule);
            return runnableC207539Gg;
        } catch (RejectedExecutionException e) {
            if (interfaceC41821wW != null) {
                interfaceC41821wW.EEm(runnableC207539Gg);
            }
            AbstractC142886co.A02(e);
            return runnableC207539Gg;
        }
    }

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        if (!this.A01) {
            this.A01 = true;
            this.A00.shutdownNow();
        }
    }

    public C142976cx(ThreadFactory threadFactory) {
        boolean z = AbstractC142926cs.A02;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, threadFactory);
        if (z) {
            scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
        }
        this.A00 = scheduledThreadPoolExecutor;
    }
}
