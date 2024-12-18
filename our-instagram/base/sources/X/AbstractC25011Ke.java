package X;

import com.facebook.react.modules.intent.IntentModule;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.1Ke, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC25011Ke extends AbstractC25021Kf implements ListenableFuture {
    public static final AbstractC25081Km A00;
    public static final C25051Kj A01;
    public static final boolean A02;
    public static final Object A03;
    public volatile C25141Ks listeners;
    public volatile Object value;
    public volatile C25121Kq waiters;

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

    private void A03(C25121Kq node) {
        node.thread = null;
        while (true) {
            C25121Kq c25121Kq = this.waiters;
            if (c25121Kq != C25121Kq.A00) {
                C25121Kq c25121Kq2 = null;
                while (c25121Kq != null) {
                    C25121Kq c25121Kq3 = c25121Kq.next;
                    if (c25121Kq.thread != null) {
                        c25121Kq2 = c25121Kq;
                    } else if (c25121Kq2 != null) {
                        c25121Kq2.next = c25121Kq3;
                        if (c25121Kq2.thread == null) {
                            break;
                        }
                    } else if (!A00.A05(c25121Kq, c25121Kq3, this)) {
                        break;
                    }
                    c25121Kq = c25121Kq3;
                }
                return;
            }
            return;
        }
    }

    public static void A04(AbstractC25011Ke param, boolean callInterruptTask) {
        C25141Ks c25141Ks = null;
        while (true) {
            AbstractC25081Km abstractC25081Km = A00;
            for (C25121Kq A012 = abstractC25081Km.A01(C25121Kq.A00, param); A012 != null; A012 = A012.next) {
                Thread thread = A012.thread;
                if (thread != null) {
                    A012.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            if (callInterruptTask) {
                param.A09();
                callInterruptTask = false;
            }
            param.A08();
            C25141Ks A002 = abstractC25081Km.A00(C25141Ks.A03, param);
            while (true) {
                C25141Ks c25141Ks2 = A002;
                if (A002 == null) {
                    break;
                }
                A002 = A002.A00;
                c25141Ks2.A00 = c25141Ks;
                c25141Ks = c25141Ks2;
            }
            while (true) {
                C25141Ks c25141Ks3 = c25141Ks;
                if (c25141Ks != null) {
                    c25141Ks = c25141Ks.A00;
                    Runnable runnable = c25141Ks3.A01;
                    runnable.getClass();
                    if (runnable instanceof C1MJ) {
                        C1MJ c1mj = (C1MJ) runnable;
                        param = c1mj.A00;
                        if (param.value == c1mj && abstractC25081Km.A06(param, c1mj, A00(c1mj.A01))) {
                            break;
                        }
                    } else {
                        Executor executor = c25141Ks3.A02;
                        executor.getClass();
                        A05(runnable, executor);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public void A08() {
    }

    public void A09() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        if (((X.C25561Mm) r1).A01 == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0B(java.util.concurrent.Future r3) {
        /*
            r2 = this;
            r1 = 0
            if (r3 == 0) goto L4
            r1 = 1
        L4:
            boolean r0 = r2.isCancelled()
            r1 = r1 & r0
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r2.value
            boolean r0 = r1 instanceof X.C25561Mm
            if (r0 == 0) goto L18
            X.1Mm r1 = (X.C25561Mm) r1
            boolean r1 = r1.A01
            r0 = 1
            if (r1 != 0) goto L19
        L18:
            r0 = 0
        L19:
            r3.cancel(r0)
        L1c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC25011Ke.A0B(java.util.concurrent.Future):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.1Km] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    static {
        boolean z;
        ?? r6;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        A02 = z;
        A01 = new C25051Kj(AbstractC25011Ke.class);
        Throwable e = null;
        try {
            e = null;
            r6 = new Object();
        } catch (Error | Exception e2) {
            e = e2;
            try {
                r6 = new C60785RSw(AtomicReferenceFieldUpdater.newUpdater(C25121Kq.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(C25121Kq.class, C25121Kq.class, "next"), AtomicReferenceFieldUpdater.newUpdater(AbstractC25011Ke.class, C25121Kq.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(AbstractC25011Ke.class, C25141Ks.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(AbstractC25011Ke.class, Object.class, IntentModule.EXTRA_MAP_KEY_FOR_VALUE));
            } catch (Error | Exception e3) {
                e = e3;
                r6 = new Object();
            }
        }
        A00 = r6;
        if (e != null) {
            C25051Kj c25051Kj = A01;
            Logger A002 = c25051Kj.A00();
            Level level = Level.SEVERE;
            A002.log(level, "UnsafeAtomicHelper is broken!", e);
            c25051Kj.A00().log(level, "SafeAtomicHelper is broken!", e);
        }
        A03 = new Object();
    }

    public static Object A01(Object obj) {
        if (!(obj instanceof C25561Mm)) {
            if (!(obj instanceof C53392cN)) {
                if (obj == A03) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((C53392cN) obj).A00);
        }
        Throwable th = ((C25561Mm) obj).A00;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    @Override // X.AbstractC25021Kf
    public final Throwable A06() {
        if (this instanceof InterfaceC25031Kh) {
            Object obj = this.value;
            if (obj instanceof C53392cN) {
                return ((C53392cN) obj).A00;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String A07() {
        if (this instanceof ScheduledFuture) {
            return AnonymousClass001.A0e("remaining delay=[", " ms]", ((Delayed) this).getDelay(TimeUnit.MILLISECONDS));
        }
        return null;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable listener, Executor executor) {
        C25141Ks c25141Ks;
        C25141Ks c25141Ks2;
        C18C.A07(listener, "Runnable was null.");
        C18C.A07(executor, "Executor was null.");
        if (!isDone() && (c25141Ks = this.listeners) != (c25141Ks2 = C25141Ks.A03)) {
            C25141Ks c25141Ks3 = new C25141Ks(listener, executor);
            do {
                c25141Ks3.A00 = c25141Ks;
                if (!A00.A04(c25141Ks, c25141Ks3, this)) {
                    c25141Ks = this.listeners;
                } else {
                    return;
                }
            } while (c25141Ks != c25141Ks2);
        }
        A05(listener, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean mayInterruptIfRunning) {
        C25561Mm c25561Mm;
        Object obj = this.value;
        boolean z = false;
        if (obj == null) {
            z = true;
        }
        if (z | (obj instanceof C1MJ)) {
            if (A02) {
                C25561Mm c25561Mm2 = C25561Mm.A02;
                c25561Mm = new C25561Mm(mayInterruptIfRunning, new CancellationException("Future.cancel() was called."));
            } else {
                if (mayInterruptIfRunning) {
                    c25561Mm = C25561Mm.A03;
                } else {
                    c25561Mm = C25561Mm.A02;
                }
                c25561Mm.getClass();
            }
            boolean z2 = false;
            AbstractC25011Ke abstractC25011Ke = this;
            while (true) {
                if (A00.A06(abstractC25011Ke, obj, c25561Mm)) {
                    A04(abstractC25011Ke, mayInterruptIfRunning);
                    if (!(obj instanceof C1MJ)) {
                        break;
                    }
                    ListenableFuture listenableFuture = ((C1MJ) obj).A01;
                    if (listenableFuture instanceof InterfaceC25031Kh) {
                        abstractC25011Ke = (AbstractC25011Ke) listenableFuture;
                        obj = abstractC25011Ke.value;
                        boolean z3 = false;
                        if (obj == null) {
                            z3 = true;
                        }
                        if (!z3 && !(obj instanceof C1MJ)) {
                            break;
                        }
                        z2 = true;
                    } else {
                        listenableFuture.cancel(mayInterruptIfRunning);
                        break;
                    }
                } else {
                    obj = abstractC25011Ke.value;
                    if (!(obj instanceof C1MJ)) {
                        return z2;
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00da, code lost:
    
        if (r2 > 1000) goto L52;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(long r18, java.util.concurrent.TimeUnit r20) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC25011Ke.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof C25561Mm;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z = false;
        if (this.value != null) {
            z = true;
        }
        return (!(r0 instanceof C1MJ)) & z;
    }

    public boolean set(Object value) {
        if (value == null) {
            value = A03;
        }
        if (!A00.A06(this, null, value)) {
            return false;
        }
        A04(this, false);
        return true;
    }

    public boolean setException(Throwable throwable) {
        C53392cN c53392cN = C53392cN.A01;
        throwable.getClass();
        if (!A00.A06(this, null, new C53392cN(throwable))) {
            return false;
        }
        A04(this, false);
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:11|(7:13|(4:15|16|(1:18)(1:25)|19)(8:28|29|(5:31|21|(1:23)|8|9)|(1:33)|21|(0)|8|9)|20|21|(0)|8|9)|37|38|39|(1:41)(1:(2:45|46)(1:47))|42|8|9) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0105, code lost:
    
        r0 = "CANCELLED";
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0109, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x010a, code lost:
    
        r2.append("FAILURE, cause=[");
        r2.append(r1.getCause());
        r2.append("]");
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f4, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f5, code lost:
    
        r2.append("UNKNOWN, cause=[");
        r2.append(r1.getClass());
        r0 = " thrown from get()]";
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC25011Ke.toString():java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object A00(ListenableFuture future) {
        Throwable cause;
        Object obj;
        if (future instanceof InterfaceC25031Kh) {
            obj = ((AbstractC25011Ke) future).value;
            if (obj instanceof C25561Mm) {
                C25561Mm c25561Mm = (C25561Mm) obj;
                if (c25561Mm.A01) {
                    Throwable th = c25561Mm.A00;
                    if (th != null) {
                        obj = new C25561Mm(false, th);
                    }
                }
            }
            obj.getClass();
            return obj;
        }
        if (!(future instanceof AbstractC25021Kf) || (cause = ((AbstractC25021Kf) future).A06()) == null) {
            boolean isCancelled = future.isCancelled();
            if (!((!A02) & isCancelled)) {
                try {
                    Object A022 = A02(future);
                    if (isCancelled) {
                        C25561Mm c25561Mm2 = C25561Mm.A02;
                        StringBuilder sb = new StringBuilder();
                        sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                        sb.append(future);
                        return new C25561Mm(false, new IllegalArgumentException(sb.toString()));
                    }
                    if (A022 == null) {
                        return A03;
                    }
                    return A022;
                } catch (Error | Exception e) {
                    return new C53392cN(e);
                } catch (CancellationException e2) {
                    if (!isCancelled) {
                        C53392cN c53392cN = C53392cN.A01;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                        sb2.append(future);
                        return new C53392cN(new IllegalArgumentException(sb2.toString(), e2));
                    }
                    return new C25561Mm(false, e2);
                } catch (ExecutionException e3) {
                    if (isCancelled) {
                        C25561Mm c25561Mm3 = C25561Mm.A02;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                        sb3.append(future);
                        return new C25561Mm(false, new IllegalArgumentException(sb3.toString(), e3));
                    }
                    C53392cN c53392cN2 = C53392cN.A01;
                    cause = e3.getCause();
                }
            }
        }
        return new C53392cN(cause);
        obj = C25561Mm.A02;
        obj.getClass();
        return obj;
    }

    public static void A05(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            Logger A002 = A01.A00();
            Level level = Level.SEVERE;
            StringBuilder sb = new StringBuilder();
            sb.append("RuntimeException while executing runnable ");
            sb.append(runnable);
            sb.append(" with executor ");
            sb.append(executor);
            A002.log(level, sb.toString(), (Throwable) e);
        }
    }

    public final void A0A(ListenableFuture future) {
        C53392cN c53392cN;
        future.getClass();
        Object obj = this.value;
        if (obj == null) {
            if (future.isDone()) {
                if (A00.A06(this, null, A00(future))) {
                    A04(this, false);
                    return;
                }
                return;
            }
            C1MJ c1mj = new C1MJ(this, future);
            AbstractC25081Km abstractC25081Km = A00;
            if (!abstractC25081Km.A06(this, null, c1mj)) {
                obj = this.value;
            } else {
                try {
                    future.addListener(c1mj, C1M8.A01);
                    return;
                } catch (Throwable th) {
                    try {
                        c53392cN = new C53392cN(th);
                    } catch (Error | Exception unused) {
                        c53392cN = C53392cN.A01;
                    }
                    abstractC25081Km.A06(this, c1mj, c53392cN);
                    return;
                }
            }
        }
        if (!(obj instanceof C25561Mm)) {
            return;
        }
        future.cancel(((C25561Mm) obj).A01);
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
            if (!(z2 & (!(obj instanceof C1MJ)))) {
                C25121Kq c25121Kq = this.waiters;
                C25121Kq c25121Kq2 = C25121Kq.A00;
                if (c25121Kq != c25121Kq2) {
                    C25121Kq c25121Kq3 = new C25121Kq();
                    do {
                        AbstractC25081Km abstractC25081Km = A00;
                        abstractC25081Km.A02(c25121Kq3, c25121Kq);
                        if (!abstractC25081Km.A05(c25121Kq, c25121Kq3, this)) {
                            c25121Kq = this.waiters;
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
                                    A03(c25121Kq3);
                                    throw new InterruptedException();
                                }
                            } while (!(z & (!(obj instanceof C1MJ))));
                        }
                    } while (c25121Kq != c25121Kq2);
                }
                obj = this.value;
                obj.getClass();
            }
            return A01(obj);
        }
        throw new InterruptedException();
    }
}
