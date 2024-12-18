package X;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Jgg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractFutureC44236Jgg extends AbstractC451425u implements Future {
    public final Future A01() {
        if (this instanceof AbstractC43665JSx) {
            return ((AbstractC43665JSx) this).A00;
        }
        return ((RunnableC44906JuK) this).A00;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean mayInterruptIfRunning) {
        return A01().cancel(mayInterruptIfRunning);
    }

    @Override // java.util.concurrent.Future
    public Object get(long timeout, TimeUnit unit) {
        return A01().get(timeout, unit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return A01().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return A01().isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return A01().get();
    }
}
