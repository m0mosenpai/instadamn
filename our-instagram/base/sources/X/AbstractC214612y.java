package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* renamed from: X.12y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC214612y extends AbstractC214712z implements InterfaceC214312v {
    public volatile /* synthetic */ Object _delayed$volatile;
    public volatile /* synthetic */ int _isCompleted$volatile = 0;
    public volatile /* synthetic */ Object _queue$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater A02 = AtomicReferenceFieldUpdater.newUpdater(AbstractC214612y.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A01 = AtomicReferenceFieldUpdater.newUpdater(AbstractC214612y.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater A00 = AtomicIntegerFieldUpdater.newUpdater(AbstractC214612y.class, "_isCompleted$volatile");

    /* JADX WARN: Code restructure failed: missing block: B:22:0x001d, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A01(java.lang.Runnable r7) {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = X.AbstractC214612y.A02
        L2:
            java.lang.Object r5 = r4.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.AbstractC214612y.A00
            int r1 = r0.get(r6)
            r0 = 0
            if (r1 == 0) goto L10
            r0 = 1
        L10:
            r1 = 0
            if (r0 != 0) goto L4f
            r3 = 1
            if (r5 != 0) goto L1e
            r0 = 0
            boolean r0 = X.C1E0.A00(r6, r0, r7, r4)
        L1b:
            if (r0 == 0) goto L2
        L1d:
            return r3
        L1e:
            boolean r0 = r5 instanceof X.C213612o
            if (r0 == 0) goto L39
            r2 = r5
            X.12o r2 = (X.C213612o) r2
            int r0 = r2.A02(r7)
            if (r0 == 0) goto L1d
            if (r0 != r3) goto L4f
            long r0 = X.C213612o.A00(r2)
            X.12o r0 = X.C213612o.A01(r2, r0)
            X.C1E0.A00(r6, r5, r0, r4)
            goto L2
        L39:
            X.0zt r0 = X.C2SZ.A00
            if (r5 == r0) goto L4f
            r1 = 8
            X.12o r0 = new X.12o
            r0.<init>(r1, r3)
            r0.A02(r5)
            r0.A02(r7)
            boolean r0 = X.C1E0.A00(r6, r5, r0, r4)
            goto L1b
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC214612y.A01(java.lang.Runnable):boolean");
    }

    @Override // X.AnonymousClass130
    public void A07() {
        boolean A002;
        InterfaceC90023zi interfaceC90023zi;
        C2SU.A00.set(null);
        A00.set(this, 1);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A02;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                A002 = C1E0.A00(this, null, C2SZ.A00, atomicReferenceFieldUpdater);
            } else if (obj instanceof C213612o) {
                ((C213612o) obj).A04();
                break;
            } else {
                if (obj == C2SZ.A00) {
                    break;
                }
                C213612o c213612o = new C213612o(8, true);
                c213612o.A02(obj);
                A002 = C1E0.A00(this, obj, c213612o, atomicReferenceFieldUpdater);
            }
            if (A002) {
                break;
            }
        }
        do {
        } while (A06() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            C2SY c2sy = (C2SY) A01.get(this);
            if (c2sy != null) {
                synchronized (c2sy) {
                    if (C2SY.A01.get(c2sy) > 0) {
                        interfaceC90023zi = c2sy.A02(0);
                    } else {
                        interfaceC90023zi = null;
                    }
                }
                AbstractRunnableC90013zh abstractRunnableC90013zh = (AbstractRunnableC90013zh) interfaceC90023zi;
                if (abstractRunnableC90013zh != null) {
                    A0C(abstractRunnableC90013zh, nanoTime);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        if (((int) ((1073741823 & r4) >> 0)) == ((int) ((r4 & 1152921503533105152L) >> 30))) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long A0D() {
        /*
            r11 = this;
            X.01U r0 = r11.A01
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 == 0) goto L11
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L11
            r1 = 0
        L11:
            r9 = 0
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 == 0) goto L70
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.AbstractC214612y.A02
            java.lang.Object r1 = r0.get(r11)
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r1 == 0) goto L41
            boolean r0 = r1 instanceof X.C213612o
            if (r0 == 0) goto L6b
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X.C213612o.A05
            long r4 = r0.get(r1)
            r7 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r7 = r7 & r4
            r0 = 0
            long r7 = r7 >> r0
            int r6 = (int) r7
            r0 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r0
            r0 = 30
            long r4 = r4 >> r0
            int r0 = (int) r4
            if (r6 != r0) goto L70
        L41:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.AbstractC214612y.A01
            java.lang.Object r4 = r0.get(r11)
            X.2SY r4 = (X.C2SY) r4
            if (r4 == 0) goto L6a
            monitor-enter(r4)
            X.3zi[] r1 = r4.A00     // Catch: java.lang.Throwable -> L54
            if (r1 == 0) goto L57
            r0 = 0
            r0 = r1[r0]     // Catch: java.lang.Throwable -> L54
            goto L58
        L54:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L57:
            r0 = 0
        L58:
            monitor-exit(r4)
            X.3zh r0 = (X.AbstractRunnableC90013zh) r0
            if (r0 == 0) goto L6a
            long r2 = r0.A01
            long r0 = java.lang.System.nanoTime()
            long r2 = r2 - r0
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 >= 0) goto L6a
            r2 = 0
        L6a:
            return r2
        L6b:
            X.0zt r0 = X.C2SZ.A00
            if (r1 != r0) goto L70
            return r2
        L70:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC214612y.A0D():long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0060, code lost:
    
        if ((r7 - r3) > 0) goto L30;
     */
    /* JADX WARN: Type inference failed for: r0v25, types: [X.3zj, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0F(X.AbstractRunnableC90013zh r19, long r20) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC214612y.A0F(X.3zh, long):void");
    }

    public final boolean A0G() {
        boolean z;
        Object obj;
        C01U c01u = this.A01;
        if (c01u != null) {
            z = c01u.isEmpty();
        } else {
            z = true;
        }
        if (z && ((obj = A01.get(this)) == null || C2SY.A01.get(obj) == 0)) {
            Object obj2 = A02.get(this);
            if (obj2 != null) {
                if (obj2 instanceof C213612o) {
                    long j = C213612o.A05.get(obj2);
                    if (((int) ((1073741823 & j) >> 0)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                        return false;
                    }
                    return true;
                }
                if (obj2 == C2SZ.A00) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public C19D CPF(Runnable runnable, C12W c12w, long j) {
        return AbstractC214412w.A00.CPF(runnable, c12w, j);
    }

    @Override // X.InterfaceC214312v
    public final void EM7(final InterfaceC24901Jp interfaceC24901Jp, long j) {
        long j2 = 0;
        if (j > 0) {
            if (j < 9223372036854L) {
                j2 = 1000000 * j;
                if (j2 >= 4611686018427387903L) {
                    return;
                }
            } else {
                return;
            }
        }
        long nanoTime = System.nanoTime();
        final long j3 = j2 + nanoTime;
        AbstractRunnableC90013zh abstractRunnableC90013zh = new AbstractRunnableC90013zh(interfaceC24901Jp, this, j3) { // from class: X.3zg
            public final InterfaceC24901Jp A00;
            public final /* synthetic */ AbstractC214612y A01;

            {
                this.A01 = this;
                super.A01 = j3;
                super.A00 = -1;
                this.A00 = interfaceC24901Jp;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.A00.EKp(C0eB.A00, this.A01);
            }

            @Override // X.AbstractRunnableC90013zh
            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(super.toString());
                sb.append(this.A00);
                return sb.toString();
            }
        };
        A0F(abstractRunnableC90013zh, nanoTime);
        interfaceC24901Jp.CPA(new C50152Se(abstractRunnableC90013zh));
    }

    @Override // X.AnonymousClass130
    public final long A06() {
        Runnable runnable;
        InterfaceC90023zi interfaceC90023zi;
        InterfaceC90023zi interfaceC90023zi2;
        if (A0A()) {
            return 0L;
        }
        C2SY c2sy = (C2SY) A01.get(this);
        if (c2sy != null && C2SY.A01.get(c2sy) != 0) {
            long nanoTime = System.nanoTime();
            do {
                synchronized (c2sy) {
                    InterfaceC90023zi[] interfaceC90023ziArr = c2sy.A00;
                    if (interfaceC90023ziArr != null) {
                        interfaceC90023zi = interfaceC90023ziArr[0];
                    } else {
                        interfaceC90023zi = null;
                    }
                    interfaceC90023zi2 = null;
                    if (interfaceC90023zi != null) {
                        AbstractRunnableC90013zh abstractRunnableC90013zh = (AbstractRunnableC90013zh) interfaceC90023zi;
                        if (nanoTime - abstractRunnableC90013zh.A01 >= 0 && A01(abstractRunnableC90013zh)) {
                            interfaceC90023zi2 = c2sy.A02(0);
                        }
                    }
                }
            } while (interfaceC90023zi2 != null);
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A02;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                break;
            }
            if (obj instanceof C213612o) {
                C213612o c213612o = (C213612o) obj;
                Object A03 = c213612o.A03();
                if (A03 != C213612o.A04) {
                    runnable = (Runnable) A03;
                    break;
                }
                C1E0.A00(this, obj, C213612o.A01(c213612o, C213612o.A00(c213612o)), atomicReferenceFieldUpdater);
            } else {
                if (obj == C2SZ.A00) {
                    break;
                }
                if (C1E0.A00(this, obj, null, atomicReferenceFieldUpdater)) {
                    runnable = (Runnable) obj;
                    break;
                }
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        return A0D();
    }

    public void A0E(Runnable runnable) {
        if (A01(runnable)) {
            Thread A0B = A0B();
            if (Thread.currentThread() != A0B) {
                LockSupport.unpark(A0B);
                return;
            }
            return;
        }
        RunnableC214512x.A00.A0E(runnable);
    }

    @Override // X.C12T
    public final void A05(Runnable runnable, C12W c12w) {
        A0E(runnable);
    }
}
