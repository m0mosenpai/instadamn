package X;

import com.facebook.litho.ComponentsSystrace;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3b6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC76013b6 {
    public final RunnableFuture A00;
    public final AtomicInteger A01;
    public final AtomicInteger A02;
    public final AtomicInteger A03 = new AtomicInteger(-1);
    public final boolean A04;
    public final int A05;
    public volatile boolean A06;

    public abstract InterfaceC50892Vl A03();

    public abstract String A04();

    public final synchronized void A05() {
        if (!this.A06) {
            this.A06 = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r2 == android.os.Process.myTid()) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A06(boolean r6) {
        /*
            r5 = this;
            r3 = 1
            if (r6 == 0) goto L26
            boolean r0 = r5.A04
            if (r0 == 0) goto L26
            boolean r0 = X.C2XV.A01()
            if (r0 != 0) goto L26
            java.util.concurrent.atomic.AtomicInteger r4 = r5.A01
            int r0 = r4.get()
            r2 = 0
            if (r0 == r3) goto L25
            if (r0 != 0) goto L26
            r1 = 2
            boolean r0 = r4.compareAndSet(r2, r1)
            if (r0 != 0) goto L26
            int r0 = r4.get()
            if (r0 == r1) goto L26
        L25:
            return r2
        L26:
            java.util.concurrent.atomic.AtomicInteger r0 = r5.A03
            int r2 = r0.get()
            java.util.concurrent.RunnableFuture r0 = r5.A00
            boolean r0 = r0.isDone()
            if (r0 != 0) goto L3e
            r0 = -1
            if (r2 == r0) goto L3e
            int r0 = android.os.Process.myTid()
            r1 = 1
            if (r2 != r0) goto L3f
        L3e:
            r1 = 0
        L3f:
            boolean r0 = r5.A04
            if (r0 == 0) goto L57
            if (r1 == 0) goto L57
            boolean r0 = X.C2XV.A01()
            if (r0 == 0) goto L57
            java.util.concurrent.atomic.AtomicInteger r2 = r5.A01
            int r1 = r2.get()
            r0 = 0
            if (r1 != 0) goto L57
            r2.compareAndSet(r0, r3)
        L57:
            java.util.concurrent.atomic.AtomicInteger r0 = r5.A02
            r0.incrementAndGet()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC76013b6.A06(boolean):boolean");
    }

    public static final void A01(AbstractC76013b6 abstractC76013b6, String str) {
        C1LP A00 = ComponentsSystrace.A00(AnonymousClass001.A0u("<cls>", abstractC76013b6.getClass().getName(), "</cls>.", str));
        A00.ACV("runningThreadId", abstractC76013b6.A03.get());
        A00.flush();
    }

    public int A02() {
        return this.A05;
    }

    public AbstractC76013b6(int i, boolean z) {
        AtomicInteger atomicInteger;
        this.A05 = i;
        this.A04 = z;
        if (z) {
            atomicInteger = new AtomicInteger(0);
        } else {
            atomicInteger = new AtomicInteger(2);
        }
        this.A01 = atomicInteger;
        this.A02 = new AtomicInteger(0);
        this.A00 = new FutureTask(new Callable() { // from class: X.3b8
            @Override // java.util.concurrent.Callable
            public final /* bridge */ /* synthetic */ Object call() {
                C78383f4 c78383f4;
                AbstractC76013b6 abstractC76013b6 = AbstractC76013b6.this;
                synchronized (abstractC76013b6) {
                    if (abstractC76013b6.A06) {
                        c78383f4 = new C78383f4(null, null, "TreeFuture released");
                    } else {
                        AbstractC76073bC.A00("Litho.TreeFuture.Run", new C50361MLn(abstractC76013b6.A04(), 4), abstractC76013b6.A02());
                        InterfaceC50892Vl A03 = abstractC76013b6.A03();
                        synchronized (abstractC76013b6) {
                            if (abstractC76013b6.A06) {
                                c78383f4 = new C78383f4(null, null, "TreeFuture released");
                            } else {
                                c78383f4 = new C78383f4(A03, null, null);
                            }
                        }
                    }
                }
                return c78383f4;
            }
        });
    }
}
