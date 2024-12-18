package X;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final class SWV {
    public static final ThreadFactory A03 = new ThreadFactory() { // from class: X.TVH
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "heartbeat-information-executor");
        }
    };
    public InterfaceC65438TkA A00;
    public final java.util.Set A01;
    public final Executor A02;

    public SWV(Context context, java.util.Set set) {
        TE8 te8 = new TE8(new TE4(context, 1));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), A03);
        this.A00 = te8;
        this.A01 = set;
        this.A02 = threadPoolExecutor;
    }
}
