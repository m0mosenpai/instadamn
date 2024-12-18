package X;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.TZv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64920TZv extends AbstractExecutorService implements InterfaceExecutorServiceC65698TsK {
    public final Handler A00;

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
        RunnableC60556R6t runnableC60556R6t = new RunnableC60556R6t(handler, null, runnable);
        handler.postDelayed(runnableC60556R6t, timeUnit.toMillis(j));
        return runnableC60556R6t;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.A00.post(runnable);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.RunnableFuture, X.R6t] */
    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new RunnableC60556R6t(this.A00, obj, runnable);
    }

    public C64920TZv(Handler handler) {
        this.A00 = handler;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
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

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* bridge */ /* synthetic */ Future submit(Runnable runnable, Object obj) {
        runnable.getClass();
        RunnableC60556R6t runnableC60556R6t = new RunnableC60556R6t(this.A00, obj, runnable);
        execute(runnableC60556R6t);
        return runnableC60556R6t;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.RunnableFuture, X.R6t] */
    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new RunnableC60556R6t(this.A00, callable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        Handler handler = this.A00;
        RunnableC60556R6t runnableC60556R6t = new RunnableC60556R6t(handler, callable);
        handler.postDelayed(runnableC60556R6t, timeUnit.toMillis(j));
        return runnableC60556R6t;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* bridge */ /* synthetic */ Future submit(Runnable runnable) {
        runnable.getClass();
        RunnableC60556R6t runnableC60556R6t = new RunnableC60556R6t(this.A00, null, runnable);
        execute(runnableC60556R6t);
        return runnableC60556R6t;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* bridge */ /* synthetic */ Future submit(Callable callable) {
        callable.getClass();
        RunnableC60556R6t runnableC60556R6t = new RunnableC60556R6t(this.A00, callable);
        execute(runnableC60556R6t);
        return runnableC60556R6t;
    }
}
