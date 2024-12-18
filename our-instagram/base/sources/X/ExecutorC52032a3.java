package X;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* renamed from: X.2a3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC52032a3 implements Executor {
    public Runnable A00;
    public final Executor A02;
    public final Object A03 = new Object();
    public final Queue A01 = new ArrayDeque();

    public final void A00() {
        synchronized (this.A03) {
            Runnable runnable = (Runnable) this.A01.poll();
            this.A00 = runnable;
            if (runnable != null) {
                this.A02.execute(runnable);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        synchronized (this.A03) {
            this.A01.add(new Runnable() { // from class: X.Atj
                @Override // java.lang.Runnable
                public final void run() {
                    ExecutorC52032a3 executorC52032a3 = ExecutorC52032a3.this;
                    try {
                        runnable.run();
                    } finally {
                        executorC52032a3.A00();
                    }
                }
            });
            if (this.A00 == null) {
                A00();
            }
        }
    }

    public ExecutorC52032a3(Executor executor) {
        this.A02 = executor;
    }
}
