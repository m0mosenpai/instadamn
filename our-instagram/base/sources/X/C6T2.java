package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.6T2, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6T2 implements Executor {
    public static final Executor A01 = new C6T2();
    public final Handler A00 = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        C14360o3.A0B(runnable, 0);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.A00.post(runnable);
        }
    }
}
