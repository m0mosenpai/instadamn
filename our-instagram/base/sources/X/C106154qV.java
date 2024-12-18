package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.4qV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106154qV<E> extends AbstractSet<E> implements java.util.Set<E>, Cloneable, Serializable {
    public static final Object A04 = new Object() { // from class: X.4qW
        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return 0;
        }
    };
    public static final Object[] A05 = new Object[0];
    public int A00 = 0;
    public transient int A01 = 0;
    public transient int A02 = 0;
    public transient Object[] A03;

    public C106154qV() {
        Object[] objArr;
        float f = 0.0f / 0.75f;
        int i = (int) f;
        if (i >= 0) {
            if (i == 0) {
                objArr = A05;
            } else {
                objArr = new Object[i];
            }
            this.A03 = objArr;
            return;
        }
        throw new RuntimeException(StringFormatUtil.formatStrLocaleSafe("adjustedCapacity = %d, capacity = %d, LOAD_FACTOR = %s, (capacity / LOAD_FACTOR) = %s", Integer.valueOf(i), 0, Float.toString(0.75f), Float.toString(f)));
    }

    public static int A01(Object[] objArr, Object obj) {
        int length = objArr.length;
        int A00 = A00(obj, length);
        int i = A00;
        do {
            Object obj2 = objArr[i];
            if (obj2 == null || obj2 == obj || obj2.equals(obj)) {
                break;
            }
            i++;
            if (i == length) {
                i = 0;
            }
        } while (i != A00);
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.A00 = 0;
        Arrays.fill(this.A03, (Object) null);
        this.A01++;
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof java.util.Set) {
                java.util.Set set = (java.util.Set) obj;
                if (size() == set.size()) {
                    for (Object obj2 : this.A03) {
                        if (obj2 == null || set.contains(obj2)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        int A02 = A02(-1);
        int i = 0;
        while (A02 >= 0) {
            i += this.A03[A02].hashCode();
            A02 = A02(A02);
        }
        return i;
    }

    public final int A02(int i) {
        Object[] objArr;
        do {
            i++;
            objArr = this.A03;
            if (i >= objArr.length) {
                return Integer.MIN_VALUE;
            }
        } while (objArr[i] == null);
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        if (this.A00 >= this.A02) {
            this.A01++;
            Object[] objArr = this.A03;
            int i = 2;
            int length = objArr.length * 2;
            if (length != 0) {
                i = length;
            }
            Object[] objArr2 = new Object[i];
            for (Object obj2 : objArr) {
                if (obj2 != null) {
                    objArr2[A01(objArr2, obj2)] = obj2;
                }
            }
            this.A03 = objArr2;
            this.A02 = (int) (i * 0.75f);
        }
        if (obj == null) {
            obj = A04;
        }
        int length2 = this.A03.length;
        int A00 = A00(obj, length2);
        while (true) {
            Object[] objArr3 = this.A03;
            Object obj3 = objArr3[A00];
            if (obj3 == null) {
                this.A00++;
                this.A01++;
                objArr3[A00] = obj;
                return true;
            }
            if (obj3 == obj || obj3.equals(obj)) {
                break;
            }
            A00++;
            if (A00 == length2) {
                A00 = 0;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object[] objArr = this.A03;
        if (objArr.length == 0) {
            return false;
        }
        if (obj == null) {
            obj = A04;
        }
        if (objArr[A01(objArr, obj)] == null) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        if (this.A00 != 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new Iterator(this) { // from class: X.4qX
            public int A00;
            public int A01;
            public int A02;
            public boolean A03;
            public final C106154qV A04;
            public final Object[] A05;

            {
                this.A04 = this;
                this.A05 = this.A03;
                this.A01 = this.A01;
                int A02 = this.A02(-1);
                this.A00 = A02;
                this.A02 = A02;
                this.A03 = false;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                if (this.A00 < 0) {
                    return false;
                }
                return true;
            }

            @Override // java.util.Iterator
            public final Object next() {
                if (this.A01 == this.A04.A01) {
                    int i = this.A00;
                    if (i >= 0) {
                        Object[] objArr = this.A05;
                        Object obj = objArr[i];
                        if (obj == C106154qV.A04) {
                            obj = null;
                        }
                        this.A02 = i;
                        this.A03 = true;
                        while (true) {
                            i++;
                            if (i < objArr.length) {
                                if (objArr[i] != null) {
                                    break;
                                }
                            } else {
                                i = -1;
                                break;
                            }
                        }
                        this.A00 = i;
                        return obj;
                    }
                    throw new NoSuchElementException();
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.Iterator
            public final void remove() {
                int i = this.A01;
                C106154qV c106154qV = this.A04;
                if (i == c106154qV.A01) {
                    if (this.A03) {
                        this.A03 = false;
                        Object[] objArr = this.A05;
                        c106154qV.remove(objArr[this.A02]);
                        this.A01++;
                        int i2 = this.A02;
                        while (true) {
                            if (i2 < objArr.length) {
                                if (objArr[i2] != null) {
                                    break;
                                } else {
                                    i2++;
                                }
                            } else {
                                i2 = -1;
                                break;
                            }
                        }
                        this.A00 = i2;
                        return;
                    }
                    throw new IllegalStateException();
                }
                throw new ConcurrentModificationException();
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        Object[] objArr = this.A03;
        if (objArr.length != 0) {
            if (obj == null) {
                obj = A04;
            }
            int A01 = A01(objArr, obj);
            Object[] objArr2 = this.A03;
            if (objArr2[A01] != null) {
                int length = objArr2.length;
                while (true) {
                    int i = A01;
                    while (true) {
                        A01++;
                        if (A01 >= length) {
                            A01 = 0;
                        }
                        Object[] objArr3 = this.A03;
                        obj2 = objArr3[A01];
                        if (obj2 == null) {
                            this.A01++;
                            this.A00--;
                            objArr3[i] = null;
                            return true;
                        }
                        int A00 = A00(obj2, length);
                        boolean z = false;
                        if (A00 > i) {
                            z = true;
                        }
                        if (A01 < i) {
                            if (z) {
                                continue;
                            }
                        } else if (!z) {
                            break;
                        }
                        if (A00 <= A01) {
                        }
                    }
                    this.A03[i] = obj2;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00;
    }

    public static int A00(Object obj, int i) {
        int hashCode = obj.hashCode();
        int i2 = hashCode + ((hashCode << 15) ^ (-12931));
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return ((i6 ^ (i6 >>> 16)) & Integer.MAX_VALUE) % i;
    }

    public final Object clone() {
        try {
            C106154qV c106154qV = (C106154qV) super.clone();
            Object[] objArr = new Object[this.A03.length];
            c106154qV.A03 = objArr;
            Object[] objArr2 = this.A03;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            return c106154qV;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        int size = size();
        if (objArr.length < size) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        }
        int i = 0;
        int A02 = A02(-1);
        while (A02 >= 0) {
            int i2 = i + 1;
            Object obj = this.A03[A02];
            if (obj == A04) {
                obj = null;
            }
            objArr[i] = obj;
            A02 = A02(A02);
            i = i2;
        }
        if (objArr.length > size) {
            objArr[size] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        boolean z = true;
        int A02 = A02(-1);
        while (A02 >= 0) {
            Object obj = this.A03[A02];
            if (!z) {
                sb.append(", ");
            }
            if (obj == A04) {
                obj = "null";
            }
            sb.append(obj);
            z = false;
            A02 = A02(A02);
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int size = size();
        if (size == 0) {
            return A05;
        }
        Object[] objArr = new Object[size];
        int i = 0;
        int A02 = A02(-1);
        while (A02 >= 0) {
            int i2 = i + 1;
            Object obj = this.A03[A02];
            if (obj == A04) {
                obj = null;
            }
            objArr[i] = obj;
            A02 = A02(A02);
            i = i2;
        }
        return objArr;
    }
}
