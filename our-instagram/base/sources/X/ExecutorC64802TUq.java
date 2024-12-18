package X;

import java.util.concurrent.Executor;

/* renamed from: X.TUq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ExecutorC64802TUq implements Executor {
    public static final ExecutorC64802TUq A00 = new Object();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
