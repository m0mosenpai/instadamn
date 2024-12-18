package X;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final class RT1 extends AbstractExecutorServiceC64808TUw implements ScheduledExecutorService {
    public final ScheduledExecutorService A00;
    public final /* synthetic */ InterfaceC216113n A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RT1(InterfaceC216113n delegate, final ScheduledExecutorService val$nameSupplier) {
        super(val$nameSupplier);
        this.A01 = delegate;
        this.A00 = val$nameSupplier;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable command, long delay, TimeUnit unit) {
        return this.A00.schedule(A02(command), delay, unit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit) {
        return this.A00.scheduleAtFixedRate(A02(command), initialDelay, period, unit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit) {
        return this.A00.scheduleWithFixedDelay(A02(command), initialDelay, delay, unit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable task, long delay, TimeUnit unit) {
        return this.A00.schedule(A01(task), delay, unit);
    }
}
