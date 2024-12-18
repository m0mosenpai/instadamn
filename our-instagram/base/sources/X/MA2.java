package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class MA2 extends FutureTask implements ListenableFuture {
    public final C93S A00;

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable listener, Executor exec) {
        this.A00.A02(listener, exec);
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        this.A00.A01();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.93S] */
    public MA2(Callable callable) {
        super(callable);
        this.A00 = new Object();
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public final Object get(long timeout, TimeUnit unit) {
        long nanos = unit.toNanos(timeout);
        if (nanos > 2147483647999999999L) {
            timeout = Math.min(nanos, 2147483647999999999L);
            unit = TimeUnit.NANOSECONDS;
        }
        return super.get(timeout, unit);
    }
}
