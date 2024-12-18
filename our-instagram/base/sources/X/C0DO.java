package X;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.0DO, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0DO implements RejectedExecutionHandler {
    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        C14360o3.A0B(runnable, 0);
        C0K8.A0C("AppInitScheduler", "Executor rejected execution; Running inline.");
        runnable.run();
    }
}
