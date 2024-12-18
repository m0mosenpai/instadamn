package X;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: X.12x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC214512x extends AbstractC214612y implements Runnable {
    public static final RunnableC214512x A00;
    public static final long A01;
    public static volatile Thread _thread;
    public static volatile int debugStatus;

    private final synchronized void A00() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            AbstractC214612y.A02.set(this, null);
            AbstractC214612y.A01.set(this, null);
            notifyAll();
        }
    }

    @Override // X.AbstractC214612y, X.AnonymousClass130
    public final void A07() {
        debugStatus = 4;
        super.A07();
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.130, X.12x, X.12y] */
    static {
        Long l;
        ?? abstractC214612y = new AbstractC214612y();
        A00 = abstractC214612y;
        abstractC214612y.A00++;
        abstractC214612y.A02 = true;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        A01 = timeUnit.toNanos(l.longValue());
    }

    @Override // X.AbstractC214712z
    public final Thread A0B() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "X.12x");
                    _thread = thread;
                    thread.setContextClassLoader(getClass().getClassLoader());
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // X.AbstractC214712z
    public final void A0C(AbstractRunnableC90013zh abstractRunnableC90013zh, long j) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // X.AbstractC214612y
    public final void A0E(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.A0E(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r1 < 4611686018427387903L) goto L8;
     */
    @Override // X.AbstractC214612y, X.InterfaceC214312v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C19D CPF(final java.lang.Runnable r6, X.C12W r7, long r8) {
        /*
            r5 = this;
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L1c
            r1 = 9223372036854(0x8637bd05af6, double:4.5569512622224E-311)
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L2c
            r1 = 1000000(0xf4240, double:4.940656E-318)
            long r1 = r1 * r8
            r3 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L2c
        L1c:
            long r3 = java.lang.System.nanoTime()
            long r1 = r1 + r3
            X.4li r0 = new X.4li
            r0.<init>(r6, r1)
            r5.A0F(r0, r3)
        L29:
            X.19D r0 = (X.C19D) r0
            return r0
        L2c:
            X.19C r0 = X.C19C.A00
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC214512x.CPF(java.lang.Runnable, X.12W, long):X.19D");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        C2SU.A00.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i != 2 && i != 3) {
                    z = true;
                    debugStatus = 1;
                    notifyAll();
                } else {
                    z = false;
                }
            }
            if (z) {
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long A06 = A06();
                    if (A06 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = A01 + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            break;
                        } else if (A06 > j2) {
                            A06 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (A06 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            break;
                        } else {
                            LockSupport.parkNanos(this, A06);
                        }
                    }
                }
            }
        } finally {
            _thread = null;
            A00();
            if (!A0G()) {
                A0B();
            }
        }
    }
}
