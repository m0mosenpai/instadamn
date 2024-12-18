package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final class T8O implements ListenableFuture {
    public final C49182Nr A00;
    public final AnonymousClass195 A01;

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.A00.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.A00.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.A00.get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.A00.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.A00.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.A00.isDone();
    }

    public T8O(C49182Nr c49182Nr, AnonymousClass195 anonymousClass195) {
        this.A01 = anonymousClass195;
        this.A00 = c49182Nr;
        anonymousClass195.CPD(new C57560PgY(this, 14));
    }
}
