package X;

import java.util.concurrent.Executor;

/* renamed from: X.TUe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ExecutorC64790TUe implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AbstractC167007dF.A0J().post(runnable);
    }
}
