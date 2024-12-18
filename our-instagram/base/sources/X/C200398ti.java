package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.ReferenceQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;

/* renamed from: X.8ti, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200398ti extends ReentrantLock {
    public int A00;
    public int A01;
    public long A02;
    public final long A03;
    public final C200158tK A04;
    public final ConcurrentMapC200188tN A05;
    public final ReferenceQueue A06;
    public final ReferenceQueue A07;
    public final Queue A08;
    public final Queue A09;
    public final Queue A0A;
    public final AtomicInteger A0B = new AtomicInteger();
    public volatile int A0C;
    public volatile AtomicReferenceArray A0D;

    public boolean removeEntry(InterfaceC200438tm entry, int hash, EnumC222499rq cause) {
        AtomicReferenceArray atomicReferenceArray = this.A0D;
        int length = (atomicReferenceArray.length() - 1) & hash;
        InterfaceC200438tm interfaceC200438tm = (InterfaceC200438tm) atomicReferenceArray.get(length);
        for (InterfaceC200438tm interfaceC200438tm2 = interfaceC200438tm; interfaceC200438tm2 != null; interfaceC200438tm2 = interfaceC200438tm2.BWn()) {
            if (interfaceC200438tm2 == entry) {
                this.A00++;
                InterfaceC200438tm A00 = A00(interfaceC200438tm2.CEZ(), interfaceC200438tm, interfaceC200438tm2, cause, interfaceC200438tm2.getKey(), interfaceC200438tm2.CEZ().get());
                int i = this.A0C - 1;
                atomicReferenceArray.set(length, A00);
                this.A0C = i;
                return true;
            }
        }
        return false;
    }

    public final InterfaceC200438tm A02(Object key, int hash) {
        for (InterfaceC200438tm interfaceC200438tm = (InterfaceC200438tm) this.A0D.get((r1.length() - 1) & hash); interfaceC200438tm != null; interfaceC200438tm = interfaceC200438tm.BWn()) {
            if (interfaceC200438tm.BD2() == hash) {
                Object key2 = interfaceC200438tm.getKey();
                if (key2 == null) {
                    A0F();
                } else if (this.A05.A09.A01(key, key2)) {
                    return interfaceC200438tm;
                }
            }
        }
        return null;
    }

    public final Object A09(Object key, int hash) {
        Object obj;
        try {
            if (this.A0C != 0) {
                ConcurrentMapC200188tN concurrentMapC200188tN = this.A05;
                long A00 = concurrentMapC200188tN.A0B.A00();
                InterfaceC200438tm A03 = A03(key, hash, A00);
                if (A03 != null) {
                    Object obj2 = A03.CEZ().get();
                    if (obj2 != null) {
                        this.A09.add(A03);
                        Object key2 = A03.getKey();
                        AbstractC200978ue abstractC200978ue = concurrentMapC200188tN.A0D;
                        long j = concurrentMapC200188tN.A08;
                        if (j <= 0 || A00 - A03.CHz() <= j || A03.CEZ().isLoading() || (obj = A05(abstractC200978ue, key2, hash, true)) == null) {
                            obj = obj2;
                        }
                        return obj;
                    }
                    A0F();
                }
            }
            return null;
        } finally {
            A0D();
        }
    }

    public final void A0A() {
        while (true) {
            Object poll = this.A09.poll();
            if (poll != null) {
                Queue queue = this.A08;
                if (queue.contains(poll)) {
                    queue.add(poll);
                }
            } else {
                return;
            }
        }
    }

    public final void A0B() {
        ConcurrentMapC200188tN concurrentMapC200188tN = this.A05;
        EnumC200228tR enumC200228tR = concurrentMapC200188tN.A0F;
        EnumC200228tR enumC200228tR2 = EnumC200228tR.A01;
        if (enumC200228tR != enumC200228tR2) {
            int i = 0;
            do {
                Object poll = this.A06.poll();
                if (poll == null) {
                    break;
                }
                InterfaceC200438tm interfaceC200438tm = (InterfaceC200438tm) poll;
                int BD2 = interfaceC200438tm.BD2();
                C200398ti A01 = concurrentMapC200188tN.A01(BD2);
                A01.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = A01.A0D;
                    int length = (atomicReferenceArray.length() - 1) & BD2;
                    InterfaceC200438tm interfaceC200438tm2 = (InterfaceC200438tm) atomicReferenceArray.get(length);
                    InterfaceC200438tm interfaceC200438tm3 = interfaceC200438tm2;
                    while (true) {
                        if (interfaceC200438tm3 == null) {
                            break;
                        }
                        if (interfaceC200438tm3 != interfaceC200438tm) {
                            interfaceC200438tm3 = interfaceC200438tm3.BWn();
                        } else {
                            A01.A00++;
                            InterfaceC200438tm A00 = A01.A00(interfaceC200438tm3.CEZ(), interfaceC200438tm2, interfaceC200438tm3, EnumC222499rq.A00, interfaceC200438tm3.getKey(), interfaceC200438tm3.CEZ().get());
                            int i2 = A01.A0C - 1;
                            atomicReferenceArray.set(length, A00);
                            A01.A0C = i2;
                            break;
                        }
                    }
                    A01.unlock();
                    A01.A0E();
                    i++;
                } catch (Throwable th) {
                    A01.unlock();
                    A01.A0E();
                    throw th;
                }
            } while (i != 16);
        }
        if (concurrentMapC200188tN.A0G != enumC200228tR2) {
            int i3 = 0;
            do {
                Object poll2 = this.A07.poll();
                if (poll2 != null) {
                    InterfaceC200208tP interfaceC200208tP = (InterfaceC200208tP) poll2;
                    InterfaceC200438tm B2N = interfaceC200208tP.B2N();
                    int BD22 = B2N.BD2();
                    C200398ti A012 = concurrentMapC200188tN.A01(BD22);
                    Object key = B2N.getKey();
                    A012.lock();
                    try {
                        AtomicReferenceArray atomicReferenceArray2 = A012.A0D;
                        int length2 = (atomicReferenceArray2.length() - 1) & BD22;
                        InterfaceC200438tm interfaceC200438tm4 = (InterfaceC200438tm) atomicReferenceArray2.get(length2);
                        InterfaceC200438tm interfaceC200438tm5 = interfaceC200438tm4;
                        while (true) {
                            if (interfaceC200438tm5 == null) {
                                break;
                            }
                            Object key2 = interfaceC200438tm5.getKey();
                            if (interfaceC200438tm5.BD2() == BD22 && key2 != null && A012.A05.A09.A01(key, key2)) {
                                if (interfaceC200438tm5.CEZ() == interfaceC200208tP) {
                                    A012.A00++;
                                    InterfaceC200438tm A002 = A012.A00(interfaceC200208tP, interfaceC200438tm4, interfaceC200438tm5, EnumC222499rq.A00, key2, interfaceC200208tP.get());
                                    int i4 = A012.A0C - 1;
                                    atomicReferenceArray2.set(length2, A002);
                                    A012.A0C = i4;
                                }
                            } else {
                                interfaceC200438tm5 = interfaceC200438tm5.BWn();
                            }
                        }
                        i3++;
                    } finally {
                        A012.unlock();
                        if (!A012.isHeldByCurrentThread()) {
                            A012.A0E();
                        }
                    }
                } else {
                    return;
                }
            } while (i3 != 16);
        }
    }

    public final void A0C() {
        AtomicReferenceArray atomicReferenceArray = this.A0D;
        int length = atomicReferenceArray.length();
        if (length < 1073741824) {
            int i = this.A0C;
            AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(length << 1);
            this.A01 = (atomicReferenceArray2.length() * 3) / 4;
            int length2 = atomicReferenceArray2.length() - 1;
            for (int i2 = 0; i2 < length; i2++) {
                InterfaceC200438tm interfaceC200438tm = (InterfaceC200438tm) atomicReferenceArray.get(i2);
                if (interfaceC200438tm != null) {
                    InterfaceC200438tm BWn = interfaceC200438tm.BWn();
                    int BD2 = interfaceC200438tm.BD2() & length2;
                    if (BWn == null) {
                        atomicReferenceArray2.set(BD2, interfaceC200438tm);
                    } else {
                        InterfaceC200438tm interfaceC200438tm2 = interfaceC200438tm;
                        do {
                            int BD22 = BWn.BD2() & length2;
                            if (BD22 != BD2) {
                                interfaceC200438tm2 = BWn;
                                BD2 = BD22;
                            }
                            BWn = BWn.BWn();
                        } while (BWn != null);
                        atomicReferenceArray2.set(BD2, interfaceC200438tm2);
                        while (interfaceC200438tm != interfaceC200438tm2) {
                            int BD23 = interfaceC200438tm.BD2() & length2;
                            InterfaceC200438tm A01 = A01(interfaceC200438tm, (InterfaceC200438tm) atomicReferenceArray2.get(BD23));
                            if (A01 != null) {
                                atomicReferenceArray2.set(BD23, A01);
                            } else {
                                A0J(interfaceC200438tm);
                                i--;
                            }
                            interfaceC200438tm = interfaceC200438tm.BWn();
                        }
                    }
                }
            }
            this.A0D = atomicReferenceArray2;
            this.A0C = i;
        }
    }

    public final void A0D() {
        if ((this.A0B.incrementAndGet() & 63) == 0) {
            A0H(this.A05.A0B.A00());
            A0E();
        }
    }

    public final void A0I(InterfaceC200438tm newest) {
        if (this.A05.A07 >= 0) {
            A0A();
            long CHT = newest.CEZ().CHT();
            long j = this.A03;
            if (CHT > j && !removeEntry(newest, newest.BD2(), EnumC222499rq.A04)) {
                throw new AssertionError();
            }
            while (this.A02 > j) {
                for (InterfaceC200438tm interfaceC200438tm : this.A08) {
                    if (interfaceC200438tm.CEZ().CHT() > 0) {
                        if (!removeEntry(interfaceC200438tm, interfaceC200438tm.BD2(), EnumC222499rq.A04)) {
                            throw new AssertionError();
                        }
                    }
                }
                throw new AssertionError();
            }
        }
    }

    public final void A0L(EnumC222499rq enumC222499rq, Object obj, Object obj2, int i) {
        this.A02 -= i;
        Queue queue = this.A05.A0J;
        if (queue != ConcurrentMapC200188tN.A0M) {
            queue.offer(new C201938wQ(enumC222499rq, obj, obj2));
        }
    }

    public boolean containsValue(Object value) {
        try {
            if (this.A0C != 0) {
                ConcurrentMapC200188tN concurrentMapC200188tN = this.A05;
                long A00 = concurrentMapC200188tN.A0B.A00();
                AtomicReferenceArray atomicReferenceArray = this.A0D;
                int length = atomicReferenceArray.length();
                for (int i = 0; i < length; i++) {
                    for (InterfaceC200438tm interfaceC200438tm = (InterfaceC200438tm) atomicReferenceArray.get(i); interfaceC200438tm != null; interfaceC200438tm = interfaceC200438tm.BWn()) {
                        Object A08 = A08(interfaceC200438tm, A00);
                        if (A08 != null && concurrentMapC200188tN.A0A.A01(value, A08)) {
                            A0D();
                            return true;
                        }
                    }
                }
            }
            return false;
        } finally {
            A0D();
        }
    }

    public C200398ti(C200158tK map, ConcurrentMapC200188tN initialCapacity, int maxSegmentWeight, long statsCounter) {
        ReferenceQueue referenceQueue;
        boolean z;
        Queue queue;
        Queue queue2;
        Queue queue3;
        this.A05 = initialCapacity;
        this.A03 = statsCounter;
        map.getClass();
        this.A04 = map;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(maxSegmentWeight);
        int length = (atomicReferenceArray.length() * 3) / 4;
        this.A01 = length;
        if (this.A05.A0I == EnumC200268tV.A01 && length == this.A03) {
            this.A01 = length + 1;
        }
        this.A0D = atomicReferenceArray;
        EnumC200228tR enumC200228tR = initialCapacity.A0F;
        EnumC200228tR enumC200228tR2 = EnumC200228tR.A01;
        if (enumC200228tR != enumC200228tR2) {
            referenceQueue = new ReferenceQueue();
        } else {
            referenceQueue = null;
        }
        this.A06 = referenceQueue;
        this.A07 = initialCapacity.A0G != enumC200228tR2 ? new ReferenceQueue() : null;
        if (initialCapacity.A07 >= 0) {
            z = true;
            queue = new ConcurrentLinkedQueue();
        } else {
            z = false;
            queue = ConcurrentMapC200188tN.A0M;
        }
        this.A09 = queue;
        if (initialCapacity.A06 > 0) {
            queue2 = new C200408tj();
        } else {
            queue2 = ConcurrentMapC200188tN.A0M;
        }
        this.A0A = queue2;
        if (z) {
            queue3 = new C25009B4j();
        } else {
            queue3 = ConcurrentMapC200188tN.A0M;
        }
        this.A08 = queue3;
    }

    public final InterfaceC200438tm A00(InterfaceC200208tP interfaceC200208tP, InterfaceC200438tm interfaceC200438tm, InterfaceC200438tm interfaceC200438tm2, EnumC222499rq enumC222499rq, Object obj, Object obj2) {
        A0L(enumC222499rq, obj, obj2, interfaceC200208tP.CHT());
        this.A0A.remove(interfaceC200438tm2);
        this.A08.remove(interfaceC200438tm2);
        if (interfaceC200208tP.isLoading()) {
            interfaceC200208tP.CtT(null);
            return interfaceC200438tm;
        }
        int i = this.A0C;
        InterfaceC200438tm BWn = interfaceC200438tm2.BWn();
        while (interfaceC200438tm != interfaceC200438tm2) {
            InterfaceC200438tm A01 = A01(interfaceC200438tm, BWn);
            if (A01 != null) {
                BWn = A01;
            } else {
                A0J(interfaceC200438tm);
                i--;
            }
            interfaceC200438tm = interfaceC200438tm.BWn();
        }
        this.A0C = i;
        return BWn;
    }

    public final InterfaceC200438tm A01(InterfaceC200438tm original, InterfaceC200438tm newNext) {
        InterfaceC200208tP CEZ;
        Object obj;
        InterfaceC200438tm A01;
        Object key = original.getKey();
        if (key == null || ((obj = (CEZ = original.CEZ()).get()) == null && CEZ.isActive())) {
            return null;
        }
        EnumC200308tZ enumC200308tZ = this.A05.A0E;
        if (!(enumC200308tZ instanceof C200338tc)) {
            if (!(enumC200308tZ instanceof C200388th)) {
                if (!(enumC200308tZ instanceof C200378tg)) {
                    if (!(enumC200308tZ instanceof C200368tf)) {
                        if (!(enumC200308tZ instanceof C200348td)) {
                            if (!(enumC200308tZ instanceof C200328tb)) {
                                A01 = enumC200308tZ.A01(this, newNext, key, original.BD2());
                                A01.Egk(CEZ.AKt(A01, obj, this.A07));
                                return A01;
                            }
                        }
                    }
                    A01 = enumC200308tZ.A01(this, newNext, key, original.BD2());
                    EnumC200308tZ.A00(original, A01);
                    A01.Egk(CEZ.AKt(A01, obj, this.A07));
                    return A01;
                }
            }
            A01 = enumC200308tZ.A01(this, newNext, key, original.BD2());
            EnumC200308tZ.A00(original, A01);
            A01.EhQ(original.CHz());
            InterfaceC200438tm Bg3 = original.Bg3();
            Bg3.EZf(A01);
            A01.EbV(Bg3);
            InterfaceC200438tm BWv = original.BWv();
            A01.EZf(BWv);
            BWv.EbV(A01);
            EnumC201908wN enumC201908wN = EnumC201908wN.A01;
            original.EZf(enumC201908wN);
            original.EbV(enumC201908wN);
            A01.Egk(CEZ.AKt(A01, obj, this.A07));
            return A01;
        }
        A01 = enumC200308tZ.A01(this, newNext, key, original.BD2());
        A01.EhQ(original.CHz());
        InterfaceC200438tm Bg32 = original.Bg3();
        Bg32.EZf(A01);
        A01.EbV(Bg32);
        InterfaceC200438tm BWv2 = original.BWv();
        A01.EZf(BWv2);
        BWv2.EbV(A01);
        EnumC201908wN enumC201908wN2 = EnumC201908wN.A01;
        original.EZf(enumC201908wN2);
        original.EbV(enumC201908wN2);
        A01.Egk(CEZ.AKt(A01, obj, this.A07));
        return A01;
    }

    public final InterfaceC200438tm A03(Object key, int hash, long now) {
        InterfaceC200438tm A02 = A02(key, hash);
        if (A02 != null) {
            if (this.A05.A03(A02, now)) {
                if (tryLock()) {
                    try {
                        A0G(now);
                        return null;
                    } finally {
                        unlock();
                    }
                }
            } else {
                return A02;
            }
        }
        return null;
    }

    public final Object A04(int key, Object hash, Object value, boolean onlyIfAbsent) {
        int i;
        lock();
        try {
            ConcurrentMapC200188tN concurrentMapC200188tN = this.A05;
            long A00 = concurrentMapC200188tN.A0B.A00();
            A0H(A00);
            if (this.A0C + 1 > this.A01) {
                A0C();
            }
            AtomicReferenceArray atomicReferenceArray = this.A0D;
            int length = key & (atomicReferenceArray.length() - 1);
            InterfaceC200438tm interfaceC200438tm = (InterfaceC200438tm) atomicReferenceArray.get(length);
            InterfaceC200438tm interfaceC200438tm2 = interfaceC200438tm;
            while (true) {
                if (interfaceC200438tm2 != null) {
                    Object key2 = interfaceC200438tm2.getKey();
                    if (interfaceC200438tm2.BD2() == key && key2 != null && concurrentMapC200188tN.A09.A01(hash, key2)) {
                        InterfaceC200208tP CEZ = interfaceC200438tm2.CEZ();
                        Object obj = CEZ.get();
                        if (obj == null) {
                            this.A00++;
                            if (CEZ.isActive()) {
                                A0L(EnumC222499rq.A00, hash, obj, CEZ.CHT());
                                A0K(interfaceC200438tm2, value, A00);
                                i = this.A0C;
                            } else {
                                A0K(interfaceC200438tm2, value, A00);
                                i = this.A0C + 1;
                            }
                        } else {
                            if (onlyIfAbsent) {
                                this.A08.add(interfaceC200438tm2);
                            } else {
                                this.A00++;
                                A0L(EnumC222499rq.A03, hash, obj, CEZ.CHT());
                                A0K(interfaceC200438tm2, value, A00);
                                A0I(interfaceC200438tm2);
                            }
                            return obj;
                        }
                    } else {
                        interfaceC200438tm2 = interfaceC200438tm2.BWn();
                    }
                } else {
                    this.A00++;
                    interfaceC200438tm2 = concurrentMapC200188tN.A0E.A01(this, interfaceC200438tm, hash, key);
                    A0K(interfaceC200438tm2, value, A00);
                    atomicReferenceArray.set(length, interfaceC200438tm2);
                    i = this.A0C + 1;
                    break;
                }
            }
            this.A0C = i;
            A0I(interfaceC200438tm2);
            return null;
        } finally {
            unlock();
            A0E();
        }
    }

    public final Object A05(AbstractC200978ue key, final Object hash, final int loader, boolean checkTime) {
        final C23543Abx c23543Abx;
        lock();
        try {
            ConcurrentMapC200188tN concurrentMapC200188tN = this.A05;
            long A00 = concurrentMapC200188tN.A0B.A00();
            A0H(A00);
            AtomicReferenceArray atomicReferenceArray = this.A0D;
            int length = (atomicReferenceArray.length() - 1) & loader;
            InterfaceC200438tm interfaceC200438tm = (InterfaceC200438tm) atomicReferenceArray.get(length);
            InterfaceC200438tm interfaceC200438tm2 = interfaceC200438tm;
            while (true) {
                if (interfaceC200438tm2 != null) {
                    Object key2 = interfaceC200438tm2.getKey();
                    if (interfaceC200438tm2.BD2() == loader && key2 != null && concurrentMapC200188tN.A09.A01(hash, key2)) {
                        InterfaceC200208tP CEZ = interfaceC200438tm2.CEZ();
                        if (!CEZ.isLoading() && (!checkTime || A00 - interfaceC200438tm2.CHz() >= concurrentMapC200188tN.A08)) {
                            this.A00++;
                            c23543Abx = new C23543Abx(CEZ);
                            interfaceC200438tm2.Egk(c23543Abx);
                        }
                        c23543Abx = null;
                    } else {
                        interfaceC200438tm2 = interfaceC200438tm2.BWn();
                    }
                } else {
                    this.A00++;
                    c23543Abx = new C23543Abx();
                    EnumC200308tZ enumC200308tZ = concurrentMapC200188tN.A0E;
                    hash.getClass();
                    InterfaceC200438tm A01 = enumC200308tZ.A01(this, interfaceC200438tm, hash, loader);
                    A01.Egk(c23543Abx);
                    atomicReferenceArray.set(length, A01);
                    break;
                }
            }
            unlock();
            A0E();
            Object obj = null;
            if (c23543Abx == null) {
                return null;
            }
            final ListenableFuture A002 = c23543Abx.A00(key, hash);
            A002.addListener(new Runnable() { // from class: X.AzM
                @Override // java.lang.Runnable
                public final void run() {
                    C200398ti c200398ti = this;
                    Object obj2 = hash;
                    int i = loader;
                    C23543Abx c23543Abx2 = c23543Abx;
                    try {
                        c200398ti.A06(c23543Abx2, A002, obj2, i);
                    } catch (Throwable th) {
                        ConcurrentMapC200188tN.A0N.log(Level.WARNING, "Exception thrown during refresh", th);
                        c23543Abx2.A01.setException(th);
                    }
                }
            }, C1M8.A01);
            if (A002.isDone()) {
                try {
                    obj = AbstractC53362cK.A00(A002);
                    return obj;
                } catch (Throwable unused) {
                }
            }
            return obj;
        } catch (Throwable th) {
            unlock();
            A0E();
            throw th;
        }
    }

    public final Object A06(C23543Abx key, ListenableFuture hash, Object loadingValueReference, int newValue) {
        Object obj;
        EnumC222499rq enumC222499rq;
        try {
            obj = AbstractC53362cK.A00(hash);
        } catch (Throwable th) {
            th = th;
            obj = null;
        }
        try {
            if (obj != null) {
                key.A00.A00(TimeUnit.NANOSECONDS);
                lock();
                try {
                    ConcurrentMapC200188tN concurrentMapC200188tN = this.A05;
                    long A00 = concurrentMapC200188tN.A0B.A00();
                    A0H(A00);
                    int i = this.A0C + 1;
                    if (i > this.A01) {
                        A0C();
                        i = this.A0C + 1;
                    }
                    AtomicReferenceArray atomicReferenceArray = this.A0D;
                    int length = newValue & (atomicReferenceArray.length() - 1);
                    InterfaceC200438tm interfaceC200438tm = (InterfaceC200438tm) atomicReferenceArray.get(length);
                    InterfaceC200438tm interfaceC200438tm2 = interfaceC200438tm;
                    while (true) {
                        if (interfaceC200438tm2 != null) {
                            Object key2 = interfaceC200438tm2.getKey();
                            if (interfaceC200438tm2.BD2() == newValue && key2 != null && concurrentMapC200188tN.A09.A01(loadingValueReference, key2)) {
                                InterfaceC200208tP CEZ = interfaceC200438tm2.CEZ();
                                Object obj2 = CEZ.get();
                                if (key == CEZ || (obj2 == null && CEZ != ConcurrentMapC200188tN.A0L)) {
                                    this.A00++;
                                    if (key.A02.isActive()) {
                                        if (obj2 == null) {
                                            enumC222499rq = EnumC222499rq.A00;
                                        } else {
                                            enumC222499rq = EnumC222499rq.A03;
                                        }
                                        A0L(enumC222499rq, loadingValueReference, obj2, key.A02.CHT());
                                        i--;
                                    }
                                    A0K(interfaceC200438tm2, obj, A00);
                                } else {
                                    A0L(EnumC222499rq.A03, loadingValueReference, obj, 0);
                                }
                            } else {
                                interfaceC200438tm2 = interfaceC200438tm2.BWn();
                            }
                        } else {
                            this.A00++;
                            EnumC200308tZ enumC200308tZ = concurrentMapC200188tN.A0E;
                            loadingValueReference.getClass();
                            interfaceC200438tm2 = enumC200308tZ.A01(this, interfaceC200438tm, loadingValueReference, newValue);
                            A0K(interfaceC200438tm2, obj, A00);
                            atomicReferenceArray.set(length, interfaceC200438tm2);
                            break;
                        }
                    }
                    this.A0C = i;
                    A0I(interfaceC200438tm2);
                    return obj;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("CacheLoader returned null for key ");
            sb.append(loadingValueReference);
            sb.append(".");
            throw new RuntimeException(sb.toString());
        } catch (Throwable th3) {
            th = th3;
            if (obj == null) {
                key.A00.A00(TimeUnit.NANOSECONDS);
                lock();
                try {
                    AtomicReferenceArray atomicReferenceArray2 = this.A0D;
                    int length2 = (atomicReferenceArray2.length() - 1) & newValue;
                    InterfaceC200438tm interfaceC200438tm3 = (InterfaceC200438tm) atomicReferenceArray2.get(length2);
                    InterfaceC200438tm interfaceC200438tm4 = interfaceC200438tm3;
                    while (true) {
                        if (interfaceC200438tm4 == null) {
                            break;
                        }
                        Object key3 = interfaceC200438tm4.getKey();
                        if (interfaceC200438tm4.BD2() == newValue && key3 != null && this.A05.A09.A01(loadingValueReference, key3)) {
                            if (interfaceC200438tm4.CEZ() == key) {
                                if (key.A02.isActive()) {
                                    interfaceC200438tm4.Egk(key.A02);
                                } else {
                                    int i2 = this.A0C;
                                    InterfaceC200438tm BWn = interfaceC200438tm4.BWn();
                                    while (interfaceC200438tm3 != interfaceC200438tm4) {
                                        InterfaceC200438tm A01 = A01(interfaceC200438tm3, BWn);
                                        if (A01 != null) {
                                            BWn = A01;
                                        } else {
                                            A0J(interfaceC200438tm3);
                                            i2--;
                                        }
                                        interfaceC200438tm3 = interfaceC200438tm3.BWn();
                                    }
                                    this.A0C = i2;
                                    atomicReferenceArray2.set(length2, BWn);
                                }
                            }
                        } else {
                            interfaceC200438tm4 = interfaceC200438tm4.BWn();
                        }
                    }
                } finally {
                    unlock();
                    A0E();
                }
            }
            throw th;
        }
    }

    public final Object A07(InterfaceC200208tP e, InterfaceC200438tm key, Object valueReference) {
        if (e.isLoading()) {
            C18C.A0B(valueReference, "Recursive load of: %s", !Thread.holdsLock(key));
            Object FDs = e.FDs();
            if (FDs != null) {
                this.A05.A0B.A00();
                this.A09.add(key);
                return FDs;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("CacheLoader returned null for key ");
            sb.append(valueReference);
            sb.append(".");
            throw new RuntimeException(sb.toString());
        }
        throw new AssertionError();
    }

    public final Object A08(InterfaceC200438tm entry, long now) {
        Object obj;
        if (entry.getKey() != null && (obj = entry.CEZ().get()) != null) {
            if (this.A05.A03(entry, now)) {
                if (tryLock()) {
                    try {
                        A0G(now);
                        return null;
                    } finally {
                        unlock();
                    }
                }
            } else {
                return obj;
            }
        } else {
            A0F();
        }
        return null;
    }

    public final void A0E() {
        if (!isHeldByCurrentThread()) {
            ConcurrentMapC200188tN concurrentMapC200188tN = this.A05;
            while (true) {
                C201938wQ c201938wQ = (C201938wQ) concurrentMapC200188tN.A0J.poll();
                if (c201938wQ != null) {
                    try {
                        concurrentMapC200188tN.A0H.Den(c201938wQ);
                    } catch (Throwable th) {
                        ConcurrentMapC200188tN.A0N.log(Level.WARNING, "Exception thrown by removal listener", th);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void A0F() {
        if (tryLock()) {
            try {
                A0B();
            } finally {
                unlock();
            }
        }
    }

    public final void A0G(long now) {
        InterfaceC200438tm interfaceC200438tm;
        InterfaceC200438tm interfaceC200438tm2;
        A0A();
        do {
            interfaceC200438tm = (InterfaceC200438tm) this.A0A.peek();
            if (interfaceC200438tm == null || !this.A05.A03(interfaceC200438tm, now)) {
                do {
                    interfaceC200438tm2 = (InterfaceC200438tm) this.A08.peek();
                    if (interfaceC200438tm2 == null || !this.A05.A03(interfaceC200438tm2, now)) {
                        return;
                    }
                } while (removeEntry(interfaceC200438tm2, interfaceC200438tm2.BD2(), EnumC222499rq.A01));
                throw new AssertionError();
            }
        } while (removeEntry(interfaceC200438tm, interfaceC200438tm.BD2(), EnumC222499rq.A01));
        throw new AssertionError();
    }

    public final void A0H(long now) {
        if (tryLock()) {
            try {
                A0B();
                A0G(now);
                this.A0B.set(0);
            } finally {
                unlock();
            }
        }
    }

    public final void A0J(InterfaceC200438tm entry) {
        Object key = entry.getKey();
        entry.BD2();
        A0L(EnumC222499rq.A00, key, entry.CEZ().get(), entry.CEZ().CHT());
        this.A0A.remove(entry);
        this.A08.remove(entry);
    }

    public final void A0K(InterfaceC200438tm interfaceC200438tm, Object obj, long j) {
        InterfaceC200208tP b4g;
        InterfaceC200208tP CEZ = interfaceC200438tm.CEZ();
        ConcurrentMapC200188tN concurrentMapC200188tN = this.A05;
        EnumC200228tR enumC200228tR = concurrentMapC200188tN.A0G;
        if (enumC200228tR instanceof C200238tS) {
            b4g = new C201918wO(obj);
        } else if (enumC200228tR instanceof C200258tU) {
            b4g = new C25007B4h(interfaceC200438tm, obj, this.A07);
        } else {
            b4g = new B4g(interfaceC200438tm, obj, this.A07);
        }
        interfaceC200438tm.Egk(b4g);
        A0A();
        this.A02++;
        if (concurrentMapC200188tN.A06 > 0 || concurrentMapC200188tN.A08 > 0) {
            interfaceC200438tm.EhQ(j);
        }
        this.A08.add(interfaceC200438tm);
        this.A0A.add(interfaceC200438tm);
        CEZ.CtT(obj);
    }
}
