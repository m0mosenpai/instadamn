package X;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: X.01p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C005001p {
    public int A00;
    public int[] A01;
    public Object[] A02;

    public Object A04(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.A00)) {
            Object[] objArr = this.A02;
            int i3 = i << 1;
            Object obj = objArr[i3 + 1];
            if (i2 <= 1) {
                clear();
                return obj;
            }
            int i4 = i2 - 1;
            int[] iArr = this.A01;
            int length = iArr.length;
            int i5 = 8;
            if (length > 8 && i2 < length / 3) {
                if (i2 > 8) {
                    i5 = i2 + (i2 >> 1);
                }
                int[] copyOf = Arrays.copyOf(iArr, i5);
                C14360o3.A07(copyOf);
                this.A01 = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.A02, i5 << 1);
                C14360o3.A07(copyOf2);
                this.A02 = copyOf2;
                if (i2 == this.A00) {
                    if (i > 0) {
                        AbstractC06960Yn.A0U(iArr, this.A01, 0, 0, i);
                        AbstractC06960Yn.A0W(objArr, this.A02, 0, 0, i3);
                    }
                    if (i < i4) {
                        int i6 = i + 1;
                        int i7 = i4 + 1;
                        AbstractC06960Yn.A0U(iArr, this.A01, i, i6, i7);
                        AbstractC06960Yn.A0W(objArr, this.A02, i3, i6 << 1, i7 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (i < i4) {
                    int i8 = i + 1;
                    int i9 = i4 + 1;
                    System.arraycopy(iArr, i8, iArr, i, i9 - i8);
                    Object[] objArr2 = this.A02;
                    AbstractC06960Yn.A0W(objArr2, objArr2, i3, i8 << 1, i9 << 1);
                }
                Object[] objArr3 = this.A02;
                int i10 = i4 << 1;
                objArr3[i10] = null;
                objArr3[i10 + 1] = null;
            }
            if (i2 == this.A00) {
                this.A00 = i4;
                return obj;
            }
            throw new ConcurrentModificationException();
        }
        AbstractC005601v.A00(AnonymousClass001.A0O("Expected index to be within 0..size()-1, but was ", i));
        throw C00O.createAndThrow();
    }

    public final Object A05(int i) {
        if (i >= 0 && i < this.A00) {
            return this.A02[i << 1];
        }
        AbstractC005601v.A00(AnonymousClass001.A0O("Expected index to be within 0..size()-1, but was ", i));
        throw C00O.createAndThrow();
    }

    public final Object A06(int i) {
        if (i >= 0 && i < this.A00) {
            return this.A02[(i << 1) + 1];
        }
        AbstractC005601v.A00(AnonymousClass001.A0O("Expected index to be within 0..size()-1, but was ", i));
        throw C00O.createAndThrow();
    }

    public Object A07(int i, Object obj) {
        if (i >= 0 && i < this.A00) {
            int i2 = (i << 1) + 1;
            Object[] objArr = this.A02;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
            return obj2;
        }
        AbstractC005601v.A00(AnonymousClass001.A0O("Expected index to be within 0..size()-1, but was ", i));
        throw C00O.createAndThrow();
    }

    public void A09(C005001p c005001p) {
        C14360o3.A0B(c005001p, 0);
        int i = c005001p.A00;
        A08(this.A00 + i);
        if (this.A00 == 0) {
            if (i > 0) {
                AbstractC06960Yn.A0U(c005001p.A01, this.A01, 0, 0, i);
                AbstractC06960Yn.A0W(c005001p.A02, this.A02, 0, 0, i << 1);
                this.A00 = i;
                return;
            }
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            put(c005001p.A05(i2), c005001p.A06(i2));
        }
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (this != obj) {
            if (obj instanceof C005001p) {
                C005001p c005001p = (C005001p) obj;
                if (size() == c005001p.size()) {
                    int i = this.A00;
                    for (int i2 = 0; i2 < i; i2++) {
                        Object A05 = A05(i2);
                        Object A06 = A06(i2);
                        Object obj2 = c005001p.get(A05);
                        if (A06 == null) {
                            if (obj2 == null) {
                                equals = c005001p.containsKey(A05);
                            }
                        } else {
                            equals = A06.equals(obj2);
                        }
                        if (equals) {
                        }
                    }
                }
                return false;
            }
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (size() == map.size()) {
                    int i3 = this.A00;
                    for (int i4 = 0; i4 < i3; i4++) {
                        Object A052 = A05(i4);
                        Object A062 = A06(i4);
                        Object obj3 = map.get(A052);
                        if (A062 == null) {
                            if (obj3 == null && map.containsKey(A052)) {
                            }
                            return false;
                        }
                        if (!A062.equals(obj3)) {
                            return false;
                        }
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    private final int A00() {
        int i = this.A00;
        if (i == 0) {
            return -1;
        }
        int A00 = AbstractC005301s.A00(this.A01, i, 0);
        if (A00 >= 0) {
            Object[] objArr = this.A02;
            if (objArr[A00 << 1] != null) {
                int i2 = A00 + 1;
                while (i2 < i && this.A01[i2] == 0) {
                    if (objArr[i2 << 1] == null) {
                        return i2;
                    }
                    i2++;
                }
                do {
                    A00--;
                    if (A00 < 0 || this.A01[A00] != 0) {
                        return i2 ^ (-1);
                    }
                } while (objArr[A00 << 1] != null);
                return A00;
            }
        }
        return A00;
    }

    public static final int A01(C005001p c005001p, Object obj, int i) {
        int i2 = c005001p.A00;
        if (i2 == 0) {
            return -1;
        }
        int A00 = AbstractC005301s.A00(c005001p.A01, i2, i);
        if (A00 >= 0 && !obj.equals(c005001p.A02[A00 << 1])) {
            int i3 = A00 + 1;
            while (i3 < i2 && c005001p.A01[i3] == i) {
                if (obj.equals(c005001p.A02[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            do {
                A00--;
                if (A00 < 0 || c005001p.A01[A00] != i) {
                    return i3 ^ (-1);
                }
            } while (!obj.equals(c005001p.A02[A00 << 1]));
            return A00;
        }
        return A00;
    }

    public final int A02(Object obj) {
        int i = this.A00 * 2;
        Object[] objArr = this.A02;
        int i2 = 1;
        if (obj == null) {
            while (i2 < i) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
                i2 += 2;
            }
            return -1;
        }
        while (i2 < i) {
            if (obj.equals(objArr[i2])) {
                return i2 >> 1;
            }
            i2 += 2;
        }
        return -1;
    }

    public final int A03(Object obj) {
        if (obj == null) {
            return A00();
        }
        return A01(this, obj, obj.hashCode());
    }

    public final void A08(int i) {
        int i2 = this.A00;
        int[] iArr = this.A01;
        if (iArr.length < i) {
            int[] copyOf = Arrays.copyOf(iArr, i);
            C14360o3.A07(copyOf);
            this.A01 = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.A02, i * 2);
            C14360o3.A07(copyOf2);
            this.A02 = copyOf2;
        }
        if (this.A00 == i2) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        if (this.A00 > 0) {
            this.A01 = AbstractC005301s.A00;
            this.A02 = AbstractC005301s.A02;
            this.A00 = 0;
        }
    }

    public int hashCode() {
        int i;
        int[] iArr = this.A01;
        Object[] objArr = this.A02;
        int i2 = this.A00;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            int i6 = iArr[i4];
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i5 += i ^ i6;
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public final boolean isEmpty() {
        if (this.A00 > 0) {
            return false;
        }
        return true;
    }

    public Object put(Object obj, Object obj2) {
        int i;
        int A00;
        int i2 = this.A00;
        if (obj != null) {
            i = obj.hashCode();
            A00 = A01(this, obj, i);
        } else {
            i = 0;
            A00 = A00();
        }
        if (A00 >= 0) {
            int i3 = (A00 << 1) + 1;
            Object[] objArr = this.A02;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        int i4 = A00 ^ (-1);
        int[] iArr = this.A01;
        if (i2 >= iArr.length) {
            int i5 = 4;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i5 = 8;
            }
            int[] copyOf = Arrays.copyOf(iArr, i5);
            C14360o3.A07(copyOf);
            this.A01 = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.A02, i5 << 1);
            C14360o3.A07(copyOf2);
            this.A02 = copyOf2;
            if (i2 != this.A00) {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i2) {
            int[] iArr2 = this.A01;
            int i6 = i4 + 1;
            AbstractC06960Yn.A0U(iArr2, iArr2, i6, i4, i2);
            Object[] objArr2 = this.A02;
            AbstractC06960Yn.A0W(objArr2, objArr2, i6 << 1, i4 << 1, this.A00 << 1);
        }
        int i7 = this.A00;
        if (i2 == i7) {
            int[] iArr3 = this.A01;
            if (i4 < iArr3.length) {
                iArr3[i4] = i;
                Object[] objArr3 = this.A02;
                int i8 = i4 << 1;
                objArr3[i8] = obj;
                objArr3[i8 + 1] = obj2;
                this.A00 = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final int size() {
        return this.A00;
    }

    public C005001p(int i) {
        int[] iArr;
        Object[] objArr;
        if (i == 0) {
            iArr = AbstractC005301s.A00;
        } else {
            iArr = new int[i];
        }
        this.A01 = iArr;
        if (i == 0) {
            objArr = AbstractC005301s.A02;
        } else {
            objArr = new Object[i << 1];
        }
        this.A02 = objArr;
    }

    public final boolean containsKey(Object obj) {
        if (A03(obj) < 0) {
            return false;
        }
        return true;
    }

    public final boolean containsValue(Object obj) {
        if (A02(obj) < 0) {
            return false;
        }
        return true;
    }

    public final Object get(Object obj) {
        int A03 = A03(obj);
        if (A03 >= 0) {
            return this.A02[(A03 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int A03 = A03(obj);
        if (A03 >= 0) {
            return this.A02[(A03 << 1) + 1];
        }
        return obj2;
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 == null) {
            return put(obj, obj2);
        }
        return obj3;
    }

    public final Object remove(Object obj) {
        int A03 = A03(obj);
        if (A03 >= 0) {
            return A04(A03);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int A03 = A03(obj);
        if (A03 >= 0) {
            return A07(A03, obj2);
        }
        return null;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        int i = this.A00;
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object A05 = A05(i2);
            if (A05 != sb) {
                sb.append(A05);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object A06 = A06(i2);
            if (A06 != sb) {
                sb.append(A06);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String obj = sb.toString();
        C14360o3.A07(obj);
        return obj;
    }

    public C005001p() {
        this(0);
    }

    public final boolean remove(Object obj, Object obj2) {
        int A03 = A03(obj);
        if (A03 >= 0 && C14360o3.A0K(obj2, A06(A03))) {
            A04(A03);
            return true;
        }
        return false;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int A03 = A03(obj);
        if (A03 >= 0 && C14360o3.A0K(obj2, A06(A03))) {
            A07(A03, obj3);
            return true;
        }
        return false;
    }
}
