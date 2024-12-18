package X;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.TaD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64937TaD extends C04D implements List, Collection, C0YV, InterfaceC019807s {
    public int A00;
    public int A01;
    public C5VU A02 = new Object();
    public Object[] A03;
    public Object[] A04;
    public C6MN A05;
    public Object[] A06;
    public Object[] A07;

    private final int A01(C61548RpS c61548RpS, List list, List list2, InterfaceC16660sJ interfaceC16660sJ, Object[] objArr, int i, int i2) {
        if (objArr.length == 33 && objArr[32] == this.A02) {
            list.add(objArr);
        }
        Object obj = c61548RpS.A00;
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!AbstractC25231BEo.A1a(obj2, interfaceC16660sJ)) {
                if (i2 == 32) {
                    if (AbstractC166987dD.A1b(list)) {
                        objArr3 = (Object[]) list.remove(AbstractC25226BEj.A05(list));
                    } else {
                        objArr3 = A0B();
                    }
                    i2 = 0;
                }
                objArr3[i2] = obj2;
                i2++;
            }
        }
        c61548RpS.A00 = objArr3;
        if (objArr2 != objArr3) {
            list2.add(objArr2);
        }
        return i2;
    }

    private final void A06(Collection collection, Object[] objArr, Object[] objArr2, Object[][] objArr3, int i, int i2, int i3) {
        Object[] A0B;
        if (i3 >= 1) {
            Object[] A0H = A0H(objArr);
            objArr3[0] = A0H;
            int i4 = i & 31;
            int A09 = (AbstractC58318PtA.A09(collection, i) - 1) & 31;
            int i5 = (i2 - i4) + A09;
            if (i5 < 32) {
                AbstractC06960Yn.A0W(A0H, objArr2, A09 + 1, i4, i2);
            } else {
                int i6 = (i5 - 32) + 1;
                if (i3 == 1) {
                    A0B = A0H;
                } else {
                    A0B = A0B();
                    i3--;
                    objArr3[i3] = A0B;
                }
                int i7 = i2 - i6;
                AbstractC06960Yn.A0W(A0H, objArr2, 0, i7, i2);
                AbstractC06960Yn.A0W(A0H, A0B, A09 + 1, i4, i7);
                objArr2 = A0B;
            }
            Iterator it = collection.iterator();
            A08(it, A0H, i4);
            for (int i8 = 1; i8 < i3; i8++) {
                Object[] A0B2 = A0B();
                A08(it, A0B2, 0);
                objArr3[i8] = A0B2;
            }
            A08(it, objArr2, 0);
            return;
        }
        SQP.A00("requires at least one nullBuffer");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.RpS, java.lang.Object] */
    private final void A09(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.A03 = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.A04 = objArr;
            this.A01 = i;
        } else {
            ?? obj = new Object();
            obj.A00 = null;
            C14360o3.A0A(objArr);
            Object[] A0E = A0E(obj, objArr, i2, i);
            C14360o3.A0A(A0E);
            Object obj2 = obj.A00;
            C14360o3.A0C(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            this.A04 = (Object[]) obj2;
            this.A01 = i;
            if (A0E[1] == null) {
                this.A03 = (Object[]) A0E[0];
                i2 -= 5;
            } else {
                this.A03 = A0E;
            }
        }
        this.A00 = i2;
    }

    private final Object[] A0I(Object[] objArr, int i) {
        if (objArr.length == 33 && objArr[32] == this.A02) {
            System.arraycopy(objArr, 0, objArr, i, 32 - i);
            return objArr;
        }
        Object[] A0B = A0B();
        AbstractC06960Yn.A0W(objArr, A0B, i, 0, 32 - i);
        return A0B;
    }

    private final Object[] A0J(Object[] objArr, int i, int i2) {
        if (i2 >= 0) {
            if (i2 != 0) {
                int i3 = (i >> i2) & 31;
                Object A0J = A0J(AbstractC58322PtE.A1b(objArr, i3), i, i2 - 5);
                if (i3 < 31) {
                    int i4 = i3 + 1;
                    if (objArr[i4] != null) {
                        if (objArr.length == 33 && objArr[32] == this.A02) {
                            Arrays.fill(objArr, i4, 32, (Object) null);
                        }
                        Object[] A0B = A0B();
                        AbstractC06960Yn.A0W(objArr, A0B, 0, 0, i4);
                        objArr = A0B;
                    }
                }
                if (A0J != objArr[i3]) {
                    Object[] A0H = A0H(objArr);
                    A0H[i3] = A0J;
                    return A0H;
                }
                return objArr;
            }
            return objArr;
        }
        SQP.A00("shift should be positive");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.RpS, java.lang.Object] */
    @Override // X.C04D, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        AbstractC63038SbD.A01(i, size());
        if (i == size()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int A00 = A00();
        if (i >= A00) {
            A05(obj, this.A03, i - A00);
            return;
        }
        ?? obj2 = new Object();
        obj2.A00 = null;
        Object[] objArr = this.A03;
        C14360o3.A0A(objArr);
        A05(obj2.A00, A0C(obj2, obj, objArr, this.A00, i), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.RpS, java.lang.Object] */
    @Override // X.C04D, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        AbstractC63038SbD.A00(i, size());
        if (A00() <= i) {
            Object[] A0H = A0H(this.A04);
            if (A0H != this.A04) {
                ((AbstractList) this).modCount++;
            }
            int i2 = i & 31;
            Object obj2 = A0H[i2];
            A0H[i2] = obj;
            this.A04 = A0H;
            return obj2;
        }
        ?? obj3 = new Object();
        obj3.A00 = null;
        Object[] objArr = this.A03;
        C14360o3.A0A(objArr);
        this.A03 = A0D(obj3, obj, objArr, this.A00, i);
        return obj3.A00;
    }

    private final int A02(C61548RpS c61548RpS, InterfaceC16660sJ interfaceC16660sJ, int i) {
        Object[] objArr = this.A04;
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (AbstractC25231BEo.A1a(obj, interfaceC16660sJ)) {
                if (!z) {
                    objArr2 = A0H(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        c61548RpS.A00 = objArr2;
        if (i2 == i) {
            return i;
        }
        C14360o3.A0C(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        AbstractC06960Yn.A0V(objArr2, i2, i);
        this.A04 = objArr2;
        this.A01 = size() - (i - i2);
        return i2;
    }

    private final TTS A03(int i) {
        Object[] objArr = this.A03;
        if (objArr != null) {
            int A00 = A00() >> 5;
            AbstractC63038SbD.A01(i, A00);
            int i2 = this.A00;
            if (i2 == 0) {
                return new Q5l(objArr, i);
            }
            return new Q5n(objArr, i, A00, i2 / 5);
        }
        throw AbstractC166987dD.A14("Invalid root");
    }

    private final void A07(Collection collection, Object[] objArr, Object[][] objArr2, int i, int i2, int i3) {
        Object[] objArr3;
        Object[] objArr4 = objArr;
        if (this.A03 != null) {
            int i4 = i >> 5;
            int i5 = i3;
            Object[] objArr5 = objArr4;
            TTS A03 = A03(A00() >> 5);
            while (true) {
                int previousIndex = A03.previousIndex();
                objArr3 = (Object[]) A03.previous();
                if (previousIndex == i4) {
                    break;
                }
                AbstractC06960Yn.A0W(objArr3, objArr5, 0, 32 - i2, 32);
                objArr5 = A0I(objArr3, i2);
                i5--;
                objArr2[i5] = objArr5;
            }
            int A00 = i3 - (((A00() >> 5) - 1) - i4);
            if (A00 < i3) {
                objArr4 = objArr2[A00];
                C14360o3.A0A(objArr4);
            }
            A06(collection, objArr3, objArr4, objArr2, i, 32, A00);
            return;
        }
        throw AbstractC166987dD.A14("root is null");
    }

    public static final void A08(Iterator it, Object[] objArr, int i) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    private final Object[] A0B() {
        Object[] objArr = new Object[33];
        objArr[32] = this.A02;
        return objArr;
    }

    private final Object[] A0C(C61548RpS c61548RpS, Object obj, Object[] objArr, int i, int i2) {
        Object obj2;
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            c61548RpS.A00 = objArr[31];
            Object[] A0H = A0H(objArr);
            AbstractC06960Yn.A0W(objArr, A0H, i3 + 1, i3, 31);
            A0H[i3] = obj;
            return A0H;
        }
        Object[] A0H2 = A0H(objArr);
        int i4 = i - 5;
        Object obj3 = A0H2[i3];
        C14360o3.A0C(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj3;
        while (true) {
            A0H2[i3] = A0C(c61548RpS, obj, objArr2, i4, i2);
            i3++;
            if (i3 >= 32 || (obj2 = A0H2[i3]) == null) {
                return A0H2;
            }
            objArr2 = (Object[]) obj2;
            i2 = 0;
            obj = c61548RpS.A00;
        }
    }

    private final Object[] A0D(C61548RpS c61548RpS, Object obj, Object[] objArr, int i, int i2) {
        int i3 = (i2 >> i) & 31;
        Object[] A0H = A0H(objArr);
        if (i == 0) {
            if (A0H != objArr) {
                ((AbstractList) this).modCount++;
            }
            c61548RpS.A00 = A0H[i3];
            A0H[i3] = obj;
            return A0H;
        }
        Object obj2 = A0H[i3];
        C14360o3.A0C(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        A0H[i3] = A0D(c61548RpS, obj, (Object[]) obj2, i - 5, i2);
        return A0H;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if (r0 == null) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object[] A0E(X.C61548RpS r5, java.lang.Object[] r6, int r7, int r8) {
        /*
            r4 = this;
            int r0 = r8 + (-1)
            int r0 = r0 >> r7
            r3 = r0 & 31
            r2 = 0
            r1 = 5
            if (r7 != r1) goto L11
            r0 = r6[r3]
            r5.A00 = r0
            r0 = r2
        Le:
            if (r3 != 0) goto L1d
            return r2
        L11:
            java.lang.Object[] r0 = X.AbstractC58322PtE.A1b(r6, r3)
            int r7 = r7 - r1
            java.lang.Object[] r0 = r4.A0E(r5, r0, r7, r8)
            if (r0 != 0) goto L1d
            goto Le
        L1d:
            java.lang.Object[] r2 = r4.A0H(r6)
            r2[r3] = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64937TaD.A0E(X.RpS, java.lang.Object[], int, int):java.lang.Object[]");
    }

    private final Object[] A0F(C61548RpS c61548RpS, Object[] objArr, int i, int i2) {
        int i3 = (i2 >> i) & 31;
        int i4 = 31;
        if (i == 0) {
            Object obj = objArr[i3];
            Object[] A0H = A0H(objArr);
            AbstractC06960Yn.A0W(objArr, A0H, i3, i3 + 1, 32);
            A0H[31] = c61548RpS.A00;
            c61548RpS.A00 = obj;
            return A0H;
        }
        if (objArr[31] == null) {
            i4 = ((A00() - 1) >> i) & 31;
        }
        Object[] A0H2 = A0H(objArr);
        int i5 = i - 5;
        int i6 = i3 + 1;
        if (i6 <= i4) {
            while (true) {
                Object obj2 = A0H2[i4];
                C14360o3.A0C(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                A0H2[i4] = A0F(c61548RpS, (Object[]) obj2, i5, 0);
                if (i4 == i6) {
                    break;
                }
                i4--;
            }
        }
        Object obj3 = A0H2[i3];
        C14360o3.A0C(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        A0H2[i3] = A0F(c61548RpS, (Object[]) obj3, i5, i2);
        return A0H2;
    }

    private final Object[] A0H(Object[] objArr) {
        if (objArr == null) {
            return A0B();
        }
        int length = objArr.length;
        if (length == 33 && objArr[32] == this.A02) {
            return objArr;
        }
        Object[] A0B = A0B();
        if (length > 32) {
            length = 32;
        }
        AbstractC06960Yn.A0W(objArr, A0B, 0, 0, length);
        return A0B;
    }

    @Override // X.C04D
    public final int A0M() {
        return this.A01;
    }

    public final int A0O() {
        return ((AbstractList) this).modCount;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.5VU, java.lang.Object] */
    public final C6MN A0P() {
        C6MN q5p;
        C6MN c6mn;
        Object[] objArr = this.A03;
        if (objArr == this.A06 && this.A04 == this.A07) {
            c6mn = this.A05;
        } else {
            this.A02 = new Object();
            this.A06 = objArr;
            Object[] objArr2 = this.A04;
            this.A07 = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    c6mn = C6ML.A01;
                } else {
                    q5p = new C6ML(AbstractC58319PtB.A1a(objArr2, size()));
                }
            } else {
                q5p = new Q5p(objArr, objArr2, size(), this.A00);
            }
            c6mn = q5p;
        }
        this.A05 = c6mn;
        return c6mn;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r3 != false) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.RpS, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0Q(X.InterfaceC16660sJ r20) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64937TaD.A0Q(X.0sJ):boolean");
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Object[] A0B;
        AbstractC63038SbD.A01(i, size());
        if (i == size()) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int A09 = (AbstractC58318PtA.A09(collection, size() - i2) - 1) / 32;
        if (A09 == 0) {
            A00();
            int i3 = i & 31;
            int A092 = (AbstractC58318PtA.A09(collection, i) - 1) & 31;
            Object[] objArr = this.A04;
            A0B = A0H(objArr);
            int i4 = A092 + 1;
            int size = size();
            AbstractC06960Yn.A0W(objArr, A0B, i4, i3, AbstractC58319PtB.A02(size, size));
            A08(collection.iterator(), A0B, i3);
        } else {
            Object[][] objArr2 = new Object[A09];
            int size2 = size();
            int A02 = AbstractC58319PtB.A02(size2, size2);
            int A093 = AbstractC58318PtA.A09(collection, size());
            int A022 = AbstractC58319PtB.A02(A093, A093);
            if (i >= A00()) {
                A0B = A0B();
                A06(collection, this.A04, A0B, objArr2, i, A02, A09);
            } else if (A022 > A02) {
                int i5 = A022 - A02;
                A0B = A0I(this.A04, i5);
                A07(collection, A0B, objArr2, i, i5, A09);
            } else {
                Object[] objArr3 = this.A04;
                A0B = A0B();
                int i6 = A02 - A022;
                AbstractC06960Yn.A0W(objArr3, A0B, 0, i6, A02);
                int i7 = 32 - i6;
                Object[] A0I = A0I(this.A04, i7);
                int i8 = A09 - 1;
                objArr2[i8] = A0I;
                A07(collection, A0I, objArr2, i, i7, i8);
            }
            this.A03 = A0L(this.A03, objArr2, i2);
        }
        this.A04 = A0B;
        this.A01 = AbstractC58318PtA.A09(collection, size());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return A0Q(new DRU(collection, 22));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5VU, java.lang.Object] */
    public C64937TaD(C6MN c6mn, Object[] objArr, Object[] objArr2, int i) {
        this.A05 = c6mn;
        this.A06 = objArr;
        this.A07 = objArr2;
        this.A00 = i;
        this.A03 = objArr;
        this.A04 = objArr2;
        this.A01 = c6mn.size();
    }

    private final int A00() {
        if (size() <= 32) {
            return 0;
        }
        return AbstractC58318PtA.A08(this) & (-32);
    }

    private final Object A04(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        if (size == 1) {
            Object obj = this.A04[0];
            A09(objArr, i, i2);
            return obj;
        }
        Object[] objArr2 = this.A04;
        Object obj2 = objArr2[i3];
        Object[] A0H = A0H(objArr2);
        AbstractC06960Yn.A0W(objArr2, A0H, i3, i3 + 1, size);
        A0H[size - 1] = null;
        this.A03 = objArr;
        this.A04 = A0H;
        this.A01 = (i + size) - 1;
        this.A00 = i2;
        return obj2;
    }

    private final void A05(Object obj, Object[] objArr, int i) {
        int size = size();
        int A02 = AbstractC58319PtB.A02(size, size);
        Object[] A0H = A0H(this.A04);
        if (A02 < 32) {
            AbstractC06960Yn.A0W(this.A04, A0H, i + 1, i, A02);
            A0H[i] = obj;
            this.A03 = objArr;
            this.A04 = A0H;
            this.A01 = size() + 1;
            return;
        }
        Object[] objArr2 = this.A04;
        Object obj2 = objArr2[31];
        AbstractC06960Yn.A0W(objArr2, A0H, i + 1, i, 31);
        A0H[i] = obj;
        Object[] A1a = AbstractC58322PtE.A1a(obj2);
        A1a[32] = this.A02;
        A0A(objArr, A0H, A1a);
    }

    private final void A0A(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.A00;
        if (size > (1 << i)) {
            Object[] A1a = AbstractC58322PtE.A1a(objArr);
            A1a[32] = this.A02;
            this.A03 = A0K(A1a, objArr2, i + 5);
            this.A04 = objArr3;
            this.A00 += 5;
        } else {
            if (objArr == null) {
                this.A03 = objArr2;
            } else {
                this.A03 = A0K(objArr, objArr2, i);
            }
            this.A04 = objArr3;
        }
        this.A01 = size() + 1;
    }

    private final Object[] A0G(Iterator it, Object[] objArr, int i, int i2) {
        String str;
        if (!it.hasNext()) {
            str = "invalid buffersIterator";
        } else if (i2 >= 0) {
            if (i2 == 0) {
                return (Object[]) it.next();
            }
            Object[] A0H = A0H(objArr);
            int i3 = (i >> i2) & 31;
            int i4 = i2 - 5;
            Object[] A0G = A0G(it, (Object[]) A0H[i3], i, i4);
            while (true) {
                A0H[i3] = A0G;
                i3++;
                if (i3 >= 32 || !it.hasNext()) {
                    return A0H;
                }
                A0G = A0G(it, (Object[]) A0H[i3], 0, i4);
            }
        } else {
            str = "negative shift";
        }
        SQP.A00(str);
        throw C00O.createAndThrow();
    }

    private final Object[] A0K(Object[] objArr, Object[] objArr2, int i) {
        int A08 = (AbstractC58318PtA.A08(this) >> i) & 31;
        Object[] A0H = A0H(objArr);
        if (i != 5) {
            objArr2 = A0K((Object[]) A0H[A08], objArr2, i - 5);
        }
        A0H[A08] = objArr2;
        return A0H;
    }

    private final Object[] A0L(Object[] objArr, Object[][] objArr2, int i) {
        Object[] A0H;
        C0s6 A00 = AbstractC13190m5.A00(objArr2);
        int i2 = i >> 5;
        int i3 = this.A00;
        if (i2 < (1 << i3)) {
            A0H = A0G(A00, objArr, i, i3);
        } else {
            A0H = A0H(objArr);
        }
        while (A00.hasNext()) {
            int i4 = this.A00 + 5;
            this.A00 = i4;
            A0H = AbstractC58322PtE.A1a(A0H);
            A0H[32] = this.A02;
            A0G(A00, A0H, 1 << i4, i4);
        }
        return A0H;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.RpS, java.lang.Object] */
    @Override // X.C04D
    public final Object A0N(int i) {
        AbstractC63038SbD.A00(i, size());
        ((AbstractList) this).modCount++;
        int A00 = A00();
        if (i >= A00) {
            return A04(this.A03, A00, this.A00, i - A00);
        }
        Object obj = this.A04[0];
        ?? obj2 = new Object();
        obj2.A00 = obj;
        Object[] objArr = this.A03;
        C14360o3.A0A(objArr);
        A04(A0F(obj2, objArr, this.A00, i), A00, this.A00, 0);
        return obj2.A00;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        AbstractC63038SbD.A00(i, size());
        if (A00() <= i) {
            objArr = this.A04;
        } else {
            objArr = this.A03;
            C14360o3.A0A(objArr);
            for (int i2 = this.A00; i2 > 0; i2 -= 5) {
                objArr = AbstractC58322PtE.A1b(objArr, (i >> i2) & 31);
            }
        }
        return objArr[i & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        AbstractC63038SbD.A01(i, size());
        return new Q5o(this, i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int size = size();
        int A02 = AbstractC58319PtB.A02(size, size);
        if (A02 < 32) {
            Object[] A0H = A0H(this.A04);
            A0H[A02] = obj;
            this.A04 = A0H;
            this.A01 = size() + 1;
            return true;
        }
        Object[] A1a = AbstractC58322PtE.A1a(obj);
        A1a[32] = this.A02;
        A0A(this.A03, this.A04, A1a);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        Object[] A0B;
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int size = size();
        int A02 = AbstractC58319PtB.A02(size, size);
        Iterator it = collection.iterator();
        if (32 - A02 >= collection.size()) {
            A0B = A0H(this.A04);
            A08(it, A0B, A02);
        } else {
            int size2 = ((collection.size() + A02) - 1) / 32;
            Object[][] objArr = new Object[size2];
            Object[] A0H = A0H(this.A04);
            A08(it, A0H, A02);
            objArr[0] = A0H;
            for (int i = 1; i < size2; i++) {
                Object[] A0B2 = A0B();
                A08(it, A0B2, 0);
                objArr[i] = A0B2;
            }
            this.A03 = A0L(this.A03, objArr, A00());
            A0B = A0B();
            A08(it, A0B, 0);
        }
        this.A04 = A0B;
        this.A01 = AbstractC58318PtA.A09(collection, size());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }
}
