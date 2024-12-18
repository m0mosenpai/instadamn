package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class K60 extends AbstractC43665JSx implements ListenableFuture, ScheduledFuture {
    public final ScheduledFuture A00;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed other) {
        return this.A00.compareTo(other);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit unit) {
        return this.A00.getDelay(unit);
    }

    public K60(ListenableFuture listenableDelegate, ScheduledFuture scheduledDelegate) {
        super(listenableDelegate);
        this.A00 = scheduledDelegate;
    }

    @Override // X.AbstractFutureC44236Jgg, java.util.concurrent.Future
    public final boolean cancel(boolean mayInterruptIfRunning) {
        boolean cancel = super.cancel(mayInterruptIfRunning);
        if (cancel) {
            this.A00.cancel(mayInterruptIfRunning);
        }
        return cancel;
    }
}
