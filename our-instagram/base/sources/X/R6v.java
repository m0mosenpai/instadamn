package X;

import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public class R6v extends AbstractC60559R6x implements Runnable, InterfaceFutureC65699TsL, ScheduledFuture {
    public final C64925Ta0 A00;
    public final /* synthetic */ ExecutorServiceC64921TZw A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R6v(ExecutorServiceC64921TZw executorServiceC64921TZw, Callable callable) {
        super(executorServiceC64921TZw.A00);
        this.A01 = executorServiceC64921TZw;
        String str = ExecutorServiceC64921TZw.A0A;
        this.A00 = new C64925Ta0(callable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.run();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        throw AbstractC43592JPx.A11();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R6v(ExecutorServiceC64921TZw executorServiceC64921TZw, Object obj, Runnable runnable) {
        super(executorServiceC64921TZw.A00);
        this.A01 = executorServiceC64921TZw;
        String str = ExecutorServiceC64921TZw.A0A;
        this.A00 = new C64925Ta0(runnable, obj);
    }
}
