package X;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3Qr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73403Qr extends C73413Qs implements InterfaceScheduledExecutorServiceC73383Qp {
    public final ScheduledExecutorService A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, java.lang.Runnable, X.3Qv] */
    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable command, long delay, TimeUnit unit) {
        boolean z = AbstractC25011Ke.A02;
        Callable callable = Executors.callable(command, null);
        ?? obj = new Object();
        obj.A00 = new C73483Qz(obj, callable);
        return new K60(obj, this.A00.schedule((Runnable) obj, delay, unit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit) {
        RunnableC45363K5w runnableC45363K5w = new RunnableC45363K5w(command);
        return new K60(runnableC45363K5w, this.A00.scheduleAtFixedRate(runnableC45363K5w, initialDelay, period, unit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit) {
        RunnableC45363K5w runnableC45363K5w = new RunnableC45363K5w(command);
        return new K60(runnableC45363K5w, this.A00.scheduleWithFixedDelay(runnableC45363K5w, initialDelay, delay, unit));
    }

    public C73403Qr(ScheduledExecutorService delegate) {
        super(delegate);
        delegate.getClass();
        this.A00 = delegate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, java.lang.Runnable, X.3Qv] */
    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long delay, TimeUnit unit) {
        ?? obj = new Object();
        obj.A00 = new C73483Qz(obj, callable);
        return new K60(obj, this.A00.schedule((Runnable) obj, delay, unit));
    }
}
