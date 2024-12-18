package X;

import java.util.Arrays;

/* renamed from: X.57O, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C57O {
    public static final C57O A04 = new C57O(null, new Object[0], 0, 0);
    public int A00;
    public int A01;
    public Object[] A02;
    public final C5VU A03;

    private final C57O A06(C5VU c5vu, Object obj, Object obj2, Object obj3, Object obj4, int i, int i2, int i3) {
        if (i3 > 30) {
            return new C57O(c5vu, new Object[]{obj, obj2, obj3, obj4}, 0, 0);
        }
        int i4 = (i >> i3) & 31;
        int i5 = (i2 >> i3) & 31;
        if (i4 != i5) {
            Object[] objArr = new Object[4];
            if (i4 < i5) {
                objArr[0] = obj;
                objArr[1] = obj2;
                objArr[2] = obj3;
                objArr[3] = obj4;
            } else {
                objArr[0] = obj3;
                objArr[1] = obj4;
                objArr[2] = obj;
                objArr[3] = obj2;
            }
            return new C57O(c5vu, objArr, (1 << i4) | (1 << i5), 0);
        }
        return new C57O(c5vu, new Object[]{A06(c5vu, obj, obj2, obj3, obj4, i, i2, i3 + 5)}, 0, 1 << i4);
    }

    private final boolean A07(C57O c57o) {
        if (this != c57o) {
            if (this.A01 == c57o.A01 && this.A00 == c57o.A00) {
                Object[] objArr = this.A02;
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    if (objArr[i] == c57o.A02[i]) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    private final int A00() {
        if (this.A01 == 0) {
            return this.A02.length / 2;
        }
        int bitCount = Integer.bitCount(this.A00);
        int length = this.A02.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += A0D(i).A00();
        }
        return bitCount;
    }

    private final C57O A03(C57O c57o, int i, int i2) {
        Object[] objArr = c57o.A02;
        if (objArr.length == 2 && c57o.A01 == 0) {
            Object[] objArr2 = this.A02;
            int length = objArr2.length;
            if (length == 1) {
                c57o.A00 = this.A01;
                return c57o;
            }
            int A0A = A0A(i2);
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Object[] copyOf = Arrays.copyOf(objArr2, length + 1);
            C14360o3.A07(copyOf);
            int i3 = i + 1;
            System.arraycopy(copyOf, i3, copyOf, i + 2, length - i3);
            System.arraycopy(copyOf, A0A, copyOf, A0A + 2, i - A0A);
            copyOf[A0A] = obj;
            copyOf[A0A + 1] = obj2;
            return new C57O(null, copyOf, this.A00 ^ i2, i2 ^ this.A01);
        }
        Object[] objArr3 = this.A02;
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length);
        C14360o3.A07(copyOf2);
        copyOf2[i] = c57o;
        return new C57O(null, copyOf2, this.A00, this.A01);
    }

    private final C57O A04(C57O c57o, C57O c57o2, C5VU c5vu, int i, int i2) {
        if (c57o2 == null) {
            Object[] objArr = this.A02;
            int length = objArr.length;
            if (length == 1) {
                return null;
            }
            C5VU c5vu2 = this.A03;
            Object[] objArr2 = new Object[length - 1];
            AbstractC06960Yn.A0W(objArr, objArr2, 0, 0, i);
            AbstractC06960Yn.A0W(objArr, objArr2, i, i + 1, length);
            if (c5vu2 == c5vu) {
                this.A02 = objArr2;
                this.A01 ^= i2;
            } else {
                return new C57O(c5vu, objArr2, this.A00, i2 ^ this.A01);
            }
        } else if (this.A03 == c5vu || c57o != c57o2) {
            return A05(c57o2, c5vu, i);
        }
        return this;
    }

    private final C57O A05(C57O c57o, C5VU c5vu, int i) {
        Object[] objArr = this.A02;
        int length = objArr.length;
        if (length == 1 && c57o.A02.length == 2 && c57o.A01 == 0) {
            c57o.A00 = this.A01;
            return c57o;
        }
        if (this.A03 == c5vu) {
            objArr[i] = c57o;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, length);
        C14360o3.A07(copyOf);
        copyOf[i] = c57o;
        return new C57O(c5vu, copyOf, this.A00, this.A01);
    }

    private final boolean A08(Object obj) {
        C17v A0B = C17s.A0B(C17s.A0C(0, this.A02.length), 2);
        int i = A0B.A00;
        int i2 = A0B.A01;
        int i3 = A0B.A02;
        if (i3 <= 0 ? !(i3 >= 0 || i2 > i) : i <= i2) {
            while (!C14360o3.A0K(obj, this.A02[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    private final Object[] A09(C5VU c5vu, Object obj, Object obj2, int i, int i2, int i3, int i4) {
        int i5;
        Object obj3 = this.A02[i];
        if (obj3 != null) {
            i5 = obj3.hashCode();
        } else {
            i5 = 0;
        }
        C57O A06 = A06(c5vu, obj3, this.A02[i + 1], obj, obj2, i5, i3, i4 + 5);
        int A0B = A0B(i2) + 1;
        Object[] objArr = this.A02;
        int i6 = A0B - 2;
        int length = objArr.length;
        Object[] objArr2 = new Object[(length - 2) + 1];
        AbstractC06960Yn.A0W(objArr, objArr2, 0, 0, i);
        AbstractC06960Yn.A0W(objArr, objArr2, i, i + 2, A0B);
        objArr2[i6] = A06;
        AbstractC06960Yn.A0W(objArr, objArr2, i6 + 1, A0B, length);
        return objArr2;
    }

    public final int A0A(int i) {
        return Integer.bitCount((i - 1) & this.A00) * 2;
    }

    public final int A0B(int i) {
        return (this.A02.length - 1) - Integer.bitCount((i - 1) & this.A01);
    }

    public final C57e A0C(Object obj, Object obj2, int i, int i2) {
        C57O c57o;
        C57e A0C;
        int i3;
        int i4 = 1 << ((i >> i2) & 31);
        boolean z = false;
        if ((i4 & this.A00) != 0) {
            z = true;
        }
        if (z) {
            int A0A = A0A(i4);
            if (C14360o3.A0K(obj, this.A02[A0A])) {
                Object[] objArr = this.A02;
                int i5 = A0A + 1;
                if (objArr[i5] != obj2) {
                    Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                    C14360o3.A07(copyOf);
                    copyOf[i5] = obj2;
                    c57o = new C57O(null, copyOf, this.A00, this.A01);
                    i3 = 0;
                }
                return null;
            }
            c57o = new C57O(null, A09(null, obj, obj2, A0A, i4, i, i2), this.A00 ^ i4, i4 | this.A01);
            i3 = 1;
        } else {
            if ((this.A01 & i4) != 0) {
                int A0B = A0B(i4);
                C57O A0D = A0D(A0B);
                if (i2 == 30) {
                    C17v A0B2 = C17s.A0B(C17s.A0C(0, A0D.A02.length), 2);
                    int i6 = A0B2.A00;
                    int i7 = A0B2.A01;
                    int i8 = A0B2.A02;
                    if (i8 <= 0 ? !(i8 >= 0 || i7 > i6) : i6 <= i7) {
                        while (!C14360o3.A0K(obj, A0D.A02[i6])) {
                            if (i6 != i7) {
                                i6 += i8;
                            }
                        }
                        Object[] objArr2 = A0D.A02;
                        int i9 = i6 + 1;
                        if (obj2 != objArr2[i9]) {
                            Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                            C14360o3.A07(copyOf2);
                            copyOf2[i9] = obj2;
                            A0C = new C57e(new C57O(null, copyOf2, 0, 0), 0);
                        }
                        return null;
                    }
                    A0C = new C57e(new C57O(null, AbstractC1127357d.A00(obj, obj2, A0D.A02, 0), 0, 0), 1);
                    break;
                }
                A0C = A0D.A0C(obj, obj2, i, i2 + 5);
                if (A0C == null) {
                    return null;
                }
                A0C.A00 = A03(A0C.A00, A0B, i4);
                return A0C;
            }
            c57o = new C57O(null, AbstractC1127357d.A00(obj, obj2, this.A02, A0A(i4)), i4 | this.A00, this.A01);
            i3 = 1;
        }
        return new C57e(c57o, i3);
    }

    public final C57O A0D(int i) {
        Object obj = this.A02[i];
        C14360o3.A0C(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (C57O) obj;
    }

    public final C57O A0E(C5VS c5vs, C57O c57o, C5VV c5vv, int i) {
        C57O c57o2;
        int i2;
        C57O A06;
        int i3;
        int i4;
        if (this == c57o) {
            c5vv.A00 += A00();
            return this;
        }
        if (i > 30) {
            C5VU c5vu = c5vs.A02;
            Object[] objArr = this.A02;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + c57o.A02.length);
            C14360o3.A07(copyOf);
            int length = this.A02.length;
            C17v A0B = C17s.A0B(C17s.A0C(0, c57o.A02.length), 2);
            int i5 = A0B.A00;
            int i6 = A0B.A01;
            int i7 = A0B.A02;
            if (i7 <= 0 ? !(i7 >= 0 || i6 > i5) : i5 <= i6) {
                while (true) {
                    if (!A08(c57o.A02[i5])) {
                        Object[] objArr2 = c57o.A02;
                        copyOf[length] = objArr2[i5];
                        copyOf[length + 1] = objArr2[i5 + 1];
                        length += 2;
                    } else {
                        c5vv.A00++;
                    }
                    if (i5 == i6) {
                        break;
                    }
                    i5 += i7;
                }
            }
            if (length == this.A02.length) {
                return this;
            }
            if (length == c57o.A02.length) {
                return c57o;
            }
            if (length == copyOf.length) {
                return new C57O(c5vu, copyOf, 0, 0);
            }
            Object[] copyOf2 = Arrays.copyOf(copyOf, length);
            C14360o3.A07(copyOf2);
            return new C57O(c5vu, copyOf2, 0, 0);
        }
        int i8 = this.A01 | c57o.A01;
        int i9 = this.A00;
        int i10 = c57o.A00;
        int i11 = (i9 ^ i10) & (i8 ^ (-1));
        int i12 = i9 & i10;
        while (i12 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i12);
            if (C14360o3.A0K(this.A02[A0A(lowestOneBit)], c57o.A02[c57o.A0A(lowestOneBit)])) {
                i11 |= lowestOneBit;
            } else {
                i8 |= lowestOneBit;
            }
            i12 ^= lowestOneBit;
        }
        int i13 = 0;
        if ((i8 & i11) == 0) {
            if (C14360o3.A0K(this.A03, c5vs.A02) && this.A00 == i11 && this.A01 == i8) {
                c57o2 = this;
            } else {
                c57o2 = new C57O(null, new Object[(Integer.bitCount(i11) * 2) + Integer.bitCount(i8)], i11, i8);
            }
            int i14 = 0;
            while (i8 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i8);
                Object[] objArr3 = c57o2.A02;
                int length2 = (objArr3.length - 1) - i14;
                boolean z = false;
                if ((lowestOneBit2 & this.A01) != 0) {
                    z = true;
                }
                int i15 = 0;
                if (z) {
                    A06 = A0D(A0B(lowestOneBit2));
                    if ((c57o.A01 & lowestOneBit2) != 0) {
                        A06 = A06.A0E(c5vs, c57o.A0D(c57o.A0B(lowestOneBit2)), c5vv, i + 5);
                    } else if ((c57o.A00 & lowestOneBit2) != 0) {
                        int A0A = c57o.A0A(lowestOneBit2);
                        Object[] objArr4 = c57o.A02;
                        Object obj = objArr4[A0A];
                        Object obj2 = objArr4[A0A + 1];
                        int size = c5vs.size();
                        if (obj != null) {
                            i15 = obj.hashCode();
                        }
                        A06 = A06.A0G(c5vs, obj, obj2, i15, i + 5);
                        if (c5vs.size() != size) {
                        }
                        c5vv.A00++;
                    }
                } else if ((c57o.A01 & lowestOneBit2) != 0) {
                    A06 = c57o.A0D(c57o.A0B(lowestOneBit2));
                    if ((this.A00 & lowestOneBit2) != 0) {
                        int A0A2 = A0A(lowestOneBit2);
                        Object obj3 = this.A02[A0A2];
                        if (obj3 != null) {
                            i3 = obj3.hashCode();
                        } else {
                            i3 = 0;
                        }
                        int i16 = i + 5;
                        if (!A06.A0K(obj3, i3, i16)) {
                            Object obj4 = this.A02[A0A2 + 1];
                            if (obj3 != null) {
                                i4 = obj3.hashCode();
                            } else {
                                i4 = 0;
                            }
                            A06 = A06.A0G(c5vs, obj3, obj4, i4, i16);
                        }
                        c5vv.A00++;
                    }
                } else {
                    int A0A3 = A0A(lowestOneBit2);
                    Object[] objArr5 = this.A02;
                    Object obj5 = objArr5[A0A3];
                    Object obj6 = objArr5[A0A3 + 1];
                    int A0A4 = c57o.A0A(lowestOneBit2);
                    Object[] objArr6 = c57o.A02;
                    Object obj7 = objArr6[A0A4];
                    Object obj8 = objArr6[A0A4 + 1];
                    if (obj5 != null) {
                        i2 = obj5.hashCode();
                    } else {
                        i2 = 0;
                    }
                    if (obj7 != null) {
                        i15 = obj7.hashCode();
                    }
                    A06 = A06(c5vs.A02, obj5, obj6, obj7, obj8, i2, i15, i + 5);
                }
                objArr3[length2] = A06;
                i14++;
                i8 ^= lowestOneBit2;
            }
            while (i11 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i11);
                int i17 = i13 * 2;
                if ((c57o.A00 & lowestOneBit3) != 0) {
                    int A0A5 = c57o.A0A(lowestOneBit3);
                    Object[] objArr7 = c57o2.A02;
                    Object[] objArr8 = c57o.A02;
                    objArr7[i17] = objArr8[A0A5];
                    objArr7[i17 + 1] = objArr8[A0A5 + 1];
                    if ((this.A00 & lowestOneBit3) != 0) {
                        c5vv.A00++;
                    }
                } else {
                    int A0A6 = A0A(lowestOneBit3);
                    Object[] objArr9 = c57o2.A02;
                    Object[] objArr10 = this.A02;
                    objArr9[i17] = objArr10[A0A6];
                    objArr9[i17 + 1] = objArr10[A0A6 + 1];
                }
                i13++;
                i11 ^= lowestOneBit3;
            }
            if (A07(c57o2)) {
                return this;
            }
            if (c57o.A07(c57o2)) {
                return c57o;
            }
            return c57o2;
        }
        SQP.A01("Check failed.");
        throw C00O.createAndThrow();
    }

    public final C57O A0F(C5VS c5vs, Object obj, int i, int i2) {
        C57O A0F;
        int i3 = 1 << ((i >> i2) & 31);
        if ((this.A00 & i3) != 0) {
            int A0A = A0A(i3);
            if (C14360o3.A0K(obj, this.A02[A0A])) {
                return A02(c5vs, A0A, i3);
            }
        } else if ((this.A01 & i3) != 0) {
            int A0B = A0B(i3);
            C57O A0D = A0D(A0B);
            if (i2 == 30) {
                C17v A0B2 = C17s.A0B(C17s.A0C(0, A0D.A02.length), 2);
                int i4 = A0B2.A00;
                int i5 = A0B2.A01;
                int i6 = A0B2.A02;
                if (i6 <= 0 ? !(i6 >= 0 || i5 > i4) : i4 <= i5) {
                    while (!C14360o3.A0K(obj, A0D.A02[i4])) {
                        if (i4 != i5) {
                            i4 += i6;
                        }
                    }
                    A0F = A0D.A01(c5vs, i4);
                }
                A0F = A0D;
                break;
            }
            A0F = A0D.A0F(c5vs, obj, i, i2 + 5);
            return A04(A0D, A0F, c5vs.A02, A0B, i3);
        }
        return this;
    }

    public final C57O A0G(C5VS c5vs, Object obj, Object obj2, int i, int i2) {
        C5VU c5vu;
        Object[] A00;
        int i3;
        int i4;
        C57O A0G;
        Object[] copyOf;
        int i5 = 1 << ((i >> i2) & 31);
        if ((this.A00 & i5) != 0) {
            int A0A = A0A(i5);
            if (C14360o3.A0K(obj, this.A02[A0A])) {
                Object[] objArr = this.A02;
                int i6 = A0A + 1;
                Object obj3 = objArr[i6];
                c5vs.A03 = obj3;
                if (obj3 != obj2) {
                    if (this.A03 == c5vs.A02) {
                        objArr[i6] = obj2;
                        return this;
                    }
                    c5vs.A00++;
                    Object[] copyOf2 = Arrays.copyOf(objArr, objArr.length);
                    C14360o3.A07(copyOf2);
                    copyOf2[i6] = obj2;
                    return new C57O(c5vs.A02, copyOf2, this.A00, this.A01);
                }
                return this;
            }
            c5vs.A05(c5vs.size() + 1);
            c5vu = c5vs.A02;
            C5VU c5vu2 = this.A03;
            A00 = A09(c5vu, obj, obj2, A0A, i5, i, i2);
            if (c5vu2 == c5vu) {
                this.A02 = A00;
                this.A00 ^= i5;
                this.A01 |= i5;
                return this;
            }
            i3 = this.A00 ^ i5;
            i4 = i5 | this.A01;
            return new C57O(c5vu, A00, i3, i4);
        }
        if ((this.A01 & i5) != 0) {
            int A0B = A0B(i5);
            C57O A0D = A0D(A0B);
            if (i2 == 30) {
                C17v A0B2 = C17s.A0B(C17s.A0C(0, A0D.A02.length), 2);
                int i7 = A0B2.A00;
                int i8 = A0B2.A01;
                int i9 = A0B2.A02;
                if (i9 <= 0 ? !(i9 >= 0 || i8 > i7) : i7 <= i8) {
                    while (!C14360o3.A0K(obj, A0D.A02[i7])) {
                        if (i7 != i8) {
                            i7 += i9;
                        }
                    }
                    Object[] objArr2 = A0D.A02;
                    int i10 = i7 + 1;
                    c5vs.A03 = objArr2[i10];
                    if (A0D.A03 == c5vs.A02) {
                        objArr2[i10] = obj2;
                        A0G = A0D;
                    } else {
                        c5vs.A00++;
                        copyOf = Arrays.copyOf(objArr2, objArr2.length);
                        C14360o3.A07(copyOf);
                        copyOf[i10] = obj2;
                        A0G = new C57O(c5vs.A02, copyOf, 0, 0);
                    }
                }
                c5vs.A05(c5vs.size() + 1);
                copyOf = AbstractC1127357d.A00(obj, obj2, A0D.A02, 0);
                A0G = new C57O(c5vs.A02, copyOf, 0, 0);
            } else {
                A0G = A0D.A0G(c5vs, obj, obj2, i, i2 + 5);
            }
            if (A0D != A0G) {
                return A05(A0G, c5vs.A02, A0B);
            }
            return this;
        }
        c5vs.A05(c5vs.size() + 1);
        c5vu = c5vs.A02;
        int A0A2 = A0A(i5);
        C5VU c5vu3 = this.A03;
        Object[] objArr3 = this.A02;
        if (c5vu3 == c5vu) {
            this.A02 = AbstractC1127357d.A00(obj, obj2, objArr3, A0A2);
            this.A00 = i5 | this.A00;
            return this;
        }
        A00 = AbstractC1127357d.A00(obj, obj2, objArr3, A0A2);
        i3 = i5 | this.A00;
        i4 = this.A01;
        return new C57O(c5vu, A00, i3, i4);
    }

    public final C57O A0H(C5VS c5vs, Object obj, Object obj2, int i, int i2) {
        C57O A0H;
        int i3 = 1 << ((i >> i2) & 31);
        if ((this.A00 & i3) != 0) {
            int A0A = A0A(i3);
            if (C14360o3.A0K(obj, this.A02[A0A]) && C14360o3.A0K(obj2, this.A02[A0A + 1])) {
                return A02(c5vs, A0A, i3);
            }
        } else if ((this.A01 & i3) != 0) {
            int A0B = A0B(i3);
            C57O A0D = A0D(A0B);
            if (i2 == 30) {
                C17v A0B2 = C17s.A0B(C17s.A0C(0, A0D.A02.length), 2);
                int i4 = A0B2.A00;
                int i5 = A0B2.A01;
                int i6 = A0B2.A02;
                if (i6 <= 0 ? !(i6 >= 0 || i5 > i4) : i4 <= i5) {
                    while (true) {
                        if (C14360o3.A0K(obj, A0D.A02[i4]) && C14360o3.A0K(obj2, A0D.A02[i4 + 1])) {
                            A0H = A0D.A01(c5vs, i4);
                            break;
                        }
                        if (i4 == i5) {
                            break;
                        }
                        i4 += i6;
                    }
                }
                A0H = A0D;
            } else {
                A0H = A0D.A0H(c5vs, obj, obj2, i, i2 + 5);
            }
            return A04(A0D, A0H, c5vs.A02, A0B, i3);
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0088, code lost:
    
        if (r0 == null) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a8 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C57O A0I(java.lang.Object r11, int r12, int r13) {
        /*
            r10 = this;
            int r0 = r12 >> r13
            r0 = r0 & 31
            r2 = 1
            int r4 = r2 << r0
            int r0 = r10.A00
            r0 = r0 & r4
            if (r0 == 0) goto L30
            int r3 = r10.A0A(r4)
            java.lang.Object[] r0 = r10.A02
            r0 = r0[r3]
            boolean r0 = X.C14360o3.A0K(r11, r0)
            if (r0 == 0) goto Lab
            java.lang.Object[] r2 = r10.A02
            int r1 = r2.length
            r0 = 2
            if (r1 == r0) goto La9
            java.lang.Object[] r2 = X.AbstractC1127357d.A01(r2, r3)
            int r0 = r10.A00
            r4 = r4 ^ r0
            int r1 = r10.A01
            r0 = 0
            X.57O r3 = new X.57O
            r3.<init>(r0, r2, r4, r1)
            return r3
        L30:
            int r0 = r10.A01
            r0 = r0 & r4
            if (r0 == 0) goto Lab
            int r5 = r10.A0B(r4)
            X.57O r3 = r10.A0D(r5)
            r0 = 30
            if (r13 != r0) goto L82
            java.lang.Object[] r0 = r3.A02
            int r0 = r0.length
            r6 = 0
            X.17u r0 = X.C17s.A0C(r6, r0)
            r9 = 2
            X.17v r0 = X.C17s.A0B(r0, r9)
            int r8 = r0.A00
            int r7 = r0.A01
            int r1 = r0.A02
            if (r1 <= 0) goto L60
            if (r8 <= r7) goto L64
        L58:
            r0 = r3
        L59:
            if (r3 == r0) goto La8
            X.57O r3 = r10.A03(r0, r5, r4)
            return r3
        L60:
            if (r1 >= 0) goto L58
            if (r7 > r8) goto L58
        L64:
            java.lang.Object[] r0 = r3.A02
            r0 = r0[r8]
            boolean r0 = X.C14360o3.A0K(r11, r0)
            if (r0 == 0) goto L7e
            java.lang.Object[] r1 = r3.A02
            int r0 = r1.length
            if (r0 == r9) goto L8a
            java.lang.Object[] r2 = X.AbstractC1127357d.A01(r1, r8)
            r1 = 0
            X.57O r0 = new X.57O
            r0.<init>(r1, r2, r6, r6)
            goto L59
        L7e:
            if (r8 == r7) goto L58
            int r8 = r8 + r1
            goto L64
        L82:
            int r0 = r13 + 5
            X.57O r0 = r3.A0I(r11, r12, r0)
            if (r0 != 0) goto L59
        L8a:
            java.lang.Object[] r3 = r10.A02
            int r1 = r3.length
            if (r1 == r2) goto La9
            int r0 = r1 + (-1)
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r0 = 0
            X.AbstractC06960Yn.A0W(r3, r2, r0, r0, r5)
            int r0 = r5 + 1
            X.AbstractC06960Yn.A0W(r3, r2, r5, r0, r1)
            int r1 = r10.A00
            int r0 = r10.A01
            r4 = r4 ^ r0
            r0 = 0
            X.57O r3 = new X.57O
            r3.<init>(r0, r2, r1, r4)
            return r3
        La8:
            return r10
        La9:
            r3 = 0
            return r3
        Lab:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57O.A0I(java.lang.Object, int, int):X.57O");
    }

    public final Object A0J(int i, Object obj, int i2) {
        int i3;
        Object[] objArr;
        int i4 = 1 << ((i >> i2) & 31);
        boolean z = false;
        if ((i4 & this.A00) != 0) {
            z = true;
        }
        if (z) {
            i3 = A0A(i4);
            if (!C14360o3.A0K(obj, this.A02[i3])) {
                return null;
            }
            objArr = this.A02;
        } else {
            if ((this.A01 & i4) == 0) {
                return null;
            }
            C57O A0D = A0D(A0B(i4));
            if (i2 == 30) {
                C17v A0B = C17s.A0B(C17s.A0C(0, A0D.A02.length), 2);
                i3 = A0B.A00;
                int i5 = A0B.A01;
                int i6 = A0B.A02;
                if (i6 > 0) {
                    if (i3 > i5) {
                        return null;
                    }
                } else if (i6 >= 0 || i5 > i3) {
                    return null;
                }
                while (!C14360o3.A0K(obj, A0D.A02[i3])) {
                    if (i3 == i5) {
                        return null;
                    }
                    i3 += i6;
                }
                objArr = A0D.A02;
            } else {
                return A0D.A0J(i, obj, i2 + 5);
            }
        }
        return objArr[i3 + 1];
    }

    public final boolean A0K(Object obj, int i, int i2) {
        int i3 = 1 << ((i >> i2) & 31);
        if ((this.A00 & i3) != 0) {
            return C14360o3.A0K(obj, this.A02[A0A(i3)]);
        }
        if ((this.A01 & i3) != 0) {
            C57O A0D = A0D(A0B(i3));
            if (i2 == 30) {
                return A0D.A08(obj);
            }
            return A0D.A0K(obj, i, i2 + 5);
        }
        return false;
    }

    public C57O(C5VU c5vu, Object[] objArr, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = c5vu;
        this.A02 = objArr;
    }

    private final C57O A01(C5VS c5vs, int i) {
        c5vs.A05(c5vs.size() - 1);
        Object[] objArr = this.A02;
        c5vs.A03 = objArr[i + 1];
        if (objArr.length == 2) {
            return null;
        }
        if (this.A03 == c5vs.A02) {
            this.A02 = AbstractC1127357d.A01(objArr, i);
            return this;
        }
        return new C57O(c5vs.A02, AbstractC1127357d.A01(objArr, i), 0, 0);
    }

    private final C57O A02(C5VS c5vs, int i, int i2) {
        c5vs.A05(c5vs.size() - 1);
        Object[] objArr = this.A02;
        c5vs.A03 = objArr[i + 1];
        if (objArr.length == 2) {
            return null;
        }
        if (this.A03 == c5vs.A02) {
            this.A02 = AbstractC1127357d.A01(objArr, i);
            this.A00 ^= i2;
            return this;
        }
        return new C57O(c5vs.A02, AbstractC1127357d.A01(objArr, i), i2 ^ this.A00, this.A01);
    }
}
