package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.1Kx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25191Kx implements ListenableFuture {
    public static final ListenableFuture A01 = new C25191Kx(null);
    public static final C25051Kj A02 = new C25051Kj(C25191Kx.class);
    public final Object A00;

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean mayInterruptIfRunning) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable listener, Executor executor) {
        C18C.A07(listener, "Runnable was null.");
        C18C.A07(executor, "Executor was null.");
        try {
            executor.execute(listener);
        } catch (Exception e) {
            Logger A00 = A02.A00();
            Level level = Level.SEVERE;
            StringBuilder sb = new StringBuilder();
            sb.append("RuntimeException while executing runnable ");
            sb.append(listener);
            sb.append(" with executor ");
            sb.append(executor);
            A00.log(level, sb.toString(), (Throwable) e);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=SUCCESS, result=[");
        sb.append(this.A00);
        sb.append("]]");
        return sb.toString();
    }

    public C25191Kx(Object value) {
        this.A00 = value;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long timeout, TimeUnit unit) {
        unit.getClass();
        return get();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.A00;
    }
}
