package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.2mN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ExecutorC58642mN implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        C14360o3.A0B(runnable, 0);
        new Handler(Looper.getMainLooper()).post(runnable);
    }
}
