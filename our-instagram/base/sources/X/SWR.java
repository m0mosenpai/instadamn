package X;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final class SWR {
    public static final SWR A03 = new SWR();
    public final Executor A00;
    public final ExecutorService A01;
    public final ScheduledExecutorService A02;

    public SWR() {
        ExecutorService executorService;
        String property = System.getProperty("java.runtime.name");
        if (property != null && property.toLowerCase(Locale.US).contains("android")) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(SVt.A01, SVt.A02, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            executorService = threadPoolExecutor;
        } else {
            executorService = Executors.newCachedThreadPool();
        }
        this.A01 = executorService;
        this.A02 = Executors.newSingleThreadScheduledExecutor();
        this.A00 = new ExecutorC64803TUr();
    }
}
