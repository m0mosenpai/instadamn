package X;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6r1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC151006r1 implements InterfaceC41801wU {
    public InterfaceC41801wU A00(Runnable runnable) {
        if (this instanceof C6JH) {
            C6JH c6jh = (C6JH) this;
            if (c6jh.A04) {
                return EnumC137086Im.INSTANCE;
            }
            AbstractC42141x4.A01(runnable, "run is null");
            RunnableC1345766h runnableC1345766h = new RunnableC1345766h(runnable);
            C6JI c6ji = c6jh.A01;
            c6ji.offer(runnableC1345766h);
            if (c6jh.A03.getAndIncrement() != 0) {
                return runnableC1345766h;
            }
            try {
                c6jh.A02.execute(c6jh);
                return runnableC1345766h;
            } catch (RejectedExecutionException e) {
                c6jh.A04 = true;
                c6ji.clear();
                AbstractC142886co.A02(e);
                return EnumC137086Im.INSTANCE;
            }
        }
        if (this instanceof C142976cx) {
            return A01(runnable, null, 0L);
        }
        return A01(runnable, TimeUnit.NANOSECONDS, 0L);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.YKg, X.1wU, java.util.concurrent.atomic.AtomicReference] */
    public InterfaceC41801wU A01(Runnable runnable, TimeUnit timeUnit, long j) {
        if (this instanceof C142976cx) {
            C142976cx c142976cx = (C142976cx) this;
            if (c142976cx.A01) {
                return EnumC137086Im.INSTANCE;
            }
            return c142976cx.A02(null, runnable, timeUnit, j);
        }
        C6JH c6jh = (C6JH) this;
        if (j <= 0) {
            return c6jh.A00(runnable);
        }
        if (c6jh.A04) {
            return EnumC137086Im.INSTANCE;
        }
        AtomicReference atomicReference = new AtomicReference();
        ?? atomicReference2 = new AtomicReference();
        atomicReference2.lazySet(atomicReference);
        AbstractC42141x4.A01(runnable, "run is null");
        YIT yit = new YIT(atomicReference2, c6jh, runnable);
        C41781wS c41781wS = c6jh.A00;
        RunnableC207539Gg runnableC207539Gg = new RunnableC207539Gg(c41781wS, yit);
        c41781wS.A7o(runnableC207539Gg);
        Executor executor = c6jh.A02;
        if (executor instanceof ScheduledExecutorService) {
            try {
                runnableC207539Gg.A00(((ScheduledExecutorService) executor).schedule((Callable) runnableC207539Gg, j, timeUnit));
            } catch (RejectedExecutionException e) {
                c6jh.A04 = true;
                AbstractC142886co.A02(e);
                return EnumC137086Im.INSTANCE;
            }
        } else {
            runnableC207539Gg.A00(new YJ9(C151016r2.A01.A02(runnableC207539Gg, timeUnit, j)));
        }
        C6KP.A00(runnableC207539Gg, atomicReference);
        return atomicReference2;
    }
}
