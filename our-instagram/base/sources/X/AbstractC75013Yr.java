package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.3Yr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC75013Yr {
    public static int A00;
    public static C75063Yw A01;
    public static List A02;
    public static List A03;
    public static C74983Yo A04;
    public static final C75073Yx A06;
    public static final AtomicReference A08;
    public static final Snapshot A0A;
    public static final C75083Yy A0B;
    public static final InterfaceC16660sJ A09 = C75023Ys.A00;
    public static final C75033Yt A05 = new C75033Yt();
    public static final Object A07 = new Object();

    public static final Snapshot A01(Snapshot snapshot, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        C3Z1 c3z1;
        if (!(snapshot instanceof C3Z1)) {
            if (snapshot == null) {
                c3z1 = null;
            } else {
                return new C3Z4(snapshot, interfaceC16660sJ, z);
            }
        } else {
            c3z1 = (C3Z1) snapshot;
        }
        return new C3Z3(c3z1, interfaceC16660sJ, null, false, z);
    }

    public static final AbstractC75003Yq A05(C75063Yw c75063Yw, AbstractC75003Yq abstractC75003Yq, int i) {
        AbstractC75003Yq abstractC75003Yq2 = null;
        while (abstractC75003Yq != null) {
            int i2 = abstractC75003Yq.A00;
            if (i2 != 0 && i2 <= i && !c75063Yw.A04(i2) && (abstractC75003Yq2 == null || abstractC75003Yq2.A00 < abstractC75003Yq.A00)) {
                abstractC75003Yq2 = abstractC75003Yq;
            }
            abstractC75003Yq = abstractC75003Yq.A01;
        }
        if (abstractC75003Yq2 != null) {
            return abstractC75003Yq2;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.concurrent.atomic.AtomicInteger, X.3Yo] */
    static {
        C75063Yw c75063Yw = C75063Yw.A04;
        A01 = c75063Yw;
        A00 = 2;
        A06 = new C75073Yx();
        A0B = new C75083Yy();
        C16930sl c16930sl = C16930sl.A00;
        A02 = c16930sl;
        A03 = c16930sl;
        A00 = 3;
        C3Z0 c3z0 = new C3Z0(c75063Yw, 2);
        A01 = A01.A01(c3z0.A0F());
        AtomicReference atomicReference = new AtomicReference(c3z0);
        A08 = atomicReference;
        A0A = (Snapshot) atomicReference.get();
        A04 = new AtomicInteger(0);
    }

    public static final Snapshot A00() {
        Snapshot snapshot = (Snapshot) A05.A00();
        if (snapshot == null) {
            return (Snapshot) A08.get();
        }
        return snapshot;
    }

    public static final Object A09(Snapshot snapshot, InterfaceC16660sJ interfaceC16660sJ) {
        Object invoke = interfaceC16660sJ.invoke(A01.A00(snapshot.A0F()));
        synchronized (A07) {
            int i = A00;
            A00 = i + 1;
            C75063Yw A002 = A01.A00(snapshot.A0F());
            A01 = A002;
            A08.set(new C3Z0(A002, i));
            snapshot.A0H();
            A01 = A01.A01(i);
        }
        return invoke;
    }

    public static final Object A0A(InterfaceC16660sJ interfaceC16660sJ) {
        Object obj;
        C18570vk A0I;
        Object A092;
        C14360o3.A0C(A0A, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        Object obj2 = A07;
        synchronized (obj2) {
            obj = A08.get();
            A0I = ((C3Z0) obj).A0I();
            if (A0I != null) {
                A04.addAndGet(1);
            }
            A092 = A09((Snapshot) obj, interfaceC16660sJ);
        }
        if (A0I != null) {
            try {
                List list = A02;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((InterfaceC16620sF) list.get(i)).invoke(new C1127457f(A0I), obj);
                }
            } finally {
                A04.addAndGet(-1);
            }
        }
        synchronized (obj2) {
            A0D();
            if (A0I != null) {
                Object[] objArr = A0I.A03;
                long[] jArr = A0I.A02;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - (((i2 - length) ^ (-1)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                boolean z = false;
                                if ((255 & j) < 128) {
                                    z = true;
                                }
                                if (z) {
                                    A0I((InterfaceC74933Yj) objArr[(i2 << 3) + i4]);
                                }
                                j >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        return A092;
    }

    public static final HashMap A0B(C3Z1 c3z1, C3Z1 c3z12, C75063Yw c75063Yw) {
        InterfaceC74933Yj interfaceC74933Yj;
        AbstractC75003Yq B6j;
        AbstractC75003Yq A052;
        AbstractC75003Yq A053;
        C18570vk A0I = c3z12.A0I();
        int A0F = c3z1.A0F();
        if (A0I != null) {
            C75063Yw A032 = c3z12.A0G().A01(c3z12.A0F()).A03(c3z12.A02);
            Object[] objArr = A0I.A03;
            long[] jArr = A0I.A02;
            int length = jArr.length - 2;
            if (length < 0) {
                return null;
            }
            HashMap hashMap = null;
            int i = 0;
            loop0: while (true) {
                long j = jArr[i];
                if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - (((i - length) ^ (-1)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (A052 = A05(c75063Yw, (B6j = (interfaceC74933Yj = (InterfaceC74933Yj) objArr[(i << 3) + i3]).B6j()), A0F)) != null && (A053 = A05(A032, B6j, A0F)) != null && !A052.equals(A053)) {
                            AbstractC75003Yq A054 = A05(c3z12.A0G(), B6j, c3z12.A0F());
                            if (A054 != null) {
                                AbstractC75003Yq CpR = interfaceC74933Yj.CpR(A053, A052, A054);
                                if (CpR == null) {
                                    break loop0;
                                }
                                if (hashMap == null) {
                                    hashMap = new HashMap();
                                }
                                hashMap.put(A052, CpR);
                            } else {
                                A0E();
                                throw C00O.createAndThrow();
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return hashMap;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return hashMap;
                }
            }
        }
        return null;
    }

    public static final InterfaceC16660sJ A0C(InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, boolean z) {
        if (!z) {
            interfaceC16660sJ2 = null;
        }
        if (interfaceC16660sJ != null) {
            if (interfaceC16660sJ2 != null && interfaceC16660sJ != interfaceC16660sJ2) {
                return new C9F3(interfaceC16660sJ, interfaceC16660sJ2, 8);
            }
            return interfaceC16660sJ;
        }
        return interfaceC16660sJ2;
    }

    public static final void A0D() {
        T t;
        C75083Yy c75083Yy = A0B;
        int i = c75083Yy.A00;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            C75093Yz c75093Yz = c75083Yy.A02[i3];
            if (c75093Yz != null && (t = c75093Yz.get()) != 0 && !(!A0J((InterfaceC74933Yj) t))) {
                if (i2 != i3) {
                    c75083Yy.A02[i2] = c75093Yz;
                    int[] iArr = c75083Yy.A01;
                    iArr[i2] = iArr[i3];
                }
                i2++;
            }
        }
        for (int i4 = i2; i4 < i; i4++) {
            c75083Yy.A02[i4] = null;
            c75083Yy.A01[i4] = 0;
        }
        if (i2 != i) {
            c75083Yy.A00 = i2;
        }
    }

    public static final void A0E() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final void A0F(int i) {
        int i2;
        C75073Yx c75073Yx = A06;
        int[] iArr = c75073Yx.A02;
        int i3 = iArr[i];
        int i4 = c75073Yx.A01 - 1;
        C75073Yx.A00(c75073Yx, i3, i4);
        c75073Yx.A01 = i4;
        int i5 = i3;
        int[] iArr2 = c75073Yx.A04;
        int i6 = iArr2[i3];
        while (i5 > 0) {
            int i7 = ((i5 + 1) >> 1) - 1;
            if (iArr2[i7] <= i6) {
                break;
            }
            C75073Yx.A00(c75073Yx, i7, i5);
            i5 = i7;
        }
        int i8 = i4 >> 1;
        while (i3 < i8) {
            int i9 = (i3 + 1) << 1;
            int i10 = i9 - 1;
            if (i9 < i4 && (i2 = iArr2[i9]) < iArr2[i10]) {
                if (i2 >= iArr2[i3]) {
                    break;
                }
                C75073Yx.A00(c75073Yx, i9, i3);
                i3 = i9;
            } else {
                if (iArr2[i10] >= iArr2[i3]) {
                    break;
                }
                C75073Yx.A00(c75073Yx, i10, i3);
                i3 = i10;
            }
        }
        iArr[i] = c75073Yx.A00;
        c75073Yx.A00 = i;
    }

    public static final void A0G(Snapshot snapshot) {
        Object obj;
        int i;
        C3Z1 c3z1;
        if (!A01.A04(snapshot.A0F())) {
            StringBuilder sb = new StringBuilder();
            sb.append("Snapshot is not open: id=");
            sb.append(snapshot.A0F());
            sb.append(", disposed=");
            sb.append(snapshot.A02);
            sb.append(", applied=");
            if ((snapshot instanceof C3Z1) && (c3z1 = (C3Z1) snapshot) != null) {
                obj = Boolean.valueOf(c3z1.A03);
            } else {
                obj = "read-only";
            }
            sb.append(obj);
            sb.append(", lowestPin=");
            synchronized (A07) {
                C75073Yx c75073Yx = A06;
                i = -1;
                if (c75073Yx.A01 > 0) {
                    i = c75073Yx.A04[0];
                }
            }
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
    }

    public static final AbstractC75003Yq A02(Snapshot snapshot, InterfaceC74933Yj interfaceC74933Yj, AbstractC75003Yq abstractC75003Yq) {
        AbstractC75003Yq A052;
        if (snapshot.A0E()) {
            snapshot.A0D(interfaceC74933Yj);
        }
        int A0F = snapshot.A0F();
        AbstractC75003Yq A053 = A05(snapshot.A0G(), abstractC75003Yq, A0F);
        if (A053 != null) {
            if (A053.A00 == snapshot.A0F()) {
                return A053;
            }
            synchronized (A07) {
                A052 = A05(snapshot.A0G(), interfaceC74933Yj.B6j(), A0F);
                if (A052 != null) {
                    if (A052.A00 != A0F) {
                        AbstractC75003Yq A062 = A06(interfaceC74933Yj, A052);
                        A062.A01(A052);
                        A062.A00 = snapshot.A0F();
                        A052 = A062;
                    }
                } else {
                    A0E();
                    throw C00O.createAndThrow();
                }
            }
            C14360o3.A0C(A052, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.writableRecord");
            if (A053.A00 != 1) {
                snapshot.A0D(interfaceC74933Yj);
            }
            return A052;
        }
        A0E();
        throw C00O.createAndThrow();
    }

    public static final AbstractC75003Yq A03(Snapshot snapshot, InterfaceC74933Yj interfaceC74933Yj, AbstractC75003Yq abstractC75003Yq, AbstractC75003Yq abstractC75003Yq2) {
        AbstractC75003Yq A062;
        if (snapshot.A0E()) {
            snapshot.A0D(interfaceC74933Yj);
        }
        int A0F = snapshot.A0F();
        if (abstractC75003Yq2.A00 == A0F) {
            return abstractC75003Yq2;
        }
        synchronized (A07) {
            A062 = A06(interfaceC74933Yj, abstractC75003Yq);
        }
        A062.A00 = A0F;
        if (abstractC75003Yq2.A00 != 1) {
            snapshot.A0D(interfaceC74933Yj);
        }
        return A062;
    }

    public static final AbstractC75003Yq A04(Snapshot snapshot, AbstractC75003Yq abstractC75003Yq) {
        AbstractC75003Yq A052 = A05(snapshot.A0G(), abstractC75003Yq, snapshot.A0F());
        if (A052 != null) {
            return A052;
        }
        A0E();
        throw C00O.createAndThrow();
    }

    public static final AbstractC75003Yq A06(InterfaceC74933Yj interfaceC74933Yj, AbstractC75003Yq abstractC75003Yq) {
        AbstractC75003Yq B6j = interfaceC74933Yj.B6j();
        C75073Yx c75073Yx = A06;
        int i = A00;
        if (c75073Yx.A01 > 0) {
            i = c75073Yx.A04[0];
        }
        int i2 = i - 1;
        C75063Yw c75063Yw = C75063Yw.A04;
        AbstractC75003Yq abstractC75003Yq2 = null;
        while (B6j != null) {
            if (B6j.A00 != 0) {
                int i3 = B6j.A00;
                if (i3 != 0 && i3 <= i2 && !c75063Yw.A04(i3)) {
                    if (abstractC75003Yq2 == null) {
                        abstractC75003Yq2 = B6j;
                    } else if (B6j.A00 >= abstractC75003Yq2.A00) {
                        B6j = abstractC75003Yq2;
                    }
                }
                B6j = B6j.A01;
            }
            B6j.A00 = Integer.MAX_VALUE;
            return B6j;
        }
        AbstractC75003Yq A002 = abstractC75003Yq.A00();
        A002.A00 = Integer.MAX_VALUE;
        A002.A01 = interfaceC74933Yj.B6j();
        interfaceC74933Yj.E5y(A002);
        return A002;
    }

    public static final AbstractC75003Yq A07(InterfaceC74933Yj interfaceC74933Yj, AbstractC75003Yq abstractC75003Yq) {
        Snapshot A002 = A00();
        InterfaceC16660sJ A032 = A002.A03();
        if (A032 != null) {
            A032.invoke(interfaceC74933Yj);
        }
        AbstractC75003Yq A052 = A05(A002.A0G(), abstractC75003Yq, A002.A0F());
        if (A052 == null) {
            synchronized (A07) {
                Snapshot A003 = A00();
                AbstractC75003Yq B6j = interfaceC74933Yj.B6j();
                C14360o3.A0C(B6j, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
                A052 = A05(A003.A0G(), B6j, A003.A0F());
                if (A052 == null) {
                    A0E();
                    throw C00O.createAndThrow();
                }
            }
        }
        return A052;
    }

    public static final AbstractC75003Yq A08(AbstractC75003Yq abstractC75003Yq) {
        Snapshot A002 = A00();
        AbstractC75003Yq A052 = A05(A002.A0G(), abstractC75003Yq, A002.A0F());
        if (A052 == null) {
            synchronized (A07) {
                Snapshot A003 = A00();
                A052 = A05(A003.A0G(), abstractC75003Yq, A003.A0F());
            }
            if (A052 == null) {
                A0E();
                throw C00O.createAndThrow();
            }
        }
        return A052;
    }

    public static final void A0H(Snapshot snapshot, InterfaceC74933Yj interfaceC74933Yj) {
        snapshot.A09(snapshot.A01() + 1);
        InterfaceC16660sJ A042 = snapshot.A04();
        if (A042 != null) {
            A042.invoke(interfaceC74933Yj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A0I(InterfaceC74933Yj interfaceC74933Yj) {
        int i;
        int i2;
        Object obj;
        Object obj2;
        if (A0J(interfaceC74933Yj)) {
            C75083Yy c75083Yy = A0B;
            int i3 = c75083Yy.A00;
            int identityHashCode = System.identityHashCode(interfaceC74933Yj);
            if (i3 > 0) {
                int i4 = i3 - 1;
                int i5 = 0;
                while (true) {
                    if (i5 <= i4) {
                        i = (i5 + i4) >>> 1;
                        int[] iArr = c75083Yy.A01;
                        int i6 = iArr[i];
                        if (i6 < identityHashCode) {
                            i5 = i + 1;
                        } else if (i6 > identityHashCode) {
                            i4 = i - 1;
                        } else {
                            C75093Yz[] c75093YzArr = c75083Yy.A02;
                            C75093Yz c75093Yz = c75093YzArr[i];
                            if (c75093Yz != null) {
                                obj = c75093Yz.get();
                            } else {
                                obj = null;
                            }
                            if (interfaceC74933Yj != obj) {
                                int i7 = i - 1;
                                while (true) {
                                    Object obj3 = null;
                                    if (-1 >= i7 || iArr[i7] != identityHashCode) {
                                        break;
                                    }
                                    C75093Yz c75093Yz2 = c75093YzArr[i7];
                                    if (c75093Yz2 != null) {
                                        obj3 = c75093Yz2.get();
                                    }
                                    if (obj3 != interfaceC74933Yj) {
                                        i7--;
                                    } else {
                                        return;
                                    }
                                }
                                do {
                                    i++;
                                    if (i < i3) {
                                        if (iArr[i] == identityHashCode) {
                                            C75093Yz c75093Yz3 = c75093YzArr[i];
                                            if (c75093Yz3 != null) {
                                                obj2 = c75093Yz3.get();
                                            } else {
                                                obj2 = null;
                                            }
                                        }
                                    } else {
                                        i = i3;
                                    }
                                    i2 = i + 1;
                                } while (obj2 != interfaceC74933Yj);
                            }
                        }
                    } else {
                        i2 = i5 + 1;
                        break;
                    }
                }
                i = -i2;
                if (i >= 0) {
                    return;
                }
            } else {
                i = -1;
            }
            int i8 = -(i + 1);
            C75093Yz[] c75093YzArr2 = c75083Yy.A02;
            int length = c75093YzArr2.length;
            if (i3 == length) {
                int i9 = length * 2;
                C75093Yz[] c75093YzArr3 = new C75093Yz[i9];
                int[] iArr2 = new int[i9];
                int i10 = i8 + 1;
                AbstractC06960Yn.A0W(c75093YzArr2, c75093YzArr3, i10, i8, i3);
                AbstractC06960Yn.A0W(c75083Yy.A02, c75093YzArr3, 0, 0, i8);
                AbstractC06960Yn.A0U(c75083Yy.A01, iArr2, i10, i8, i3);
                AbstractC06960Yn.A0U(c75083Yy.A01, iArr2, 0, 0, i8);
                c75083Yy.A02 = c75093YzArr3;
                c75083Yy.A01 = iArr2;
            } else {
                int i11 = i8 + 1;
                System.arraycopy(c75093YzArr2, i8, c75093YzArr2, i11, i3 - i8);
                int[] iArr3 = c75083Yy.A01;
                AbstractC06960Yn.A0U(iArr3, iArr3, i11, i8, i3);
            }
            c75083Yy.A02[i8] = new WeakReference(interfaceC74933Yj);
            c75083Yy.A01[i8] = identityHashCode;
            c75083Yy.A00++;
        }
    }

    public static final boolean A0J(InterfaceC74933Yj interfaceC74933Yj) {
        C75073Yx c75073Yx = A06;
        int i = A00;
        if (c75073Yx.A01 > 0) {
            i = c75073Yx.A04[0];
        }
        AbstractC75003Yq abstractC75003Yq = null;
        AbstractC75003Yq abstractC75003Yq2 = null;
        int i2 = 0;
        for (AbstractC75003Yq B6j = interfaceC74933Yj.B6j(); B6j != null; B6j = B6j.A01) {
            int i3 = B6j.A00;
            if (i3 != 0) {
                if (i3 < i) {
                    if (abstractC75003Yq == null) {
                        i2++;
                        abstractC75003Yq = B6j;
                    } else {
                        AbstractC75003Yq abstractC75003Yq3 = B6j;
                        if (B6j.A00 < abstractC75003Yq.A00) {
                            abstractC75003Yq3 = abstractC75003Yq;
                            abstractC75003Yq = B6j;
                        }
                        if (abstractC75003Yq2 == null) {
                            abstractC75003Yq2 = interfaceC74933Yj.B6j();
                            AbstractC75003Yq abstractC75003Yq4 = abstractC75003Yq2;
                            while (true) {
                                if (abstractC75003Yq2 != null) {
                                    if (abstractC75003Yq2.A00 >= i) {
                                        break;
                                    }
                                    if (abstractC75003Yq4.A00 < abstractC75003Yq2.A00) {
                                        abstractC75003Yq4 = abstractC75003Yq2;
                                    }
                                    abstractC75003Yq2 = abstractC75003Yq2.A01;
                                } else {
                                    abstractC75003Yq2 = abstractC75003Yq4;
                                    break;
                                }
                            }
                        }
                        abstractC75003Yq.A00 = 0;
                        abstractC75003Yq.A01(abstractC75003Yq2);
                        abstractC75003Yq = abstractC75003Yq3;
                    }
                } else {
                    i2++;
                }
            }
        }
        if (i2 <= 1) {
            return false;
        }
        return true;
    }
}
