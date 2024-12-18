package X;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: X.04o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C012504o<E> implements Collection<E>, java.util.Set<E>, C0YV, InterfaceC019007k {
    public int A00;
    public int[] A01;
    public Object[] A02;

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        C14360o3.A0B(collection, 0);
        int size = this.A00 + collection.size();
        int i = this.A00;
        int[] iArr = this.A01;
        if (iArr.length < size) {
            Object[] objArr = this.A02;
            int[] iArr2 = new int[size];
            this.A01 = iArr2;
            this.A02 = new Object[size];
            if (i > 0) {
                AbstractC06960Yn.A0U(iArr, iArr2, 0, 0, i);
                AbstractC06960Yn.A0W(objArr, this.A02, 0, 0, this.A00);
            }
        }
        if (this.A00 == i) {
            Iterator<E> it = collection.iterator();
            boolean z = false;
            while (it.hasNext()) {
                z |= add(it.next());
            }
            return z;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        C14360o3.A0B(collection, 0);
        Iterator<E> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set set = (java.util.Set) obj;
            if (size() == set.size()) {
                try {
                    int i = this.A00;
                    for (int i2 = 0; i2 < i; i2++) {
                        if (set.contains(this.A02[i2])) {
                        }
                    }
                    return true;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        C14360o3.A0B(collection, 0);
        Iterator<E> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        C14360o3.A0B(collection, 0);
        boolean z = false;
        for (int i = this.A00 - 1; -1 < i; i--) {
            if (!AbstractC001800i.A0u(collection, this.A02[i])) {
                A00(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        C14360o3.A0B(objArr, 0);
        int i = this.A00;
        int length = objArr.length;
        if (length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (length > i) {
            objArr[i] = null;
        }
        AbstractC06960Yn.A0W(this.A02, objArr, 0, 0, this.A00);
        C14360o3.A07(objArr);
        return objArr;
    }

    public final void A00(int i) {
        int i2 = this.A00;
        Object[] objArr = this.A02;
        if (i2 <= 1) {
            clear();
            return;
        }
        int i3 = i2 - 1;
        int[] iArr = this.A01;
        int length = iArr.length;
        int i4 = 8;
        if (length > 8 && i2 < length / 3) {
            if (i2 > 8) {
                i4 = i2 + (i2 >> 1);
            }
            int[] iArr2 = new int[i4];
            this.A01 = iArr2;
            this.A02 = new Object[i4];
            if (i > 0) {
                AbstractC06960Yn.A0U(iArr, iArr2, 0, 0, i);
                AbstractC06960Yn.A0W(objArr, this.A02, 0, 0, i);
            }
            if (i < i3) {
                int i5 = i + 1;
                int i6 = i3 + 1;
                AbstractC06960Yn.A0U(iArr, this.A01, i, i5, i6);
                AbstractC06960Yn.A0W(objArr, this.A02, i, i5, i6);
            }
        } else {
            if (i < i3) {
                int i7 = i + 1;
                int i8 = i3 + 1;
                System.arraycopy(iArr, i7, iArr, i, i8 - i7);
                Object[] objArr2 = this.A02;
                AbstractC06960Yn.A0W(objArr2, objArr2, i, i7, i8);
            }
            this.A02[i3] = null;
        }
        if (i2 == this.A00) {
            this.A00 = i3;
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int hashCode;
        int A00;
        int i = this.A00;
        if (obj == null) {
            A00 = AbstractC003000v.A00(this, null, 0);
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
            A00 = AbstractC003000v.A00(this, obj, hashCode);
        }
        if (A00 >= 0) {
            return false;
        }
        int i2 = A00 ^ (-1);
        int[] iArr = this.A01;
        if (i >= iArr.length) {
            int i3 = 4;
            if (i >= 8) {
                i3 = (i >> 1) + i;
            } else if (i >= 4) {
                i3 = 8;
            }
            Object[] objArr = this.A02;
            int[] iArr2 = new int[i3];
            this.A01 = iArr2;
            this.A02 = new Object[i3];
            if (i == this.A00) {
                if (i3 != 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    AbstractC06960Yn.A0W(objArr, this.A02, 0, 0, objArr.length);
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i2 < i) {
            int[] iArr3 = this.A01;
            int i4 = i2 + 1;
            AbstractC06960Yn.A0U(iArr3, iArr3, i4, i2, i);
            Object[] objArr2 = this.A02;
            AbstractC06960Yn.A0W(objArr2, objArr2, i4, i2, i);
        }
        int i5 = this.A00;
        if (i == i5) {
            int[] iArr4 = this.A01;
            if (i2 < iArr4.length) {
                iArr4[i2] = hashCode;
                this.A02[i2] = obj;
                this.A00 = i5 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.A00 != 0) {
            int[] iArr = AbstractC005301s.A00;
            C14360o3.A0B(iArr, 0);
            this.A01 = iArr;
            Object[] objArr = AbstractC005301s.A02;
            C14360o3.A0B(objArr, 0);
            this.A02 = objArr;
            this.A00 = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int A00;
        if (obj == null) {
            A00 = AbstractC003000v.A00(this, null, 0);
        } else {
            A00 = AbstractC003000v.A00(this, obj, obj.hashCode());
        }
        if (A00 < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.A01;
        int i = this.A00;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        if (this.A00 > 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new AbstractC12580l3() { // from class: X.0SZ
            {
                super.A00 = C012504o.this.A00;
            }

            @Override // X.AbstractC12580l3
            public final Object A00(int i) {
                return C012504o.this.A02[i];
            }

            @Override // X.AbstractC12580l3
            public final void A01(int i) {
                C012504o.this.A00(i);
            }
        };
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int A00;
        if (obj == null) {
            A00 = AbstractC003000v.A00(this, null, 0);
        } else {
            A00 = AbstractC003000v.A00(this, obj, obj.hashCode());
        }
        if (A00 >= 0) {
            A00(A00);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return this.A00;
    }

    public C012504o(int i) {
        this.A01 = AbstractC005301s.A00;
        this.A02 = AbstractC005301s.A02;
        if (i > 0) {
            this.A01 = new int[i];
            this.A02 = new Object[i];
        }
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        int i = this.A00;
        StringBuilder sb = new StringBuilder(i * 14);
        sb.append('{');
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.A02[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String obj2 = sb.toString();
        C14360o3.A07(obj2);
        return obj2;
    }

    public C012504o() {
        this(0);
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC06960Yn.A0a(this.A02, 0, this.A00);
    }
}
