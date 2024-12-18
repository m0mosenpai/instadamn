package X;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.KbD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46113KbD extends AbstractC151006r1 {
    public final C41781wS A00 = new Object();
    public final ScheduledExecutorService A01;
    public volatile boolean A02;

    @Override // X.AbstractC151006r1
    public final InterfaceC41801wU A01(Runnable runnable, TimeUnit timeUnit, long j) {
        Future schedule;
        if (this.A02) {
            return EnumC137086Im.INSTANCE;
        }
        AbstractC42141x4.A01(runnable, "run is null");
        C41781wS c41781wS = this.A00;
        RunnableC207539Gg runnableC207539Gg = new RunnableC207539Gg(c41781wS, runnable);
        c41781wS.A7o(runnableC207539Gg);
        try {
            if (j <= 0) {
                schedule = this.A01.submit((Callable) runnableC207539Gg);
            } else {
                schedule = this.A01.schedule((Callable) runnableC207539Gg, j, timeUnit);
            }
            runnableC207539Gg.A00(schedule);
            return runnableC207539Gg;
        } catch (RejectedExecutionException e) {
            dispose();
            AbstractC142886co.A02(e);
            return EnumC137086Im.INSTANCE;
        }
    }

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        if (!this.A02) {
            this.A02 = true;
            this.A00.dispose();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.1wS] */
    public C46113KbD(ScheduledExecutorService scheduledExecutorService) {
        this.A01 = scheduledExecutorService;
    }
}
