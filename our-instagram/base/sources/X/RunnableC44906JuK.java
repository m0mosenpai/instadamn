package X;

import android.os.Handler;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.JuK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC44906JuK extends AbstractC45365K5y implements Runnable, ListenableFuture, RunnableFuture, ScheduledFuture {
    public final MA3 A00;

    @Override // X.AbstractFutureC44236Jgg, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return super.cancel(false);
    }

    @Override // X.AbstractC451425u
    public final /* bridge */ /* synthetic */ Object A00() {
        return this.A00;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.A00.addListener(runnable, executor);
    }

    @Override // java.lang.Runnable, java.util.concurrent.RunnableFuture
    public final void run() {
        this.A00.run();
    }

    public RunnableC44906JuK(Handler handler, Callable callable) {
        super(handler);
        this.A00 = new MA3(callable);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        throw AbstractC43592JPx.A11();
    }

    public RunnableC44906JuK(Handler handler, Object obj, Runnable runnable) {
        super(handler);
        this.A00 = new MA3(runnable, obj);
    }
}
