package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0nx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14330nx extends ThreadPoolExecutor {
    public boolean A00;
    public final Map A01;

    private synchronized AtomicInteger A00(int i) {
        AtomicInteger atomicInteger;
        Map map = this.A01;
        Integer valueOf = Integer.valueOf(i);
        atomicInteger = (AtomicInteger) map.get(valueOf);
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
            map.put(valueOf, atomicInteger);
        }
        return atomicInteger;
    }

    public C14330nx(BlockingQueue blockingQueue, ThreadFactory threadFactory, TimeUnit timeUnit, int i, long j) {
        super(i, 128, j, timeUnit, blockingQueue, threadFactory, new RejectedExecutionHandler() { // from class: X.0nw
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                final C14330nx c14330nx = (C14330nx) threadPoolExecutor;
                synchronized (c14330nx) {
                    final StringBuilder sb = new StringBuilder();
                    Map map = c14330nx.A01;
                    final int i2 = 0;
                    int i3 = 0;
                    for (Map.Entry entry : map.entrySet()) {
                        int intValue = ((Integer) entry.getKey()).intValue();
                        int i4 = ((AtomicInteger) entry.getValue()).get();
                        if (sb.length() > 0) {
                            sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                        }
                        sb.append(intValue);
                        if (i4 > i3) {
                            i3 = i4;
                            i2 = intValue;
                        }
                    }
                    C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.0vE
                        @Override // java.lang.Runnable
                        public final void run() {
                            String obj;
                            int i5 = i2;
                            StringBuilder sb2 = sb;
                            StringBuilder sb3 = new StringBuilder();
                            for (Map.Entry<Thread, StackTraceElement[]> entry2 : Thread.getAllStackTraces().entrySet()) {
                                if (entry2.getKey().getName().startsWith("IgExecutorV2 #")) {
                                    if (sb3.length() > 0) {
                                        sb3.append("\n");
                                    }
                                    sb3.append(entry2.getKey().getName());
                                    sb3.append("\n");
                                    for (StackTraceElement stackTraceElement : entry2.getValue()) {
                                        sb3.append(stackTraceElement.toString());
                                        sb3.append("\n");
                                    }
                                }
                            }
                            String obj2 = sb3.toString();
                            if (AbstractC14310nv.A00 != null && (obj = sb2.toString()) != null && obj2 != null) {
                                C18920wW A00 = new C12210kP(AbstractC12960li.A00).A00();
                                C25531Mh c25531Mh = new C25531Mh(A00.A00(A00.A00, "ig_executor_full_network_pool"), 218);
                                c25531Mh.A0Q("dominant_task_id", Long.valueOf(i5));
                                c25531Mh.A0R("all_task_ids", obj);
                                c25531Mh.A0R("thread_dumps", obj2);
                                c25531Mh.Cht();
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1862274429);
                        }
                    });
                    c14330nx.A00 = false;
                    map.clear();
                }
            }
        });
        this.A01 = Collections.synchronizedMap(new HashMap());
        this.A00 = true;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th) {
        if (this.A00 && (runnable instanceof AbstractRunnableC14200nk)) {
            A00(((AbstractRunnableC14200nk) runnable).runnableId).decrementAndGet();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void beforeExecute(Thread thread, Runnable runnable) {
        if (this.A00 && (runnable instanceof AbstractRunnableC14200nk)) {
            A00(((AbstractRunnableC14200nk) runnable).runnableId).incrementAndGet();
        }
    }
}
