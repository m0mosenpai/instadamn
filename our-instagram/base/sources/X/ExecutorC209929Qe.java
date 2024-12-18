package X;

import java.util.concurrent.Executor;

/* renamed from: X.9Qe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ExecutorC209929Qe implements Executor {
    public static final ExecutorC209929Qe A00 = new ExecutorC209929Qe();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
