package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.2LB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2LB implements C2LC {
    public final C2LE A01;
    public final C12T A03;
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final Executor A02 = new Executor() { // from class: X.2LD
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable command) {
            C2LB.this.A00.post(command);
        }
    };

    @Override // X.C2LC
    public final /* synthetic */ void ATa(Runnable runnable) {
        this.A01.execute(runnable);
    }

    public C2LB(Executor backgroundExecutor) {
        C2LE c2le = new C2LE(backgroundExecutor);
        this.A01 = c2le;
        this.A03 = new C2LF(c2le);
    }
}
