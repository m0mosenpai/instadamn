package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* renamed from: X.3Qt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC73423Qt extends AbstractExecutorService implements InterfaceExecutorServiceC73393Qq {
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.concurrent.RunnableFuture, java.lang.Object, X.3Qv] */
    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        ?? obj = new Object();
        obj.A00 = new C73483Qz(obj, callable);
        return obj;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: Ep5, reason: merged with bridge method [inline-methods] */
    public final ListenableFuture submit(Runnable task) {
        return (ListenableFuture) super.submit(task);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: Ep6, reason: merged with bridge method [inline-methods] */
    public final ListenableFuture submit(Callable task) {
        return (ListenableFuture) super.submit(task);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.concurrent.RunnableFuture, java.lang.Object, X.3Qv] */
    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object value) {
        boolean z = AbstractC25011Ke.A02;
        Callable callable = Executors.callable(runnable, value);
        ?? obj = new Object();
        obj.A00 = new C73483Qz(obj, callable);
        return obj;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* bridge */ /* synthetic */ Future submit(Runnable task, Object result) {
        return super.submit(task, result);
    }
}
