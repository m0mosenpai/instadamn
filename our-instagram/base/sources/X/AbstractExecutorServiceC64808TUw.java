package X;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: X.TUw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractExecutorServiceC64808TUw implements ExecutorService {
    public final ExecutorService A00;

    public final CallableC64789TUd A01(Callable callable) {
        InterfaceC216113n interfaceC216113n;
        if (this instanceof RT1) {
            interfaceC216113n = ((RT1) this).A01;
        } else {
            interfaceC216113n = ((RT0) this).A00;
        }
        callable.getClass();
        return new CallableC64789TUd(2, interfaceC216113n, callable);
    }

    public final RunnableC64654TOl A02(Runnable command) {
        InterfaceC216113n interfaceC216113n;
        if (this instanceof RT1) {
            interfaceC216113n = ((RT1) this).A01;
        } else {
            interfaceC216113n = ((RT0) this).A00;
        }
        command.getClass();
        return new RunnableC64654TOl(interfaceC216113n, command);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long timeout, TimeUnit unit) {
        return this.A00.awaitTermination(timeout, unit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        this.A00.execute(A02(command));
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection tasks) {
        return this.A00.invokeAll(A00(tasks));
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection tasks) {
        return this.A00.invokeAny(A00(tasks));
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.A00.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.A00.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.A00.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.A00.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable task, Object result) {
        return this.A00.submit(A02(task), result);
    }

    public AbstractExecutorServiceC64808TUw(ExecutorService delegate) {
        this.A00 = delegate;
    }

    private ImmutableList A00(Collection tasks) {
        ImmutableList.Builder builder = ImmutableList.builder();
        Iterator it = tasks.iterator();
        while (it.hasNext()) {
            builder.add((Object) A01((Callable) it.next()));
        }
        return builder.build();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection tasks, long timeout, TimeUnit unit) {
        return this.A00.invokeAll(A00(tasks), timeout, unit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection tasks, long timeout, TimeUnit unit) {
        return this.A00.invokeAny(A00(tasks), timeout, unit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable task) {
        ExecutorService executorService = this.A00;
        task.getClass();
        return executorService.submit(A01(task));
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable task) {
        return this.A00.submit(A02(task));
    }
}
