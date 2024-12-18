package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes9.dex */
public final class MXR implements Executor {
    public final Handler A00 = AbstractC167007dF.A0J();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.A00.post(runnable);
    }
}
