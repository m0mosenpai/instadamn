package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.TUi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ExecutorC64794TUi implements Executor {
    public final Handler A00;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.A00.post(runnable);
    }

    public ExecutorC64794TUi(Looper looper) {
        this.A00 = new HandlerC1341163w(looper);
    }
}
