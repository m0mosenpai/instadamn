package X;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* renamed from: X.6Fu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136416Fu extends AbstractC136346Fn {
    public final long A00;
    public volatile C135266Ab A01;

    public final C135266Ab A01() {
        RunnableFuture runnableFuture;
        synchronized (this) {
            runnableFuture = super.A00;
        }
        if (runnableFuture != null && !runnableFuture.isDone()) {
            return this.A01;
        }
        return (C135266Ab) A00();
    }

    public C136416Fu(C135266Ab c135266Ab, Callable callable, long j) {
        super(callable);
        this.A01 = c135266Ab;
        this.A00 = j;
    }
}
