package X;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: X.0Yd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06860Yd<K, V> implements Map<K, V>, Serializable, InterfaceC16540rz {
    public static final C06860Yd A0D;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public AnonymousClass015 A05;
    public C01K A06;
    public C03Q A07;
    public boolean A08;
    public int[] A09;
    public int[] A0A;
    public Object[] A0B;
    public Object[] A0C;

    static {
        C06860Yd c06860Yd = new C06860Yd(0);
        c06860Yd.A08 = true;
        A0D = c06860Yd;
    }

    public final boolean A06(Map.Entry entry) {
        C14360o3.A0B(entry, 0);
        int A00 = A00(entry.getKey(), this);
        if (A00 < 0) {
            return false;
        }
        Object[] objArr = this.A0C;
        C14360o3.A0A(objArr);
        return C14360o3.A0K(objArr[A00], entry.getValue());
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        C14360o3.A0B(map, 0);
        A05();
        java.util.Set<Map.Entry<K, V>> entrySet = map.entrySet();
        if (!entrySet.isEmpty()) {
            A01(entrySet.size());
            for (Map.Entry<K, V> entry : entrySet) {
                int A04 = A04(entry.getKey());
                Object[] objArr = this.A0C;
                if (objArr == null) {
                    objArr = new Object[this.A0B.length];
                    this.A0C = objArr;
                }
                if (A04 < 0) {
                    A04 = (-A04) - 1;
                    if (!C14360o3.A0K(entry.getValue(), objArr[A04])) {
                    }
                }
                objArr[A04] = entry.getValue();
            }
        }
    }

    public C06860Yd(int i) {
        if (i >= 0) {
            Object[] objArr = new Object[i];
            int[] iArr = new int[i];
            int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
            this.A0B = objArr;
            this.A0C = null;
            this.A0A = iArr;
            this.A09 = new int[highestOneBit];
            this.A02 = 2;
            this.A01 = 0;
            this.A00 = Integer.numberOfLeadingZeros(highestOneBit) + 1;
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    public static final int A00(Object obj, C06860Yd c06860Yd) {
        int i;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i2 = (i * (-1640531527)) >>> c06860Yd.A00;
        int i3 = c06860Yd.A02;
        while (true) {
            int i4 = c06860Yd.A09[i2];
            if (i4 != 0) {
                if (i4 > 0) {
                    int i5 = i4 - 1;
                    if (C14360o3.A0K(c06860Yd.A0B[i5], obj)) {
                        return i5;
                    }
                }
                i3--;
                if (i3 < 0) {
                    break;
                }
                int i6 = i2 - 1;
                if (i2 == 0) {
                    i2 = c06860Yd.A09.length - 1;
                } else {
                    i2 = i6;
                }
            } else {
                break;
            }
        }
        return -1;
    }

    private final void A01(int i) {
        Object[] objArr;
        int highestOneBit;
        Object[] objArr2 = this.A0B;
        int length = objArr2.length;
        int i2 = this.A01;
        int i3 = length - i2;
        int size = i2 - size();
        if (i3 < i && i3 + size >= i && size >= length / 4) {
            highestOneBit = this.A09.length;
        } else {
            int i4 = i2 + i;
            if (i4 >= 0) {
                if (i4 <= length) {
                    return;
                }
                int A00 = C0eC.A00(length, i4);
                Object[] copyOf = Arrays.copyOf(objArr2, A00);
                C14360o3.A07(copyOf);
                this.A0B = copyOf;
                Object[] objArr3 = this.A0C;
                if (objArr3 != null) {
                    objArr = Arrays.copyOf(objArr3, A00);
                    C14360o3.A07(objArr);
                } else {
                    objArr = null;
                }
                this.A0C = objArr;
                int[] copyOf2 = Arrays.copyOf(this.A0A, A00);
                C14360o3.A07(copyOf2);
                this.A0A = copyOf2;
                if (A00 < 1) {
                    A00 = 1;
                }
                highestOneBit = Integer.highestOneBit(A00 * 3);
                if (highestOneBit <= this.A09.length) {
                    return;
                }
            } else {
                throw new OutOfMemoryError();
            }
        }
        A02(highestOneBit);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x006b, code lost:
    
        r2[r4] = r6 + 1;
        r7.A0A[r6] = r4;
        r6 = r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A02(int r8) {
        /*
            r7 = this;
            int r0 = r7.A03
            int r0 = r0 + 1
            r7.A03 = r0
            int r5 = r7.A01
            int r0 = r7.size()
            if (r5 <= r0) goto L39
            java.lang.Object[] r4 = r7.A0C
            r3 = 0
            r2 = 0
        L12:
            if (r3 >= r5) goto L2b
            int[] r0 = r7.A0A
            r0 = r0[r3]
            if (r0 < 0) goto L28
            java.lang.Object[] r1 = r7.A0B
            r0 = r1[r3]
            r1[r2] = r0
            if (r4 == 0) goto L26
            r0 = r4[r3]
            r4[r2] = r0
        L26:
            int r2 = r2 + 1
        L28:
            int r3 = r3 + 1
            goto L12
        L2b:
            java.lang.Object[] r0 = r7.A0B
            X.AbstractC11600jJ.A01(r0, r2, r5)
            if (r4 == 0) goto L37
            int r0 = r7.A01
            X.AbstractC11600jJ.A01(r4, r2, r0)
        L37:
            r7.A01 = r2
        L39:
            int[] r1 = r7.A09
            int r0 = r1.length
            r6 = 0
            if (r8 == r0) goto L8c
            int[] r0 = new int[r8]
            r7.A09 = r0
            int r0 = java.lang.Integer.numberOfLeadingZeros(r8)
            int r0 = r0 + 1
            r7.A00 = r0
        L4b:
            int r0 = r7.A01
            if (r6 >= r0) goto L90
            int r5 = r6 + 1
            java.lang.Object[] r0 = r7.A0B
            r0 = r0[r6]
            if (r0 == 0) goto L8a
            int r4 = r0.hashCode()
        L5b:
            r0 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r4 = r4 * r0
            int r0 = r7.A00
            int r4 = r4 >>> r0
            int r3 = r7.A02
        L64:
            int[] r2 = r7.A09
            r0 = r2[r4]
            r1 = 1
            if (r0 != 0) goto L75
            int r0 = r6 + 1
            r2[r4] = r0
            int[] r0 = r7.A0A
            r0[r6] = r4
            r6 = r5
            goto L4b
        L75:
            int r3 = r3 + (-1)
            if (r3 >= 0) goto L81
            java.lang.String r1 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L81:
            int r0 = r4 + (-1)
            if (r4 != 0) goto L88
            int r4 = r2.length
            int r4 = r4 - r1
            goto L64
        L88:
            r4 = r0
            goto L64
        L8a:
            r4 = 0
            goto L5b
        L8c:
            java.util.Arrays.fill(r1, r6, r0, r6)
            goto L4b
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06860Yd.A02(int):void");
    }

    public static final void A03(C06860Yd c06860Yd, int i) {
        int i2;
        int i3;
        Object[] objArr = c06860Yd.A0B;
        C14360o3.A0B(objArr, 0);
        objArr[i] = null;
        Object[] objArr2 = c06860Yd.A0C;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int i4 = c06860Yd.A0A[i];
        int i5 = c06860Yd.A02 * 2;
        int[] iArr = c06860Yd.A09;
        int length = iArr.length;
        int i6 = length / 2;
        if (i5 > i6) {
            i5 = i6;
        }
        int i7 = 0;
        int i8 = i4;
        do {
            int i9 = i4;
            i4--;
            if (i9 == 0) {
                i4 = length - 1;
            }
            i7++;
            if (i7 <= c06860Yd.A02 && (i2 = iArr[i4]) != 0) {
                if (i2 < 0) {
                    iArr[i8] = -1;
                } else {
                    int i10 = i2 - 1;
                    Object obj = c06860Yd.A0B[i10];
                    if (obj != null) {
                        i3 = obj.hashCode();
                    } else {
                        i3 = 0;
                    }
                    int i11 = ((i3 * (-1640531527)) >>> c06860Yd.A00) - i4;
                    iArr = c06860Yd.A09;
                    length = iArr.length;
                    if ((i11 & (length - 1)) >= i7) {
                        iArr[i8] = i2;
                        c06860Yd.A0A[i10] = i8;
                    }
                    i5--;
                }
                i8 = i4;
                i7 = 0;
                i5--;
            } else {
                iArr[i8] = 0;
                break;
            }
        } while (i5 >= 0);
        iArr[i8] = -1;
        c06860Yd.A0A[i] = -1;
        c06860Yd.A04 = c06860Yd.size() - 1;
        c06860Yd.A03++;
    }

    public final void A05() {
        if (!this.A08) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        int i = this.A01;
        while (true) {
            i--;
            if (i >= 0) {
                if (this.A0A[i] >= 0) {
                    Object[] objArr = this.A0C;
                    C14360o3.A0A(objArr);
                    if (C14360o3.A0K(objArr[i], obj)) {
                        return true;
                    }
                }
            } else {
                return false;
            }
        }
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set entrySet() {
        AnonymousClass015 anonymousClass015 = this.A05;
        if (anonymousClass015 == null) {
            AnonymousClass015 anonymousClass0152 = new AnonymousClass015(this);
            this.A05 = anonymousClass0152;
            return anonymousClass0152;
        }
        return anonymousClass015;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (size() == map.size()) {
                    java.util.Set<Map.Entry<K, V>> entrySet = map.entrySet();
                    C14360o3.A0B(entrySet, 0);
                    for (Map.Entry<K, V> entry : entrySet) {
                        if (entry != null) {
                            try {
                                if (!A06(entry)) {
                                    return false;
                                }
                            } catch (ClassCastException unused) {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i;
        AbstractC11640jN abstractC11640jN = new AbstractC11640jN(this);
        int i2 = 0;
        while (abstractC11640jN.hasNext()) {
            int i3 = abstractC11640jN.A00;
            C06860Yd c06860Yd = abstractC11640jN.A03;
            if (i3 < c06860Yd.A01) {
                abstractC11640jN.A00 = i3 + 1;
                abstractC11640jN.A01 = i3;
                Object obj = c06860Yd.A0B[i3];
                int i4 = 0;
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                Object[] objArr = c06860Yd.A0C;
                C14360o3.A0A(objArr);
                Object obj2 = objArr[abstractC11640jN.A01];
                if (obj2 != null) {
                    i4 = obj2.hashCode();
                }
                abstractC11640jN.A01();
                i2 += i ^ i4;
            } else {
                throw new NoSuchElementException();
            }
        }
        return i2;
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set keySet() {
        C01K c01k = this.A06;
        if (c01k == null) {
            C01K c01k2 = new C01K(this);
            this.A06 = c01k2;
            return c01k2;
        }
        return c01k;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return this.A04;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        C03Q c03q = this.A07;
        if (c03q == null) {
            C03Q c03q2 = new C03Q(this);
            this.A07 = c03q2;
            return c03q2;
        }
        return c03q;
    }

    public final int A04(Object obj) {
        int i;
        A05();
        while (true) {
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            int i2 = (i * (-1640531527)) >>> this.A00;
            int i3 = this.A02 * 2;
            int length = this.A09.length / 2;
            if (i3 > length) {
                i3 = length;
            }
            int i4 = 0;
            while (true) {
                int[] iArr = this.A09;
                int i5 = iArr[i2];
                if (i5 <= 0) {
                    int i6 = this.A01;
                    Object[] objArr = this.A0B;
                    if (i6 >= objArr.length) {
                        A01(1);
                    } else {
                        int i7 = i6 + 1;
                        this.A01 = i7;
                        objArr[i6] = obj;
                        this.A0A[i6] = i2;
                        iArr[i2] = i7;
                        this.A04 = size() + 1;
                        this.A03++;
                        if (i4 > this.A02) {
                            this.A02 = i4;
                        }
                        return i6;
                    }
                } else {
                    if (C14360o3.A0K(this.A0B[i5 - 1], obj)) {
                        return -i5;
                    }
                    i4++;
                    if (i4 > i3) {
                        A02(this.A09.length * 2);
                        break;
                    }
                    int i8 = i2 - 1;
                    if (i2 == 0) {
                        i2 = this.A09.length - 1;
                    } else {
                        i2 = i8;
                    }
                }
            }
        }
    }

    @Override // java.util.Map
    public final void clear() {
        A05();
        int i = this.A01;
        int i2 = i - 1;
        if (i2 >= 0) {
            int i3 = 0;
            while (true) {
                int[] iArr = this.A0A;
                int i4 = iArr[i3];
                if (i4 >= 0) {
                    this.A09[i4] = 0;
                    iArr[i3] = -1;
                }
                if (i3 == i2) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        AbstractC11600jJ.A01(this.A0B, 0, i);
        Object[] objArr = this.A0C;
        if (objArr != null) {
            AbstractC11600jJ.A01(objArr, 0, this.A01);
        }
        this.A04 = 0;
        this.A01 = 0;
        this.A03++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (A00(obj, this) < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int A00 = A00(obj, this);
        if (A00 < 0) {
            return null;
        }
        Object[] objArr = this.A0C;
        C14360o3.A0A(objArr);
        return objArr[A00];
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (size() != 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        A05();
        int A04 = A04(obj);
        Object[] objArr = this.A0C;
        if (objArr == null) {
            objArr = new Object[this.A0B.length];
            this.A0C = objArr;
        }
        if (A04 < 0) {
            int i = (-A04) - 1;
            Object obj3 = objArr[i];
            objArr[i] = obj2;
            return obj3;
        }
        objArr[A04] = obj2;
        return null;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        A05();
        int A00 = A00(obj, this);
        if (A00 < 0) {
            return null;
        }
        Object[] objArr = this.A0C;
        C14360o3.A0A(objArr);
        Object obj2 = objArr[A00];
        A03(this, A00);
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        AbstractC11640jN abstractC11640jN = new AbstractC11640jN(this);
        int i = 0;
        while (abstractC11640jN.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = abstractC11640jN.A00;
            C06860Yd c06860Yd = abstractC11640jN.A03;
            if (i2 < c06860Yd.A01) {
                abstractC11640jN.A00 = i2 + 1;
                abstractC11640jN.A01 = i2;
                Object obj = c06860Yd.A0B[i2];
                if (obj == c06860Yd) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj);
                }
                sb.append('=');
                Object[] objArr = c06860Yd.A0C;
                C14360o3.A0A(objArr);
                Object obj2 = objArr[abstractC11640jN.A01];
                if (obj2 == c06860Yd) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj2);
                }
                abstractC11640jN.A01();
                i++;
            } else {
                throw new NoSuchElementException();
            }
        }
        sb.append("}");
        String obj3 = sb.toString();
        C14360o3.A07(obj3);
        return obj3;
    }

    public C06860Yd() {
        this(8);
    }
}
