package X;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Ta3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64928Ta3 extends ThreadPoolExecutor {
    public final /* synthetic */ SX6 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    public C64928Ta3(SX6 sx6) {
        super(1, 1, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue());
        this.A00 = sx6;
        setThreadFactory(new Object());
        allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new C64924TZz(this, obj, runnable);
    }
}
