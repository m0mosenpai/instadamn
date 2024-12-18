package X;

import java.util.concurrent.Executor;

/* renamed from: X.TUp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ExecutorC64801TUp implements Executor {
    public static final ExecutorC64801TUp A00 = new ExecutorC64801TUp();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        C14360o3.A0B(runnable, 0);
        runnable.run();
    }
}
