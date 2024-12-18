package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.6LW, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6LW {
    public static final C6LW A04 = new C6LW(null, new Object[0], 0, 0);
    public int A00;
    public int A01;
    public Object[] A02;
    public final C6LX A03;

    private final C6LW A02(Object obj, Object obj2, Object obj3, Object obj4, C6LX c6lx, int i, int i2, int i3) {
        if (i3 > 30) {
            return new C6LW(c6lx, new Object[]{obj, obj2, obj3, obj4}, 0, 0);
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
            return new C6LW(c6lx, objArr, (1 << i4) | (1 << i5), 0);
        }
        return new C6LW(c6lx, new Object[]{A02(obj, obj2, obj3, obj4, c6lx, i, i2, i3 + 5)}, 0, 1 << i4);
    }

    private final C6LW A06(C6LW c6lw, C6LX c6lx, int i) {
        Object[] objArr = this.A02;
        int length = objArr.length;
        if (length == 1 && c6lw.A02.length == 2 && c6lw.A01 == 0) {
            c6lw.A00 = this.A01;
            return c6lw;
        }
        if (this.A03 == c6lx) {
            objArr[i] = c6lw;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, length);
        C14360o3.A07(copyOf);
        copyOf[i] = c6lw;
        return new C6LW(c6lx, copyOf, this.A00, this.A01);
    }

    private final boolean A07(C6LW c6lw) {
        if (this != c6lw) {
            if (this.A01 == c6lw.A01 && this.A00 == c6lw.A00) {
                Object[] objArr = this.A02;
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    if (objArr[i] == c6lw.A02[i]) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean A0G(InterfaceC16620sF interfaceC16620sF, C6LW c6lw) {
        int i;
        C14360o3.A0B(c6lw, 0);
        C14360o3.A0B(interfaceC16620sF, 1);
        if (this != c6lw) {
            int i2 = this.A00;
            if (i2 == c6lw.A00 && (i = this.A01) == c6lw.A01) {
                if (i2 == 0 && i == 0) {
                    int length = this.A02.length;
                    if (length == c6lw.A02.length) {
                        Iterable A0B = C17s.A0B(C17s.A0C(0, length), 2);
                        if (!(A0B instanceof Collection) || !((Collection) A0B).isEmpty()) {
                            Iterator it = A0B.iterator();
                            while (it.hasNext()) {
                                int A00 = ((AbstractC16880sg) it).A00();
                                Object[] objArr = c6lw.A02;
                                Object obj = objArr[A00];
                                Object obj2 = objArr[A00 + 1];
                                int A01 = A01(obj);
                                if (A01 == -1 || !((Boolean) interfaceC16620sF.invoke(this.A02[A01 + 1], obj2)).booleanValue()) {
                                    return false;
                                }
                            }
                        }
                        return true;
                    }
                } else {
                    int bitCount = Integer.bitCount(i2) * 2;
                    C17v A0B2 = C17s.A0B(C17s.A0C(0, bitCount), 2);
                    int i3 = A0B2.A00;
                    int i4 = A0B2.A01;
                    int i5 = A0B2.A02;
                    if (i5 <= 0 ? !(i5 >= 0 || i4 > i3) : i3 <= i4) {
                        while (C14360o3.A0K(this.A02[i3], c6lw.A02[i3])) {
                            int i6 = i3 + 1;
                            if (!((Boolean) interfaceC16620sF.invoke(this.A02[i6], c6lw.A02[i6])).booleanValue()) {
                                break;
                            }
                            if (i3 != i4) {
                                i3 += i5;
                            }
                        }
                    }
                    int length2 = this.A02.length;
                    while (bitCount < length2) {
                        if (A0A(bitCount).A0G(interfaceC16620sF, c6lw.A0A(bitCount))) {
                            bitCount++;
                        }
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
            bitCount += A0A(i).A00();
        }
        return bitCount;
    }

    private final int A01(Object obj) {
        C17v A0B = C17s.A0B(C17s.A0C(0, this.A02.length), 2);
        int i = A0B.A00;
        int i2 = A0B.A01;
        int i3 = A0B.A02;
        if (i3 <= 0 ? !(i3 >= 0 || i2 > i) : i <= i2) {
            while (!C14360o3.A0K(obj, this.A02[i])) {
                int i4 = i;
                i += i3;
                if (i4 == i2) {
                }
            }
            return i;
        }
        return -1;
    }

    private final C6LW A05(C6LW c6lw, C6LW c6lw2, C6LX c6lx, int i, int i2) {
        if (c6lw2 == null) {
            Object[] objArr = this.A02;
            int length = objArr.length;
            if (length == 1) {
                return null;
            }
            C6LX c6lx2 = this.A03;
            Object[] objArr2 = new Object[length - 1];
            AbstractC06960Yn.A0W(objArr, objArr2, 0, 0, i);
            AbstractC06960Yn.A0W(objArr, objArr2, i, i + 1, length);
            if (c6lx2 == c6lx) {
                this.A02 = objArr2;
                this.A01 ^= i2;
            } else {
                return new C6LW(c6lx, objArr2, this.A00, i2 ^ this.A01);
            }
        } else if (c6lw != c6lw2) {
            return A06(c6lw2, c6lx, i);
        }
        return this;
    }

    public final int A08(int i) {
        return (this.A02.length - 1) - Integer.bitCount((i - 1) & this.A01);
    }

    public final Object A09(int i, Object obj, int i2) {
        int A01;
        Object[] objArr;
        int i3 = 1 << ((i >> i2) & 31);
        int i4 = this.A00;
        boolean z = false;
        if ((i3 & i4) != 0) {
            z = true;
        }
        if (z) {
            A01 = Integer.bitCount((i3 - 1) & i4) * 2;
            if (!C14360o3.A0K(obj, this.A02[A01])) {
                return null;
            }
            objArr = this.A02;
        } else {
            if ((this.A01 & i3) == 0) {
                return null;
            }
            C6LW A0A = A0A(A08(i3));
            if (i2 == 30) {
                A01 = A0A.A01(obj);
                if (A01 != -1) {
                    objArr = A0A.A02;
                } else {
                    return null;
                }
            } else {
                return A0A.A09(i, obj, i2 + 5);
            }
        }
        return objArr[A01 + 1];
    }

    public final C6LW A0A(int i) {
        Object obj = this.A02[i];
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (C6LW) obj;
    }

    public final C6LW A0B(Object obj, Object obj2, Pw1 pw1, int i, int i2) {
        C6LW A0B;
        Object[] objArr;
        int i3;
        int i4 = 1 << ((i >> i2) & 31);
        int i5 = this.A00;
        if ((i4 & i5) != 0) {
            int bitCount = Integer.bitCount((i4 - 1) & i5) * 2;
            if (C14360o3.A0K(obj, this.A02[bitCount])) {
                Object[] objArr2 = this.A02;
                int i6 = bitCount + 1;
                Object obj3 = objArr2[i6];
                pw1.A02 = obj3;
                if (obj3 != obj2) {
                    if (this.A03 == pw1.A05) {
                        objArr2[i6] = obj2;
                        return this;
                    }
                    pw1.A00++;
                    Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
                    C14360o3.A07(copyOf);
                    copyOf[i6] = obj2;
                    return new C6LW(pw1.A05, copyOf, this.A00, this.A01);
                }
            } else {
                pw1.A05(pw1.size() + 1);
                C6LX c6lx = pw1.A05;
                C6LX c6lx2 = this.A03;
                Object obj4 = this.A02[bitCount];
                if (obj4 != null) {
                    i3 = obj4.hashCode();
                } else {
                    i3 = 0;
                }
                C6LW A02 = A02(obj4, this.A02[bitCount + 1], obj, obj2, c6lx, i3, i, i2 + 5);
                int A08 = A08(i4) + 1;
                Object[] objArr3 = this.A02;
                int i7 = A08 - 2;
                int length = objArr3.length;
                Object[] objArr4 = new Object[(length - 2) + 1];
                AbstractC06960Yn.A0W(objArr3, objArr4, 0, 0, bitCount);
                AbstractC06960Yn.A0W(objArr3, objArr4, bitCount, bitCount + 2, A08);
                objArr4[i7] = A02;
                AbstractC06960Yn.A0W(objArr3, objArr4, i7 + 1, A08, length);
                if (c6lx2 == c6lx) {
                    this.A02 = objArr4;
                    this.A00 ^= i4;
                    this.A01 |= i4;
                    return this;
                }
                return new C6LW(c6lx, objArr4, this.A00 ^ i4, i4 | this.A01);
            }
        } else if ((this.A01 & i4) != 0) {
            int A082 = A08(i4);
            C6LW A0A = A0A(A082);
            if (i2 == 30) {
                int A01 = A0A.A01(obj);
                if (A01 != -1) {
                    Object[] objArr5 = A0A.A02;
                    int i8 = A01 + 1;
                    pw1.A02 = objArr5[i8];
                    if (A0A.A03 == pw1.A05) {
                        objArr5[i8] = obj2;
                        A0B = A0A;
                    } else {
                        pw1.A00++;
                        objArr = Arrays.copyOf(objArr5, objArr5.length);
                        C14360o3.A07(objArr);
                        objArr[i8] = obj2;
                    }
                } else {
                    pw1.A05(pw1.size() + 1);
                    Object[] objArr6 = A0A.A02;
                    int length2 = objArr6.length;
                    objArr = new Object[length2 + 2];
                    AbstractC06960Yn.A0W(objArr6, objArr, 0, 0, 0);
                    AbstractC06960Yn.A0W(objArr6, objArr, 2, 0, length2);
                    objArr[0] = obj;
                    objArr[1] = obj2;
                }
                A0B = new C6LW(pw1.A05, objArr, 0, 0);
            } else {
                A0B = A0A.A0B(obj, obj2, pw1, i, i2 + 5);
            }
            if (A0A != A0B) {
                return A06(A0B, pw1.A05, A082);
            }
        } else {
            pw1.A05(pw1.size() + 1);
            C6LX c6lx3 = pw1.A05;
            int bitCount2 = Integer.bitCount((i4 - 1) & this.A00) * 2;
            C6LX c6lx4 = this.A03;
            Object[] objArr7 = this.A02;
            int length3 = objArr7.length;
            int i9 = length3 + 2;
            if (c6lx4 == c6lx3) {
                Object[] objArr8 = new Object[i9];
                AbstractC06960Yn.A0W(objArr7, objArr8, 0, 0, bitCount2);
                AbstractC06960Yn.A0W(objArr7, objArr8, bitCount2 + 2, bitCount2, length3);
                objArr8[bitCount2] = obj;
                objArr8[bitCount2 + 1] = obj2;
                this.A02 = objArr8;
                this.A00 = i4 | this.A00;
                return this;
            }
            Object[] objArr9 = new Object[i9];
            AbstractC06960Yn.A0W(objArr7, objArr9, 0, 0, bitCount2);
            AbstractC06960Yn.A0W(objArr7, objArr9, bitCount2 + 2, bitCount2, length3);
            objArr9[bitCount2] = obj;
            objArr9[bitCount2 + 1] = obj2;
            return new C6LW(c6lx3, objArr9, i4 | this.A00, this.A01);
        }
        return this;
    }

    public final C6LW A0C(Object obj, Object obj2, Pw1 pw1, int i, int i2) {
        C6LW A0C;
        int i3 = 1 << ((i >> i2) & 31);
        int i4 = this.A00;
        if ((i3 & i4) != 0) {
            int bitCount = Integer.bitCount((i3 - 1) & i4) * 2;
            if (C14360o3.A0K(obj, this.A02[bitCount]) && C14360o3.A0K(obj2, this.A02[bitCount + 1])) {
                return A04(pw1, bitCount, i3);
            }
        } else if ((this.A01 & i3) != 0) {
            int A08 = A08(i3);
            C6LW A0A = A0A(A08);
            if (i2 == 30) {
                int A01 = A0A.A01(obj);
                if (A01 != -1 && C14360o3.A0K(obj2, A0A.A02[A01 + 1])) {
                    A0C = A0A.A03(pw1, A01);
                } else {
                    A0C = A0A;
                }
            } else {
                A0C = A0A.A0C(obj, obj2, pw1, i, i2 + 5);
            }
            return A05(A0A, A0C, pw1.A05, A08, i3);
        }
        return this;
    }

    public final C6LW A0D(Object obj, Pw1 pw1, int i, int i2) {
        C6LW A0D;
        int i3 = 1 << ((i >> i2) & 31);
        int i4 = this.A00;
        if ((i3 & i4) != 0) {
            int bitCount = Integer.bitCount((i3 - 1) & i4) * 2;
            if (C14360o3.A0K(obj, this.A02[bitCount])) {
                return A04(pw1, bitCount, i3);
            }
        } else if ((this.A01 & i3) != 0) {
            int A08 = A08(i3);
            C6LW A0A = A0A(A08);
            if (i2 == 30) {
                int A01 = A0A.A01(obj);
                if (A01 != -1) {
                    A0D = A0A.A03(pw1, A01);
                } else {
                    A0D = A0A;
                }
            } else {
                A0D = A0A.A0D(obj, pw1, i, i2 + 5);
            }
            return A05(A0A, A0D, pw1.A05, A08, i3);
        }
        return this;
    }

    public final C6LW A0E(Pw1 pw1, C6LW c6lw, SOO soo, int i) {
        C6LW c6lw2;
        int i2;
        C6LW A02;
        int i3;
        int i4;
        C14360o3.A0B(c6lw, 0);
        if (this == c6lw) {
            soo.A00 += A00();
            return this;
        }
        if (i > 30) {
            C6LX c6lx = pw1.A05;
            Object[] objArr = this.A02;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + c6lw.A02.length);
            C14360o3.A07(copyOf);
            int length = this.A02.length;
            C17v A0B = C17s.A0B(C17s.A0C(0, c6lw.A02.length), 2);
            int i5 = A0B.A00;
            int i6 = A0B.A01;
            int i7 = A0B.A02;
            if (i7 <= 0 ? !(i7 >= 0 || i6 > i5) : i5 <= i6) {
                while (true) {
                    if (A01(c6lw.A02[i5]) != -1) {
                        soo.A00++;
                    } else {
                        Object[] objArr2 = c6lw.A02;
                        copyOf[length] = objArr2[i5];
                        copyOf[length + 1] = objArr2[i5 + 1];
                        length += 2;
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
            if (length == c6lw.A02.length) {
                return c6lw;
            }
            if (length == copyOf.length) {
                return new C6LW(c6lx, copyOf, 0, 0);
            }
            Object[] copyOf2 = Arrays.copyOf(copyOf, length);
            C14360o3.A07(copyOf2);
            return new C6LW(c6lx, copyOf2, 0, 0);
        }
        int i8 = this.A01 | c6lw.A01;
        int i9 = this.A00;
        int i10 = c6lw.A00;
        int i11 = (i9 ^ i10) & (i8 ^ (-1));
        int i12 = i9 & i10;
        while (i12 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i12);
            int i13 = lowestOneBit - 1;
            if (C14360o3.A0K(this.A02[Integer.bitCount(this.A00 & i13) * 2], c6lw.A02[Integer.bitCount(i13 & c6lw.A00) * 2])) {
                i11 |= lowestOneBit;
            } else {
                i8 |= lowestOneBit;
            }
            i12 ^= lowestOneBit;
        }
        int i14 = 0;
        if ((i8 & i11) == 0) {
            if (C14360o3.A0K(this.A03, pw1.A05) && this.A00 == i11 && this.A01 == i8) {
                c6lw2 = this;
            } else {
                c6lw2 = new C6LW(null, new Object[(Integer.bitCount(i11) * 2) + Integer.bitCount(i8)], i11, i8);
            }
            int i15 = 0;
            while (i8 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i8);
                Object[] objArr3 = c6lw2.A02;
                int length2 = (objArr3.length - 1) - i15;
                boolean z = false;
                if ((lowestOneBit2 & this.A01) != 0) {
                    z = true;
                }
                int i16 = 0;
                if (z) {
                    A02 = A0A(A08(lowestOneBit2));
                    if ((c6lw.A01 & lowestOneBit2) != 0) {
                        A02 = A02.A0E(pw1, c6lw.A0A(c6lw.A08(lowestOneBit2)), soo, i + 5);
                    } else {
                        int i17 = c6lw.A00;
                        if ((lowestOneBit2 & i17) != 0) {
                            int bitCount = Integer.bitCount((lowestOneBit2 - 1) & i17) * 2;
                            Object[] objArr4 = c6lw.A02;
                            Object obj = objArr4[bitCount];
                            Object obj2 = objArr4[bitCount + 1];
                            int size = pw1.size();
                            if (obj != null) {
                                i16 = obj.hashCode();
                            }
                            A02 = A02.A0B(obj, obj2, pw1, i16, i + 5);
                            if (pw1.size() != size) {
                            }
                            soo.A00++;
                        }
                    }
                } else if ((c6lw.A01 & lowestOneBit2) != 0) {
                    A02 = c6lw.A0A(c6lw.A08(lowestOneBit2));
                    int i18 = this.A00;
                    if ((lowestOneBit2 & i18) != 0) {
                        int bitCount2 = Integer.bitCount((lowestOneBit2 - 1) & i18) * 2;
                        Object obj3 = this.A02[bitCount2];
                        if (obj3 != null) {
                            i3 = obj3.hashCode();
                        } else {
                            i3 = 0;
                        }
                        int i19 = i + 5;
                        if (!A02.A0F(obj3, i3, i19)) {
                            Object obj4 = this.A02[bitCount2 + 1];
                            if (obj3 != null) {
                                i4 = obj3.hashCode();
                            } else {
                                i4 = 0;
                            }
                            A02 = A02.A0B(obj3, obj4, pw1, i4, i19);
                        }
                        soo.A00++;
                    }
                } else {
                    int i20 = lowestOneBit2 - 1;
                    int bitCount3 = Integer.bitCount(this.A00 & i20) * 2;
                    Object[] objArr5 = this.A02;
                    Object obj5 = objArr5[bitCount3];
                    Object obj6 = objArr5[bitCount3 + 1];
                    int bitCount4 = Integer.bitCount(i20 & c6lw.A00) * 2;
                    Object[] objArr6 = c6lw.A02;
                    Object obj7 = objArr6[bitCount4];
                    Object obj8 = objArr6[bitCount4 + 1];
                    if (obj5 != null) {
                        i2 = obj5.hashCode();
                    } else {
                        i2 = 0;
                    }
                    if (obj7 != null) {
                        i16 = obj7.hashCode();
                    }
                    A02 = A02(obj5, obj6, obj7, obj8, pw1.A05, i2, i16, i + 5);
                }
                objArr3[length2] = A02;
                i15++;
                i8 ^= lowestOneBit2;
            }
            while (i11 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i11);
                int i21 = i14 * 2;
                int i22 = c6lw.A00;
                if ((lowestOneBit3 & i22) != 0) {
                    int bitCount5 = Integer.bitCount((lowestOneBit3 - 1) & i22) * 2;
                    Object[] objArr7 = c6lw2.A02;
                    Object[] objArr8 = c6lw.A02;
                    objArr7[i21] = objArr8[bitCount5];
                    objArr7[i21 + 1] = objArr8[bitCount5 + 1];
                    if ((this.A00 & lowestOneBit3) != 0) {
                        soo.A00++;
                    }
                } else {
                    int bitCount6 = Integer.bitCount((lowestOneBit3 - 1) & this.A00) * 2;
                    Object[] objArr9 = c6lw2.A02;
                    Object[] objArr10 = this.A02;
                    objArr9[i21] = objArr10[bitCount6];
                    objArr9[i21 + 1] = objArr10[bitCount6 + 1];
                }
                i14++;
                i11 ^= lowestOneBit3;
            }
            if (A07(c6lw2)) {
                return this;
            }
            return c6lw.A07(c6lw2) ? c6lw : c6lw2;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final boolean A0F(Object obj, int i, int i2) {
        int i3 = 1 << ((i >> i2) & 31);
        int i4 = this.A00;
        if ((i3 & i4) != 0) {
            return C14360o3.A0K(obj, this.A02[Integer.bitCount((i3 - 1) & i4) * 2]);
        }
        if ((this.A01 & i3) != 0) {
            C6LW A0A = A0A(A08(i3));
            if (i2 == 30) {
                if (A0A.A01(obj) == -1) {
                    return false;
                }
                return true;
            }
            return A0A.A0F(obj, i, i2 + 5);
        }
        return false;
    }

    public C6LW(C6LX c6lx, Object[] objArr, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = c6lx;
        this.A02 = objArr;
    }

    private final C6LW A03(Pw1 pw1, int i) {
        pw1.A05(pw1.size() - 1);
        Object[] objArr = this.A02;
        pw1.A02 = objArr[i + 1];
        int length = objArr.length;
        if (length == 2) {
            return null;
        }
        int i2 = length - 2;
        if (this.A03 == pw1.A05) {
            Object[] objArr2 = new Object[i2];
            AbstractC06960Yn.A0W(objArr, objArr2, 0, 0, i);
            AbstractC06960Yn.A0W(objArr, objArr2, i, i + 2, length);
            this.A02 = objArr2;
            return this;
        }
        Object[] objArr3 = new Object[i2];
        AbstractC06960Yn.A0W(objArr, objArr3, 0, 0, i);
        AbstractC06960Yn.A0W(objArr, objArr3, i, i + 2, length);
        return new C6LW(pw1.A05, objArr3, 0, 0);
    }

    private final C6LW A04(Pw1 pw1, int i, int i2) {
        pw1.A05(pw1.size() - 1);
        Object[] objArr = this.A02;
        pw1.A02 = objArr[i + 1];
        int length = objArr.length;
        if (length == 2) {
            return null;
        }
        int i3 = length - 2;
        if (this.A03 == pw1.A05) {
            Object[] objArr2 = new Object[i3];
            AbstractC06960Yn.A0W(objArr, objArr2, 0, 0, i);
            AbstractC06960Yn.A0W(objArr, objArr2, i, i + 2, length);
            this.A02 = objArr2;
            this.A00 ^= i2;
            return this;
        }
        Object[] objArr3 = new Object[i3];
        AbstractC06960Yn.A0W(objArr, objArr3, 0, 0, i);
        AbstractC06960Yn.A0W(objArr, objArr3, i, i + 2, length);
        return new C6LW(pw1.A05, objArr3, i2 ^ this.A00, this.A01);
    }
}
