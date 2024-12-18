package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

/* loaded from: classes8.dex */
public final class MA3 extends FutureTask implements ListenableFuture {
    public final C93S A00;
    public final WeakReference A01;
    public final WeakReference A02;

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.A00.A02(runnable, executor);
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        this.A00.A01();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.93S] */
    public MA3(Callable callable) {
        super(callable);
        this.A00 = new Object();
        this.A01 = AbstractC25225BEi.A16(callable);
        this.A02 = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.93S] */
    public MA3(Runnable runnable, Object obj) {
        super(runnable, obj);
        this.A00 = new Object();
        this.A01 = null;
        this.A02 = AbstractC25225BEi.A16(runnable);
    }
}
