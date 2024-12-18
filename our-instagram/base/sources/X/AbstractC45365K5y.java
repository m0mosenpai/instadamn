package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* renamed from: X.K5y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC45365K5y extends AbstractFutureC44236Jgg {
    public final Handler A00;

    public AbstractC45365K5y(Handler handler) {
        this.A00 = handler;
    }

    @Override // X.AbstractFutureC44236Jgg, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        if (Looper.myLooper() == this.A00.getLooper() && !isDone()) {
            throw AbstractC166987dD.A14("Must not call get() function from this Handler thread. Will deadlock!");
        }
        return super.get(j, timeUnit);
    }

    @Override // X.AbstractFutureC44236Jgg, java.util.concurrent.Future
    public final Object get() {
        if (Looper.myLooper() == this.A00.getLooper() && !isDone()) {
            throw AbstractC166987dD.A14("Must not call get() function from this Handler thread. Will deadlock!");
        }
        return super.get();
    }
}
