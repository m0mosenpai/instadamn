package androidx.work;

import X.AbstractC1114350h;
import X.AbstractC48352Kc;
import X.C49182Nr;
import X.Q0Z;
import X.RunnableC64615TMf;
import android.content.Context;
import androidx.work.Worker;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes.dex */
public abstract class Worker extends AbstractC48352Kc {
    public C49182Nr mFuture;

    public abstract AbstractC1114350h doWork();

    public Q0Z getForegroundInfo() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, X.2Nr] */
    @Override // X.AbstractC48352Kc
    public ListenableFuture getForegroundInfoAsync() {
        ?? obj = new Object();
        this.mWorkerParams.A0A.execute(new RunnableC64615TMf(this, obj));
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.2Nr] */
    @Override // X.AbstractC48352Kc
    public final ListenableFuture startWork() {
        this.mFuture = new Object();
        this.mWorkerParams.A0A.execute(new Runnable() { // from class: X.516
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    Worker worker = Worker.this;
                    worker.mFuture.A07(worker.doWork());
                } catch (Throwable th) {
                    Worker.this.mFuture.A08(th);
                }
            }
        });
        return this.mFuture;
    }

    public Worker(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
    }
}
