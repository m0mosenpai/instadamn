package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* renamed from: X.3Ig, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71423Ig extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A08 = AtomicIntegerFieldUpdater.newUpdater(C71423Ig.class, "workerCtl$volatile");
    public int A00;
    public long A01;
    public long A02;
    public Integer A03;
    public boolean A04;
    public final C15370ps A05;
    public final C71453Ij A06;
    public final /* synthetic */ ExecutorC213312l A07;
    public volatile int indexInArray;
    public volatile Object nextParkedWorker;
    public volatile /* synthetic */ int workerCtl$volatile;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0ps, java.lang.Object] */
    public C71423Ig(ExecutorC213312l executorC213312l, int i) {
        this.A07 = executorC213312l;
        setDaemon(true);
        setContextClassLoader(executorC213312l.getClass().getClassLoader());
        this.A06 = new C71453Ij();
        this.A05 = new Object();
        this.A03 = C05F.A0N;
        this.nextParkedWorker = ExecutorC213312l.A07;
        this.A00 = AbstractC50712Us.A01.A03();
        A02(i);
    }

    private final C1E5 A00() {
        C213412m c213412m;
        int i = this.A00;
        int i2 = i ^ (i << 13);
        int i3 = i2 ^ (i2 >> 17);
        int i4 = i3 ^ (i3 << 5);
        this.A00 = i4;
        int i5 = i4 & 1;
        ExecutorC213312l executorC213312l = this.A07;
        if (i5 == 0) {
            C1E5 c1e5 = (C1E5) executorC213312l.A06.A01();
            if (c1e5 == null) {
                c213412m = executorC213312l.A05;
            } else {
                return c1e5;
            }
        } else {
            C1E5 c1e52 = (C1E5) executorC213312l.A05.A01();
            if (c1e52 != null) {
                return c1e52;
            }
            c213412m = executorC213312l.A06;
        }
        return (C1E5) c213412m.A01();
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x00ba, code lost:
    
        if (r4 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cd, code lost:
    
        if (r10 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x017f, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x017f, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1E5 A01(boolean r24) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71423Ig.A01(boolean):X.1E5");
    }

    public final void A02(int i) {
        String valueOf;
        String str = this.A07.A03;
        if (i == 0) {
            valueOf = "TERMINATED";
        } else {
            valueOf = String.valueOf(i);
        }
        setName(AnonymousClass001.A0g(str, "-worker-", valueOf));
        this.indexInArray = i;
    }

    public final boolean A03(Integer num) {
        Integer num2 = this.A03;
        boolean z = false;
        if (num2 == C05F.A00) {
            z = true;
            ExecutorC213312l.A09.addAndGet(this.A07, 4398046511104L);
        }
        if (num2 != num) {
            this.A03 = num;
        }
        return z;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long j;
        int i;
        loop0: while (true) {
            boolean z = false;
            while (true) {
                ExecutorC213312l executorC213312l = this.A07;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ExecutorC213312l.A08;
                if (atomicIntegerFieldUpdater.get(executorC213312l) != 0) {
                    break loop0;
                }
                Integer num = this.A03;
                Integer num2 = C05F.A0Y;
                if (num == num2) {
                    break loop0;
                }
                C1E5 A01 = A01(this.A04);
                if (A01 != null) {
                    this.A01 = 0L;
                    int i2 = A01.A01.A00;
                    this.A02 = 0L;
                    if (this.A03 == C05F.A0C) {
                        this.A03 = C05F.A01;
                    }
                    if (i2 != 0 && A03(C05F.A01)) {
                        executorC213312l.A04();
                    }
                    ExecutorC213312l.A01(A01);
                    if (i2 != 0) {
                        ExecutorC213312l.A09.addAndGet(executorC213312l, -2097152L);
                        if (this.A03 != num2) {
                            this.A03 = C05F.A0N;
                        }
                    }
                } else {
                    this.A04 = false;
                    if (this.A01 != 0) {
                        if (!z) {
                            z = true;
                        } else {
                            A03(C05F.A0C);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.A01);
                            this.A01 = 0L;
                            break;
                        }
                    } else {
                        Object obj = this.nextParkedWorker;
                        C20730zt c20730zt = ExecutorC213312l.A07;
                        if (obj != c20730zt) {
                            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = A08;
                            atomicIntegerFieldUpdater2.set(this, -1);
                            while (this.nextParkedWorker != c20730zt && atomicIntegerFieldUpdater2.get(this) == -1 && atomicIntegerFieldUpdater.get(executorC213312l) == 0 && this.A03 != num2) {
                                A03(C05F.A0C);
                                Thread.interrupted();
                                if (this.A02 == 0) {
                                    this.A02 = System.nanoTime() + executorC213312l.A02;
                                }
                                LockSupport.parkNanos(executorC213312l.A02);
                                if (System.nanoTime() - this.A02 >= 0) {
                                    this.A02 = 0L;
                                    C213712p c213712p = executorC213312l.A04;
                                    synchronized (c213712p) {
                                        if (atomicIntegerFieldUpdater.get(executorC213312l) == 0) {
                                            AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC213312l.A09;
                                            if (((int) (atomicLongFieldUpdater.get(executorC213312l) & 2097151)) > executorC213312l.A00 && atomicIntegerFieldUpdater2.compareAndSet(this, -1, 1)) {
                                                int i3 = this.indexInArray;
                                                A02(0);
                                                executorC213312l.A06(this, i3, 0);
                                                int andDecrement = (int) (2097151 & atomicLongFieldUpdater.getAndDecrement(executorC213312l));
                                                if (andDecrement != i3) {
                                                    Object A00 = c213712p.A00(andDecrement);
                                                    C14360o3.A0A(A00);
                                                    C71423Ig c71423Ig = (C71423Ig) A00;
                                                    c213712p.A01(i3, c71423Ig);
                                                    c71423Ig.A02(i3);
                                                    executorC213312l.A06(c71423Ig, andDecrement, i3);
                                                }
                                                c213712p.A01(andDecrement, null);
                                                this.A03 = num2;
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (this.nextParkedWorker == c20730zt) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = ExecutorC213312l.A0A;
                            do {
                                j = atomicLongFieldUpdater2.get(executorC213312l);
                                i = this.indexInArray;
                                this.nextParkedWorker = executorC213312l.A04.A00((int) (2097151 & j));
                            } while (!atomicLongFieldUpdater2.compareAndSet(executorC213312l, j, i | ((2097152 + j) & (-2097152))));
                        }
                    }
                }
            }
        }
        A03(C05F.A0Y);
    }
}
