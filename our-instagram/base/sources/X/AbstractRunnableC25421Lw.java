package X;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* renamed from: X.1Lw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC25421Lw extends AtomicReference implements Runnable {
    public static final Runnable A00 = new Object();
    public static final Runnable A01 = new Object();

    public abstract Object A01();

    public abstract String A02();

    public abstract void A04(Object result);

    public abstract void A05(Throwable error);

    public abstract boolean A06();

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
    
        if (r0 != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A00(java.lang.Thread r6) {
        /*
            r5 = this;
            java.lang.Object r4 = r5.get()
            r3 = 0
            r2 = 0
            r1 = 0
        L7:
            boolean r0 = r4 instanceof X.RunnableC116305Oj
            if (r0 != 0) goto L15
            java.lang.Runnable r0 = X.AbstractRunnableC25421Lw.A01
            if (r4 == r0) goto L16
            if (r2 == 0) goto L14
            r6.interrupt()
        L14:
            return
        L15:
            r3 = r4
        L16:
            int r1 = r1 + 1
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 <= r0) goto L39
            java.lang.Runnable r0 = X.AbstractRunnableC25421Lw.A01
            if (r4 == r0) goto L26
            boolean r0 = r5.compareAndSet(r4, r0)
            if (r0 == 0) goto L34
        L26:
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L30
            r0 = r2
            r2 = 0
            if (r0 == 0) goto L31
        L30:
            r2 = 1
        L31:
            java.util.concurrent.locks.LockSupport.park(r3)
        L34:
            java.lang.Object r4 = r5.get()
            goto L7
        L39:
            java.lang.Thread.yield()
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractRunnableC25421Lw.A00(java.lang.Thread):void");
    }

    public final void A03() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            RunnableC116305Oj runnableC116305Oj = new RunnableC116305Oj(this);
            RunnableC116305Oj.A00(runnableC116305Oj, Thread.currentThread());
            if (compareAndSet(runnable, runnableC116305Oj)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (getAndSet(A00) == A01) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (getAndSet(A00) == A01) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            boolean z = !A06();
            if (z) {
                try {
                    obj = A01();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            currentThread.interrupt();
                        }
                        if (!compareAndSet(currentThread, A00)) {
                            A00(currentThread);
                        }
                        A05(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(currentThread, A00)) {
                            A00(currentThread);
                        }
                        A04(obj);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(currentThread, A00)) {
                A00(currentThread);
            }
            if (z) {
                A04(obj);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == A00) {
            str = "running=[DONE]";
        } else if (runnable instanceof RunnableC116305Oj) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = AnonymousClass001.A0g("running=[RUNNING ON ", ((Thread) runnable).getName(), "]");
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return AnonymousClass001.A0g(str, ", ", A02());
    }
}
