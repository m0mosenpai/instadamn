package X;

import com.facebook.react.modules.intent.IntentModule;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.2Nt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC49192Nt implements ListenableFuture {
    public static final C2O7 A00;
    public static final Object A02;
    public volatile C2O4 listeners;
    public volatile Object value;
    public volatile C2O2 waiters;
    public static final boolean A01 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger A03 = Logger.getLogger(AbstractC49192Nt.class.getName());

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public static Object A02(Future future) {
        boolean z = false;
        ?? r1 = future;
        while (true) {
            try {
                r1 = r1.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
                r1 = r1;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return r1;
    }

    private void A03(C2O2 node) {
        node.thread = null;
        while (true) {
            C2O2 c2o2 = this.waiters;
            if (c2o2 != C2O2.A00) {
                C2O2 c2o22 = null;
                while (c2o2 != null) {
                    C2O2 c2o23 = c2o2.next;
                    if (c2o2.thread != null) {
                        c2o22 = c2o2;
                    } else if (c2o22 != null) {
                        c2o22.next = c2o23;
                        if (c2o22.thread == null) {
                            break;
                        }
                    } else if (!A00.A03(c2o2, c2o23, this)) {
                        break;
                    }
                    c2o2 = c2o23;
                }
                return;
            }
            return;
        }
    }

    public static void A04(AbstractC49192Nt future) {
        C2O4 c2o4;
        C2O4 c2o42 = null;
        while (true) {
            C2O2 c2o2 = future.waiters;
            C2O7 c2o7 = A00;
            if (c2o7.A03(c2o2, C2O2.A00, future)) {
                while (c2o2 != null) {
                    Thread thread = c2o2.thread;
                    if (thread != null) {
                        c2o2.thread = null;
                        LockSupport.unpark(thread);
                    }
                    c2o2 = c2o2.next;
                }
                do {
                    c2o4 = future.listeners;
                } while (!c2o7.A02(c2o4, C2O4.A03, future));
                while (true) {
                    C2O4 c2o43 = c2o4;
                    if (c2o4 == null) {
                        break;
                    }
                    c2o4 = c2o4.A00;
                    c2o43.A00 = c2o42;
                    c2o42 = c2o43;
                }
                while (true) {
                    C2O4 c2o44 = c2o42;
                    if (c2o42 != null) {
                        c2o42 = c2o42.A00;
                        Runnable runnable = c2o44.A01;
                        if (runnable instanceof RunnableC53352cJ) {
                            RunnableC53352cJ runnableC53352cJ = (RunnableC53352cJ) runnable;
                            future = runnableC53352cJ.A00;
                            if (future.value == runnableC53352cJ && c2o7.A04(future, runnableC53352cJ, A00(runnableC53352cJ.A01))) {
                                break;
                            }
                        } else {
                            A05(runnable, c2o44.A02);
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.2O7] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    static {
        ?? r4;
        try {
            final AtomicReferenceFieldUpdater newUpdater = AtomicReferenceFieldUpdater.newUpdater(C2O2.class, Thread.class, "thread");
            final AtomicReferenceFieldUpdater newUpdater2 = AtomicReferenceFieldUpdater.newUpdater(C2O2.class, C2O2.class, "next");
            final AtomicReferenceFieldUpdater newUpdater3 = AtomicReferenceFieldUpdater.newUpdater(AbstractC49192Nt.class, C2O2.class, "waiters");
            final AtomicReferenceFieldUpdater newUpdater4 = AtomicReferenceFieldUpdater.newUpdater(AbstractC49192Nt.class, C2O4.class, "listeners");
            final AtomicReferenceFieldUpdater newUpdater5 = AtomicReferenceFieldUpdater.newUpdater(AbstractC49192Nt.class, Object.class, IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
            th = null;
            r4 = new C2O7(newUpdater, newUpdater2, newUpdater3, newUpdater4, newUpdater5) { // from class: X.2O6
                public final AtomicReferenceFieldUpdater A00;
                public final AtomicReferenceFieldUpdater A01;
                public final AtomicReferenceFieldUpdater A02;
                public final AtomicReferenceFieldUpdater A03;
                public final AtomicReferenceFieldUpdater A04;

                @Override // X.C2O7
                public final void A00(C2O2 waiter, C2O2 newValue) {
                    this.A02.lazySet(waiter, newValue);
                }

                @Override // X.C2O7
                public final void A01(C2O2 waiter, Thread newValue) {
                    this.A03.lazySet(waiter, newValue);
                }

                @Override // X.C2O7
                public final boolean A02(C2O4 future, C2O4 expect, AbstractC49192Nt update) {
                    return C1E0.A00(update, future, expect, this.A00);
                }

                @Override // X.C2O7
                public final boolean A03(C2O2 future, C2O2 expect, AbstractC49192Nt update) {
                    return C1E0.A00(update, future, expect, this.A04);
                }

                @Override // X.C2O7
                public final boolean A04(AbstractC49192Nt future, Object expect, Object update) {
                    return C1E0.A00(future, expect, update, this.A01);
                }

                {
                    this.A03 = newUpdater;
                    this.A02 = newUpdater2;
                    this.A04 = newUpdater3;
                    this.A00 = newUpdater4;
                    this.A01 = newUpdater5;
                }
            };
        } catch (Throwable th) {
            th = th;
            r4 = new Object();
        }
        A00 = r4;
        if (th != null) {
            A03.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        A02 = new Object();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r2 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object A00(com.google.common.util.concurrent.ListenableFuture r5) {
        /*
            boolean r0 = r5 instanceof X.AbstractC49192Nt
            r4 = 0
            if (r0 == 0) goto L1e
            X.2Nt r5 = (X.AbstractC49192Nt) r5
            java.lang.Object r3 = r5.value
            boolean r0 = r3 instanceof X.C53372cL
            if (r0 == 0) goto L1d
            r1 = r3
            X.2cL r1 = (X.C53372cL) r1
            boolean r0 = r1.A01
            if (r0 == 0) goto L1d
            java.lang.Throwable r2 = r1.A00
            if (r2 == 0) goto L5f
        L18:
            X.2cL r3 = new X.2cL
            r3.<init>(r4, r2)
        L1d:
            return r3
        L1e:
            boolean r1 = r5.isCancelled()
            boolean r0 = X.AbstractC49192Nt.A01
            r0 = r0 ^ 1
            r0 = r0 & r1
            if (r0 != 0) goto L5f
            java.lang.Object r0 = A02(r5)     // Catch: java.util.concurrent.CancellationException -> L32 java.util.concurrent.ExecutionException -> L50 java.lang.Throwable -> L58
            if (r0 != 0) goto L4f
            java.lang.Object r0 = X.AbstractC49192Nt.A02     // Catch: java.util.concurrent.CancellationException -> L32 java.util.concurrent.ExecutionException -> L50 java.lang.Throwable -> L58
            return r0
        L32:
            r2 = move-exception
            if (r1 != 0) goto L18
            X.2cM r0 = X.C53382cM.A01
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "get() threw CancellationException, despite reporting isCancelled() == false: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1, r2)
            goto L59
        L4f:
            return r0
        L50:
            r1 = move-exception
            X.2cM r0 = X.C53382cM.A01
            java.lang.Throwable r0 = r1.getCause()
            goto L59
        L58:
            r0 = move-exception
        L59:
            X.2cM r3 = new X.2cM
            r3.<init>(r0)
            return r3
        L5f:
            X.2cL r3 = X.C53372cL.A02
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC49192Nt.A00(com.google.common.util.concurrent.ListenableFuture):java.lang.Object");
    }

    public static Object A01(Object obj) {
        if (!(obj instanceof C53372cL)) {
            if (!(obj instanceof C53382cM)) {
                if (obj == A02) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((C53382cM) obj).A00);
        }
        Throwable th = ((C53372cL) obj).A00;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    public final void A07(Object value) {
        if (value == null) {
            value = A02;
        }
        if (A00.A04(this, null, value)) {
            A04(this);
        }
    }

    public final void A08(Throwable throwable) {
        C53382cM c53382cM = C53382cM.A01;
        throwable.getClass();
        if (A00.A04(this, null, new C53382cM(throwable))) {
            A04(this);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean mayInterruptIfRunning) {
        C53372cL c53372cL;
        Object obj = this.value;
        boolean z = false;
        if (obj == null) {
            z = true;
        }
        if (z | (obj instanceof RunnableC53352cJ)) {
            if (A01) {
                C53372cL c53372cL2 = C53372cL.A02;
                c53372cL = new C53372cL(mayInterruptIfRunning, new CancellationException("Future.cancel() was called."));
            } else if (mayInterruptIfRunning) {
                c53372cL = C53372cL.A03;
            } else {
                c53372cL = C53372cL.A02;
            }
            boolean z2 = false;
            AbstractC49192Nt abstractC49192Nt = this;
            while (true) {
                if (A00.A04(abstractC49192Nt, obj, c53372cL)) {
                    A04(abstractC49192Nt);
                    if (!(obj instanceof RunnableC53352cJ)) {
                        break;
                    }
                    ListenableFuture listenableFuture = ((RunnableC53352cJ) obj).A01;
                    if (listenableFuture instanceof AbstractC49192Nt) {
                        abstractC49192Nt = (AbstractC49192Nt) listenableFuture;
                        obj = abstractC49192Nt.value;
                        boolean z3 = false;
                        if (obj == null) {
                            z3 = true;
                        }
                        if (!z3 && !(obj instanceof RunnableC53352cJ)) {
                            break;
                        }
                        z2 = true;
                    } else {
                        listenableFuture.cancel(mayInterruptIfRunning);
                        break;
                    }
                } else {
                    obj = abstractC49192Nt.value;
                    if (!(obj instanceof RunnableC53352cJ)) {
                        return z2;
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ce, code lost:
    
        if (r2 > 1000) goto L52;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(long r18, java.util.concurrent.TimeUnit r20) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC49192Nt.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof C53372cL;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z = false;
        if (this.value != null) {
            z = true;
        }
        return (!(r0 instanceof RunnableC53352cJ)) & z;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:8|(7:10|11|(4:13|(1:15)(1:27)|16|17)(2:28|(1:30)(2:31|(2:23|(1:25))(3:22|5|6)))|18|(1:20)|23|(0))|34|35|(2:37|38)(1:41)|39|5|6) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00da, code lost:
    
        r0 = "CANCELLED";
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c9, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ca, code lost:
    
        r3.append("UNKNOWN, cause=[");
        r3.append(r1.getClass());
        r0 = " thrown from get()]";
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00de, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00df, code lost:
    
        r3.append("FAILURE, cause=[");
        r3.append(r1.getCause());
        r3.append("]");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r5 = this;
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = super.toString()
            r3.append(r0)
            java.lang.String r0 = "[status="
            r3.append(r0)
            boolean r0 = r5.isCancelled()
            java.lang.String r2 = "]"
            if (r0 == 0) goto L26
            java.lang.String r0 = "CANCELLED"
        L1b:
            r3.append(r0)
        L1e:
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            return r0
        L26:
            boolean r0 = r5.isDone()
            if (r0 != 0) goto Lad
            java.lang.Object r1 = r5.value     // Catch: java.lang.RuntimeException -> L78
            boolean r0 = r1 instanceof X.RunnableC53352cJ     // Catch: java.lang.RuntimeException -> L78
            if (r0 == 0) goto L51
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L78
            r4.<init>()     // Catch: java.lang.RuntimeException -> L78
            java.lang.String r0 = "setFuture=["
            r4.append(r0)     // Catch: java.lang.RuntimeException -> L78
            X.2cJ r1 = (X.RunnableC53352cJ) r1     // Catch: java.lang.RuntimeException -> L78
            com.google.common.util.concurrent.ListenableFuture r0 = r1.A01     // Catch: java.lang.RuntimeException -> L78
            if (r0 != r5) goto L4a
            java.lang.String r0 = "this future"
        L46:
            r4.append(r0)     // Catch: java.lang.RuntimeException -> L78
            goto L4f
        L4a:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.RuntimeException -> L78
            goto L46
        L4f:
            r0 = r2
            goto L6e
        L51:
            boolean r0 = r5 instanceof java.util.concurrent.ScheduledFuture     // Catch: java.lang.RuntimeException -> L78
            if (r0 == 0) goto L76
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L78
            r4.<init>()     // Catch: java.lang.RuntimeException -> L78
            java.lang.String r0 = "remaining delay=["
            r4.append(r0)     // Catch: java.lang.RuntimeException -> L78
            r1 = r5
            java.util.concurrent.Delayed r1 = (java.util.concurrent.Delayed) r1     // Catch: java.lang.RuntimeException -> L78
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.RuntimeException -> L78
            long r0 = r1.getDelay(r0)     // Catch: java.lang.RuntimeException -> L78
            r4.append(r0)     // Catch: java.lang.RuntimeException -> L78
            java.lang.String r0 = " ms]"
        L6e:
            r4.append(r0)     // Catch: java.lang.RuntimeException -> L78
            java.lang.String r1 = r4.toString()     // Catch: java.lang.RuntimeException -> L78
            goto L8e
        L76:
            r1 = 0
            goto L8e
        L78:
            r4 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Exception thrown from implementation: "
            r1.append(r0)
            java.lang.Class r0 = r4.getClass()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
        L8e:
            if (r1 == 0) goto La3
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto La3
            java.lang.String r0 = "PENDING, info=["
            r3.append(r0)
            r3.append(r1)
            r3.append(r2)
            goto L1e
        La3:
            boolean r0 = r5.isDone()
            if (r0 != 0) goto Lad
            java.lang.String r0 = "PENDING"
            goto L1b
        Lad:
            java.lang.Object r1 = A02(r5)     // Catch: java.lang.RuntimeException -> Lc9 java.util.concurrent.CancellationException -> Lda java.util.concurrent.ExecutionException -> Lde
            java.lang.String r0 = "SUCCESS, result=["
            r3.append(r0)     // Catch: java.lang.RuntimeException -> Lc9 java.util.concurrent.CancellationException -> Lda java.util.concurrent.ExecutionException -> Lde
            if (r1 != r5) goto Lb9
            goto Lbe
        Lb9:
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch: java.lang.RuntimeException -> Lc9 java.util.concurrent.CancellationException -> Lda java.util.concurrent.ExecutionException -> Lde
            goto Lc1
        Lbe:
            java.lang.String r0 = "this future"
        Lc1:
            r3.append(r0)     // Catch: java.lang.RuntimeException -> Lc9 java.util.concurrent.CancellationException -> Lda java.util.concurrent.ExecutionException -> Lde
            r3.append(r2)     // Catch: java.lang.RuntimeException -> Lc9 java.util.concurrent.CancellationException -> Lda java.util.concurrent.ExecutionException -> Lde
            goto L1e
        Lc9:
            r1 = move-exception
            java.lang.String r0 = "UNKNOWN, cause=["
            r3.append(r0)
            java.lang.Class r0 = r1.getClass()
            r3.append(r0)
            java.lang.String r0 = " thrown from get()]"
            goto L1b
        Lda:
            java.lang.String r0 = "CANCELLED"
            goto L1b
        Lde:
            r1 = move-exception
            java.lang.String r0 = "FAILURE, cause=["
            r3.append(r0)
            java.lang.Throwable r0 = r1.getCause()
            r3.append(r0)
            r3.append(r2)
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC49192Nt.toString():java.lang.String");
    }

    public static void A05(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = A03;
            Level level = Level.SEVERE;
            StringBuilder sb = new StringBuilder();
            sb.append("RuntimeException while executing runnable ");
            sb.append(runnable);
            sb.append(" with executor ");
            sb.append(executor);
            logger.log(level, sb.toString(), (Throwable) e);
        }
    }

    public final void A06(ListenableFuture future) {
        C53382cM c53382cM;
        future.getClass();
        Object obj = this.value;
        if (obj == null) {
            if (future.isDone()) {
                if (A00.A04(this, null, A00(future))) {
                    A04(this);
                    return;
                }
                return;
            }
            RunnableC53352cJ runnableC53352cJ = new RunnableC53352cJ(this, future);
            C2O7 c2o7 = A00;
            if (!c2o7.A04(this, null, runnableC53352cJ)) {
                obj = this.value;
            } else {
                try {
                    future.addListener(runnableC53352cJ, AnonymousClass517.A01);
                    return;
                } catch (Throwable th) {
                    try {
                        c53382cM = new C53382cM(th);
                    } catch (Throwable unused) {
                        c53382cM = C53382cM.A01;
                    }
                    c2o7.A04(this, runnableC53352cJ, c53382cM);
                    return;
                }
            }
        }
        if (!(obj instanceof C53372cL)) {
            return;
        }
        future.cancel(((C53372cL) obj).A01);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable listener, Executor executor) {
        listener.getClass();
        executor.getClass();
        C2O4 c2o4 = this.listeners;
        C2O4 c2o42 = C2O4.A03;
        if (c2o4 != c2o42) {
            C2O4 c2o43 = new C2O4(listener, executor);
            do {
                c2o43.A00 = c2o4;
                if (!A00.A02(c2o4, c2o43, this)) {
                    c2o4 = this.listeners;
                } else {
                    return;
                }
            } while (c2o4 != c2o42);
        }
        A05(listener, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        boolean z;
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z2 = false;
            if (obj != null) {
                z2 = true;
            }
            if (!(z2 & (!(obj instanceof RunnableC53352cJ)))) {
                C2O2 c2o2 = this.waiters;
                C2O2 c2o22 = C2O2.A00;
                if (c2o2 != c2o22) {
                    C2O2 c2o23 = new C2O2();
                    do {
                        C2O7 c2o7 = A00;
                        c2o7.A00(c2o23, c2o2);
                        if (!c2o7.A03(c2o2, c2o23, this)) {
                            c2o2 = this.waiters;
                        } else {
                            do {
                                LockSupport.park(this);
                                if (!Thread.interrupted()) {
                                    obj = this.value;
                                    z = false;
                                    if (obj != null) {
                                        z = true;
                                    }
                                } else {
                                    A03(c2o23);
                                    throw new InterruptedException();
                                }
                            } while (!(z & (!(obj instanceof RunnableC53352cJ))));
                        }
                    } while (c2o2 != c2o22);
                }
                obj = this.value;
            }
            return A01(obj);
        }
        throw new InterruptedException();
    }
}
