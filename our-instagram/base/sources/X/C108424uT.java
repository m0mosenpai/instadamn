package X;

import android.os.Handler;
import android.os.SystemClock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4uT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108424uT extends AbstractExecutorService implements InterfaceScheduledExecutorServiceC73383Qp {
    public final Handler A00;

    @Override // X.InterfaceExecutorServiceC73393Qq
    /* renamed from: Ep5 */
    public final /* bridge */ /* synthetic */ ListenableFuture submit(Runnable runnable) {
        RunnableC44906JuK runnableC44906JuK = new RunnableC44906JuK(this.A00, null, runnable);
        execute(runnableC44906JuK);
        return runnableC44906JuK;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        Handler handler = this.A00;
        RunnableC44906JuK runnableC44906JuK = new RunnableC44906JuK(handler, null, runnable);
        handler.postAtTime(C0SX.A00(runnableC44906JuK, "HandlerListeningExecutorService", 0), runnableC44906JuK, SystemClock.uptimeMillis() + timeUnit.toMillis(j));
        return runnableC44906JuK;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* bridge */ /* synthetic */ Future submit(Runnable runnable) {
        runnable.getClass();
        RunnableC44906JuK runnableC44906JuK = new RunnableC44906JuK(this.A00, null, runnable);
        execute(runnableC44906JuK);
        return runnableC44906JuK;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if ((runnable instanceof Future) && !(runnable instanceof AbstractC45365K5y)) {
            Class<?> cls = getClass();
            C0K8.A0A(cls, "%s submitted as runnable to %s. Potential deadlocks on get().", runnable.getClass(), cls);
        }
        this.A00.postAtTime(C0SX.A00(runnable, "HandlerListeningExecutorService", 0), runnable, SystemClock.uptimeMillis());
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new RunnableC44906JuK(this.A00, callable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    public C108424uT(Handler handler) {
        this.A00 = handler;
    }

    @Override // X.InterfaceExecutorServiceC73393Qq
    /* renamed from: Ep6 */
    public final /* bridge */ /* synthetic */ ListenableFuture submit(Callable callable) {
        callable.getClass();
        RunnableC44906JuK runnableC44906JuK = new RunnableC44906JuK(this.A00, callable);
        execute(runnableC44906JuK);
        return runnableC44906JuK;
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new RunnableC44906JuK(this.A00, obj, runnable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        Handler handler = this.A00;
        RunnableC44906JuK runnableC44906JuK = new RunnableC44906JuK(handler, callable);
        handler.postAtTime(C0SX.A00(runnableC44906JuK, "HandlerListeningExecutorService", 0), runnableC44906JuK, SystemClock.uptimeMillis() + timeUnit.toMillis(j));
        return runnableC44906JuK;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* bridge */ /* synthetic */ Future submit(Runnable runnable, Object obj) {
        runnable.getClass();
        RunnableC44906JuK runnableC44906JuK = new RunnableC44906JuK(this.A00, obj, runnable);
        execute(runnableC44906JuK);
        return runnableC44906JuK;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* bridge */ /* synthetic */ Future submit(Callable callable) {
        callable.getClass();
        RunnableC44906JuK runnableC44906JuK = new RunnableC44906JuK(this.A00, callable);
        execute(runnableC44906JuK);
        return runnableC44906JuK;
    }
}
