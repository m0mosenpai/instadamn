package X;

import com.facebook.common.dextricks.Constants;
import com.google.common.collect.RegularImmutableSet;
import java.lang.ref.ReferenceQueue;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.logging.Logger;

/* renamed from: X.8tN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ConcurrentMapC200188tN<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {
    public Collection A00;
    public java.util.Set A01;
    public java.util.Set A02;
    public final int A03 = Math.min(4, Constants.LOAD_RESULT_PGO_ATTEMPTED);
    public final int A04;
    public final int A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final C18M A09;
    public final C18M A0A;
    public final AbstractC95374Qx A0B;
    public final C200158tK A0C;
    public final AbstractC200978ue A0D;
    public final EnumC200308tZ A0E;
    public final EnumC200228tR A0F;
    public final EnumC200228tR A0G;
    public final InterfaceC200298tY A0H;
    public final InterfaceC200278tW A0I;
    public final Queue A0J;
    public final C200398ti[] A0K;
    public static final Logger A0N = Logger.getLogger(ConcurrentMapC200188tN.class.getName());
    public static final InterfaceC200208tP A0L = new InterfaceC200208tP() { // from class: X.8tO
        @Override // X.InterfaceC200208tP
        public final InterfaceC200208tP AKt(InterfaceC200438tm queue, Object value, ReferenceQueue entry) {
            return this;
        }

        @Override // X.InterfaceC200208tP
        public final InterfaceC200438tm B2N() {
            return null;
        }

        @Override // X.InterfaceC200208tP
        public final int CHT() {
            return 0;
        }

        @Override // X.InterfaceC200208tP
        public final void CtT(Object newValue) {
        }

        @Override // X.InterfaceC200208tP
        public final Object FDs() {
            return null;
        }

        @Override // X.InterfaceC200208tP
        public final Object get() {
            return null;
        }

        @Override // X.InterfaceC200208tP
        public final boolean isActive() {
            return false;
        }

        @Override // X.InterfaceC200208tP
        public final boolean isLoading() {
            return false;
        }
    };
    public static final Queue A0M = new AbstractQueue<Object>() { // from class: X.8tQ
        @Override // java.util.Queue
        public final boolean offer(Object o) {
            return true;
        }

        @Override // java.util.Queue
        public final Object peek() {
            return null;
        }

        @Override // java.util.Queue
        public final Object poll() {
            return null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return RegularImmutableSet.A03.iterator();
        }
    };

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r17.A08 > 0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ConcurrentMapC200188tN(X.C200148tJ r18, X.AbstractC200978ue r19) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ConcurrentMapC200188tN.<init>(X.8tJ, X.8ue):void");
    }

    public final int A00(Object key) {
        int A00 = this.A09.A00(key);
        int i = A00 + ((A00 << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = i4 + (i4 << 2) + (i4 << 14);
        return i5 ^ (i5 >>> 16);
    }

    public final C200398ti A01(int hash) {
        return this.A0K[(hash >>> this.A05) & this.A04];
    }

    public final Object A02(Object key) {
        C23543Abx c23543Abx;
        InterfaceC200208tP interfaceC200208tP;
        boolean z;
        Object A06;
        InterfaceC200438tm A02;
        AbstractC200978ue abstractC200978ue = this.A0D;
        key.getClass();
        int A00 = A00(key);
        C200398ti A01 = A01(A00);
        abstractC200978ue.getClass();
        try {
            try {
                try {
                    if (A01.A0C != 0 && (A02 = A01.A02(key, A00)) != null) {
                        ConcurrentMapC200188tN concurrentMapC200188tN = A01.A05;
                        long A002 = concurrentMapC200188tN.A0B.A00();
                        Object A08 = A01.A08(A02, A002);
                        if (A08 != null) {
                            A01.A09.add(A02);
                            long j = concurrentMapC200188tN.A08;
                            if (j > 0) {
                                if (A002 - A02.CHz() > j) {
                                    if (!A02.CEZ().isLoading()) {
                                        A06 = A01.A05(abstractC200978ue, key, A00, true);
                                        if (A06 == null) {
                                        }
                                    }
                                }
                            }
                            A06 = A08;
                        } else {
                            InterfaceC200208tP CEZ = A02.CEZ();
                            if (CEZ.isLoading()) {
                                A06 = A01.A07(CEZ, A02, key);
                            }
                        }
                        return A06;
                    }
                    ConcurrentMapC200188tN concurrentMapC200188tN2 = A01.A05;
                    long A003 = concurrentMapC200188tN2.A0B.A00();
                    A01.A0H(A003);
                    int i = A01.A0C - 1;
                    AtomicReferenceArray atomicReferenceArray = A01.A0D;
                    int length = A00 & (atomicReferenceArray.length() - 1);
                    InterfaceC200438tm interfaceC200438tm = (InterfaceC200438tm) atomicReferenceArray.get(length);
                    InterfaceC200438tm interfaceC200438tm2 = interfaceC200438tm;
                    while (true) {
                        c23543Abx = null;
                        if (interfaceC200438tm2 != null) {
                            Object key2 = interfaceC200438tm2.getKey();
                            if (interfaceC200438tm2.BD2() == A00 && key2 != null && concurrentMapC200188tN2.A09.A01(key, key2)) {
                                interfaceC200208tP = interfaceC200438tm2.CEZ();
                                if (interfaceC200208tP.isLoading()) {
                                    z = false;
                                } else {
                                    A06 = interfaceC200208tP.get();
                                    if (A06 == null) {
                                        A01.A0L(EnumC222499rq.A00, key2, A06, interfaceC200208tP.CHT());
                                    } else if (concurrentMapC200188tN2.A03(interfaceC200438tm2, A003)) {
                                        A01.A0L(EnumC222499rq.A01, key2, A06, interfaceC200208tP.CHT());
                                    } else {
                                        A01.A08.add(interfaceC200438tm2);
                                        A01.unlock();
                                        A01.A0E();
                                    }
                                    A01.A0A.remove(interfaceC200438tm2);
                                    A01.A08.remove(interfaceC200438tm2);
                                    A01.A0C = i;
                                }
                            } else {
                                interfaceC200438tm2 = interfaceC200438tm2.BWn();
                            }
                        } else {
                            interfaceC200208tP = null;
                            break;
                        }
                    }
                    z = true;
                    if (z) {
                        c23543Abx = new C23543Abx();
                        if (interfaceC200438tm2 == null) {
                            interfaceC200438tm2 = concurrentMapC200188tN2.A0E.A01(A01, interfaceC200438tm, key, A00);
                            interfaceC200438tm2.Egk(c23543Abx);
                            atomicReferenceArray.set(length, interfaceC200438tm2);
                        } else {
                            interfaceC200438tm2.Egk(c23543Abx);
                        }
                    }
                    A01.unlock();
                    A01.A0E();
                    if (z) {
                        try {
                            synchronized (interfaceC200438tm2) {
                                A06 = A01.A06(c23543Abx, c23543Abx.A00(abstractC200978ue, key), key, A00);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else {
                        A06 = A01.A07(interfaceC200208tP, interfaceC200438tm2, key);
                    }
                    return A06;
                } catch (Throwable th2) {
                    A01.unlock();
                    A01.A0E();
                    throw th2;
                }
                A01.lock();
            } finally {
                A01.A0D();
            }
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (!(cause instanceof Error)) {
                if (cause instanceof RuntimeException) {
                    throw new RuntimeException(cause);
                }
                throw e;
            }
            throw new Error((Error) cause);
        }
    }

    public final boolean A03(InterfaceC200438tm entry, long now) {
        long j = this.A06;
        if (j > 0 && now - entry.CHz() >= j) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        EnumC222499rq enumC222499rq;
        C200398ti[] c200398tiArr = this.A0K;
        int length = c200398tiArr.length;
        for (int i = 0; i < length; i++) {
            C200398ti c200398ti = c200398tiArr[i];
            if (c200398ti.A0C != 0) {
                c200398ti.lock();
                try {
                    ConcurrentMapC200188tN concurrentMapC200188tN = c200398ti.A05;
                    c200398ti.A0H(concurrentMapC200188tN.A0B.A00());
                    AtomicReferenceArray atomicReferenceArray = c200398ti.A0D;
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        for (InterfaceC200438tm interfaceC200438tm = (InterfaceC200438tm) atomicReferenceArray.get(i2); interfaceC200438tm != null; interfaceC200438tm = interfaceC200438tm.BWn()) {
                            if (interfaceC200438tm.CEZ().isActive()) {
                                Object key = interfaceC200438tm.getKey();
                                Object obj = interfaceC200438tm.CEZ().get();
                                if (key == null || obj == null) {
                                    enumC222499rq = EnumC222499rq.A00;
                                } else {
                                    enumC222499rq = EnumC222499rq.A02;
                                }
                                interfaceC200438tm.BD2();
                                c200398ti.A0L(enumC222499rq, key, obj, interfaceC200438tm.CEZ().CHT());
                            }
                        }
                    }
                    for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                        atomicReferenceArray.set(i3, null);
                    }
                    EnumC200228tR enumC200228tR = concurrentMapC200188tN.A0F;
                    EnumC200228tR enumC200228tR2 = EnumC200228tR.A01;
                    if (enumC200228tR != enumC200228tR2) {
                        do {
                        } while (c200398ti.A06.poll() != null);
                    }
                    if (concurrentMapC200188tN.A0G != enumC200228tR2) {
                        do {
                        } while (c200398ti.A07.poll() != null);
                    }
                    c200398ti.A0A.clear();
                    c200398ti.A08.clear();
                    c200398ti.A0B.set(0);
                    c200398ti.A00++;
                    c200398ti.A0C = 0;
                } finally {
                    c200398ti.unlock();
                    c200398ti.A0E();
                }
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object key) {
        InterfaceC200438tm A03;
        if (key == null) {
            return false;
        }
        int A00 = A00(key);
        C200398ti A01 = A01(A00);
        try {
            boolean z = false;
            if (A01.A0C != 0 && (A03 = A01.A03(key, A00, A01.A05.A0B.A00())) != null) {
                if (A03.CEZ().get() != null) {
                    z = true;
                }
            }
            return z;
        } finally {
            A01.A0D();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object value) {
        if (value == null) {
            return false;
        }
        long A00 = this.A0B.A00();
        C200398ti[] c200398tiArr = this.A0K;
        long j = -1;
        int i = 0;
        do {
            long j2 = 0;
            for (C200398ti c200398ti : c200398tiArr) {
                AtomicReferenceArray atomicReferenceArray = c200398ti.A0D;
                for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                    for (InterfaceC200438tm interfaceC200438tm = (InterfaceC200438tm) atomicReferenceArray.get(i2); interfaceC200438tm != null; interfaceC200438tm = interfaceC200438tm.BWn()) {
                        Object A08 = c200398ti.A08(interfaceC200438tm, A00);
                        if (A08 != null && this.A0A.A01(value, A08)) {
                            return true;
                        }
                    }
                }
                j2 += c200398ti.A00;
            }
            if (j2 == j) {
                return false;
            }
            i++;
            j = j2;
        } while (i < 3);
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        java.util.Set set = this.A01;
        if (set == null) {
            C60751RPu c60751RPu = new C60751RPu(this);
            this.A01 = c60751RPu;
            return c60751RPu;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object key) {
        if (key == null) {
            return null;
        }
        int A00 = A00(key);
        return A01(A00).A09(key, A00);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        C200398ti[] c200398tiArr = this.A0K;
        long j = 0;
        for (C200398ti c200398ti : c200398tiArr) {
            if (c200398ti.A0C != 0) {
                return false;
            }
            j += r1.A00;
        }
        if (j == 0) {
            return true;
        }
        for (C200398ti c200398ti2 : c200398tiArr) {
            if (c200398ti2.A0C != 0) {
                return false;
            }
            j -= r1.A00;
        }
        if (j != 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set keySet() {
        java.util.Set set = this.A02;
        if (set == null) {
            C60752RPv c60752RPv = new C60752RPv(this);
            this.A02 = c60752RPv;
            return c60752RPv;
        }
        return set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        r7 = r9.CEZ();
        r12 = r7.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (r12 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        r10 = X.EnumC222499rq.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        r6.A00++;
        r1 = r6.A00(r7, r8, r9, r10, r11, r12);
        r0 = r6.A0C - 1;
        r3.set(r2, r1);
        r6.A0C = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (r7.isActive() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        r10 = X.EnumC222499rq.A00;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object remove(java.lang.Object r14) {
        /*
            r13 = this;
            if (r14 != 0) goto L4
            r12 = 0
            return r12
        L4:
            int r5 = r13.A00(r14)
            X.8ti r6 = r13.A01(r5)
            r6.lock()
            X.8tN r4 = r6.A05     // Catch: java.lang.Throwable -> L7d
            X.4Qx r0 = r4.A0B     // Catch: java.lang.Throwable -> L7d
            long r0 = r0.A00()     // Catch: java.lang.Throwable -> L7d
            r6.A0H(r0)     // Catch: java.lang.Throwable -> L7d
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r6.A0D     // Catch: java.lang.Throwable -> L7d
            int r0 = r3.length()     // Catch: java.lang.Throwable -> L7d
            int r2 = r0 + (-1)
            r2 = r2 & r5
            java.lang.Object r8 = r3.get(r2)     // Catch: java.lang.Throwable -> L7d
            X.8tm r8 = (X.InterfaceC200438tm) r8     // Catch: java.lang.Throwable -> L7d
            r9 = r8
        L2a:
            r1 = 0
            if (r9 == 0) goto L76
            java.lang.Object r11 = r9.getKey()     // Catch: java.lang.Throwable -> L7d
            int r0 = r9.BD2()     // Catch: java.lang.Throwable -> L7d
            if (r0 != r5) goto L6a
            if (r11 == 0) goto L6a
            X.18M r0 = r4.A09     // Catch: java.lang.Throwable -> L7d
            boolean r0 = r0.A01(r14, r11)     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L6a
            X.8tP r7 = r9.CEZ()     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r12 = r7.get()     // Catch: java.lang.Throwable -> L7d
            if (r12 == 0) goto L61
            X.9rq r10 = X.EnumC222499rq.A02     // Catch: java.lang.Throwable -> L7d
        L4d:
            int r0 = r6.A00     // Catch: java.lang.Throwable -> L7d
            int r0 = r0 + 1
            r6.A00 = r0     // Catch: java.lang.Throwable -> L7d
            X.8tm r1 = r6.A00(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L7d
            int r0 = r6.A0C     // Catch: java.lang.Throwable -> L7d
            int r0 = r0 + (-1)
            r3.set(r2, r1)     // Catch: java.lang.Throwable -> L7d
            r6.A0C = r0     // Catch: java.lang.Throwable -> L7d
            goto L6f
        L61:
            boolean r0 = r7.isActive()     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L76
            X.9rq r10 = X.EnumC222499rq.A00     // Catch: java.lang.Throwable -> L7d
            goto L4d
        L6a:
            X.8tm r9 = r9.BWn()     // Catch: java.lang.Throwable -> L7d
            goto L2a
        L6f:
            r6.unlock()
            r6.A0E()
            return r12
        L76:
            r6.unlock()
            r6.A0E()
            return r1
        L7d:
            r0 = move-exception
            r6.unlock()
            r6.A0E()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ConcurrentMapC200188tN.remove(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b3, code lost:
    
        return false;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean replace(java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
        /*
            r19 = this;
            r6 = r20
            r6.getClass()
            r5 = r22
            r5.getClass()
            r8 = r21
            if (r21 == 0) goto Lb3
            r0 = r19
            int r10 = r0.A00(r6)
            X.8ti r12 = r0.A01(r10)
            r12.lock()
            X.8tN r9 = r12.A05     // Catch: java.lang.Throwable -> La5
            X.4Qx r0 = r9.A0B     // Catch: java.lang.Throwable -> La5
            long r0 = r0.A00()     // Catch: java.lang.Throwable -> La5
            r12.A0H(r0)     // Catch: java.lang.Throwable -> La5
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r12.A0D     // Catch: java.lang.Throwable -> La5
            int r2 = r3.length()     // Catch: java.lang.Throwable -> La5
            r11 = 1
            int r2 = r2 - r11
            r2 = r2 & r10
            java.lang.Object r14 = r3.get(r2)     // Catch: java.lang.Throwable -> La5
            X.8tm r14 = (X.InterfaceC200438tm) r14     // Catch: java.lang.Throwable -> La5
            r15 = r14
        L36:
            if (r15 == 0) goto Lad
            java.lang.Object r7 = r15.getKey()     // Catch: java.lang.Throwable -> La5
            int r4 = r15.BD2()     // Catch: java.lang.Throwable -> La5
            if (r4 != r10) goto L75
            if (r7 == 0) goto L75
            X.18M r4 = r9.A09     // Catch: java.lang.Throwable -> La5
            boolean r4 = r4.A01(r6, r7)     // Catch: java.lang.Throwable -> La5
            if (r4 == 0) goto L75
            X.8tP r13 = r15.CEZ()     // Catch: java.lang.Throwable -> La5
            java.lang.Object r4 = r13.get()     // Catch: java.lang.Throwable -> La5
            if (r4 != 0) goto L7a
            boolean r0 = r13.isActive()     // Catch: java.lang.Throwable -> La5
            if (r0 == 0) goto Lad
            int r0 = r12.A00     // Catch: java.lang.Throwable -> La5
            int r0 = r0 + 1
            r12.A00 = r0     // Catch: java.lang.Throwable -> La5
            X.9rq r16 = X.EnumC222499rq.A00     // Catch: java.lang.Throwable -> La5
            r17 = r7
            r18 = r4
            X.8tm r1 = r12.A00(r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> La5
            int r0 = r12.A0C     // Catch: java.lang.Throwable -> La5
            int r0 = r0 - r11
            r3.set(r2, r1)     // Catch: java.lang.Throwable -> La5
            r12.A0C = r0     // Catch: java.lang.Throwable -> La5
            goto Lad
        L75:
            X.8tm r15 = r15.BWn()     // Catch: java.lang.Throwable -> La5
            goto L36
        L7a:
            X.18M r2 = r9.A0A     // Catch: java.lang.Throwable -> La5
            boolean r2 = r2.A01(r8, r4)     // Catch: java.lang.Throwable -> La5
            if (r2 == 0) goto L9f
            int r2 = r12.A00     // Catch: java.lang.Throwable -> La5
            int r2 = r2 + 1
            r12.A00 = r2     // Catch: java.lang.Throwable -> La5
            int r3 = r13.CHT()     // Catch: java.lang.Throwable -> La5
            X.9rq r2 = X.EnumC222499rq.A03     // Catch: java.lang.Throwable -> La5
            r12.A0L(r2, r6, r4, r3)     // Catch: java.lang.Throwable -> La5
            r12.A0K(r15, r5, r0)     // Catch: java.lang.Throwable -> La5
            r12.A0I(r15)     // Catch: java.lang.Throwable -> La5
            r12.unlock()
            r12.A0E()
            r0 = 1
            return r0
        L9f:
            java.util.Queue r0 = r12.A08     // Catch: java.lang.Throwable -> La5
            r0.add(r15)     // Catch: java.lang.Throwable -> La5
            goto Lad
        La5:
            r0 = move-exception
            r12.unlock()
            r12.A0E()
            throw r0
        Lad:
            r12.unlock()
            r12.A0E()
        Lb3:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ConcurrentMapC200188tN.replace(java.lang.Object, java.lang.Object, java.lang.Object):boolean");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long j = 0;
        for (int i = 0; i < this.A0K.length; i++) {
            j += Math.max(0, r7[i].A0C);
        }
        return AbstractC38301qK.A02(j);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.A00;
        if (collection == null) {
            C64888TYo c64888TYo = new C64888TYo(this);
            this.A00 = c64888TYo;
            return c64888TYo;
        }
        return collection;
    }

    public InterfaceC200438tm copyEntry(InterfaceC200438tm original, InterfaceC200438tm newNext) {
        return A01(original.BD2()).A01(original, newNext);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final Object getOrDefault(Object key, Object defaultValue) {
        V v = get(key);
        if (v != null) {
            return v;
        }
        return defaultValue;
    }

    public boolean isLive(InterfaceC200438tm entry, long now) {
        if (A01(entry.BD2()).A08(entry, now) == null) {
            return false;
        }
        return true;
    }

    public InterfaceC200438tm newEntry(Object key, int hash, InterfaceC200438tm next) {
        C200398ti A01 = A01(hash);
        A01.lock();
        try {
            EnumC200308tZ enumC200308tZ = A01.A05.A0E;
            key.getClass();
            return enumC200308tZ.A01(A01, next, key, hash);
        } finally {
            A01.unlock();
        }
    }

    public InterfaceC200208tP newValueReference(InterfaceC200438tm entry, Object value, int weight) {
        int BD2 = entry.BD2();
        EnumC200228tR enumC200228tR = this.A0G;
        C200398ti A01 = A01(BD2);
        value.getClass();
        if (enumC200228tR instanceof C200238tS) {
            if (weight == 1) {
                return new C201918wO(value);
            }
            return new C214219eL(value, weight);
        }
        if (enumC200228tR instanceof C200258tU) {
            ReferenceQueue referenceQueue = A01.A07;
            if (weight == 1) {
                return new C25007B4h(entry, value, referenceQueue);
            }
            return new C214259eP(entry, value, referenceQueue, weight);
        }
        ReferenceQueue referenceQueue2 = A01.A07;
        if (weight == 1) {
            return new B4g(entry, value, referenceQueue2);
        }
        return new C214199eJ(entry, value, referenceQueue2, weight);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object key, Object value) {
        key.getClass();
        value.getClass();
        int A00 = A00(key);
        return A01(A00).A04(A00, key, value, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map m) {
        for (Map.Entry<K, V> entry : m.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final Object putIfAbsent(Object key, Object value) {
        key.getClass();
        value.getClass();
        int A00 = A00(key);
        return A01(A00).A04(A00, key, value, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        r10 = r12.CEZ();
        r15 = r10.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        if (r6.A0A.A01(r18, r15) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        r13 = X.EnumC222499rq.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        r9.A00++;
        r1 = r9.A00(r10, r11, r12, r13, r14, r15);
        r0 = r9.A0C - 1;
        r3.set(r2, r1);
        r9.A0C = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
    
        if (r13 == X.EnumC222499rq.A02) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        if (r15 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (r10.isActive() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        r13 = X.EnumC222499rq.A00;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(java.lang.Object r17, java.lang.Object r18) {
        /*
            r16 = this;
            r8 = r17
            if (r17 == 0) goto L95
            r5 = r18
            if (r18 == 0) goto L95
            r0 = r16
            int r7 = r0.A00(r8)
            X.8ti r9 = r0.A01(r7)
            r9.lock()
            X.8tN r6 = r9.A05     // Catch: java.lang.Throwable -> L87
            X.4Qx r0 = r6.A0B     // Catch: java.lang.Throwable -> L87
            long r0 = r0.A00()     // Catch: java.lang.Throwable -> L87
            r9.A0H(r0)     // Catch: java.lang.Throwable -> L87
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r9.A0D     // Catch: java.lang.Throwable -> L87
            int r2 = r3.length()     // Catch: java.lang.Throwable -> L87
            r4 = 1
            int r2 = r2 - r4
            r2 = r2 & r7
            java.lang.Object r11 = r3.get(r2)     // Catch: java.lang.Throwable -> L87
            X.8tm r11 = (X.InterfaceC200438tm) r11     // Catch: java.lang.Throwable -> L87
            r12 = r11
        L30:
            if (r12 == 0) goto L8f
            java.lang.Object r14 = r12.getKey()     // Catch: java.lang.Throwable -> L87
            int r0 = r12.BD2()     // Catch: java.lang.Throwable -> L87
            if (r0 != r7) goto L78
            if (r14 == 0) goto L78
            X.18M r0 = r6.A09     // Catch: java.lang.Throwable -> L87
            boolean r0 = r0.A01(r8, r14)     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L78
            X.8tP r10 = r12.CEZ()     // Catch: java.lang.Throwable -> L87
            java.lang.Object r15 = r10.get()     // Catch: java.lang.Throwable -> L87
            X.18M r0 = r6.A0A     // Catch: java.lang.Throwable -> L87
            boolean r0 = r0.A01(r5, r15)     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L6d
            X.9rq r13 = X.EnumC222499rq.A02     // Catch: java.lang.Throwable -> L87
        L58:
            int r0 = r9.A00     // Catch: java.lang.Throwable -> L87
            int r0 = r0 + 1
            r9.A00 = r0     // Catch: java.lang.Throwable -> L87
            X.8tm r1 = r9.A00(r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L87
            int r0 = r9.A0C     // Catch: java.lang.Throwable -> L87
            int r0 = r0 - r4
            r3.set(r2, r1)     // Catch: java.lang.Throwable -> L87
            r9.A0C = r0     // Catch: java.lang.Throwable -> L87
            X.9rq r0 = X.EnumC222499rq.A02     // Catch: java.lang.Throwable -> L87
            goto L7d
        L6d:
            if (r15 != 0) goto L8f
            boolean r0 = r10.isActive()     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L8f
            X.9rq r13 = X.EnumC222499rq.A00     // Catch: java.lang.Throwable -> L87
            goto L58
        L78:
            X.8tm r12 = r12.BWn()     // Catch: java.lang.Throwable -> L87
            goto L30
        L7d:
            if (r13 == r0) goto L80
            r4 = 0
        L80:
            r9.unlock()
            r9.A0E()
            return r4
        L87:
            r0 = move-exception
            r9.unlock()
            r9.A0E()
            throw r0
        L8f:
            r9.unlock()
            r9.A0E()
        L95:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ConcurrentMapC200188tN.remove(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0098, code lost:
    
        return null;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object replace(java.lang.Object r18, java.lang.Object r19) {
        /*
            r17 = this;
            r6 = r18
            r6.getClass()
            r5 = r19
            r5.getClass()
            r0 = r17
            int r9 = r0.A00(r6)
            X.8ti r10 = r0.A01(r9)
            r10.lock()
            X.8tN r8 = r10.A05     // Catch: java.lang.Throwable -> L99
            X.4Qx r0 = r8.A0B     // Catch: java.lang.Throwable -> L99
            long r0 = r0.A00()     // Catch: java.lang.Throwable -> L99
            r10.A0H(r0)     // Catch: java.lang.Throwable -> L99
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r10.A0D     // Catch: java.lang.Throwable -> L99
            int r2 = r3.length()     // Catch: java.lang.Throwable -> L99
            int r2 = r2 + (-1)
            r2 = r2 & r9
            java.lang.Object r12 = r3.get(r2)     // Catch: java.lang.Throwable -> L99
            X.8tm r12 = (X.InterfaceC200438tm) r12     // Catch: java.lang.Throwable -> L99
            r13 = r12
        L32:
            r7 = 0
            if (r13 == 0) goto L92
            java.lang.Object r15 = r13.getKey()     // Catch: java.lang.Throwable -> L99
            int r4 = r13.BD2()     // Catch: java.lang.Throwable -> L99
            if (r4 != r9) goto L71
            if (r15 == 0) goto L71
            X.18M r4 = r8.A09     // Catch: java.lang.Throwable -> L99
            boolean r4 = r4.A01(r6, r15)     // Catch: java.lang.Throwable -> L99
            if (r4 == 0) goto L71
            X.8tP r11 = r13.CEZ()     // Catch: java.lang.Throwable -> L99
            java.lang.Object r4 = r11.get()     // Catch: java.lang.Throwable -> L99
            if (r4 != 0) goto L76
            boolean r0 = r11.isActive()     // Catch: java.lang.Throwable -> L99
            if (r0 == 0) goto L92
            int r0 = r10.A00     // Catch: java.lang.Throwable -> L99
            int r0 = r0 + 1
            r10.A00 = r0     // Catch: java.lang.Throwable -> L99
            X.9rq r14 = X.EnumC222499rq.A00     // Catch: java.lang.Throwable -> L99
            r16 = r4
            X.8tm r1 = r10.A00(r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L99
            int r0 = r10.A0C     // Catch: java.lang.Throwable -> L99
            int r0 = r0 + (-1)
            r3.set(r2, r1)     // Catch: java.lang.Throwable -> L99
            r10.A0C = r0     // Catch: java.lang.Throwable -> L99
            goto L92
        L71:
            X.8tm r13 = r13.BWn()     // Catch: java.lang.Throwable -> L99
            goto L32
        L76:
            int r2 = r10.A00     // Catch: java.lang.Throwable -> L99
            int r2 = r2 + 1
            r10.A00 = r2     // Catch: java.lang.Throwable -> L99
            int r3 = r11.CHT()     // Catch: java.lang.Throwable -> L99
            X.9rq r2 = X.EnumC222499rq.A03     // Catch: java.lang.Throwable -> L99
            r10.A0L(r2, r6, r4, r3)     // Catch: java.lang.Throwable -> L99
            r10.A0K(r13, r5, r0)     // Catch: java.lang.Throwable -> L99
            r10.A0I(r13)     // Catch: java.lang.Throwable -> L99
            r10.unlock()
            r10.A0E()
            return r4
        L92:
            r10.unlock()
            r10.A0E()
            return r7
        L99:
            r0 = move-exception
            r10.unlock()
            r10.A0E()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ConcurrentMapC200188tN.replace(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
