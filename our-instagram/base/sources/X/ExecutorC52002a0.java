package X;

import java.util.concurrent.Executor;

/* renamed from: X.2a0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC52002a0 implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        new Thread(runnable).start();
    }
}
