package X;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.RSx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60786RSx extends AbstractC73423Qt {
    public final Object A02 = AbstractC58318PtA.A0b();
    public int A00 = 0;
    public boolean A01 = false;

    private void A00() {
        Object obj = this.A02;
        synchronized (obj) {
            int i = this.A00 - 1;
            this.A00 = i;
            if (i == 0) {
                obj.notifyAll();
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        synchronized (this.A02) {
            if (!this.A01) {
                this.A00++;
            } else {
                throw new RejectedExecutionException("Executor already shutdown");
            }
        }
        try {
            command.run();
        } finally {
            A00();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        boolean z;
        synchronized (this.A02) {
            z = this.A01;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000a, code lost:
    
        if (r3.A00 != 0) goto L8;
     */
    @Override // java.util.concurrent.ExecutorService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isTerminated() {
        /*
            r3 = this;
            java.lang.Object r2 = r3.A02
            monitor-enter(r2)
            boolean r0 = r3.A01     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto Lc
            int r1 = r3.A00     // Catch: java.lang.Throwable -> Lf
            r0 = 1
            if (r1 == 0) goto Ld
        Lc:
            r0 = 0
        Ld:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            return r0
        Lf:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60786RSx.isTerminated():boolean");
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        Object obj = this.A02;
        synchronized (obj) {
            this.A01 = true;
            if (this.A00 == 0) {
                obj.notifyAll();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long timeout, TimeUnit unit) {
        boolean z;
        long nanos = unit.toNanos(timeout);
        Object obj = this.A02;
        synchronized (obj) {
            while (true) {
                if (!this.A01 || this.A00 != 0) {
                    if (nanos <= 0) {
                        z = false;
                        break;
                    }
                    long nanoTime = System.nanoTime();
                    TimeUnit.NANOSECONDS.timedWait(obj, nanos);
                    nanos -= System.nanoTime() - nanoTime;
                } else {
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        shutdown();
        return Collections.emptyList();
    }
}
