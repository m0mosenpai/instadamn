package X;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: X.1bG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC29391bG implements Executor {
    public Runnable A00;
    public final Executor A03;
    public final ArrayDeque A02 = new ArrayDeque();
    public final Object A01 = new Object();

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        C14360o3.A0B(runnable, 0);
        synchronized (this.A01) {
            this.A02.offer(new Runnable(this) { // from class: X.48X
                public final /* synthetic */ ExecutorC29391bG A00;

                {
                    this.A00 = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Runnable runnable2 = runnable;
                    ExecutorC29391bG executorC29391bG = this.A00;
                    try {
                        runnable2.run();
                    } finally {
                        executorC29391bG.A00();
                    }
                }
            });
            if (this.A00 == null) {
                A00();
            }
        }
    }

    public final void A00() {
        synchronized (this.A01) {
            Object poll = this.A02.poll();
            Runnable runnable = (Runnable) poll;
            this.A00 = runnable;
            if (poll != null) {
                this.A03.execute(runnable);
            }
        }
    }

    public ExecutorC29391bG(Executor executor) {
        this.A03 = executor;
    }
}
