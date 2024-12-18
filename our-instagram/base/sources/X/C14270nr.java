package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;

/* renamed from: X.0nr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14270nr {
    public static C14270nr A01;
    public final Handler A00;

    /* JADX WARN: Type inference failed for: r1v3, types: [android.os.Handler$Callback, java.lang.Object] */
    public static synchronized C14270nr A00() {
        C14270nr c14270nr;
        synchronized (C14270nr.class) {
            c14270nr = A01;
            if (c14270nr == null) {
                HandlerThread handlerThread = new HandlerThread("IgSchedulerExecutor.ScheduledTasksLooper", 9);
                AbstractC09770fa.A00(handlerThread);
                handlerThread.start();
                c14270nr = new C14270nr(new Handler(handlerThread.getLooper(), new Object()));
                A01 = c14270nr;
            }
        }
        return c14270nr;
    }

    public final void A01(AbstractRunnableC14200nk abstractRunnableC14200nk, long j) {
        Handler handler = this.A00;
        C14360o3.A0B(abstractRunnableC14200nk, 0);
        handler.postAtTime(new C18260vD(abstractRunnableC14200nk), abstractRunnableC14200nk, SystemClock.uptimeMillis() + j);
    }

    public final void A02(Runnable runnable) {
        if (runnable != null) {
            this.A00.removeCallbacksAndMessages(runnable);
            return;
        }
        throw new IllegalArgumentException("Command must not be null");
    }

    public C14270nr(Handler handler) {
        this.A00 = handler;
    }
}
