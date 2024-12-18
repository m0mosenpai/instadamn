package X;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6JB, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6JB extends AtomicInteger implements InterfaceC42071wx, InterfaceC41801wU {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public InterfaceC41801wU A04;
    public Queue A05;
    public final int A06;
    public final int A07;
    public final InterfaceC42071wx A08;
    public final C6D4 A09;
    public final C6JD A0A = new AtomicReference();
    public final AtomicReference A0B;
    public volatile InterfaceC137386Kj A0C;
    public volatile boolean A0D;
    public volatile boolean A0E;
    public static final C6JC[] A0G = new C6JC[0];
    public static final C6JC[] A0F = new C6JC[0];

    /* JADX WARN: Code restructure failed: missing block: B:100:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0094, code lost:
    
        if (r1 != null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a6, code lost:
    
        r1 = r5.A04;
        r0 = r5.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00aa, code lost:
    
        if (r1 == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ac, code lost:
    
        if (r0 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b2, code lost:
    
        if (r0.isEmpty() == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b4, code lost:
    
        A03(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bb, code lost:
    
        if (A04() == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d3, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bd, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d5, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d7, code lost:
    
        if (r8 == r9) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d9, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00da, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00dc, code lost:
    
        if (r4 >= r9) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00de, code lost:
    
        r14.A00 = r8;
        r14.A02 = r10[r8].A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e6, code lost:
    
        if (r11 != 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e8, code lost:
    
        if (r7 != Integer.MAX_VALUE) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ea, code lost:
    
        r1 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ec, code lost:
    
        if (r11 != 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ee, code lost:
    
        monitor-enter(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ef, code lost:
    
        r0 = (X.InterfaceC42061ww) r14.A05.poll();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f7, code lost:
    
        if (r0 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f9, code lost:
    
        r14.A01--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0104, code lost:
    
        r11 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0101, code lost:
    
        A02(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0096, code lost:
    
        r0 = r1.poll();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x009a, code lost:
    
        if (r0 == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x009c, code lost:
    
        r2.DVo(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00a3, code lost:
    
        if (A04() == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00a5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00be, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00bf, code lost:
    
        X.AbstractC62281S5a.A00(r1);
        X.C6KP.A01(r5);
        X.Y4X.A02(r1, r14.A0A);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00ce, code lost:
    
        if (A04() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00d0, code lost:
    
        A03(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0004 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01() {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6JB.A01():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (decrementAndGet() == 0) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(X.InterfaceC42061ww r7) {
        /*
            r6 = this;
        L0:
            boolean r0 = r7 instanceof java.util.concurrent.Callable
            if (r0 == 0) goto L8c
            java.util.concurrent.Callable r7 = (java.util.concurrent.Callable) r7
            r2 = 1
            java.lang.Object r4 = r7.call()     // Catch: java.lang.Throwable -> L51
            if (r4 == 0) goto L5d
            int r1 = r6.get()
            r0 = 0
            if (r1 != 0) goto L26
            boolean r0 = r6.compareAndSet(r0, r2)
            if (r0 == 0) goto L26
            X.1wx r0 = r6.A08
            r0.DVo(r4)
            int r0 = r6.decrementAndGet()
            if (r0 != 0) goto L6e
            goto L5d
        L26:
            X.6Kj r3 = r6.A0C
            if (r3 != 0) goto L3a
            int r1 = r6.A07
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r0) goto L4b
            int r0 = r6.A06
            X.6Km r3 = new X.6Km
            r3.<init>(r0)
        L38:
            r6.A0C = r3
        L3a:
            boolean r0 = r3.offer(r4)
            if (r0 != 0) goto L67
            java.lang.String r1 = "Scalar queue full?!"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            r6.onError(r0)
            goto L5d
        L4b:
            X.9Gt r3 = new X.9Gt
            r3.<init>(r1)
            goto L38
        L51:
            r1 = move-exception
            X.AbstractC62281S5a.A00(r1)
            X.6JD r0 = r6.A0A
            X.Y4X.A02(r1, r0)
            r6.A00()
        L5d:
            int r1 = r6.A07
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r0) goto L6d
            r1 = 0
            monitor-enter(r6)
            goto L72
        L67:
            int r0 = r6.getAndIncrement()
            if (r0 == 0) goto L6e
        L6d:
            return
        L6e:
            r6.A01()
            goto L5d
        L72:
            java.util.Queue r0 = r6.A05     // Catch: java.lang.Throwable -> L89
            java.lang.Object r7 = r0.poll()     // Catch: java.lang.Throwable -> L89
            X.1ww r7 = (X.InterfaceC42061ww) r7     // Catch: java.lang.Throwable -> L89
            if (r7 != 0) goto L82
            int r0 = r6.A01     // Catch: java.lang.Throwable -> L89
            int r0 = r0 - r2
            r6.A01 = r0     // Catch: java.lang.Throwable -> L89
            r1 = 1
        L82:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L89
            if (r1 == 0) goto L0
            r6.A00()
            return
        L89:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L89
            throw r0
        L8c:
            long r2 = r6.A03
            r0 = 1
            long r0 = r0 + r2
            r6.A03 = r0
            X.6JC r5 = new X.6JC
            r5.<init>(r6, r2)
        L98:
            java.util.concurrent.atomic.AtomicReference r4 = r6.A0B
            java.lang.Object r3 = r4.get()
            X.6JC[] r3 = (X.C6JC[]) r3
            X.6JC[] r0 = X.C6JB.A0F
            r2 = 0
            if (r3 != r0) goto La9
            X.C6KP.A01(r5)
            return
        La9:
            int r1 = r3.length
            int r0 = r1 + 1
            X.6JC[] r0 = new X.C6JC[r0]
            java.lang.System.arraycopy(r3, r2, r0, r2, r1)
            r0[r1] = r5
            boolean r0 = X.C1EM.A00(r3, r0, r4)
            if (r0 == 0) goto L98
            r7.EpF(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6JB.A02(X.1ww):void");
    }

    public final void A03(C6JC c6jc) {
        AtomicReference atomicReference;
        C6JC[] c6jcArr;
        C6JC[] c6jcArr2;
        do {
            atomicReference = this.A0B;
            c6jcArr = (C6JC[]) atomicReference.get();
            int length = c6jcArr.length;
            if (length != 0) {
                int i = 0;
                while (c6jcArr[i] != c6jc) {
                    i++;
                    if (i >= length) {
                        return;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        c6jcArr2 = A0G;
                    } else {
                        c6jcArr2 = new C6JC[length - 1];
                        System.arraycopy(c6jcArr, 0, c6jcArr2, 0, i);
                        System.arraycopy(c6jcArr, i + 1, c6jcArr2, i, (length - i) - 1);
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!C1EM.A00(c6jcArr, c6jcArr2, atomicReference));
    }

    public final boolean A04() {
        if (!this.A0D) {
            C6JD c6jd = this.A0A;
            if (c6jd.get() != null) {
                A05();
                Throwable A01 = Y4X.A01(c6jd);
                if (A01 != Y4X.A00) {
                    this.A08.onError(A01);
                }
            } else {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean A05() {
        C6JC[] c6jcArr;
        this.A04.dispose();
        AtomicReference atomicReference = this.A0B;
        Object obj = atomicReference.get();
        Object obj2 = A0F;
        if (obj == obj2 || (c6jcArr = (C6JC[]) atomicReference.getAndSet(obj2)) == obj2) {
            return false;
        }
        for (C6JJ c6jj : c6jcArr) {
            C6KP.A01(c6jj);
        }
        return true;
    }

    @Override // X.InterfaceC42071wx
    public final void DVo(Object obj) {
        if (!this.A0E) {
            try {
                Object apply = this.A09.apply(obj);
                AbstractC42141x4.A01(apply, "The mapper returned a null ObservableSource");
                InterfaceC42061ww interfaceC42061ww = (InterfaceC42061ww) apply;
                int i = this.A07;
                if (i != Integer.MAX_VALUE) {
                    synchronized (this) {
                        int i2 = this.A01;
                        if (i2 == i) {
                            this.A05.offer(interfaceC42061ww);
                            return;
                        }
                        this.A01 = i2 + 1;
                    }
                }
                A02(interfaceC42061ww);
            } catch (Throwable th) {
                AbstractC62281S5a.A00(th);
                this.A04.dispose();
                onError(th);
            }
        }
    }

    @Override // X.InterfaceC42071wx
    public final void Dpc(InterfaceC41801wU interfaceC41801wU) {
        if (C6KP.A02(this.A04, interfaceC41801wU)) {
            this.A04 = interfaceC41801wU;
            this.A08.Dpc(this);
        }
    }

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        Throwable A01;
        if (!this.A0D) {
            this.A0D = true;
            if (A05() && (A01 = Y4X.A01(this.A0A)) != null && A01 != Y4X.A00) {
                AbstractC142886co.A02(A01);
            }
        }
    }

    @Override // X.InterfaceC42071wx
    public final void onComplete() {
        if (!this.A0E) {
            this.A0E = true;
            A00();
        }
    }

    @Override // X.InterfaceC42071wx
    public final void onError(Throwable th) {
        if (!this.A0E && Y4X.A02(th, this.A0A)) {
            this.A0E = true;
            A00();
        } else {
            AbstractC142886co.A02(th);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.6JD, java.util.concurrent.atomic.AtomicReference] */
    public C6JB(InterfaceC42071wx interfaceC42071wx, C6D4 c6d4, int i, int i2) {
        this.A08 = interfaceC42071wx;
        this.A09 = c6d4;
        this.A07 = i;
        this.A06 = i2;
        if (i != Integer.MAX_VALUE) {
            this.A05 = new ArrayDeque(i);
        }
        this.A0B = new AtomicReference(A0G);
    }

    public final void A00() {
        if (getAndIncrement() == 0) {
            A01();
        }
    }
}
