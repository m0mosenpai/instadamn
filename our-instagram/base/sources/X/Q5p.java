package X;

import java.util.ListIterator;

/* loaded from: classes10.dex */
public final class Q5p<E> extends C6MM<E> implements C6MN<E> {
    public final int A00;
    public final Object[] A01;
    public final Object[] A02;
    public final int A03;

    /* JADX WARN: Type inference failed for: r4v0, types: [X.RpS, java.lang.Object] */
    @Override // X.C6MN
    public final C6MN A7p(Object obj, int i) {
        AbstractC63038SbD.A01(i, size());
        if (i == size()) {
            return A7U(obj);
        }
        int size = (size() - 1) & (-32);
        if (i >= size) {
            return A01(obj, this.A01, i - size);
        }
        ?? obj2 = new Object();
        obj2.A00 = null;
        return A01(obj2.A00, A03(obj2, obj, this.A01, this.A00, i), 0);
    }

    private final Object[] A03(C61548RpS c61548RpS, Object obj, Object[] objArr, int i, int i2) {
        Object[] A1a;
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            if (i3 == 0) {
                A1a = new Object[32];
            } else {
                A1a = AbstractC58319PtB.A1a(objArr, 32);
            }
            AbstractC06960Yn.A0W(objArr, A1a, i3 + 1, i3, 31);
            c61548RpS.A00 = objArr[31];
            A1a[i3] = obj;
        } else {
            A1a = AbstractC58319PtB.A1a(objArr, 32);
            int i4 = i - 5;
            Object obj2 = objArr[i3];
            C14360o3.A0C(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            A1a[i3] = A03(c61548RpS, obj, (Object[]) obj2, i4, i2);
            for (int i5 = i3 + 1; i5 < 32 && A1a[i5] != null; i5++) {
                Object obj3 = objArr[i5];
                C14360o3.A0C(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                A1a[i5] = A03(c61548RpS, c61548RpS.A00, (Object[]) obj3, i4, 0);
            }
        }
        return A1a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r1 == null) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object[] A04(X.C61548RpS r5, java.lang.Object[] r6, int r7, int r8) {
        /*
            r4 = this;
            int r0 = r8 >> r7
            r3 = r0 & 31
            r2 = 0
            r1 = 5
            if (r7 != r1) goto L10
            r0 = r6[r3]
            r5.A00 = r0
            r1 = r2
        Ld:
            if (r3 != 0) goto L1c
            return r2
        L10:
            java.lang.Object[] r0 = X.AbstractC58322PtE.A1b(r6, r3)
            int r7 = r7 - r1
            java.lang.Object[] r1 = r4.A04(r5, r0, r7, r8)
            if (r1 != 0) goto L1c
            goto Ld
        L1c:
            r0 = 32
            java.lang.Object[] r2 = X.AbstractC58319PtB.A1a(r6, r0)
            r2[r3] = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q5p.A04(X.RpS, java.lang.Object[], int, int):java.lang.Object[]");
    }

    private final Object[] A05(C61548RpS c61548RpS, Object[] objArr, int i, int i2) {
        Object[] A1a;
        int i3 = (i2 >> i) & 31;
        int i4 = 31;
        if (i == 0) {
            if (i3 == 0) {
                A1a = new Object[32];
            } else {
                A1a = AbstractC58319PtB.A1a(objArr, 32);
            }
            AbstractC06960Yn.A0W(objArr, A1a, i3, i3 + 1, 32);
            A1a[31] = c61548RpS.A00;
            c61548RpS.A00 = objArr[i3];
            return A1a;
        }
        if (objArr[31] == null) {
            i4 = ((((size() - 1) & (-32)) - 1) >> i) & 31;
        }
        Object[] A1a2 = AbstractC58319PtB.A1a(objArr, 32);
        int i5 = i - 5;
        int i6 = i3 + 1;
        if (i6 <= i4) {
            while (true) {
                Object obj = A1a2[i4];
                C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                A1a2[i4] = A05(c61548RpS, (Object[]) obj, i5, 0);
                if (i4 == i6) {
                    break;
                }
                i4--;
            }
        }
        Object obj2 = A1a2[i3];
        C14360o3.A0C(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        A1a2[i3] = A05(c61548RpS, (Object[]) obj2, i5, i2);
        return A1a2;
    }

    private final Object[] A06(Object obj, Object[] objArr, int i, int i2) {
        int i3 = (i2 >> i) & 31;
        Object[] A1a = AbstractC58319PtB.A1a(objArr, 32);
        if (i == 0) {
            A1a[i3] = obj;
            return A1a;
        }
        A1a[i3] = A06(obj, AbstractC58322PtE.A1b(A1a, i3), i - 5, i2);
        return A1a;
    }

    @Override // X.AbstractC17040sw
    public final int A08() {
        return this.A03;
    }

    @Override // X.C6MN
    public final /* bridge */ /* synthetic */ C64937TaD AF0() {
        return new C64937TaD(this, this.A01, this.A02, this.A00);
    }

    @Override // X.C6MN
    public final C6MN EEr(InterfaceC16660sJ interfaceC16660sJ) {
        C64937TaD c64937TaD = new C64937TaD(this, this.A01, this.A02, this.A00);
        c64937TaD.A0Q(interfaceC16660sJ);
        return c64937TaD.A0P();
    }

    public Q5p(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.A01 = objArr;
        this.A02 = objArr2;
        this.A03 = i;
        this.A00 = i2;
        if (size() > 32) {
            size();
            size();
        } else {
            SQP.A00(AnonymousClass001.A0O("Trie-based persistent vector should have at least 33 elements, got ", size()));
            throw C00O.createAndThrow();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.RpS, java.lang.Object] */
    private final C6MN A00(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        if (size == 1) {
            if (i2 == 0) {
                if (objArr.length == 33) {
                    objArr = AbstractC58319PtB.A1a(objArr, 32);
                }
                return new C6ML(objArr);
            }
            ?? obj = new Object();
            obj.A00 = null;
            Object[] A04 = A04(obj, objArr, i2, i - 1);
            C14360o3.A0A(A04);
            Object obj2 = obj.A00;
            C14360o3.A0C(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            Object[] objArr2 = (Object[]) obj2;
            if (A04[1] == null) {
                Object obj3 = A04[0];
                C14360o3.A0C(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                A04 = (Object[]) obj3;
                i2 -= 5;
            }
            return new Q5p(A04, objArr2, i, i2);
        }
        Object[] objArr3 = this.A02;
        Object[] A1a = AbstractC58319PtB.A1a(objArr3, 32);
        int i4 = size - 1;
        if (i3 < i4) {
            AbstractC06960Yn.A0W(objArr3, A1a, i3, i3 + 1, size);
        }
        A1a[i4] = null;
        return new Q5p(objArr, A1a, (i + size) - 1, i2);
    }

    private final Q5p A01(Object obj, Object[] objArr, int i) {
        int size = size() - ((size() - 1) & (-32));
        Object[] objArr2 = this.A02;
        Object[] A1a = AbstractC58319PtB.A1a(objArr2, 32);
        if (size < 32) {
            AbstractC06960Yn.A0W(objArr2, A1a, i + 1, i, size);
            A1a[i] = obj;
            return new Q5p(objArr, A1a, size() + 1, this.A00);
        }
        Object obj2 = objArr2[31];
        System.arraycopy(objArr2, i, A1a, i + 1, (size - 1) - i);
        A1a[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return A02(objArr, A1a, objArr3);
    }

    private final Q5p A02(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        Object[] A07;
        int size = size() >> 5;
        int i = this.A00;
        if (size > (1 << i)) {
            Object[] objArr4 = new Object[32];
            objArr4[0] = objArr;
            i += 5;
            A07 = A07(objArr4, objArr2, i);
        } else {
            A07 = A07(objArr, objArr2, i);
        }
        return new Q5p(A07, objArr3, size() + 1, i);
    }

    private final Object[] A07(Object[] objArr, Object[] objArr2, int i) {
        Object[] objArr3;
        int size = ((size() - 1) >> i) & 31;
        if (objArr != null) {
            objArr3 = AbstractC58319PtB.A1a(objArr, 32);
        } else {
            objArr3 = new Object[32];
        }
        if (i == 5) {
            objArr3[size] = objArr2;
            return objArr3;
        }
        objArr3[size] = A07((Object[]) objArr3[size], objArr2, i - 5);
        return objArr3;
    }

    @Override // X.C6MN
    public final C6MN A7U(Object obj) {
        int size = size() - ((size() - 1) & (-32));
        if (size < 32) {
            Object[] A1a = AbstractC58319PtB.A1a(this.A02, 32);
            A1a[size] = obj;
            return new Q5p(this.A01, A1a, size() + 1, this.A00);
        }
        Object[] objArr = new Object[32];
        objArr[0] = obj;
        return A02(this.A01, this.A02, objArr);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.RpS, java.lang.Object] */
    @Override // X.C6MN
    public final C6MN EF1(int i) {
        AbstractC63038SbD.A00(i, size());
        int size = (size() - 1) & (-32);
        Object[] objArr = this.A01;
        int i2 = this.A00;
        if (i >= size) {
            return A00(objArr, size, i2, i - size);
        }
        Object obj = this.A02[0];
        ?? obj2 = new Object();
        obj2.A00 = obj;
        return A00(A05(obj2, objArr, i2, i), size, i2, 0);
    }

    @Override // X.C6MN
    public final C6MN EP2(Object obj, int i) {
        AbstractC63038SbD.A00(i, size());
        if (((size() - 1) & (-32)) <= i) {
            Object[] A1a = AbstractC58319PtB.A1a(this.A02, 32);
            A1a[i & 31] = obj;
            return new Q5p(this.A01, A1a, size(), this.A00);
        }
        Object[] objArr = this.A01;
        int i2 = this.A00;
        return new Q5p(A06(obj, objArr, i2, i), this.A02, size(), i2);
    }

    @Override // X.AbstractC06990Yq, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        AbstractC63038SbD.A00(i, size());
        if (((size() - 1) & (-32)) <= i) {
            objArr = this.A02;
        } else {
            objArr = this.A01;
            for (int i2 = this.A00; i2 > 0; i2 -= 5) {
                objArr = AbstractC58322PtE.A1b(objArr, (i >> i2) & 31);
            }
        }
        return objArr[i & 31];
    }

    @Override // X.AbstractC06990Yq, java.util.List
    public final ListIterator listIterator(int i) {
        AbstractC63038SbD.A01(i, size());
        return new Q5m(this.A01, this.A02, i, size(), (this.A00 / 5) + 1);
    }
}
