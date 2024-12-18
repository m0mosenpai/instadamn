package X;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3Qs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C73413Qs extends AbstractC73423Qt {
    public final ExecutorService A00;

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long timeout, TimeUnit unit) {
        return this.A00.awaitTermination(timeout, unit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        this.A00.execute(command);
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

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[");
        sb.append(this.A00);
        sb.append("]");
        return sb.toString();
    }

    public C73413Qs(ExecutorService delegate) {
        delegate.getClass();
        this.A00 = delegate;
    }
}
