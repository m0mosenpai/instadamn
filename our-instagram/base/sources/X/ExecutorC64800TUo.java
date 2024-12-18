package X;

import java.util.concurrent.Executor;

/* renamed from: X.TUo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ExecutorC64800TUo implements Executor {
    public static final ExecutorC64800TUo A00 = new ExecutorC64800TUo();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AbstractC167007dF.A0J().post(runnable);
    }
}
