package X;

import android.os.SystemClock;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class MA4 extends FutureTask implements ScheduledFuture {
    public final long A00;
    public final LSU A01;

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        C14360o3.A0B(timeUnit, 1);
        this.A01.A00();
        return super.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        C14360o3.A0B(timeUnit, 0);
        return timeUnit.convert(this.A00 - SystemClock.elapsedRealtime(), TimeUnit.MILLISECONDS);
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.A01.A00();
        return super.cancel(z);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        Delayed delayed2 = delayed;
        C14360o3.A0B(delayed2, 0);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return C14360o3.A01(getDelay(timeUnit), delayed2.getDelay(timeUnit));
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        Throwable th;
        LSU lsu = this.A01;
        synchronized (lsu) {
            if (!isCancelled() && isDone()) {
                boolean z = lsu.A01;
                try {
                    get();
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        lsu.A00 = cause;
                    } else {
                        lsu.A00 = e;
                    }
                } catch (Exception unused) {
                }
                if (!lsu.A02 && (th = lsu.A00) != null) {
                    throw new RuntimeException(th);
                }
                lsu.A01 = z;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.LSU, X.YNc, java.lang.Object] */
    public MA4(Callable callable, long j) {
        super(callable);
        ?? obj = new Object();
        obj.A02 = true;
        AbstractC72906Xqm.A00(obj, this);
        obj.A02 = true;
        this.A01 = obj;
        this.A00 = j + SystemClock.elapsedRealtime();
    }

    public final void A00() {
        super.runAndReset();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.LSU, X.YNc, java.lang.Object] */
    public MA4(Object obj, Runnable runnable, long j) {
        super(runnable, obj);
        ?? obj2 = new Object();
        obj2.A02 = true;
        AbstractC72906Xqm.A00(obj2, this);
        obj2.A02 = true;
        this.A01 = obj2;
        this.A00 = j + SystemClock.elapsedRealtime();
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public final Object get() {
        this.A01.A00();
        return super.get();
    }
}
