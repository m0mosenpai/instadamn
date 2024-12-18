package X;

import java.lang.Thread;

/* loaded from: classes10.dex */
public final class TRq implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ C63335Shm A00;

    public TRq(C63335Shm c63335Shm) {
        this.A00 = c63335Shm;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        C60687RMf c60687RMf = this.A00.A0C;
        if (c60687RMf != null) {
            c60687RMf.A0G("Job execution failed", th);
        }
    }
}
