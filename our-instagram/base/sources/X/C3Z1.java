package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.3Z1, reason: invalid class name */
/* loaded from: classes2.dex */
public class C3Z1 extends Snapshot {
    public static final int[] A09 = new int[0];
    public int A00;
    public int A01;
    public C75063Yw A02;
    public boolean A03;
    public int[] A04;
    public C18570vk A05;
    public List A06;
    public final InterfaceC16660sJ A07;
    public final InterfaceC16660sJ A08;

    public final C3Z1 A0J(InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
        C3Z1 c3z1;
        InterfaceC16660sJ interfaceC16660sJ3 = interfaceC16660sJ2;
        if (this instanceof C3Z0) {
            C9F3 c9f3 = new C9F3(interfaceC16660sJ, interfaceC16660sJ2, 7);
            int i = AbstractC75013Yr.A00;
            return (C3Z1) ((Snapshot) AbstractC75013Yr.A0A(new C206929Dx(c9f3, 40)));
        }
        if (this instanceof C3Z3) {
            C3Z3 c3z3 = (C3Z3) this;
            InterfaceC16660sJ A0C = AbstractC75013Yr.A0C(interfaceC16660sJ, c3z3.A00, true);
            InterfaceC16660sJ interfaceC16660sJ4 = c3z3.A01;
            if (interfaceC16660sJ4 != null && interfaceC16660sJ2 != interfaceC16660sJ4) {
                interfaceC16660sJ3 = new C9F3(interfaceC16660sJ2, interfaceC16660sJ4, 9);
            }
            boolean z = c3z3.A03;
            C3Z1 A00 = C3Z3.A00(c3z3);
            if (!z) {
                return new C3Z3(A00.A0J(null, interfaceC16660sJ3), A0C, interfaceC16660sJ3, false, true);
            }
            return A00.A0J(A0C, interfaceC16660sJ3);
        }
        if (!(!super.A02)) {
            SQP.A00("Cannot use a disposed snapshot");
        } else if (this.A03 && super.A01 < 0) {
            SQP.A01("Unsupported operation on a disposed or applied snapshot");
        } else {
            A0N(A0F());
            Object obj = AbstractC75013Yr.A07;
            synchronized (obj) {
                final int i2 = AbstractC75013Yr.A00;
                AbstractC75013Yr.A00 = i2 + 1;
                AbstractC75013Yr.A01 = AbstractC75013Yr.A01.A01(i2);
                final C75063Yw A0G = A0G();
                A0C(A0G.A01(i2));
                int A0F = A0F();
                while (true) {
                    A0F++;
                    if (A0F >= i2) {
                        break;
                    }
                    A0G = A0G.A01(A0F);
                }
                final InterfaceC16660sJ A0C2 = AbstractC75013Yr.A0C(interfaceC16660sJ, this.A07, true);
                InterfaceC16660sJ A04 = A04();
                if (A04 != null && interfaceC16660sJ2 != A04) {
                    interfaceC16660sJ3 = new C9F3(interfaceC16660sJ2, A04, 9);
                }
                final InterfaceC16660sJ interfaceC16660sJ5 = interfaceC16660sJ3;
                c3z1 = new C3Z1(this, A0G, A0C2, interfaceC16660sJ5, i2) { // from class: X.5Yy
                    public boolean A00;
                    public final C3Z1 A01;

                    @Override // X.C3Z1, androidx.compose.runtime.snapshots.Snapshot
                    public final void A0H() {
                        if (!((Snapshot) this).A02) {
                            super.A0H();
                            if (!this.A00) {
                                this.A00 = true;
                                this.A01.A0B(this);
                            }
                        }
                    }

                    @Override // X.C3Z1
                    public final C5Z0 A0K() {
                        HashMap hashMap;
                        C3Z1 c3z12 = this.A01;
                        if (!c3z12.A03 && !((Snapshot) c3z12).A02) {
                            C18570vk A0I = A0I();
                            int A0F2 = A0F();
                            if (A0I != null) {
                                hashMap = AbstractC75013Yr.A0B(c3z12, this, c3z12.A0G());
                            } else {
                                hashMap = null;
                            }
                            synchronized (AbstractC75013Yr.A07) {
                                AbstractC75013Yr.A0G(this);
                                if (A0I != null && A0I.A01 != 0) {
                                    C5Z0 A0L = A0L(c3z12.A0G(), hashMap, c3z12.A0F());
                                    if (!C14360o3.A0K(A0L, C5Yz.A00)) {
                                        return A0L;
                                    }
                                    C18570vk A0I2 = c3z12.A0I();
                                    if (A0I2 != null) {
                                        A0I2.A07(A0I);
                                    } else {
                                        c3z12.A0O(A0I);
                                        A0O(null);
                                    }
                                } else {
                                    A08();
                                }
                                if (c3z12.A0F() < A0F2) {
                                    c3z12.A0M();
                                }
                                c3z12.A0C(c3z12.A0G().A00(A0F2).A02(((C3Z1) this).A02));
                                c3z12.A0N(A0F2);
                                int i3 = ((Snapshot) this).A01;
                                ((Snapshot) this).A01 = -1;
                                if (i3 >= 0) {
                                    int[] iArr = c3z12.A04;
                                    C14360o3.A0B(iArr, 0);
                                    int length = iArr.length;
                                    int[] copyOf = Arrays.copyOf(iArr, length + 1);
                                    copyOf[length] = i3;
                                    c3z12.A04 = copyOf;
                                }
                                c3z12.A02 = c3z12.A02.A03(((C3Z1) this).A02);
                                int[] iArr2 = this.A04;
                                int length2 = iArr2.length;
                                if (length2 != 0) {
                                    int[] iArr3 = c3z12.A04;
                                    int length3 = iArr3.length;
                                    if (length3 != 0) {
                                        int[] copyOf2 = Arrays.copyOf(iArr3, length3 + length2);
                                        System.arraycopy(iArr2, 0, copyOf2, length3, length2);
                                        C14360o3.A0A(copyOf2);
                                        iArr2 = copyOf2;
                                    }
                                    c3z12.A04 = iArr2;
                                }
                                ((C3Z1) this).A03 = true;
                                if (!this.A00) {
                                    this.A00 = true;
                                    c3z12.A0B(this);
                                }
                                return C5Yz.A00;
                            }
                        }
                        return new C5Z1(this);
                    }

                    {
                        this.A01 = this;
                        this.A0A(this);
                    }
                };
            }
            if (!this.A03 && !super.A02) {
                int A0F2 = A0F();
                synchronized (obj) {
                    int i3 = AbstractC75013Yr.A00;
                    AbstractC75013Yr.A00 = i3 + 1;
                    super.A00 = i3;
                    AbstractC75013Yr.A01 = AbstractC75013Yr.A01.A01(A0F());
                }
                C75063Yw A0G2 = A0G();
                int A0F3 = A0F();
                for (int i4 = A0F2 + 1; i4 < A0F3; i4++) {
                    A0G2 = A0G2.A01(i4);
                }
                A0C(A0G2);
            }
            return c3z1;
        }
        throw C00O.createAndThrow();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void A07() {
        for (int i : this.A04) {
            AbstractC75013Yr.A0F(i);
        }
        super.A07();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void A0H() {
        if (!super.A02) {
            super.A0H();
            A0B(this);
        }
    }

    public final C18570vk A0I() {
        if (this instanceof C3Z3) {
            return C3Z3.A00((C3Z3) this).A0I();
        }
        return this.A05;
    }

    public C5Z0 A0K() {
        HashMap hashMap;
        C18570vk A0I;
        if (this instanceof C3Z3) {
            return C3Z3.A00((C3Z3) this).A0K();
        }
        if (this instanceof C3Z0) {
            throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
        }
        C18570vk A0I2 = A0I();
        if (A0I2 != null) {
            AtomicReference atomicReference = AbstractC75013Yr.A08;
            hashMap = AbstractC75013Yr.A0B((C3Z1) atomicReference.get(), this, AbstractC75013Yr.A01.A00(((Snapshot) atomicReference.get()).A0F()));
        } else {
            hashMap = null;
        }
        List list = C16930sl.A00;
        Object obj = AbstractC75013Yr.A07;
        synchronized (obj) {
            AbstractC75013Yr.A0G(this);
            if (A0I2 != null && A0I2.A01 != 0) {
                C3Z0 c3z0 = (C3Z0) AbstractC75013Yr.A08.get();
                C5Z0 A0L = A0L(AbstractC75013Yr.A01.A00(c3z0.A0F()), hashMap, AbstractC75013Yr.A00);
                if (!C14360o3.A0K(A0L, C5Yz.A00)) {
                    return A0L;
                }
                A05();
                AbstractC75013Yr.A09(c3z0, AbstractC75013Yr.A09);
                A0I = c3z0.A0I();
                A0O(null);
                c3z0.A0O(null);
                list = AbstractC75013Yr.A02;
            } else {
                A05();
                C3Z0 c3z02 = (C3Z0) AbstractC75013Yr.A08.get();
                AbstractC75013Yr.A09(c3z02, AbstractC75013Yr.A09);
                A0I = c3z02.A0I();
                if (A0I != null && A0I.A01 != 0) {
                    list = AbstractC75013Yr.A02;
                } else {
                    A0I = null;
                }
            }
            this.A03 = true;
            if (A0I != null) {
                C1127457f c1127457f = new C1127457f(A0I);
                if (!c1127457f.isEmpty()) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((InterfaceC16620sF) list.get(i)).invoke(c1127457f, this);
                    }
                }
            }
            if (A0I2 != null && A0I2.A01 != 0) {
                C1127457f c1127457f2 = new C1127457f(A0I2);
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((InterfaceC16620sF) list.get(i2)).invoke(c1127457f2, this);
                }
            }
            synchronized (obj) {
                A07();
                AbstractC75013Yr.A0D();
                if (A0I != null) {
                    Object[] objArr = A0I.A03;
                    long[] jArr = A0I.A02;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j = jArr[i3];
                            if ((j & ((j ^ (-1)) << 7) & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i4 = 8 - (((i3 - length) ^ (-1)) >>> 31);
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if ((j & 255) < 128) {
                                        AbstractC75013Yr.A0I((InterfaceC74933Yj) objArr[(i3 << 3) + i5]);
                                    }
                                    j >>= 8;
                                }
                                if (i4 != 8) {
                                    break;
                                }
                            }
                            if (i3 == length) {
                                break;
                            }
                            i3++;
                        }
                    }
                }
                if (A0I2 != null) {
                    Object[] objArr2 = A0I2.A03;
                    long[] jArr2 = A0I2.A02;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i6 = 0;
                        while (true) {
                            long j2 = jArr2[i6];
                            if ((((j2 ^ (-1)) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i7 = 8 - (((i6 - length2) ^ (-1)) >>> 31);
                                for (int i8 = 0; i8 < i7; i8++) {
                                    if ((j2 & 255) < 128) {
                                        AbstractC75013Yr.A0I((InterfaceC74933Yj) objArr2[(i6 << 3) + i8]);
                                    }
                                    j2 >>= 8;
                                }
                                if (i7 != 8) {
                                    break;
                                }
                            }
                            if (i6 == length2) {
                                break;
                            }
                            i6++;
                        }
                    }
                }
                List list2 = this.A06;
                if (list2 != null) {
                    int size3 = list2.size();
                    for (int i9 = 0; i9 < size3; i9++) {
                        AbstractC75013Yr.A0I((InterfaceC74933Yj) list2.get(i9));
                    }
                }
                this.A06 = null;
            }
            return C5Yz.A00;
        }
    }

    public final C5Z0 A0L(C75063Yw c75063Yw, Map map, int i) {
        InterfaceC74933Yj interfaceC74933Yj;
        AbstractC75003Yq B6j;
        AbstractC75003Yq A05;
        AbstractC75003Yq A052;
        Object CpR;
        C75063Yw A03 = A0G().A01(A0F()).A03(this.A02);
        C18570vk A0I = A0I();
        C14360o3.A0A(A0I);
        Object[] objArr = A0I.A03;
        long[] jArr = A0I.A02;
        int length = jArr.length - 2;
        ArrayList arrayList = null;
        if (length >= 0) {
            ArrayList arrayList2 = null;
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - (((i2 - length) ^ (-1)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((j & 255) < 128 && (A05 = AbstractC75013Yr.A05(c75063Yw, (B6j = (interfaceC74933Yj = (InterfaceC74933Yj) objArr[(i2 << 3) + i4]).B6j()), i)) != null && (A052 = AbstractC75013Yr.A05(A03, B6j, A0F())) != null && A052.A00 != 1 && !A05.equals(A052)) {
                            AbstractC75003Yq A053 = AbstractC75013Yr.A05(A0G(), B6j, A0F());
                            if (A053 != null) {
                                if ((map == null || (CpR = map.get(A05)) == null) && (CpR = interfaceC74933Yj.CpR(A052, A05, A053)) == null) {
                                    return new C5Z1(this);
                                }
                                if (!CpR.equals(A053)) {
                                    if (CpR.equals(A05)) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(new C09530e4(interfaceC74933Yj, A05.A00()));
                                        if (arrayList2 == null) {
                                            arrayList2 = new ArrayList();
                                        }
                                        arrayList2.add(interfaceC74933Yj);
                                    } else {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        if (CpR.equals(A052)) {
                                            CpR = A052.A00();
                                        }
                                        arrayList.add(new C09530e4(interfaceC74933Yj, CpR));
                                    }
                                }
                            } else {
                                AbstractC75013Yr.A0E();
                                throw C00O.createAndThrow();
                            }
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
            if (arrayList != null) {
                A0M();
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    C09530e4 c09530e4 = (C09530e4) arrayList.get(i5);
                    InterfaceC74933Yj interfaceC74933Yj2 = (InterfaceC74933Yj) c09530e4.A00;
                    AbstractC75003Yq abstractC75003Yq = (AbstractC75003Yq) c09530e4.A01;
                    abstractC75003Yq.A00 = A0F();
                    synchronized (AbstractC75013Yr.A07) {
                        abstractC75003Yq.A01 = interfaceC74933Yj2.B6j();
                        interfaceC74933Yj2.E5y(abstractC75003Yq);
                    }
                }
            }
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    A0I.A0A(arrayList2.get(i6));
                }
                List list = this.A06;
                if (list != null) {
                    arrayList2 = AbstractC001800i.A0S(arrayList2, list);
                }
                this.A06 = arrayList2;
            }
        }
        return C5Yz.A00;
    }

    public final void A0N(int i) {
        synchronized (AbstractC75013Yr.A07) {
            this.A02 = this.A02.A01(i);
        }
    }

    public final void A0O(C18570vk c18570vk) {
        if (this instanceof C3Z3) {
            ST4.A00();
            throw C00O.createAndThrow();
        }
        this.A05 = c18570vk;
    }

    public C3Z1(C75063Yw c75063Yw, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, int i) {
        super(c75063Yw, i);
        this.A07 = interfaceC16660sJ;
        this.A08 = interfaceC16660sJ2;
        this.A02 = C75063Yw.A04;
        this.A04 = A09;
        this.A00 = 1;
    }

    public final void A0M() {
        A0N(A0F());
        if (!this.A03 && !super.A02) {
            int A0F = A0F();
            synchronized (AbstractC75013Yr.A07) {
                int i = AbstractC75013Yr.A00;
                AbstractC75013Yr.A00 = i + 1;
                if (this instanceof C3Z3) {
                    ST4.A00();
                    throw C00O.createAndThrow();
                }
                super.A00 = i;
                AbstractC75013Yr.A01 = AbstractC75013Yr.A01.A01(A0F());
            }
            C75063Yw A0G = A0G();
            int A0F2 = A0F();
            for (int i2 = A0F + 1; i2 < A0F2; i2++) {
                A0G = A0G.A01(i2);
            }
            A0C(A0G);
        }
    }
}
