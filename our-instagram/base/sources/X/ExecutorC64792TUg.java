package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.TUg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ExecutorC64792TUg implements Executor {
    public final Handler A00 = AbstractC167007dF.A0J();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.A00.post(runnable);
    }
}
