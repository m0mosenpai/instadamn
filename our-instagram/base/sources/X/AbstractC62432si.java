package X;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: X.2si, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC62432si extends AbstractC62442sj {
    public static final Handler A01 = new Handler(Looper.getMainLooper());
    public static volatile boolean A02;
    public Object A00;

    @Override // X.AbstractC019307n
    public final void A01() {
        this.A00 = null;
    }

    @Override // X.AbstractC019307n
    public final void A02() {
        if (this.A00 != null) {
            A01.post(new RunnableC43936Jbl(this));
            return;
        }
        boolean z = this.A04;
        this.A04 = false;
        this.A05 |= z;
        if (!z) {
            return;
        }
        try {
            A09();
        } catch (RejectedExecutionException e) {
            String simpleName = getClass().getSimpleName();
            C14360o3.A07(simpleName);
            C0w9.A07(simpleName, e);
        }
    }

    @Override // X.AbstractC019307n
    public final void A03(Object obj) {
        this.A00 = obj;
        if (this.A07) {
            super.A03(obj);
        }
    }

    @Override // X.AbstractC62442sj
    public final Executor A07() {
        if (!A02) {
            Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
            C14360o3.A07(executor);
            return executor;
        }
        return ExecutorC902440j.A00;
    }
}
