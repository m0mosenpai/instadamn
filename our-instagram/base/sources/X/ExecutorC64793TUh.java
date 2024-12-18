package X;

import java.util.concurrent.Executor;

/* renamed from: X.TUh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ExecutorC64793TUh implements Executor {
    public final Executor A00;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.A00.execute(new TLE(runnable));
    }

    public ExecutorC64793TUh(Executor executor) {
        this.A00 = executor;
    }
}
