package X;

import com.facebook.react.modules.appstate.AppStateModule;
import java.util.HashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0Mb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04590Mb {
    public static int A00;
    public static ExecutorService A01;
    public static ExecutorService A02;
    public static final ExecutorService A03;
    public static final ExecutorService A04;
    public static final ScheduledExecutorService A05;
    public static final ExecutorService A06;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        A06 = new ThreadPoolExecutor(0, 1, 15L, timeUnit, new LinkedBlockingQueue(), new ThreadFactoryC04580Ma("main", 5));
        A04 = new ThreadPoolExecutor(1, 1, 15L, timeUnit, new LinkedBlockingQueue(), new ThreadFactoryC04580Ma("single", 0));
        A03 = new ThreadPoolExecutor(0, 1, 10L, timeUnit, new LinkedBlockingQueue(), new ThreadFactoryC04580Ma("startup", 0));
        A05 = new ScheduledThreadPoolExecutor(3, new ThreadFactoryC04580Ma("scheduled", 10));
    }

    public static ExecutorService A00() {
        if (A02 == null) {
            synchronized (C04590Mb.class) {
                ExecutorService executorService = A02;
                if (executorService != null) {
                    return executorService;
                }
                A02 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC04580Ma("sender", 10));
            }
        }
        return A02;
    }

    public static ExecutorService A01() {
        ThreadPoolExecutor threadPoolExecutor;
        if (A02 == null) {
            synchronized (C04590Mb.class) {
                ExecutorService executorService = A02;
                if (executorService != null) {
                    return executorService;
                }
                int i = A00;
                if (i == 0) {
                    threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC04580Ma("softErrorSender", 15));
                } else {
                    threadPoolExecutor = new ThreadPoolExecutor(1, 4, 10L, TimeUnit.SECONDS, new ArrayBlockingQueue(i), new ThreadFactoryC04580Ma("softErrorSender", 15), new ThreadPoolExecutor.DiscardPolicy() { // from class: X.0MY
                        @Override // java.util.concurrent.ThreadPoolExecutor.DiscardPolicy, java.util.concurrent.RejectedExecutionHandler
                        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                            HashMap hashMap;
                            if (runnable instanceof AbstractRunnableC04600Mc) {
                                hashMap = ((AbstractRunnableC04600Mc) runnable).A00();
                                hashMap.put("limit", Integer.toString(C04590Mb.A00));
                            } else {
                                hashMap = null;
                            }
                            C0PC.A00().DEh("softErrorSenderQueueFull", null, hashMap);
                        }
                    });
                }
                A02 = threadPoolExecutor;
            }
        }
        return A02;
    }

    public static synchronized ExecutorService A02() {
        ExecutorService executorService;
        synchronized (C04590Mb.class) {
            executorService = A01;
            if (executorService == null) {
                executorService = new ThreadPoolExecutor(0, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC04580Ma(AppStateModule.APP_STATE_BACKGROUND, 10));
                A01 = executorService;
            }
        }
        return executorService;
    }
}
