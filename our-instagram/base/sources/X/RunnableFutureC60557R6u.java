package X;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* renamed from: X.R6u, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableFutureC60557R6u extends R6v implements RunnableFuture {
    public final /* synthetic */ ExecutorServiceC64921TZw A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RunnableFutureC60557R6u(ExecutorServiceC64921TZw executorServiceC64921TZw, Callable callable) {
        super(executorServiceC64921TZw, callable);
        this.A00 = executorServiceC64921TZw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RunnableFutureC60557R6u(ExecutorServiceC64921TZw executorServiceC64921TZw, Object obj, Runnable runnable) {
        super(executorServiceC64921TZw, obj, runnable);
        this.A00 = executorServiceC64921TZw;
    }
}
