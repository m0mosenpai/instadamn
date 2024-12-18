package X;

import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* renamed from: X.12l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC213312l implements Executor, Closeable {
    public final int A00;
    public final int A01;
    public final long A02;
    public final String A03;
    public final C213712p A04;
    public final C213412m A05;
    public final C213412m A06;
    public volatile /* synthetic */ int _isTerminated$volatile;
    public volatile /* synthetic */ long controlState$volatile;
    public volatile /* synthetic */ long parkedWorkersStack$volatile;
    public static final /* synthetic */ AtomicLongFieldUpdater A0A = AtomicLongFieldUpdater.newUpdater(ExecutorC213312l.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater A09 = AtomicLongFieldUpdater.newUpdater(ExecutorC213312l.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater A08 = AtomicIntegerFieldUpdater.newUpdater(ExecutorC213312l.class, "_isTerminated$volatile");
    public static final C20730zt A07 = new C20730zt("NOT_IN_STACK");

    private final int A00() {
        int i;
        C213712p c213712p = this.A04;
        synchronized (c213712p) {
            if (A08.get(this) == 0) {
                AtomicLongFieldUpdater atomicLongFieldUpdater = A09;
                long j = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j & 2097151);
                int i3 = i2 - ((int) ((j & 4398044413952L) >> 21));
                i = 0;
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i3 < this.A00 && i2 < this.A01) {
                    int i4 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                    if (i4 > 0 && c213712p.A00(i4) == null) {
                        C71423Ig c71423Ig = new C71423Ig(this, i4);
                        c213712p.A01(i4, c71423Ig);
                        if (i4 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                            int i5 = i3 + 1;
                            c71423Ig.start();
                            return i5;
                        }
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
            } else {
                i = -1;
            }
            return i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r6.compareAndSet(r12, r8, r0 | r3) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        r5.nextParkedWorker = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A02() {
        /*
            r12 = this;
        L0:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = X.ExecutorC213312l.A0A
        L2:
            r7 = r12
            long r8 = r6.get(r12)
            r2 = 2097151(0x1fffff, double:1.0361303E-317)
            long r2 = r2 & r8
            int r1 = (int) r2
            X.12p r0 = r12.A04
            java.lang.Object r5 = r0.A00(r1)
            X.3Ig r5 = (X.C71423Ig) r5
            if (r5 != 0) goto L28
            r5 = 0
        L17:
            r2 = 0
            if (r5 == 0) goto L27
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = X.C71423Ig.A08
            r0 = -1
            boolean r0 = r1.compareAndSet(r5, r0, r2)
            if (r0 == 0) goto L0
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r2 = 1
        L27:
            return r2
        L28:
            r3 = 2097152(0x200000, double:1.036131E-317)
            long r3 = r3 + r8
            r0 = -2097152(0xffffffffffe00000, double:NaN)
            long r3 = r3 & r0
            r2 = r5
        L31:
            java.lang.Object r2 = r2.nextParkedWorker
            X.0zt r1 = X.ExecutorC213312l.A07
            if (r2 == r1) goto L2
            if (r2 != 0) goto L45
            r0 = 0
        L3a:
            long r10 = (long) r0
            long r10 = r10 | r3
            boolean r0 = r6.compareAndSet(r7, r8, r10)
            if (r0 == 0) goto L2
            r5.nextParkedWorker = r1
            goto L17
        L45:
            X.3Ig r2 = (X.C71423Ig) r2
            int r0 = r2.indexInArray
            if (r0 == 0) goto L31
            if (r0 < 0) goto L2
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ExecutorC213312l.A02():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(java.lang.Runnable r12, X.C12k r13, boolean r14) {
        /*
            r11 = this;
            int r0 = X.AbstractC212912g.A01
            long r0 = java.lang.System.nanoTime()
            boolean r2 = r12 instanceof X.C1E5
            if (r2 == 0) goto Ld3
            r5 = r12
            X.1E5 r5 = (X.C1E5) r5
            r5.A00 = r0
            r5.A01 = r13
        L11:
            X.12k r0 = r5.A01
            int r0 = r0.A00
            r10 = 0
            r4 = 1
            if (r0 != r4) goto Lce
            r9 = 1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = X.ExecutorC213312l.A09
            r0 = 2097152(0x200000, double:1.036131E-317)
            long r2 = r2.addAndGet(r11, r0)
        L23:
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            boolean r0 = r6 instanceof X.C71423Ig
            r8 = 0
            if (r0 == 0) goto L4b
            X.3Ig r6 = (X.C71423Ig) r6
            if (r6 == 0) goto L4b
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.C71423Ig.A08
            X.12l r0 = r6.A07
            boolean r0 = X.C14360o3.A0K(r0, r11)
            if (r0 == 0) goto L4b
            r8 = r6
            java.lang.Integer r1 = r6.A03
            java.lang.Integer r0 = X.C05F.A0Y
            if (r1 == r0) goto L4b
            X.12k r0 = r5.A01
            int r0 = r0.A00
            if (r0 != 0) goto L6a
            java.lang.Integer r0 = X.C05F.A01
            if (r1 != r0) goto L6a
        L4b:
            X.12k r0 = r5.A01
            int r0 = r0.A00
            if (r0 != r4) goto L67
            X.12m r0 = r11.A05
        L53:
            boolean r0 = r0.A02(r5)
            if (r0 != 0) goto Lc8
            java.lang.String r1 = r11.A03
            java.lang.String r0 = " was terminated"
            java.lang.String r1 = X.AnonymousClass001.A0R(r1, r0)
            java.util.concurrent.RejectedExecutionException r0 = new java.util.concurrent.RejectedExecutionException
            r0.<init>(r1)
            throw r0
        L67:
            X.12m r0 = r11.A06
            goto L53
        L6a:
            r6.A04 = r4
            X.3Ij r6 = r6.A06
            if (r14 != 0) goto L94
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C71453Ij.A04
            java.lang.Object r5 = r0.getAndSet(r6, r5)
            X.1E5 r5 = (X.C1E5) r5
            if (r5 != 0) goto L94
        L7a:
            if (r9 == 0) goto L8e
            if (r10 != 0) goto L8d
            boolean r0 = r11.A02()
            if (r0 != 0) goto L8d
            boolean r0 = r11.A03(r2)
            if (r0 != 0) goto L8d
            r11.A02()
        L8d:
            return
        L8e:
            if (r10 != 0) goto L8d
            r11.A04()
            return
        L94:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r7 = X.C71453Ij.A03
            int r1 = r7.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.C71453Ij.A02
            int r0 = r0.get(r6)
            int r1 = r1 - r0
            r0 = 127(0x7f, float:1.78E-43)
            if (r1 == r0) goto L4b
            X.12k r0 = r5.A01
            int r0 = r0.A00
            if (r0 != r4) goto Lb0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.C71453Ij.A01
            r0.incrementAndGet(r6)
        Lb0:
            int r0 = r7.get(r6)
            r4 = r0 & 127(0x7f, float:1.78E-43)
        Lb6:
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r6.A00
            java.lang.Object r0 = r1.get(r4)
            if (r0 == 0) goto Lc2
            java.lang.Thread.yield()
            goto Lb6
        Lc2:
            r1.lazySet(r4, r5)
            r7.incrementAndGet(r6)
        Lc8:
            if (r14 == 0) goto L7a
            if (r8 == 0) goto L7a
            r10 = 1
            goto L7a
        Lce:
            r9 = 0
            r2 = 0
            goto L23
        Ld3:
            X.PuB r5 = new X.PuB
            r5.<init>(r12, r13, r0)
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ExecutorC213312l.A05(java.lang.Runnable, X.12k, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0002, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(X.C71423Ig r10, int r11, int r12) {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = X.ExecutorC213312l.A0A
        L2:
            r4 = r9
            long r5 = r3.get(r9)
            r0 = 2097151(0x1fffff, double:1.0361303E-317)
            long r0 = r0 & r5
            int r2 = (int) r0
            r7 = 2097152(0x200000, double:1.036131E-317)
            long r7 = r7 + r5
            r0 = -2097152(0xffffffffffe00000, double:NaN)
            long r7 = r7 & r0
            if (r2 != r11) goto L33
            if (r12 != 0) goto L2b
            r1 = r10
        L19:
            java.lang.Object r1 = r1.nextParkedWorker
            X.0zt r0 = X.ExecutorC213312l.A07
            if (r1 == r0) goto L2
            if (r1 != 0) goto L2d
            r2 = 0
        L22:
            long r0 = (long) r2
            long r7 = r7 | r0
            boolean r0 = r3.compareAndSet(r4, r5, r7)
            if (r0 == 0) goto L2
            return
        L2b:
            r2 = r12
            goto L33
        L2d:
            X.3Ig r1 = (X.C71423Ig) r1
            int r2 = r1.indexInArray
            if (r2 == 0) goto L19
        L33:
            if (r2 < 0) goto L2
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ExecutorC213312l.A06(X.3Ig, int, int):void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        int i;
        C1E5 c1e5;
        C71423Ig c71423Ig;
        if (A08.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            C71423Ig c71423Ig2 = null;
            if ((currentThread instanceof C71423Ig) && (c71423Ig = (C71423Ig) currentThread) != null) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C71423Ig.A08;
                if (C14360o3.A0K(c71423Ig.A07, this)) {
                    c71423Ig2 = c71423Ig;
                }
            }
            C213712p c213712p = this.A04;
            synchronized (c213712p) {
                atomicLongFieldUpdater = A09;
                i = (int) (atomicLongFieldUpdater.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object A00 = c213712p.A00(i2);
                    C14360o3.A0A(A00);
                    C71423Ig c71423Ig3 = (C71423Ig) A00;
                    if (c71423Ig3 != c71423Ig2) {
                        while (c71423Ig3.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(c71423Ig3);
                            c71423Ig3.join(10000L);
                        }
                        C71453Ij c71453Ij = c71423Ig3.A06;
                        C213412m c213412m = this.A05;
                        Object andSet = C71453Ij.A04.getAndSet(c71453Ij, null);
                        if (andSet != null) {
                            c213412m.A02(andSet);
                        }
                        while (true) {
                            C1E5 A002 = C71453Ij.A00(c71453Ij);
                            if (A002 == null) {
                                break;
                            } else {
                                c213412m.A02(A002);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            C213412m c213412m2 = this.A05;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C213512n.A00;
            while (true) {
                C213612o c213612o = (C213612o) atomicReferenceFieldUpdater.get(c213412m2);
                if (c213612o.A04()) {
                    break;
                } else {
                    C1E0.A00(c213412m2, c213612o, C213612o.A01(c213612o, C213612o.A00(c213612o)), atomicReferenceFieldUpdater);
                }
            }
            C213412m c213412m3 = this.A06;
            while (true) {
                C213612o c213612o2 = (C213612o) atomicReferenceFieldUpdater.get(c213412m3);
                if (c213612o2.A04()) {
                    break;
                } else {
                    C1E0.A00(c213412m3, c213612o2, C213612o.A01(c213612o2, C213612o.A00(c213612o2)), atomicReferenceFieldUpdater);
                }
            }
            while (true) {
                if (c71423Ig2 != null) {
                    c1e5 = c71423Ig2.A01(true);
                    if (c1e5 != null) {
                        continue;
                        A01(c1e5);
                    }
                }
                c1e5 = (C1E5) c213412m3.A01();
                if (c1e5 == null && (c1e5 = (C1E5) c213412m2.A01()) == null) {
                    break;
                }
                A01(c1e5);
            }
            if (c71423Ig2 != null) {
                c71423Ig2.A03(C05F.A0Y);
            }
            A0A.set(this, 0L);
            atomicLongFieldUpdater.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        A05(runnable, AbstractC212912g.A07, false);
    }

    public final String toString() {
        StringBuilder sb;
        char c;
        ArrayList arrayList = new ArrayList();
        C213712p c213712p = this.A04;
        int length = c213712p.array.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < length; i6++) {
            C71423Ig c71423Ig = (C71423Ig) c213712p.A00(i6);
            if (c71423Ig != null) {
                C71453Ij c71453Ij = c71423Ig.A06;
                Object obj = C71453Ij.A04.get(c71453Ij);
                int i7 = C71453Ij.A03.get(c71453Ij) - C71453Ij.A02.get(c71453Ij);
                if (obj != null) {
                    i7++;
                }
                int intValue = c71423Ig.A03.intValue();
                if (intValue != 2) {
                    if (intValue != 1) {
                        if (intValue != 0) {
                            if (intValue != 3) {
                                if (intValue == 4) {
                                    i5++;
                                }
                            } else {
                                i4++;
                                if (i7 > 0) {
                                    sb = new StringBuilder();
                                    sb.append(i7);
                                    c = 'd';
                                }
                            }
                        } else {
                            i++;
                            sb = new StringBuilder();
                            sb.append(i7);
                            c = 'c';
                        }
                    } else {
                        i2++;
                        sb = new StringBuilder();
                        sb.append(i7);
                        c = 'b';
                    }
                    sb.append(c);
                    arrayList.add(sb.toString());
                } else {
                    i3++;
                }
            }
        }
        long j = A09.get(this);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.A03);
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[Pool Size {core = ");
        int i8 = this.A00;
        sb2.append(i8);
        sb2.append(", max = ");
        sb2.append(this.A01);
        sb2.append("}, Worker States {CPU = ");
        sb2.append(i);
        sb2.append(", blocking = ");
        sb2.append(i2);
        sb2.append(", parked = ");
        sb2.append(i3);
        sb2.append(", dormant = ");
        sb2.append(i4);
        sb2.append(", terminated = ");
        sb2.append(i5);
        sb2.append("}, running workers queues = ");
        sb2.append(arrayList);
        sb2.append(", global CPU queue size = ");
        sb2.append(this.A06.A00());
        sb2.append(", global blocking queue size = ");
        sb2.append(this.A05.A00());
        sb2.append(", Control State {created workers= ");
        sb2.append((int) (2097151 & j));
        sb2.append(", blocking tasks = ");
        sb2.append((int) ((4398044413952L & j) >> 21));
        sb2.append(", CPUs acquired = ");
        sb2.append(i8 - ((int) ((9223367638808264704L & j) >> 42)));
        sb2.append("}]");
        return sb2.toString();
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.12n, X.12m] */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.12n, X.12m] */
    /* JADX WARN: Type inference failed for: r1v8, types: [X.12p, java.lang.Object] */
    public ExecutorC213312l(int i, int i2, String str, long j) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
        this.A03 = str;
        if (i >= 1) {
            if (i2 >= i) {
                if (i2 <= 2097150) {
                    if (j > 0) {
                        this.A06 = new C213512n(false);
                        this.A05 = new C213512n(false);
                        ?? obj = new Object();
                        obj.array = new AtomicReferenceArray((i + 1) * 2);
                        this.A04 = obj;
                        this.controlState$volatile = i << 42;
                        this._isTerminated$volatile = 0;
                        return;
                    }
                    throw new IllegalArgumentException(AnonymousClass001.A0e("Idle worker keep alive time ", " must be positive", j));
                }
                throw new IllegalArgumentException(AnonymousClass001.A0c("Max pool size ", " should not exceed maximal supported number of threads 2097150", i2));
            }
            throw new IllegalArgumentException(AnonymousClass001.A02(i2, i, "Max pool size ", " should be greater than or equals to core pool size "));
        }
        throw new IllegalArgumentException(AnonymousClass001.A0c("Core pool size ", " should be at least 1", i));
    }

    public static final void A01(C1E5 c1e5) {
        try {
            c1e5.run();
        } catch (Throwable th) {
            Thread currentThread = Thread.currentThread();
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
        }
    }

    private final boolean A03(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.A00;
        if (i < i2) {
            int A00 = A00();
            if (A00 == 1) {
                if (i2 > 1) {
                    A00();
                }
                return true;
            }
            if (A00 > 0) {
                return true;
            }
        }
        return false;
    }

    public final void A04() {
        if (!A02() && !A03(A09.get(this))) {
            A02();
        }
    }
}
