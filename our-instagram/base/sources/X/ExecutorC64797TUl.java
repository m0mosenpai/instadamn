package X;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: X.TUl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ExecutorC64797TUl implements Executor {
    public Runnable A00;
    public final InterfaceC65352Tig A01;
    public final ArrayDeque A02 = new ArrayDeque();
    public final Executor A03;

    public final synchronized void A00() {
        Runnable runnable = (Runnable) this.A02.poll();
        this.A00 = runnable;
        if (runnable != null) {
            this.A03.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(final Runnable runnable) {
        this.A02.offer(new Runnable() { // from class: X.TNR
            @Override // java.lang.Runnable
            public final void run() {
                ExecutorC64797TUl executorC64797TUl = ExecutorC64797TUl.this;
                try {
                    try {
                        runnable.run();
                    } catch (RuntimeException e) {
                        executorC64797TUl.A01.handleException(e);
                    }
                } finally {
                    executorC64797TUl.A00();
                }
            }
        });
        if (this.A00 == null) {
            A00();
        }
    }

    public ExecutorC64797TUl(InterfaceC65352Tig interfaceC65352Tig, Executor executor) {
        this.A03 = executor;
        this.A01 = interfaceC65352Tig;
    }
}
