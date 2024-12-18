package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* renamed from: X.R6x, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC60559R6x extends R6y {
    public final Handler A00;

    public AbstractC60559R6x(Handler handler) {
        this.A00 = handler;
    }

    @Override // X.R6y, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        if (Looper.myLooper() == this.A00.getLooper() && !isDone()) {
            throw AbstractC166987dD.A14(AbstractC43591JPw.A00(267));
        }
        return super.get(j, timeUnit);
    }

    @Override // X.R6y, java.util.concurrent.Future
    public final Object get() {
        if (Looper.myLooper() == this.A00.getLooper() && !isDone()) {
            throw AbstractC166987dD.A14(AbstractC43591JPw.A00(267));
        }
        return super.get();
    }
}
