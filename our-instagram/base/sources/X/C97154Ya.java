package X;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.4Ya, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97154Ya extends AbstractList<Integer> implements RandomAccess, Serializable {
    public final int A00;
    public final int A01;
    public final int[] A02;

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object object) {
        if (object != this) {
            if (object instanceof C97154Ya) {
                C97154Ya c97154Ya = (C97154Ya) object;
                int size = size();
                if (c97154Ya.size() != size) {
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (this.A02[this.A01 + i] != c97154Ya.A02[c97154Ya.A01 + i]) {
                        return false;
                    }
                }
            } else {
                return super.equals(object);
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object target) {
        if (target instanceof Integer) {
            int[] iArr = this.A02;
            int intValue = ((Number) target).intValue();
            int i = this.A01;
            int i2 = this.A00;
            while (true) {
                if (i >= i2) {
                    break;
                }
                if (iArr[i] == intValue) {
                    if (i == -1) {
                        break;
                    }
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = this.A01; i2 < this.A00; i2++) {
            i = (i * 31) + this.A02[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object target) {
        if (target instanceof Integer) {
            int[] iArr = this.A02;
            int intValue = ((Number) target).intValue();
            int i = this.A01;
            int i2 = this.A00;
            int i3 = i;
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                if (iArr[i3] == intValue) {
                    int i4 = i3 - i;
                    if (i3 < 0) {
                        break;
                    }
                    return i4;
                }
                i3++;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object target) {
        if (target instanceof Integer) {
            int[] iArr = this.A02;
            int intValue = ((Number) target).intValue();
            int i = this.A01;
            int i2 = this.A00;
            while (true) {
                i2--;
                if (i2 < i) {
                    break;
                }
                if (iArr[i2] == intValue) {
                    int i3 = i2 - i;
                    if (i2 < 0) {
                        break;
                    }
                    return i3;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int index, Object element) {
        Number number = (Number) element;
        C18C.A01(index, size());
        int[] iArr = this.A02;
        int i = this.A01 + index;
        int i2 = iArr[i];
        number.getClass();
        iArr[i] = number.intValue();
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00 - this.A01;
    }

    public C97154Ya(int[] array, int start, int end) {
        this.A02 = array;
        this.A01 = start;
        this.A00 = end;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int index) {
        C18C.A01(index, size());
        return Integer.valueOf(this.A02[this.A01 + index]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int fromIndex, int toIndex) {
        C18C.A03(fromIndex, toIndex, size());
        if (fromIndex == toIndex) {
            return Collections.emptyList();
        }
        int[] iArr = this.A02;
        int i = this.A01;
        return new C97154Ya(iArr, fromIndex + i, i + toIndex);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        int[] iArr = this.A02;
        int i = this.A01;
        while (true) {
            sb.append(iArr[i]);
            i++;
            if (i < this.A00) {
                sb.append(", ");
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }
}
