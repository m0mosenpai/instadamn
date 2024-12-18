package X;

import com.facebook.react.modules.intent.IntentModule;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.56J, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C56J implements ListenableFuture {
    public static final C56N A00;
    public static final Object A02;
    public volatile C56L listeners;
    public volatile Object value;
    public volatile C56K waiters;
    public static final boolean A01 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger A03 = Logger.getLogger(C56J.class.getName());

    private void A02(C56K c56k) {
        c56k.thread = null;
        while (true) {
            C56K c56k2 = this.waiters;
            if (c56k2 != C56K.A00) {
                C56K c56k3 = null;
                while (c56k2 != null) {
                    C56K c56k4 = c56k2.next;
                    if (c56k2.thread != null) {
                        c56k3 = c56k2;
                    } else if (c56k3 != null) {
                        c56k3.next = c56k4;
                        if (c56k3.thread == null) {
                            break;
                        }
                    } else if (!A00.A03(c56k2, c56k4, this)) {
                        break;
                    }
                    c56k2 = c56k4;
                }
                return;
            }
            return;
        }
    }

    public static void A03(C56J c56j) {
        C56K c56k;
        C56N c56n;
        C56L c56l;
        C56L c56l2 = null;
        do {
            c56k = c56j.waiters;
            c56n = A00;
        } while (!c56n.A03(c56k, C56K.A00, c56j));
        while (c56k != null) {
            Thread thread = c56k.thread;
            if (thread != null) {
                c56k.thread = null;
                LockSupport.unpark(thread);
            }
            c56k = c56k.next;
        }
        do {
            c56l = c56j.listeners;
        } while (!c56n.A02(c56l, C56L.A03, c56j));
        while (true) {
            C56L c56l3 = c56l;
            if (c56l == null) {
                break;
            }
            c56l = c56l.A00;
            c56l3.A00 = c56l2;
            c56l2 = c56l3;
        }
        while (true) {
            C56L c56l4 = c56l2;
            if (c56l2 != null) {
                c56l2 = c56l2.A00;
                A04(c56l4.A01, c56l4.A02);
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.56N] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    static {
        ?? r4;
        try {
            th = null;
            r4 = new C56M(AtomicReferenceFieldUpdater.newUpdater(C56K.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(C56K.class, C56K.class, "next"), AtomicReferenceFieldUpdater.newUpdater(C56J.class, C56K.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(C56J.class, C56L.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(C56J.class, Object.class, IntentModule.EXTRA_MAP_KEY_FOR_VALUE));
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

    public static Object A01(Object obj) {
        if (!(obj instanceof C73292Xzh)) {
            if (!(obj instanceof LE8)) {
                if (obj == A02) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((LE8) obj).A00);
        }
        Throwable th = ((C73292Xzh) obj).A00;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String A05() {
        if (this instanceof ScheduledFuture) {
            return AnonymousClass001.A0e("remaining delay=[", " ms]", ((Delayed) this).getDelay(TimeUnit.MILLISECONDS));
        }
        return null;
    }

    public final boolean A06(Object obj) {
        if (obj == null) {
            obj = A02;
        }
        if (A00.A04(this, null, obj)) {
            A03(this);
            return true;
        }
        return false;
    }

    public final boolean A07(Throwable th) {
        if (A00.A04(this, null, new LE8(th))) {
            A03(this);
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C73292Xzh c73292Xzh;
        Object obj = this.value;
        if (obj == null) {
            if (A01) {
                C73292Xzh c73292Xzh2 = C73292Xzh.A01;
                c73292Xzh = new C73292Xzh(new CancellationException("Future.cancel() was called."));
            } else if (z) {
                c73292Xzh = C73292Xzh.A02;
            } else {
                c73292Xzh = C73292Xzh.A01;
            }
            if (A00.A04(this, obj, c73292Xzh)) {
                A03(this);
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b3, code lost:
    
        if (r2 > 1000) goto L43;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(long r18, java.util.concurrent.TimeUnit r20) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56J.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof C73292Xzh;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z = false;
        if (this.value != null) {
            z = true;
        }
        return z & true;
    }

    public final String toString() {
        String obj;
        String str;
        Object obj2;
        String valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            str = "CANCELLED";
        } else {
            if (!isDone()) {
                try {
                    obj = A05();
                } catch (RuntimeException e) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Exception thrown from implementation: ");
                    sb2.append(e.getClass());
                    obj = sb2.toString();
                }
                if (obj != null && !obj.isEmpty()) {
                    sb.append("PENDING, info=[");
                    sb.append(obj);
                    sb.append("]");
                    sb.append("]");
                    return sb.toString();
                }
                if (!isDone()) {
                    str = "PENDING";
                }
            }
            boolean z = false;
            while (true) {
                try {
                    try {
                        obj2 = get();
                        break;
                    } catch (CancellationException unused) {
                        str = "CANCELLED";
                    } catch (RuntimeException e2) {
                        sb.append("UNKNOWN, cause=[");
                        sb.append(e2.getClass());
                        str = " thrown from get()]";
                    } catch (ExecutionException e3) {
                        sb.append("FAILURE, cause=[");
                        sb.append(e3.getCause());
                        sb.append("]");
                    }
                } catch (InterruptedException unused2) {
                    z = true;
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
            sb.append("SUCCESS, result=[");
            if (obj2 != this) {
                valueOf = String.valueOf(obj2);
            } else {
                valueOf = "this future";
            }
            sb.append(valueOf);
            sb.append("]");
            sb.append("]");
            return sb.toString();
        }
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    public static void A04(Runnable runnable, Executor executor) {
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

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        C56L c56l = this.listeners;
        C56L c56l2 = C56L.A03;
        if (c56l != c56l2) {
            C56L c56l3 = new C56L(runnable, executor);
            do {
                c56l3.A00 = c56l;
                if (!A00.A02(c56l, c56l3, this)) {
                    c56l = this.listeners;
                } else {
                    return;
                }
            } while (c56l != c56l2);
        }
        A04(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        if (!Thread.interrupted()) {
            Object obj = this.value;
            if (obj == null) {
                C56K c56k = this.waiters;
                C56K c56k2 = C56K.A00;
                if (c56k != c56k2) {
                    C56K c56k3 = new C56K();
                    do {
                        C56N c56n = A00;
                        c56n.A00(c56k3, c56k);
                        if (!c56n.A03(c56k, c56k3, this)) {
                            c56k = this.waiters;
                        } else {
                            do {
                                LockSupport.park(this);
                                if (!Thread.interrupted()) {
                                    obj = this.value;
                                } else {
                                    A02(c56k3);
                                    throw new InterruptedException();
                                }
                            } while (obj == null);
                        }
                    } while (c56k != c56k2);
                }
                obj = this.value;
            }
            return A01(obj);
        }
        throw new InterruptedException();
    }
}
