package X;

import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.1Ip, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C24721Ip implements InterfaceC24731Iq {
    public final int A00;
    public volatile /* synthetic */ Object _closeCause$volatile;
    public volatile /* synthetic */ long bufferEnd$volatile;
    public volatile /* synthetic */ Object bufferEndSegment$volatile;
    public volatile /* synthetic */ Object closeHandler$volatile;
    public volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    public volatile /* synthetic */ Object receiveSegment$volatile;
    public volatile /* synthetic */ long receivers$volatile;
    public volatile /* synthetic */ Object sendSegment$volatile;
    public volatile /* synthetic */ long sendersAndCloseStatus$volatile;
    public static final /* synthetic */ AtomicLongFieldUpdater A04 = AtomicLongFieldUpdater.newUpdater(C24721Ip.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater A03 = AtomicLongFieldUpdater.newUpdater(C24721Ip.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater A01 = AtomicLongFieldUpdater.newUpdater(C24721Ip.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater A02 = AtomicLongFieldUpdater.newUpdater(C24721Ip.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A09 = AtomicReferenceFieldUpdater.newUpdater(C24721Ip.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A08 = AtomicReferenceFieldUpdater.newUpdater(C24721Ip.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A06 = AtomicReferenceFieldUpdater.newUpdater(C24721Ip.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A05 = AtomicReferenceFieldUpdater.newUpdater(C24721Ip.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A07 = AtomicReferenceFieldUpdater.newUpdater(C24721Ip.class, Object.class, "closeHandler$volatile");

    public C24721Ip(int i) {
        long j;
        this.A00 = i;
        if (i >= 0) {
            int i2 = AbstractC24761It.A01;
            if (i != 0) {
                if (i != Integer.MAX_VALUE) {
                    j = i;
                } else {
                    j = Long.MAX_VALUE;
                }
            } else {
                j = 0;
            }
            this.bufferEnd$volatile = j;
            this.completedExpandBuffersAndPauseFlag$volatile = A01.get(this);
            C1Iu c1Iu = new C1Iu(this, null, 3, 0L);
            this.sendSegment$volatile = c1Iu;
            this.receiveSegment$volatile = c1Iu;
            if (A0C()) {
                c1Iu = AbstractC24761It.A02;
                C14360o3.A0C(c1Iu, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment$volatile = c1Iu;
            this._closeCause$volatile = AbstractC24761It.A0C;
            return;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0c("Invalid channel capacity: ", ", should be >=0", i));
    }

    public boolean A0L() {
        return false;
    }

    @Override // X.InterfaceC24741Ir
    public final boolean AID(Throwable th) {
        return A0M(th, false);
    }

    @Override // X.InterfaceC24751Is
    public final Object E8b(InterfaceC23621Ds interfaceC23621Ds) {
        return A02(interfaceC23621Ds, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r12.A0A(r13, null, r10) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A00(java.lang.Object r9, java.lang.Object r10, X.C24721Ip r11, X.C1Iu r12, int r13, long r14, boolean r16) {
        /*
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r12.A01
            int r1 = r13 * 2
            r2.set(r1, r9)
            if (r16 != 0) goto L37
            int r4 = r1 + 1
            java.lang.Object r5 = r2.get(r4)
            r3 = 1
            if (r5 != 0) goto L22
            boolean r0 = r11.A0D(r14)
            r4 = 0
            if (r0 == 0) goto L5d
            X.0zt r0 = X.AbstractC24761It.A03
            boolean r0 = r12.A0A(r13, r4, r0)
            if (r0 == 0) goto L37
            return r3
        L22:
            boolean r0 = r5 instanceof X.InterfaceC24871Jm
            if (r0 == 0) goto L37
            r0 = 0
            r2.set(r1, r0)
            boolean r0 = r11.A0E(r5, r9)
            if (r0 == 0) goto Lb8
            X.0zt r0 = X.AbstractC24761It.A07
            r2.set(r4, r0)
            r8 = 0
            return r8
        L37:
            int r4 = r1 + 1
            java.lang.Object r6 = r2.get(r4)
            r8 = 0
            r3 = 1
            if (r6 != 0) goto L67
            boolean r0 = r11.A0D(r14)
            r3 = 0
            if (r0 == 0) goto L54
            if (r16 != 0) goto L86
            X.0zt r0 = X.AbstractC24761It.A03
            boolean r0 = r12.A0A(r13, r3, r0)
        L50:
            if (r0 == 0) goto L37
            r8 = 1
            return r8
        L54:
            if (r16 != 0) goto L86
            if (r10 == 0) goto L93
            boolean r0 = r12.A0A(r13, r3, r10)
            goto L63
        L5d:
            if (r10 == 0) goto L93
            boolean r0 = r12.A0A(r13, r4, r10)
        L63:
            if (r0 == 0) goto L37
            r8 = 2
            return r8
        L67:
            X.0zt r0 = X.AbstractC24761It.A0B
            if (r6 != r0) goto L72
            X.0zt r0 = X.AbstractC24761It.A03
            boolean r0 = r12.A0A(r13, r6, r0)
            goto L50
        L72:
            X.0zt r7 = X.AbstractC24761It.A09
            if (r6 == r7) goto Lb3
            X.0zt r0 = X.AbstractC24761It.A0E
            if (r6 == r0) goto Lb3
            X.0zt r5 = X.AbstractC24761It.A04
            r0 = 0
            if (r6 != r5) goto L95
            r2.set(r1, r0)
            r11.CRR()
            goto L91
        L86:
            X.0zt r0 = X.AbstractC24761It.A0A
            boolean r0 = r12.A0A(r13, r3, r0)
            if (r0 == 0) goto L37
            r12.A05()
        L91:
            r8 = 4
            return r8
        L93:
            r8 = 3
            return r8
        L95:
            r2.set(r1, r0)
            boolean r0 = r6 instanceof X.C51O
            if (r0 == 0) goto La0
            X.51O r6 = (X.C51O) r6
            X.1Jm r6 = r6.A00
        La0:
            boolean r0 = r11.A0E(r6, r9)
            if (r0 == 0) goto Lac
            X.0zt r0 = X.AbstractC24761It.A07
            r2.set(r4, r0)
            return r8
        Lac:
            java.lang.Object r0 = r2.getAndSet(r4, r7)
            if (r0 == r7) goto Lc3
            goto Lc0
        Lb3:
            r0 = 0
            r2.set(r1, r0)
            goto Lc3
        Lb8:
            X.0zt r1 = X.AbstractC24761It.A09
            java.lang.Object r0 = r2.getAndSet(r4, r1)
            if (r0 == r1) goto Lc3
        Lc0:
            r12.A09(r13, r3)
        Lc3:
            r8 = 5
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24721Ip.A00(java.lang.Object, java.lang.Object, X.1Ip, X.1Iu, int, long, boolean):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
    
        r10.A08();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b0, code lost:
    
        return X.AbstractC24761It.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009c, code lost:
    
        if (r9 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009e, code lost:
    
        r0 = r11.A0A(r12, r6, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a9, code lost:
    
        if (r1 != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0042, code lost:
    
        if (r11.A0A(r12, r5, X.AbstractC24761It.A07) != false) goto L15;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x009e -> B:7:0x0022). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(java.lang.Object r9, X.C24721Ip r10, X.C1Iu r11, int r12, long r13) {
        /*
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r11.A01
            int r3 = r12 * 2
            int r2 = r3 + 1
            java.lang.Object r5 = r4.get(r2)
            if (r5 != 0) goto L2a
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X.C24721Ip.A04
            long r6 = r0.get(r10)
            r0 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r6 = r6 & r0
            int r0 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r0 < 0) goto L42
            if (r9 == 0) goto Lb1
            boolean r0 = r11.A0A(r12, r5, r9)
        L22:
            if (r0 == 0) goto L42
            r10.A08()
            X.0zt r1 = X.AbstractC24761It.A0H
            return r1
        L2a:
            X.0zt r0 = X.AbstractC24761It.A03
            if (r5 != r0) goto L42
            X.0zt r0 = X.AbstractC24761It.A07
            boolean r0 = r11.A0A(r12, r5, r0)
        L34:
            if (r0 == 0) goto L42
        L36:
            r10.A08()
            java.lang.Object r1 = r4.get(r3)
            r0 = 0
            r4.set(r3, r0)
            return r1
        L42:
            java.lang.Object r6 = r4.get(r2)
            if (r6 == 0) goto L83
            X.0zt r0 = X.AbstractC24761It.A0B
            if (r6 == r0) goto L83
            X.0zt r0 = X.AbstractC24761It.A03
            if (r6 != r0) goto L57
            X.0zt r0 = X.AbstractC24761It.A07
            boolean r0 = r11.A0A(r12, r6, r0)
            goto L34
        L57:
            X.0zt r5 = X.AbstractC24761It.A0A
            if (r6 == r5) goto Lae
            X.0zt r0 = X.AbstractC24761It.A0E
            if (r6 == r0) goto Lae
            X.0zt r0 = X.AbstractC24761It.A04
            if (r6 == r0) goto Lab
            X.0zt r0 = X.AbstractC24761It.A0F
            if (r6 == r0) goto L42
            X.0zt r0 = X.AbstractC24761It.A0G
            boolean r0 = r11.A0A(r12, r6, r0)
            if (r0 == 0) goto L42
            boolean r1 = r6 instanceof X.C51O
            if (r1 == 0) goto L77
            X.51O r6 = (X.C51O) r6
            X.1Jm r6 = r6.A00
        L77:
            boolean r0 = r10.A0F(r6, r11, r12)
            if (r0 == 0) goto La3
            X.0zt r0 = X.AbstractC24761It.A07
            r4.set(r2, r0)
            goto L36
        L83:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X.C24721Ip.A04
            long r7 = r0.get(r10)
            r0 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r7 = r7 & r0
            int r0 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r0 >= 0) goto L9c
            X.0zt r0 = X.AbstractC24761It.A0E
            boolean r0 = r11.A0A(r12, r6, r0)
            if (r0 == 0) goto L42
            goto Lab
        L9c:
            if (r9 == 0) goto Lb1
            boolean r0 = r11.A0A(r12, r6, r9)
            goto L22
        La3:
            r4.set(r2, r5)
            r11.A05()
            if (r1 == 0) goto Lae
        Lab:
            r10.A08()
        Lae:
            X.0zt r1 = X.AbstractC24761It.A08
            return r1
        Lb1:
            X.0zt r1 = X.AbstractC24761It.A0I
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24721Ip.A01(java.lang.Object, X.1Ip, X.1Iu, int, long):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object A02(X.InterfaceC23621Ds r17, X.C24721Ip r18) {
        /*
            r3 = r17
            boolean r0 = r3 instanceof X.B54
            r8 = r18
            if (r0 == 0) goto L8f
            r13 = r3
            X.B54 r13 = (X.B54) r13
            int r2 = r13.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8f
            int r2 = r2 - r1
            r13.A00 = r2
        L16:
            java.lang.Object r1 = r13.A01
            X.1JX r5 = X.C1JX.A02
            int r0 = r13.A00
            r4 = 1
            if (r0 == 0) goto L29
            if (r0 != r4) goto L95
            X.AbstractC09560e7.A00(r1)
            X.2QV r1 = (X.C2QV) r1
            java.lang.Object r1 = r1.A00
        L28:
            return r1
        L29:
            X.AbstractC09560e7.A00(r1)
            r7 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C24721Ip.A08
            java.lang.Object r9 = r0.get(r8)
            X.1Iu r9 = (X.C1Iu) r9
        L35:
            boolean r0 = r8.CRQ()
            if (r0 == 0) goto L49
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C24721Ip.A05
            java.lang.Object r0 = r0.get(r8)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            X.3zd r1 = new X.3zd
            r1.<init>(r0)
            return r1
        L49:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X.C24721Ip.A03
            long r11 = r0.getAndIncrement(r8)
            int r0 = X.AbstractC24761It.A01
            long r0 = (long) r0
            long r2 = r11 / r0
            long r0 = r11 % r0
            int r10 = (int) r0
            long r0 = r9.A00
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L64
            X.1Iu r0 = A06(r8, r9, r2)
            if (r0 == 0) goto L35
            r9 = r0
        L64:
            java.lang.Object r1 = A01(r7, r8, r9, r10, r11)
            X.0zt r0 = X.AbstractC24761It.A0H
            if (r1 == r0) goto La1
            X.0zt r0 = X.AbstractC24761It.A08
            if (r1 != r0) goto L7c
            long r1 = r8.A0H()
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 >= 0) goto L35
            r9.A01()
            goto L35
        L7c:
            X.0zt r0 = X.AbstractC24761It.A0I
            if (r1 != r0) goto L9d
            r13.A00 = r4
            r14 = r8
            r15 = r9
            r16 = r10
            r17 = r11
            java.lang.Object r1 = A03(r13, r14, r15, r16, r17)
            if (r1 != r5) goto L28
            return r5
        L8f:
            X.B54 r13 = new X.B54
            r13.<init>(r3, r8)
            goto L16
        L95:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L9d:
            r9.A01()
            return r1
        La1:
            java.lang.String r1 = "unexpected"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24721Ip.A02(X.1Ds, X.1Ip):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A03(X.InterfaceC23621Ds r10, X.C24721Ip r11, X.C1Iu r12, int r13, long r14) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24721Ip.A03(X.1Ds, X.1Ip, X.1Iu, int, long):java.lang.Object");
    }

    public static final Throwable A04(C24721Ip c24721Ip) {
        Throwable th = (Throwable) A05.get(c24721Ip);
        if (th == null) {
            return new NoSuchElementException("Channel was closed");
        }
        return th;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x010e, code lost:
    
        r0 = (X.C1Iu) ((X.C13D) X.C13D.A01.get(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0118, code lost:
    
        if (r0 != null) goto L90;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.C1Iu A05(long r12) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24721Ip.A05(long):X.1Iu");
    }

    public static final C1Iu A06(C24721Ip c24721Ip, C1Iu c1Iu, long j) {
        Object A00;
        boolean z;
        long j2;
        long j3;
        long A0H;
        C1Iu c1Iu2 = c1Iu;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A08;
        int i = AbstractC24761It.A01;
        C96474Vg c96474Vg = C96474Vg.A00;
        loop0: while (true) {
            A00 = C3JN.A00(c96474Vg, c1Iu2, j);
            z = true;
            if (A00 == C3JN.A00) {
                break;
            }
            z = false;
            C13C A002 = AbstractC96484Vh.A00(A00);
            while (true) {
                C13C c13c = (C13C) atomicReferenceFieldUpdater.get(c24721Ip);
                if (c13c.A00 >= A002.A00) {
                    break loop0;
                }
                if (A002.A08()) {
                    if (C1E0.A00(c24721Ip, c13c, A002, atomicReferenceFieldUpdater)) {
                        if (c13c.A07()) {
                            c13c.A02();
                        }
                    } else if (A002.A07()) {
                        A002.A02();
                    }
                }
            }
        }
        if (z) {
            c24721Ip.CRR();
            j2 = ((C13C) c1Iu2).A00 * AbstractC24761It.A01;
            A0H = c24721Ip.A0H();
        } else {
            c1Iu2 = (C1Iu) AbstractC96484Vh.A00(A00);
            if (!c24721Ip.A0C() && j <= A01.get(c24721Ip) / AbstractC24761It.A01) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = A06;
                while (true) {
                    C13C c13c2 = (C13C) atomicReferenceFieldUpdater2.get(c24721Ip);
                    if (c13c2.A00 >= ((C13C) c1Iu2).A00 || !c1Iu2.A08()) {
                        break;
                    }
                    if (C1E0.A00(c24721Ip, c13c2, c1Iu2, atomicReferenceFieldUpdater2)) {
                        if (c13c2.A07()) {
                            c13c2.A02();
                        }
                    } else if (c1Iu2.A07()) {
                        c1Iu2.A02();
                    }
                }
            }
            long j4 = ((C13C) c1Iu2).A00;
            if (j4 > j) {
                j2 = j4 * AbstractC24761It.A01;
                AtomicLongFieldUpdater atomicLongFieldUpdater = A03;
                do {
                    j3 = atomicLongFieldUpdater.get(c24721Ip);
                    if (j3 >= j2) {
                        break;
                    }
                } while (!atomicLongFieldUpdater.compareAndSet(c24721Ip, j3, j2));
                A0H = c24721Ip.A0H();
            } else {
                return c1Iu2;
            }
        }
        if (j2 < A0H) {
            c1Iu2.A01();
        }
        return null;
    }

    public static final C1Iu A07(C24721Ip c24721Ip, C1Iu c1Iu, long j) {
        Object A00;
        boolean z;
        long j2;
        long j3;
        long j4;
        long j5;
        C1Iu c1Iu2 = c1Iu;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A09;
        int i = AbstractC24761It.A01;
        C96474Vg c96474Vg = C96474Vg.A00;
        loop0: while (true) {
            A00 = C3JN.A00(c96474Vg, c1Iu2, j);
            z = true;
            if (A00 == C3JN.A00) {
                break;
            }
            z = false;
            C13C A002 = AbstractC96484Vh.A00(A00);
            while (true) {
                C13C c13c = (C13C) atomicReferenceFieldUpdater.get(c24721Ip);
                if (c13c.A00 >= A002.A00) {
                    break loop0;
                }
                if (A002.A08()) {
                    if (C1E0.A00(c24721Ip, c13c, A002, atomicReferenceFieldUpdater)) {
                        if (c13c.A07()) {
                            c13c.A02();
                        }
                    } else if (A002.A07()) {
                        A002.A02();
                    }
                }
            }
        }
        if (z) {
            c24721Ip.CRR();
            j2 = ((C13C) c1Iu2).A00 * AbstractC24761It.A01;
            j5 = A03.get(c24721Ip);
        } else {
            c1Iu2 = (C1Iu) AbstractC96484Vh.A00(A00);
            long j6 = ((C13C) c1Iu2).A00;
            if (j6 > j) {
                j2 = j6 * AbstractC24761It.A01;
                AtomicLongFieldUpdater atomicLongFieldUpdater = A04;
                do {
                    j3 = atomicLongFieldUpdater.get(c24721Ip);
                    j4 = 1152921504606846975L & j3;
                    if (j4 >= j2) {
                        break;
                    }
                } while (!atomicLongFieldUpdater.compareAndSet(c24721Ip, j3, (((int) (j3 >> 60)) << 60) + j4));
                j5 = A03.get(c24721Ip);
            } else {
                return c1Iu2;
            }
        }
        if (j2 < j5) {
            c1Iu2.A01();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a1, code lost:
    
        r3 = (X.C1Iu) X.AbstractC96484Vh.A00(r13);
        r0 = ((X.C13C) r3).A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ab, code lost:
    
        if (r0 <= r6) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ad, code lost:
    
        r4 = r4 * r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b8, code lost:
    
        if (r11.compareAndSet(r19, r17 + 1, r4) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ba, code lost:
    
        r4 = r4 - r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c7, code lost:
    
        r8 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e1, code lost:
    
        if (r17 >= X.C24721Ip.A03.get(r19)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e9, code lost:
    
        if (r8.A0A(r4, r2, X.AbstractC24761It.A0F) == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ef, code lost:
    
        if (A0F(r2, r8, r4) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0152, code lost:
    
        r3.set(r1, X.AbstractC24761It.A0A);
        r8.A05();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f1, code lost:
    
        r3.set(r1, X.AbstractC24761It.A03);
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0108 -> B:47:0x00e3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A08() {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24721Ip.A08():void");
    }

    private final void A09(InterfaceC24871Jm interfaceC24871Jm, boolean z) {
        Object c09540e5;
        InterfaceC23621Ds interfaceC23621Ds;
        Object c2qv;
        Throwable A0I;
        if (interfaceC24871Jm instanceof InterfaceC24901Jp) {
            interfaceC23621Ds = (InterfaceC23621Ds) interfaceC24871Jm;
            if (z) {
                A0I = A04(this);
            } else {
                A0I = A0I();
            }
            C14360o3.A0B(A0I, 0);
            c2qv = new C09540e5(A0I);
        } else if (interfaceC24871Jm instanceof C27331Ul) {
            interfaceC23621Ds = ((C27331Ul) interfaceC24871Jm).A00;
            c2qv = new C2QV(new C89973zd((Throwable) A05.get(this)));
        } else {
            if (interfaceC24871Jm instanceof C24861Jl) {
                C24861Jl c24861Jl = (C24861Jl) interfaceC24871Jm;
                C24891Jo c24891Jo = c24861Jl.A01;
                C14360o3.A0A(c24891Jo);
                c24861Jl.A01 = null;
                c24861Jl.A00 = AbstractC24761It.A04;
                Throwable th = (Throwable) A05.get(c24861Jl.A02);
                if (th == null) {
                    c09540e5 = false;
                } else {
                    c09540e5 = new C09540e5(th);
                }
                c24891Jo.resumeWith(c09540e5);
                return;
            }
            if (interfaceC24871Jm instanceof C2QS) {
                C2QS.A00(this, AbstractC24761It.A04, (C2QS) interfaceC24871Jm);
                return;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected waiter: ");
                sb.append(interfaceC24871Jm);
                throw new IllegalStateException(sb.toString());
            }
        }
        interfaceC23621Ds.resumeWith(c2qv);
    }

    public static final void A0A(C24721Ip c24721Ip, C2QS c2qs) {
        C1Iu c1Iu = (C1Iu) A08.get(c24721Ip);
        while (!c24721Ip.CRQ()) {
            long andIncrement = A03.getAndIncrement(c24721Ip);
            long j = AbstractC24761It.A01;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (((C13C) c1Iu).A00 != j2) {
                C1Iu A062 = A06(c24721Ip, c1Iu, j2);
                if (A062 != null) {
                    c1Iu = A062;
                } else {
                    continue;
                }
            }
            Object A012 = A01(c2qs, c24721Ip, c1Iu, i, andIncrement);
            if (A012 == AbstractC24761It.A0H) {
                if (!(c2qs instanceof InterfaceC24871Jm) || c2qs == null) {
                    return;
                }
                c2qs.CPB(c1Iu, i);
                return;
            }
            if (A012 == AbstractC24761It.A08) {
                if (andIncrement < c24721Ip.A0H()) {
                    c1Iu.A01();
                }
            } else {
                if (A012 != AbstractC24761It.A0I) {
                    c1Iu.A01();
                    c2qs.A01 = A012;
                    return;
                }
                throw new IllegalStateException("unexpected");
            }
        }
        c2qs.A01 = AbstractC24761It.A04;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0010, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.13C] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.13C] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A0B(X.C1Iu r8, long r9) {
        /*
            r7 = this;
        L0:
            long r1 = r8.A00
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 >= 0) goto L10
            X.13D r0 = r8.A00()
            X.13C r0 = (X.C13C) r0
            if (r0 == 0) goto L10
            r8 = r0
            goto L0
        L10:
            boolean r0 = r8.A03()
            if (r0 == 0) goto L20
            X.13D r0 = r8.A00()
            X.13C r0 = (X.C13C) r0
            if (r0 == 0) goto L20
            r8 = r0
            goto L10
        L20:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = X.C24721Ip.A06
        L22:
            java.lang.Object r5 = r6.get(r7)
            X.13C r5 = (X.C13C) r5
            long r3 = r5.A00
            long r1 = r8.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L45
            boolean r0 = r8.A08()
            if (r0 == 0) goto L10
            boolean r0 = X.C1E0.A00(r7, r5, r8, r6)
            if (r0 == 0) goto L46
            boolean r0 = r5.A07()
            if (r0 == 0) goto L45
            r5.A02()
        L45:
            return
        L46:
            boolean r0 = r8.A07()
            if (r0 == 0) goto L22
            r8.A02()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24721Ip.A0B(X.1Iu, long):void");
    }

    private final boolean A0C() {
        long j = A01.get(this);
        if (j != 0 && j != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }

    private final boolean A0D(long j) {
        if (j >= A01.get(this) && j >= A03.get(this) + this.A00) {
            return false;
        }
        return true;
    }

    private final boolean A0E(Object obj, Object obj2) {
        InterfaceC24901Jp interfaceC24901Jp;
        Object F8r;
        if (obj instanceof C2QS) {
            if (C2QS.A00(this, obj2, (C2QS) obj) != 0) {
                return false;
            }
        } else {
            if (obj instanceof C27331Ul) {
                C14360o3.A0C(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
                interfaceC24901Jp = ((C27331Ul) obj).A00;
                C2QV c2qv = new C2QV(obj2);
                int i = AbstractC24761It.A01;
                F8r = interfaceC24901Jp.F8r(c2qv, null, null);
                if (F8r == null) {
                    return false;
                }
            } else if (obj instanceof C24861Jl) {
                C14360o3.A0C(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
                C24861Jl c24861Jl = (C24861Jl) obj;
                interfaceC24901Jp = c24861Jl.A01;
                C14360o3.A0A(interfaceC24901Jp);
                c24861Jl.A01 = null;
                c24861Jl.A00 = obj2;
                int i2 = AbstractC24761It.A01;
                F8r = interfaceC24901Jp.F8r(true, null, null);
                if (F8r == null) {
                    return false;
                }
            } else if (obj instanceof InterfaceC24901Jp) {
                C14360o3.A0C(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
                interfaceC24901Jp = (InterfaceC24901Jp) obj;
                int i3 = AbstractC24761It.A01;
                F8r = interfaceC24901Jp.F8r(obj2, null, null);
                if (F8r == null) {
                    return false;
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected receiver type: ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString());
            }
            interfaceC24901Jp.AIl(F8r);
        }
        return true;
    }

    private final boolean A0F(Object obj, C1Iu c1Iu, int i) {
        Integer num;
        if (obj instanceof InterfaceC24901Jp) {
            C14360o3.A0C(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            InterfaceC24901Jp interfaceC24901Jp = (InterfaceC24901Jp) obj;
            C0eB c0eB = C0eB.A00;
            int i2 = AbstractC24761It.A01;
            Object F8r = interfaceC24901Jp.F8r(c0eB, null, null);
            if (F8r != null) {
                interfaceC24901Jp.AIl(F8r);
                return true;
            }
            return false;
        }
        if (obj instanceof C2QS) {
            C14360o3.A0C(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            int A00 = C2QS.A00(this, C0eB.A00, (C2QS) obj);
            if (A00 != 0) {
                if (A00 != 1) {
                    if (A00 != 2) {
                        num = C05F.A0N;
                    } else {
                        num = C05F.A0C;
                    }
                } else {
                    num = C05F.A01;
                }
            } else {
                num = C05F.A00;
            }
            if (num == C05F.A01) {
                c1Iu.A01.set(i * 2, null);
            }
            if (num == C05F.A00) {
                return true;
            }
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected waiter: ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        r2.A05();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0051, code lost:
    
        r2.A01.set(r8 * 2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00b9, code lost:
    
        r2 = (X.C1Iu) ((X.C13D) X.C13D.A01.get(r2));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A0G(X.C24721Ip r16, long r17, boolean r19) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24721Ip.A0G(X.1Ip, long, boolean):boolean");
    }

    public final long A0H() {
        return A04.get(this) & 1152921504606846975L;
    }

    public final Throwable A0I() {
        Throwable th = (Throwable) A05.get(this);
        if (th == null) {
            return new IllegalStateException("Channel was closed");
        }
        return th;
    }

    public final void A0J(long j) {
        C1Iu c1Iu = (C1Iu) A08.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = A03;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(this.A00 + j2, A01.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j2, j2 + 1)) {
                long j3 = AbstractC24761It.A01;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (((C13C) c1Iu).A00 != j4) {
                    C1Iu A062 = A06(this, c1Iu, j4);
                    if (A062 != null) {
                        c1Iu = A062;
                    }
                }
                if (A01(null, this, c1Iu, i, j2) != AbstractC24761It.A08 || j2 < A0H()) {
                    c1Iu.A01();
                }
            }
        }
    }

    public final void A0K(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        long j3;
        if (A0C()) {
            return;
        }
        do {
            atomicLongFieldUpdater = A01;
        } while (atomicLongFieldUpdater.get(this) <= j);
        int i = AbstractC24761It.A00;
        for (int i2 = 0; i2 < i; i2++) {
            long j4 = atomicLongFieldUpdater.get(this);
            if (j4 == (A02.get(this) & 4611686018427387903L) && j4 == atomicLongFieldUpdater.get(this)) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = A02;
        do {
            j2 = atomicLongFieldUpdater2.get(this);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j2, AbstractC63330She.MAX_SIGNED_POWER_OF_TWO + (j2 & 4611686018427387903L)));
        while (true) {
            long j5 = atomicLongFieldUpdater.get(this);
            long j6 = atomicLongFieldUpdater2.get(this);
            long j7 = j6 & 4611686018427387903L;
            boolean z = false;
            if ((AbstractC63330She.MAX_SIGNED_POWER_OF_TWO & j6) != 0) {
                z = true;
            }
            if (j5 == j7 && j5 == atomicLongFieldUpdater.get(this)) {
                break;
            } else if (!z) {
                atomicLongFieldUpdater2.compareAndSet(this, j6, AbstractC63330She.MAX_SIGNED_POWER_OF_TWO + j7);
            }
        }
        do {
            j3 = atomicLongFieldUpdater2.get(this);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j3, j3 & 4611686018427387903L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if (r18 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        r12 = r10.get(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if (r10.compareAndSet(r16, r12, (3 << 60) + (1152921504606846975L & r12)) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        CRR();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        if (r8 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        r3 = X.C24721Ip.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        r1 = r3.get(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r1 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        r0 = X.AbstractC24761It.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if (X.C1E0.A00(r16, r1, r0, r3) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        if (r1 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        X.C15500q5.A06(r1, 1);
        ((X.InterfaceC16660sJ) r1).invoke(r2.get(r16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
    
        r0 = X.AbstractC24761It.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
    
        r12 = r10.get(r16);
        r1 = (int) (r12 >> 60);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
    
        if (r1 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0081, code lost:
    
        if (r1 != 1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0083, code lost:
    
        r3 = r12 & 1152921504606846975L;
        r0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008f, code lost:
    
        if (r10.compareAndSet(r16, r12, (r0 << 60) + r3) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0092, code lost:
    
        r3 = r12 & 1152921504606846975L;
        r0 = 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0M(java.lang.Throwable r17, boolean r18) {
        /*
            r16 = this;
            r9 = r16
            if (r18 == 0) goto L23
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = X.C24721Ip.A04
        L6:
            long r10 = r8.get(r9)
            r3 = 60
            long r1 = r10 >> r3
            int r0 = (int) r1
            if (r0 != 0) goto L23
            r1 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r1 = r1 & r10
            int r0 = X.AbstractC24761It.A01
            r12 = 1
            long r12 = r12 << r3
            long r12 = r12 + r1
            boolean r0 = r8.compareAndSet(r9, r10, r12)
            if (r0 == 0) goto L6
        L23:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = X.C24721Ip.A05
            X.0zt r0 = X.AbstractC24761It.A0C
            r1 = r17
            boolean r8 = X.C1E0.A00(r9, r0, r1, r2)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r10 = X.C24721Ip.A04
            if (r18 == 0) goto L70
        L31:
            long r12 = r10.get(r9)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r3 = r3 & r12
            r14 = 3
            r0 = 60
            long r14 = r14 << r0
            long r14 = r14 + r3
            r11 = r9
            boolean r0 = r10.compareAndSet(r11, r12, r14)
            if (r0 == 0) goto L31
        L48:
            r9.CRR()
            if (r8 == 0) goto L6c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = X.C24721Ip.A07
        L4f:
            java.lang.Object r1 = r3.get(r9)
            if (r1 != 0) goto L6d
            X.0zt r0 = X.AbstractC24761It.A05
        L57:
            boolean r0 = X.C1E0.A00(r9, r1, r0, r3)
            if (r0 == 0) goto L4f
            if (r1 == 0) goto L6c
            r0 = 1
            X.C15500q5.A06(r1, r0)
            X.0sJ r1 = (X.InterfaceC16660sJ) r1
            java.lang.Object r0 = r2.get(r9)
            r1.invoke(r0)
        L6c:
            return r8
        L6d:
            X.0zt r0 = X.AbstractC24761It.A06
            goto L57
        L70:
            long r12 = r10.get(r9)
            r7 = 60
            long r3 = r12 >> r7
            int r1 = (int) r3
            r5 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r1 == 0) goto L92
            r0 = 1
            if (r1 != r0) goto L48
            long r3 = r12 & r5
            r0 = 3
        L86:
            long r0 = (long) r0
            long r0 = r0 << r7
            long r0 = r0 + r3
            r11 = r9
            r14 = r0
            boolean r0 = r10.compareAndSet(r11, r12, r14)
            if (r0 == 0) goto L70
            goto L48
        L92:
            long r3 = r12 & r5
            r0 = 2
            goto L86
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24721Ip.A0M(java.lang.Throwable, boolean):boolean");
    }

    @Override // X.InterfaceC24751Is
    public final void AGH(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        A0M(cancellationException, true);
    }

    @Override // X.InterfaceC24751Is
    public final C3EL BYn() {
        C3EI c3ei = C3EI.A00;
        C14360o3.A0C(c3ei, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        C15500q5.A06(c3ei, 3);
        C3EK c3ek = C3EK.A00;
        C14360o3.A0C(c3ek, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        C15500q5.A06(c3ek, 3);
        return new C3EL(this, c3ei, c3ek);
    }

    @Override // X.InterfaceC24751Is
    public final C3EL BYo() {
        C189378aE c189378aE = C189378aE.A00;
        C14360o3.A0C(c189378aE, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        C15500q5.A06(c189378aE, 3);
        C189388aF c189388aF = C189388aF.A00;
        C14360o3.A0C(c189388aF, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        C15500q5.A06(c189388aF, 3);
        return new C3EL(this, c189378aE, c189388aF);
    }

    @Override // X.InterfaceC24741Ir
    public final void CPC(InterfaceC16660sJ interfaceC16660sJ) {
        C20730zt c20730zt;
        C20730zt c20730zt2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A07;
        if (C1E0.A00(this, null, interfaceC16660sJ, atomicReferenceFieldUpdater)) {
            return;
        }
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            c20730zt = AbstractC24761It.A05;
            c20730zt2 = AbstractC24761It.A06;
            if (obj != c20730zt) {
                if (obj == c20730zt2) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Another handler is already registered: ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString());
            }
        } while (!C1E0.A00(this, c20730zt, c20730zt2, atomicReferenceFieldUpdater));
        interfaceC16660sJ.invoke(A05.get(this));
    }

    @Override // X.InterfaceC24751Is
    public final boolean CRQ() {
        return A0G(this, A04.get(this), true);
    }

    @Override // X.InterfaceC24741Ir
    public final boolean CRR() {
        return A0G(this, A04.get(this), false);
    }

    @Override // X.InterfaceC24751Is
    public final C24861Jl CgS() {
        return new C24861Jl(this);
    }

    @Override // X.InterfaceC24751Is
    public final Object E8a(InterfaceC23621Ds interfaceC23621Ds) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A08;
        C1Iu c1Iu = (C1Iu) atomicReferenceFieldUpdater.get(this);
        while (!CRQ()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = A03;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j = AbstractC24761It.A01;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (((C13C) c1Iu).A00 != j2) {
                C1Iu A062 = A06(this, c1Iu, j2);
                if (A062 != null) {
                    c1Iu = A062;
                } else {
                    continue;
                }
            }
            Object A012 = A01(null, this, c1Iu, i, andIncrement);
            C20730zt c20730zt = AbstractC24761It.A0H;
            if (A012 != c20730zt) {
                C20730zt c20730zt2 = AbstractC24761It.A08;
                if (A012 == c20730zt2) {
                    if (andIncrement < A0H()) {
                        c1Iu.A01();
                    }
                } else {
                    C20730zt c20730zt3 = AbstractC24761It.A0I;
                    if (A012 == c20730zt3) {
                        C24891Jo A00 = AbstractC24881Jn.A00(C1E2.A02(interfaceC23621Ds));
                        try {
                            Object A013 = A01(A00, this, c1Iu, i, andIncrement);
                            if (A013 == c20730zt) {
                                A00.CPB(c1Iu, i);
                            } else {
                                InterfaceC24871Jm interfaceC24871Jm = null;
                                if (A013 == c20730zt2) {
                                    if (andIncrement < A0H()) {
                                        c1Iu.A01();
                                    }
                                    C1Iu c1Iu2 = (C1Iu) atomicReferenceFieldUpdater.get(this);
                                    while (true) {
                                        if (CRQ()) {
                                            Throwable A042 = A04(this);
                                            C14360o3.A0B(A042, 0);
                                            A00.resumeWith(new C09540e5(A042));
                                            break;
                                        }
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                        long j3 = andIncrement2 / j;
                                        int i2 = (int) (andIncrement2 % j);
                                        if (((C13C) c1Iu2).A00 != j3) {
                                            C1Iu A063 = A06(this, c1Iu2, j3);
                                            if (A063 != null) {
                                                c1Iu2 = A063;
                                            } else {
                                                continue;
                                            }
                                        }
                                        A013 = A01(A00, this, c1Iu2, i2, andIncrement2);
                                        if (A013 == c20730zt) {
                                            if (A00 instanceof InterfaceC24871Jm) {
                                                interfaceC24871Jm = A00;
                                            }
                                            if (interfaceC24871Jm != null) {
                                                interfaceC24871Jm.CPB(c1Iu2, i2);
                                            }
                                        } else if (A013 == c20730zt2) {
                                            if (andIncrement2 < A0H()) {
                                                c1Iu2.A01();
                                            }
                                        } else if (A013 != c20730zt3) {
                                            c1Iu2.A01();
                                        } else {
                                            throw new IllegalStateException("unexpected");
                                        }
                                    }
                                } else {
                                    c1Iu.A01();
                                }
                                A00.EKh(null, A013);
                            }
                            return A00.A0E();
                        } catch (Throwable th) {
                            A00.A0J();
                            throw th;
                        }
                    }
                    c1Iu.A01();
                    return A012;
                }
            } else {
                throw new IllegalStateException("unexpected");
            }
        }
        Throwable A043 = A04(this);
        StackTraceElement stackTraceElement = S8E.A00;
        throw A043;
    }

    @Override // X.InterfaceC24741Ir
    public Object EMz(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        C1Iu c1Iu;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A09;
        C1Iu c1Iu2 = (C1Iu) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = A04;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j = 1152921504606846975L & andIncrement;
            boolean A0G = A0G(this, andIncrement, false);
            int i = AbstractC24761It.A01;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (((C13C) c1Iu2).A00 != j3) {
                C1Iu A072 = A07(this, c1Iu2, j3);
                if (A072 == null) {
                    if (A0G) {
                        break;
                    }
                } else {
                    c1Iu2 = A072;
                }
            }
            int A00 = A00(obj, null, this, c1Iu2, i2, j, A0G);
            if (A00 != 0) {
                if (A00 == 1) {
                    break;
                }
                if (A00 != 2) {
                    if (A00 != 3) {
                        if (A00 != 4) {
                            c1Iu2.A01();
                        } else if (j < A03.get(this)) {
                            c1Iu2.A01();
                        }
                    } else {
                        C24891Jo A002 = AbstractC24881Jn.A00(C1E2.A02(interfaceC23621Ds));
                        try {
                            int A003 = A00(obj, A002, this, c1Iu2, i2, j, false);
                            if (A003 != 0) {
                                if (A003 != 1) {
                                    if (A003 != 2) {
                                        if (A003 != 4) {
                                            if (A003 == 5) {
                                                c1Iu2.A01();
                                                C1Iu c1Iu3 = (C1Iu) atomicReferenceFieldUpdater.get(this);
                                                while (true) {
                                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                                    long j4 = andIncrement2 & 1152921504606846975L;
                                                    boolean A0G2 = A0G(this, andIncrement2, false);
                                                    long j5 = j4 / j2;
                                                    int i3 = (int) (j4 % j2);
                                                    if (((C13C) c1Iu3).A00 != j5) {
                                                        c1Iu = A07(this, c1Iu3, j5);
                                                        if (c1Iu == null) {
                                                            if (A0G2) {
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        c1Iu = c1Iu3;
                                                    }
                                                    int A004 = A00(obj, A002, this, c1Iu, i3, j4, A0G2);
                                                    if (A004 != 0) {
                                                        if (A004 != 1) {
                                                            if (A004 != 2) {
                                                                if (A004 != 3) {
                                                                    if (A004 != 4) {
                                                                        c1Iu.A01();
                                                                        c1Iu3 = c1Iu;
                                                                    } else if (j4 < A03.get(this)) {
                                                                        c1Iu.A01();
                                                                    }
                                                                } else {
                                                                    throw new IllegalStateException("unexpected");
                                                                }
                                                            } else if (!A0G2) {
                                                                C24891Jo c24891Jo = null;
                                                                if (A002 instanceof InterfaceC24871Jm) {
                                                                    c24891Jo = A002;
                                                                }
                                                                if (c24891Jo != null) {
                                                                    c24891Jo.CPB(c1Iu, i3 + i);
                                                                }
                                                            } else {
                                                                c1Iu.A05();
                                                            }
                                                        } else {
                                                            obj3 = C0eB.A00;
                                                            break;
                                                        }
                                                    } else {
                                                        c1Iu.A01();
                                                        obj3 = C0eB.A00;
                                                        break;
                                                    }
                                                }
                                            } else {
                                                throw new IllegalStateException("unexpected");
                                            }
                                        } else if (j < A03.get(this)) {
                                            c1Iu2.A01();
                                        }
                                        Throwable A0I = A0I();
                                        C14360o3.A0B(A0I, 0);
                                        obj3 = new C09540e5(A0I);
                                    } else {
                                        A002.CPB(c1Iu2, i2 + i);
                                    }
                                    obj2 = A002.A0E();
                                } else {
                                    obj3 = C0eB.A00;
                                }
                            } else {
                                c1Iu2.A01();
                                obj3 = C0eB.A00;
                            }
                            A002.resumeWith(obj3);
                            obj2 = A002.A0E();
                        } catch (Throwable th) {
                            A002.A0J();
                            throw th;
                        }
                    }
                } else if (A0G) {
                    c1Iu2.A05();
                }
            } else {
                c1Iu2.A01();
                break;
            }
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C24891Jo.A02;
        C24891Jo c24891Jo2 = new C24891Jo(1, C1E2.A02(interfaceC23621Ds));
        c24891Jo2.A0I();
        Throwable A0I2 = A0I();
        C14360o3.A0B(A0I2, 0);
        c24891Jo2.resumeWith(new C09540e5(A0I2));
        obj2 = c24891Jo2.A0E();
        C1JX c1jx = C1JX.A02;
        if (obj2 != c1jx) {
            obj2 = C0eB.A00;
        }
        if (obj2 == c1jx) {
            return obj2;
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC24751Is
    public final Object F8q() {
        InterfaceC24871Jm interfaceC24871Jm;
        AtomicLongFieldUpdater atomicLongFieldUpdater = A03;
        long j = atomicLongFieldUpdater.get(this);
        long j2 = A04.get(this);
        if (!A0G(this, j2, true)) {
            if (j < (j2 & 1152921504606846975L)) {
                Object obj = AbstractC24761It.A09;
                C1Iu c1Iu = (C1Iu) A08.get(this);
                while (!CRQ()) {
                    long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
                    long j3 = AbstractC24761It.A01;
                    long j4 = andIncrement / j3;
                    int i = (int) (andIncrement % j3);
                    if (((C13C) c1Iu).A00 != j4) {
                        C1Iu A062 = A06(this, c1Iu, j4);
                        if (A062 != null) {
                            c1Iu = A062;
                        } else {
                            continue;
                        }
                    }
                    Object A012 = A01(obj, this, c1Iu, i, andIncrement);
                    if (A012 == AbstractC24761It.A0H) {
                        if ((obj instanceof InterfaceC24871Jm) && (interfaceC24871Jm = (InterfaceC24871Jm) obj) != null) {
                            interfaceC24871Jm.CPB(c1Iu, i);
                        }
                        A0K(andIncrement);
                        c1Iu.A05();
                    } else if (A012 == AbstractC24761It.A08) {
                        if (andIncrement < A0H()) {
                            c1Iu.A01();
                        }
                    } else {
                        if (A012 != AbstractC24761It.A0I) {
                            c1Iu.A01();
                            return A012;
                        }
                        throw new IllegalStateException("unexpected");
                    }
                }
            }
            return C2QV.A01;
        }
        return new C89973zd((Throwable) A05.get(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a5, code lost:
    
        return X.C0eB.A00;
     */
    @Override // X.InterfaceC24741Ir
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object F8s(java.lang.Object r17) {
        /*
            r16 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r7 = X.C24721Ip.A04
            r10 = r16
            long r2 = r7.get(r10)
            r6 = 0
            boolean r0 = A0G(r10, r2, r6)
            if (r0 != 0) goto L20
            r0 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r2 = r2 & r0
            boolean r0 = r10.A0D(r2)
            r0 = r0 ^ 1
            if (r0 == 0) goto L20
        L1d:
            X.2QW r0 = X.C2QV.A01
            return r0
        L20:
            X.0zt r9 = X.AbstractC24761It.A0A
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C24721Ip.A09
            java.lang.Object r4 = r0.get(r10)
            X.1Iu r4 = (X.C1Iu) r4
        L2a:
            long r0 = r7.getAndIncrement(r10)
            r2 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r13 = r0 & r2
            boolean r15 = A0G(r10, r0, r6)
            int r5 = X.AbstractC24761It.A01
            long r2 = (long) r5
            long r0 = r13 / r2
            long r2 = r13 % r2
            int r12 = (int) r2
            long r2 = r4.A00
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 == 0) goto L59
            X.1Iu r11 = A07(r10, r4, r0)
            if (r11 != 0) goto L5a
            if (r15 == 0) goto L2a
        L4f:
            java.lang.Throwable r1 = r10.A0I()
            X.3zd r0 = new X.3zd
            r0.<init>(r1)
            return r0
        L59:
            r11 = r4
        L5a:
            r8 = r17
            int r1 = A00(r8, r9, r10, r11, r12, r13, r15)
            if (r1 == 0) goto La0
            r0 = 1
            if (r1 == r0) goto La3
            r0 = 2
            if (r1 == r0) goto L81
            r0 = 3
            if (r1 == r0) goto L97
            r0 = 4
            if (r1 == r0) goto L73
            r11.A01()
            r4 = r11
            goto L2a
        L73:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X.C24721Ip.A03
            long r1 = r0.get(r10)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 >= 0) goto L4f
            r11.A01()
            goto L4f
        L81:
            if (r15 == 0) goto L87
            r11.A05()
            goto L4f
        L87:
            boolean r0 = r9 instanceof X.InterfaceC24871Jm
            if (r0 == 0) goto L93
            X.1Jm r9 = (X.InterfaceC24871Jm) r9
            if (r9 == 0) goto L93
            int r12 = r12 + r5
            r9.CPB(r11, r12)
        L93:
            r11.A05()
            goto L1d
        L97:
            java.lang.String r1 = "unexpected"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        La0:
            r11.A01()
        La3:
            X.0eB r0 = X.C0eB.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24721Ip.F8s(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01a5, code lost:
    
        r6 = (X.C1Iu) r6.A00();
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24721Ip.toString():java.lang.String");
    }
}
