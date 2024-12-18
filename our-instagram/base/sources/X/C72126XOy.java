package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.XOy, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72126XOy implements ListenableFuture {
    public final C56J A00 = new C72125XOx(this);
    public final WeakReference A01;

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.A00.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C72123XOu c72123XOu = (C72123XOu) this.A01.get();
        boolean cancel = this.A00.cancel(z);
        if (cancel && c72123XOu != null) {
            c72123XOu.A02 = null;
            c72123XOu.A00 = null;
            c72123XOu.A01.A06(null);
        }
        return cancel;
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

    public final String toString() {
        return this.A00.toString();
    }

    public C72126XOy(C72123XOu c72123XOu) {
        this.A01 = AbstractC25225BEi.A16(c72123XOu);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.A00.get();
    }
}
