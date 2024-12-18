package X;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.R6t, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class RunnableC60556R6t extends AbstractC60559R6x implements Runnable, InterfaceFutureC65699TsL, ScheduledFuture {
    public final C64925Ta0 A00;

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.run();
    }

    public RunnableC60556R6t(Handler handler, Callable callable) {
        super(handler);
        this.A00 = new C64925Ta0(callable);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        throw AbstractC43592JPx.A11();
    }

    public RunnableC60556R6t(Handler handler, Object obj, Runnable runnable) {
        super(handler);
        this.A00 = new C64925Ta0(runnable, obj);
    }
}
