package com.google.common.collect;

import X.AbstractC111324zv;
import X.AbstractC38301qK;
import X.AbstractC50102Ry;
import X.AnonymousClass001;
import X.C18C;
import X.C1Jk;
import X.C49W;
import X.C64754TSn;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class CompactHashSet<E> extends AbstractSet<E> implements Serializable {
    public static final double HASH_FLOODING_FPP = 0.001d;
    public transient int A00;
    public transient Object A01;
    public transient int[] A02;
    public transient int A03;
    public transient Object[] elements;

    public int A04(int indexBeforeRemove, int indexRemoved) {
        return indexBeforeRemove - 1;
    }

    public void A05(int expectedSize) {
        boolean z = false;
        if (expectedSize >= 0) {
            z = true;
        }
        C18C.A0G(z, "Expected size must be >= 0");
        this.A00 = AbstractC38301qK.A00(expectedSize, 1, 1073741823);
    }

    public int A01() {
        boolean z = false;
        if (this.A01 == null) {
            z = true;
        }
        C18C.A0H(z, "Arrays already allocated");
        int i = this.A00;
        int max = Math.max(4, C1Jk.A00(i + 1));
        this.A01 = C49W.A02(max);
        this.A00 = (this.A00 & (-32)) | ((32 - Integer.numberOfLeadingZeros(max - 1)) & 31);
        this.A02 = new int[i];
        this.elements = new Object[i];
        return i;
    }

    public int A03(int entryIndex) {
        int i = entryIndex + 1;
        if (i >= this.A03) {
            return -1;
        }
        return i;
    }

    public void A06(int newCapacity) {
        int[] iArr = this.A02;
        iArr.getClass();
        this.A02 = Arrays.copyOf(iArr, newCapacity);
        Object[] objArr = this.elements;
        objArr.getClass();
        this.elements = Arrays.copyOf(objArr, newCapacity);
    }

    public void A07(int dstIndex, int mask) {
        int i;
        int i2;
        Object obj = this.A01;
        obj.getClass();
        int[] iArr = this.A02;
        iArr.getClass();
        Object[] objArr = this.elements;
        objArr.getClass();
        int size = size() - 1;
        if (dstIndex < size) {
            Object obj2 = objArr[size];
            objArr[dstIndex] = obj2;
            objArr[size] = null;
            iArr[dstIndex] = iArr[size];
            iArr[size] = 0;
            int A02 = C1Jk.A02(obj2) & mask;
            int A00 = C49W.A00(obj, A02);
            int i3 = size + 1;
            if (A00 == i3) {
                C49W.A03(obj, A02, dstIndex + 1);
                return;
            }
            do {
                i = A00 - 1;
                i2 = iArr[i];
                A00 = i2 & mask;
            } while (A00 != i3);
            iArr[i] = (i2 & (mask ^ (-1))) | ((dstIndex + 1) & mask);
            return;
        }
        objArr[dstIndex] = null;
        iArr[dstIndex] = 0;
    }

    public void A08(Object entryIndex, int object, int hash, int mask) {
        int[] iArr = this.A02;
        iArr.getClass();
        iArr[object] = hash & (mask ^ (-1));
        Object[] objArr = this.elements;
        objArr.getClass();
        objArr[object] = entryIndex;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object object) {
        int min;
        if (this.A01 == null) {
            A01();
        }
        Set delegateOrNull = delegateOrNull();
        if (delegateOrNull == null) {
            int[] iArr = this.A02;
            iArr.getClass();
            Object[] objArr = this.elements;
            objArr.getClass();
            int i = this.A03;
            int i2 = i + 1;
            int A02 = C1Jk.A02(object);
            int i3 = (1 << (this.A00 & 31)) - 1;
            int i4 = A02 & i3;
            Object obj = this.A01;
            obj.getClass();
            int A00 = C49W.A00(obj, i4);
            if (A00 == 0) {
                if (i2 <= i3) {
                    Object obj2 = this.A01;
                    obj2.getClass();
                    C49W.A03(obj2, i4, i2);
                }
                int i5 = 2;
                if (i3 < 32) {
                    i5 = 4;
                }
                int i6 = i5 * (i3 + 1);
                Object A022 = C49W.A02(i6);
                int i7 = i6 - 1;
                if (i != 0) {
                    C49W.A03(A022, A02 & i7, i + 1);
                }
                Object obj3 = this.A01;
                obj3.getClass();
                int[] iArr2 = this.A02;
                iArr2.getClass();
                for (int i8 = 0; i8 <= i3; i8++) {
                    int A002 = C49W.A00(obj3, i8);
                    while (A002 != 0) {
                        int i9 = A002 - 1;
                        int i10 = iArr2[i9];
                        int i11 = (i10 & (i3 ^ (-1))) | i8;
                        int i12 = i11 & i7;
                        int A003 = C49W.A00(A022, i12);
                        C49W.A03(A022, i12, A002);
                        iArr2[i9] = (i11 & (i7 ^ (-1))) | (A003 & i7);
                        A002 = i10 & i3;
                    }
                }
                this.A01 = A022;
                this.A00 = (this.A00 & (-32)) | ((32 - Integer.numberOfLeadingZeros(i7)) & 31);
                i3 = i7;
            } else {
                int i13 = i3 ^ (-1);
                int i14 = A02 & i13;
                int i15 = 0;
                while (true) {
                    int i16 = A00 - 1;
                    int i17 = iArr[i16];
                    if ((i17 & i13) != i14 || !AbstractC50102Ry.A00(object, objArr[i16])) {
                        int i18 = i17 & i3;
                        i15++;
                        if (i18 == 0) {
                            if (i15 >= 9) {
                                delegateOrNull = convertToHashFloodingResistantImplementation();
                            } else if (i2 <= i3) {
                                iArr[i16] = (i17 & i13) | (i2 & i3);
                            }
                        } else {
                            A00 = i18;
                        }
                    } else {
                        return false;
                    }
                }
            }
            int[] iArr3 = this.A02;
            iArr3.getClass();
            int length = iArr3.length;
            if (i2 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
                A06(min);
            }
            A08(object, i, A02, i3);
            this.A03 = i2;
            this.A00 += 32;
            return true;
        }
        return delegateOrNull.add(object);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (this.A01 != null) {
            this.A00 += 32;
            Set delegateOrNull = delegateOrNull();
            if (delegateOrNull != null) {
                this.A00 = AbstractC38301qK.A00(size(), 3, 1073741823);
                delegateOrNull.clear();
                this.A01 = null;
            } else {
                Object[] objArr = this.elements;
                objArr.getClass();
                Arrays.fill(objArr, 0, this.A03, (Object) null);
                Object obj = this.A01;
                obj.getClass();
                if (obj instanceof byte[]) {
                    Arrays.fill((byte[]) obj, (byte) 0);
                } else if (obj instanceof short[]) {
                    Arrays.fill((short[]) obj, (short) 0);
                } else {
                    Arrays.fill((int[]) obj, 0);
                }
                int[] iArr = this.A02;
                iArr.getClass();
                Arrays.fill(iArr, 0, this.A03, 0);
            }
            this.A03 = 0;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object object) {
        int i;
        boolean z = false;
        if (this.A01 == null) {
            z = true;
        }
        if (z) {
            return false;
        }
        Set delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.contains(object);
        }
        int A02 = C1Jk.A02(object);
        int i2 = (1 << (this.A00 & 31)) - 1;
        Object obj = this.A01;
        obj.getClass();
        int A00 = C49W.A00(obj, A02 & i2);
        if (A00 == 0) {
            return false;
        }
        int i3 = i2 ^ (-1);
        int i4 = A02 & i3;
        do {
            int i5 = A00 - 1;
            int[] iArr = this.A02;
            iArr.getClass();
            int i6 = iArr[i5];
            if ((i6 & i3) == i4) {
                Object[] objArr = this.elements;
                objArr.getClass();
                if (AbstractC50102Ry.A00(object, objArr[i5])) {
                    return true;
                }
            }
            i = i6 & i2;
            A00 = i;
        } while (i != 0);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Set convertToHashFloodingResistantImplementation() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(((1 << (this.A00 & 31)) - 1) + 1, 1.0f);
        int A02 = A02();
        while (A02 >= 0) {
            Object[] objArr = this.elements;
            objArr.getClass();
            linkedHashSet.add(objArr[A02]);
            A02 = A03(A02);
        }
        this.A01 = linkedHashSet;
        this.A02 = null;
        this.elements = null;
        this.A00 += 32;
        return linkedHashSet;
    }

    public Set delegateOrNull() {
        Object obj = this.A01;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    public boolean needsAllocArrays() {
        if (this.A01 != null) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object object) {
        boolean z = false;
        if (this.A01 == null) {
            z = true;
        }
        if (z) {
            return false;
        }
        Set delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.remove(object);
        }
        int i = (1 << (this.A00 & 31)) - 1;
        Object obj = this.A01;
        obj.getClass();
        int[] iArr = this.A02;
        iArr.getClass();
        Object[] objArr = this.elements;
        objArr.getClass();
        int A01 = C49W.A01(object, null, obj, iArr, objArr, null, i);
        if (A01 == -1) {
            return false;
        }
        A07(A01, i);
        this.A03--;
        this.A00 += 32;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray(Object[] a) {
        boolean z = false;
        if (this.A01 == null) {
            z = true;
        }
        if (z) {
            if (a.length > 0) {
                a[0] = null;
            }
            return a;
        }
        Set delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.toArray(a);
        }
        Object[] objArr = this.elements;
        objArr.getClass();
        int i = this.A03;
        C18C.A03(0, i, objArr.length);
        int length = a.length;
        if (length < i) {
            if (length != 0) {
                a = Arrays.copyOf(a, 0);
            }
            a = Arrays.copyOf(a, i);
        } else if (length > i) {
            a[i] = null;
        }
        System.arraycopy(objArr, 0, a, 0, i);
        return a;
    }

    public CompactHashSet(int expectedSize) {
        A05(expectedSize);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream stream) {
        stream.defaultReadObject();
        int readInt = stream.readInt();
        if (readInt >= 0) {
            A05(readInt);
            for (int i = 0; i < readInt; i++) {
                add(stream.readObject());
            }
            return;
        }
        throw new InvalidObjectException(AnonymousClass001.A0O(AbstractC111324zv.A00(648), readInt));
    }

    private void writeObject(ObjectOutputStream stream) {
        stream.defaultWriteObject();
        stream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            stream.writeObject(it.next());
        }
    }

    public int A02() {
        if (!isEmpty()) {
            return 0;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        if (size() != 0) {
            return false;
        }
        return true;
    }

    public boolean isUsingHashFloodingResistance() {
        if (delegateOrNull() == null) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Set delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.iterator();
        }
        return new C64754TSn(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Set delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.size();
        }
        return this.A03;
    }

    public CompactHashSet() {
        A05(3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        if (this.A01 == null) {
            return new Object[0];
        }
        Set delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.toArray();
        }
        Object[] objArr = this.elements;
        objArr.getClass();
        return Arrays.copyOf(objArr, this.A03);
    }
}
