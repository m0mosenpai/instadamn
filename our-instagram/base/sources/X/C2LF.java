package X;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2LF, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2LF extends C12S implements InterfaceC214312v {
    public final Executor A00;

    @Override // X.C12T
    public final void A05(Runnable runnable, C12W c12w) {
        try {
            this.A00.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            C57Z.A01(cancellationException, c12w);
            C12P.A01.A05(runnable, c12w);
        }
    }

    @Override // X.InterfaceC214312v
    public final C19D CPF(Runnable runnable, C12W c12w, long j) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.A00;
        if ((executor instanceof ScheduledExecutorService) && (scheduledExecutorService = (ScheduledExecutorService) executor) != null) {
            try {
                ScheduledFuture<?> schedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
                if (schedule != null) {
                    return new B47(schedule);
                }
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                C57Z.A01(cancellationException, c12w);
            }
        }
        return RunnableC214512x.A00.CPF(runnable, c12w, j);
    }

    @Override // X.InterfaceC214312v
    public final void EM7(InterfaceC24901Jp interfaceC24901Jp, long j) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.A00;
        if ((executor instanceof ScheduledExecutorService) && (scheduledExecutorService = (ScheduledExecutorService) executor) != null) {
            D20 d20 = new D20(interfaceC24901Jp, this);
            C12W context = interfaceC24901Jp.getContext();
            try {
                ScheduledFuture<?> schedule = scheduledExecutorService.schedule(d20, j, TimeUnit.MILLISECONDS);
                if (schedule != null) {
                    interfaceC24901Jp.CPA(new C65137TeC(schedule));
                    return;
                }
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                C57Z.A01(cancellationException, context);
            }
        }
        RunnableC214512x.A00.EM7(interfaceC24901Jp, j);
    }

    @Override // X.C12S, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ExecutorService executorService;
        Executor executor = this.A00;
        if ((executor instanceof ExecutorService) && (executorService = (ExecutorService) executor) != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C2LF) && ((C2LF) obj).A00 == this.A00) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.A00);
    }

    @Override // X.C12T
    public final String toString() {
        return this.A00.toString();
    }

    public C2LF(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        this.A00 = executor;
        try {
            if ((executor instanceof ScheduledThreadPoolExecutor) && (scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor) != null && (method = S8D.A00) != null) {
                method.invoke(scheduledThreadPoolExecutor, true);
            }
        } catch (Throwable unused) {
        }
    }
}
