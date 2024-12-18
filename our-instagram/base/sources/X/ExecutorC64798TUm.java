package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.TUm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ExecutorC64798TUm implements Executor {
    public static final Handler A00 = AbstractC167007dF.A0J();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        A00.post(runnable);
    }
}
