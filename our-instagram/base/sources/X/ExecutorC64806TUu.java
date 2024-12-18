package X;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.TUu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ExecutorC64806TUu implements Executor {
    public final Executor A02;
    public final Queue A01 = new ConcurrentLinkedQueue();
    public boolean A00 = false;

    public ExecutorC64806TUu(Executor executor) {
        this.A02 = executor;
    }

    public static void A01(ExecutorC64806TUu executorC64806TUu) {
        RunnableC64643TNz runnableC64643TNz;
        synchronized (executorC64806TUu) {
            if (!executorC64806TUu.A00 && (runnableC64643TNz = (RunnableC64643TNz) executorC64806TUu.A01.poll()) != null) {
                executorC64806TUu.A00 = true;
                executorC64806TUu.A02.execute(runnableC64643TNz);
            }
        }
    }

    public static ExecutorC64806TUu A00() {
        if (C62871SUv.A02 == null) {
            synchronized (C62871SUv.class) {
                if (C62871SUv.A02 == null) {
                    int max = Math.max(0, Math.min(5, 32));
                    if (max != 5) {
                        C0K8.A0P("RtiExecutor", "Core pool size override from %d to %d", 5, Integer.valueOf(max));
                    }
                    C62871SUv.A02 = new ThreadPoolExecutor(max, 128, 1L, TimeUnit.SECONDS, (BlockingQueue<Runnable>) C62871SUv.A00, C62871SUv.A01);
                }
            }
        }
        return new ExecutorC64806TUu(C62871SUv.A02);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.A01.add(new RunnableC64643TNz(this, runnable));
        A01(this);
    }
}
