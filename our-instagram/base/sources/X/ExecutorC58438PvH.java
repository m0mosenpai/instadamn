package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.PvH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ExecutorC58438PvH implements Executor {
    public final Handler A00 = new HandlerC58439PvI(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.A00.post(runnable);
    }
}
