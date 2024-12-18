package X;

import java.util.concurrent.Executor;

/* renamed from: X.B1d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ExecutorC24929B1d implements Executor {
    public static final Executor A00 = new Object();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        C14360o3.A0B(runnable, 0);
        runnable.run();
    }
}
