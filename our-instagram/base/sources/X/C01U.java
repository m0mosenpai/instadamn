package X;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.01U, reason: invalid class name */
/* loaded from: classes.dex */
public final class C01U<E> extends C04D<E> {
    public static final Object[] A03 = new Object[0];
    public int A00;
    public Object[] A01;
    public int A02;

    public C01U(Collection collection) {
        C14360o3.A0B(collection, 1);
        Object[] array = collection.toArray(new Object[0]);
        this.A01 = array;
        int length = array.length;
        this.A02 = length;
        if (length == 0) {
            this.A01 = A03;
        }
    }

    private final void A01(int i, int i2) {
        Object[] objArr = this.A01;
        if (i < i2) {
            AbstractC06960Yn.A0V(objArr, i, i2);
        } else {
            Arrays.fill(objArr, i, objArr.length, (Object) null);
            AbstractC06960Yn.A0V(this.A01, 0, i2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        C14360o3.A0B(collection, 0);
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        A00(size() + collection.size());
        int size = this.A00 + size();
        int length = this.A01.length;
        if (size >= length) {
            size -= length;
        }
        A02(collection, size);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        Object[] objArr;
        C14360o3.A0B(collection, 0);
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.A01.length != 0) {
            int size = this.A00 + size();
            int length = this.A01.length;
            if (size >= length) {
                size -= length;
            }
            int i = this.A00;
            int i2 = i;
            if (i >= size) {
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr2 = this.A01;
                    Object obj = objArr2[i];
                    objArr2[i] = null;
                    if (!collection.contains(obj)) {
                        this.A01[i2] = obj;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                int i3 = i2;
                int length2 = this.A01.length;
                if (i2 >= length2) {
                    i3 = i2 - length2;
                }
                i2 = i3;
                for (int i4 = 0; i4 < size; i4++) {
                    Object[] objArr3 = this.A01;
                    Object obj2 = objArr3[i4];
                    objArr3[i4] = null;
                    if (!collection.contains(obj2)) {
                        this.A01[i3] = obj2;
                        i3++;
                        if (i2 == r0.length - 1) {
                            i3 = 0;
                        }
                        i2 = i3;
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            } else {
                while (true) {
                    objArr = this.A01;
                    if (i >= size) {
                        break;
                    }
                    Object obj3 = objArr[i];
                    if (!collection.contains(obj3)) {
                        this.A01[i2] = obj3;
                        i2++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                AbstractC06960Yn.A0V(objArr, i2, size);
            }
            if (z) {
                ((AbstractList) this).modCount++;
                int i5 = i2 - this.A00;
                if (i5 < 0) {
                    i5 += this.A01.length;
                }
                this.A02 = i5;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        Object[] objArr;
        C14360o3.A0B(collection, 0);
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.A01.length != 0) {
            int size = this.A00 + size();
            int length = this.A01.length;
            if (size >= length) {
                size -= length;
            }
            int i = this.A00;
            int i2 = i;
            if (i >= size) {
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr2 = this.A01;
                    Object obj = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj)) {
                        this.A01[i2] = obj;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                int i3 = i2;
                int length2 = this.A01.length;
                if (i2 >= length2) {
                    i3 = i2 - length2;
                }
                i2 = i3;
                for (int i4 = 0; i4 < size; i4++) {
                    Object[] objArr3 = this.A01;
                    Object obj2 = objArr3[i4];
                    objArr3[i4] = null;
                    if (collection.contains(obj2)) {
                        this.A01[i3] = obj2;
                        i3++;
                        if (i2 == r0.length - 1) {
                            i3 = 0;
                        }
                        i2 = i3;
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            } else {
                while (true) {
                    objArr = this.A01;
                    if (i >= size) {
                        break;
                    }
                    Object obj3 = objArr[i];
                    if (collection.contains(obj3)) {
                        this.A01[i2] = obj3;
                        i2++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                AbstractC06960Yn.A0V(objArr, i2, size);
            }
            if (z) {
                ((AbstractList) this).modCount++;
                int i5 = i2 - this.A00;
                if (i5 < 0) {
                    i5 += this.A01.length;
                }
                this.A02 = i5;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        C14360o3.A0B(objArr, 0);
        if (objArr.length < size()) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size());
            C14360o3.A0C(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int size = this.A00 + size();
        Object[] objArr2 = this.A01;
        int length = objArr2.length;
        if (size >= length) {
            size -= length;
        }
        int i = this.A00;
        if (i < size) {
            AbstractC06960Yn.A0W(objArr2, objArr, 0, i, size);
        } else if (!isEmpty()) {
            Object[] objArr3 = this.A01;
            AbstractC06960Yn.A0W(objArr3, objArr, 0, this.A00, objArr3.length);
            Object[] objArr4 = this.A01;
            AbstractC06960Yn.A0W(objArr4, objArr, objArr4.length - this.A00, 0, size);
        }
        int size2 = size();
        C14360o3.A0B(objArr, 1);
        if (size2 < objArr.length) {
            objArr[size2] = null;
        }
        return objArr;
    }

    private final void A00(int i) {
        Object[] objArr;
        if (i >= 0) {
            Object[] objArr2 = this.A01;
            int length = objArr2.length;
            if (i > length) {
                if (objArr2 == A03) {
                    if (i < 10) {
                        i = 10;
                    }
                    objArr = new Object[i];
                } else {
                    objArr = new Object[C0eC.A00(length, i)];
                    AbstractC06960Yn.A0W(objArr2, objArr, 0, this.A00, length);
                    Object[] objArr3 = this.A01;
                    int length2 = objArr3.length;
                    int i2 = this.A00;
                    AbstractC06960Yn.A0W(objArr3, objArr, length2 - i2, 0, i2);
                    this.A00 = 0;
                }
                this.A01 = objArr;
                return;
            }
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    @Override // X.C04D
    public final int A0M() {
        return this.A02;
    }

    public final void addFirst(Object obj) {
        ((AbstractList) this).modCount++;
        A00(size() + 1);
        int i = this.A00;
        if (i == 0) {
            Object[] objArr = this.A01;
            C14360o3.A0B(objArr, 0);
            i = objArr.length;
        }
        int i2 = i - 1;
        this.A00 = i2;
        this.A01[i2] = obj;
        this.A02 = size() + 1;
    }

    public final void addLast(Object obj) {
        ((AbstractList) this).modCount++;
        A00(size() + 1);
        Object[] objArr = this.A01;
        int size = this.A00 + size();
        int length = this.A01.length;
        if (size >= length) {
            size -= length;
        }
        objArr[size] = obj;
        this.A02 = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int size = this.A00 + size();
        int length = this.A01.length;
        if (size >= length) {
            size -= length;
        }
        int i = this.A00;
        if (i < size) {
            while (i < size) {
                if (!C14360o3.A0K(obj, this.A01[i])) {
                    i++;
                }
            }
            return -1;
        }
        while (true) {
            if (i < length) {
                if (C14360o3.A0K(obj, this.A01[i])) {
                    break;
                }
                i++;
            } else {
                for (int i2 = 0; i2 < size; i2++) {
                    if (C14360o3.A0K(obj, this.A01[i2])) {
                        i = i2 + this.A01.length;
                    }
                }
                return -1;
            }
        }
        return i - this.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0025, code lost:
    
        if (r1 > r3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0029, code lost:
    
        if ((-1) >= r3) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        if (X.C14360o3.A0K(r5, r4.A01[r3]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0035, code lost:
    
        r3 = r3 + r4.A01.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003d, code lost:
    
        r1 = r4.A01;
        X.C14360o3.A0B(r1, 0);
        r3 = r1.length - 1;
        r1 = r4.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
    
        if (r1 > r3) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
    
        if (X.C14360o3.A0K(r5, r4.A01[r3]) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
    
        if (r3 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0056, code lost:
    
        r3 = r3 - 1;
     */
    @Override // java.util.AbstractList, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int lastIndexOf(java.lang.Object r5) {
        /*
            r4 = this;
            int r3 = r4.A00
            int r0 = r4.size()
            int r3 = r3 + r0
            java.lang.Object[] r0 = r4.A01
            int r0 = r0.length
            if (r3 < r0) goto Ld
            int r3 = r3 - r0
        Ld:
            int r1 = r4.A00
            r2 = -1
            if (r1 >= r3) goto L25
            int r3 = r3 + (-1)
            if (r1 > r3) goto L59
        L16:
            java.lang.Object[] r0 = r4.A01
            r0 = r0[r3]
            boolean r0 = X.C14360o3.A0K(r5, r0)
            if (r0 != 0) goto L39
            if (r3 == r1) goto L59
            int r3 = r3 + (-1)
            goto L16
        L25:
            if (r1 <= r3) goto L59
        L27:
            int r3 = r3 + (-1)
            if (r2 >= r3) goto L3d
            java.lang.Object[] r0 = r4.A01
            r0 = r0[r3]
            boolean r0 = X.C14360o3.A0K(r5, r0)
            if (r0 == 0) goto L27
            java.lang.Object[] r0 = r4.A01
            int r0 = r0.length
            int r3 = r3 + r0
        L39:
            int r0 = r4.A00
            int r3 = r3 - r0
            return r3
        L3d:
            java.lang.Object[] r1 = r4.A01
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            int r0 = r1.length
            int r3 = r0 + (-1)
            int r1 = r4.A00
            if (r1 > r3) goto L59
        L4a:
            java.lang.Object[] r0 = r4.A01
            r0 = r0[r3]
            boolean r0 = X.C14360o3.A0K(r5, r0)
            if (r0 != 0) goto L39
            if (r3 == r1) goto L59
            int r3 = r3 + (-1)
            goto L4a
        L59:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01U.lastIndexOf(java.lang.Object):int");
    }

    private final void A02(Collection collection, int i) {
        Iterator<E> it = collection.iterator();
        int length = this.A01.length;
        while (i < length && it.hasNext()) {
            this.A01[i] = it.next();
            i++;
        }
        int i2 = this.A00;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.A01[i3] = it.next();
        }
        this.A02 = size() + collection.size();
    }

    @Override // X.C04D
    public final Object A0N(int i) {
        C0eC.A02(i, size());
        if (i == size() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        ((AbstractList) this).modCount++;
        int i2 = this.A00 + i;
        Object[] objArr = this.A01;
        int length = objArr.length;
        if (i2 >= length) {
            i2 -= length;
        }
        Object obj = objArr[i2];
        int size = size() >> 1;
        int i3 = this.A00;
        if (i < size) {
            if (i2 >= i3) {
                Object[] objArr2 = this.A01;
                AbstractC06960Yn.A0W(objArr2, objArr2, i3 + 1, i3, i2);
            } else {
                Object[] objArr3 = this.A01;
                AbstractC06960Yn.A0W(objArr3, objArr3, 1, 0, i2);
                Object[] objArr4 = this.A01;
                int length2 = objArr4.length - 1;
                objArr4[0] = objArr4[length2];
                int i4 = this.A00;
                System.arraycopy(objArr4, i4, objArr4, i4 + 1, length2 - i4);
            }
            Object[] objArr5 = this.A01;
            int i5 = this.A00;
            objArr5[i5] = null;
            int length3 = objArr5.length - 1;
            int i6 = i5 + 1;
            if (i5 == length3) {
                i6 = 0;
            }
            this.A00 = i6;
        } else {
            int size2 = i3 + (size() - 1);
            Object[] objArr6 = this.A01;
            int length4 = objArr6.length;
            if (size2 >= length4) {
                size2 -= length4;
            }
            int i7 = i2 + 1;
            if (i2 <= size2) {
                System.arraycopy(objArr6, i7, objArr6, i2, (size2 + 1) - i7);
            } else {
                System.arraycopy(objArr6, i7, objArr6, i2, length4 - i7);
                Object[] objArr7 = this.A01;
                objArr7[objArr7.length - 1] = objArr7[0];
                System.arraycopy(objArr7, 1, objArr7, 0, (size2 + 1) - 1);
            }
            this.A01[size2] = null;
        }
        this.A02 = size() - 1;
        return obj;
    }

    public final Object A0O() {
        if (!isEmpty()) {
            return this.A01[this.A00];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object A0P() {
        if (isEmpty()) {
            return null;
        }
        return this.A01[this.A00];
    }

    public final Object A0Q() {
        if (!isEmpty()) {
            Object[] objArr = this.A01;
            int size = this.A00 + (size() - 1);
            int length = this.A01.length;
            if (size >= length) {
                size -= length;
            }
            return objArr[size];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object A0R() {
        if (isEmpty()) {
            return null;
        }
        Object[] objArr = this.A01;
        int size = this.A00 + (size() - 1);
        int length = this.A01.length;
        if (size >= length) {
            size -= length;
        }
        return objArr[size];
    }

    public final Object A0S() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final Object A0T() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            ((AbstractList) this).modCount++;
            int size = this.A00 + size();
            int length = this.A01.length;
            if (size >= length) {
                size -= length;
            }
            A01(this.A00, size);
        }
        this.A00 = 0;
        this.A02 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        C0eC.A02(i, size());
        Object[] objArr = this.A01;
        int i2 = this.A00 + i;
        int length = objArr.length;
        if (i2 >= length) {
            i2 -= length;
        }
        return objArr[i2];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (size() != 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            ((AbstractList) this).modCount++;
            Object[] objArr = this.A01;
            int i = this.A00;
            Object obj = objArr[i];
            objArr[i] = null;
            int i2 = i + 1;
            if (i == objArr.length - 1) {
                i2 = 0;
            }
            this.A00 = i2;
            this.A02 = size() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            ((AbstractList) this).modCount++;
            int size = this.A00 + (size() - 1);
            Object[] objArr = this.A01;
            int length = objArr.length;
            if (size >= length) {
                size -= length;
            }
            Object obj = objArr[size];
            objArr[size] = null;
            this.A02 = size() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        C0eC.A04(i, i2, size());
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 == size()) {
                clear();
                return;
            }
            if (i3 == 1) {
                remove(i);
                return;
            }
            ((AbstractList) this).modCount++;
            int size = size() - i2;
            int i4 = this.A00;
            if (i < size) {
                int i5 = i4 + (i - 1);
                int length = this.A01.length;
                if (i5 >= length) {
                    i5 -= length;
                }
                int i6 = i4 + (i2 - 1);
                if (i6 >= length) {
                    i6 -= length;
                }
                while (i > 0) {
                    int i7 = i5 + 1;
                    int min = Math.min(i, Math.min(i7, i6 + 1));
                    Object[] objArr = this.A01;
                    i6 -= min;
                    i5 -= min;
                    AbstractC06960Yn.A0W(objArr, objArr, i6 + 1, i5 + 1, i7);
                    if (i5 < 0) {
                        i5 += this.A01.length;
                    }
                    if (i6 < 0) {
                        i6 += this.A01.length;
                    }
                    i -= min;
                }
                int i8 = this.A00;
                int i9 = i8 + i3;
                int length2 = this.A01.length;
                if (i9 >= length2) {
                    i9 -= length2;
                }
                A01(i8, i9);
                this.A00 = i9;
            } else {
                int i10 = i4 + i2;
                int length3 = this.A01.length;
                if (i10 >= length3) {
                    i10 -= length3;
                }
                int i11 = i4 + i;
                if (i11 >= length3) {
                    i11 -= length3;
                }
                int size2 = size();
                while (true) {
                    size2 -= i2;
                    if (size2 <= 0) {
                        break;
                    }
                    Object[] objArr2 = this.A01;
                    int length4 = objArr2.length;
                    i2 = Math.min(size2, Math.min(length4 - i10, length4 - i11));
                    int i12 = i10 + i2;
                    System.arraycopy(objArr2, i10, objArr2, i11, i12 - i10);
                    i10 = i12;
                    int length5 = this.A01.length;
                    if (i12 >= length5) {
                        i10 = i12 - length5;
                    }
                    i11 += i2;
                    if (i11 >= length5) {
                        i11 -= length5;
                    }
                }
                int size3 = this.A00 + size();
                int length6 = this.A01.length;
                if (size3 >= length6) {
                    size3 -= length6;
                }
                int i13 = size3 - i3;
                if (i13 < 0) {
                    i13 += length6;
                }
                A01(i13, size3);
            }
            this.A02 = size() - i3;
        }
    }

    @Override // X.C04D, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        C0eC.A02(i, size());
        int i2 = this.A00 + i;
        Object[] objArr = this.A01;
        int length = objArr.length;
        if (i2 >= length) {
            i2 -= length;
        }
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public C01U() {
        this.A01 = A03;
    }

    @Override // X.C04D, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        C0eC.A03(i, size());
        if (i == size()) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        A00(size() + 1);
        int i3 = this.A00 + i;
        int length = this.A01.length;
        if (i3 >= length) {
            i3 -= length;
        }
        if (i < ((size() + 1) >> 1)) {
            if (i3 == 0) {
                Object[] objArr = this.A01;
                C14360o3.A0B(objArr, 0);
                i2 = objArr.length - 1;
            } else {
                i2 = i3 - 1;
            }
            int i4 = this.A00;
            if (i4 == 0) {
                Object[] objArr2 = this.A01;
                C14360o3.A0B(objArr2, 0);
                i4 = objArr2.length;
            }
            int i5 = i4 - 1;
            int i6 = this.A00;
            Object[] objArr3 = this.A01;
            if (i2 >= i6) {
                objArr3[i5] = objArr3[i6];
                int i7 = i6 + 1;
                System.arraycopy(objArr3, i7, objArr3, i6, (i2 + 1) - i7);
            } else {
                System.arraycopy(objArr3, i6, objArr3, i6 - 1, objArr3.length - i6);
                Object[] objArr4 = this.A01;
                objArr4[objArr4.length - 1] = objArr4[0];
                System.arraycopy(objArr4, 1, objArr4, 0, (i2 + 1) - 1);
            }
            this.A01[i2] = obj;
            this.A00 = i5;
        } else {
            int size = this.A00 + size();
            Object[] objArr5 = this.A01;
            int length2 = objArr5.length;
            if (size >= length2) {
                size -= length2;
            }
            if (i3 < size) {
                System.arraycopy(objArr5, i3, objArr5, i3 + 1, size - i3);
            } else {
                System.arraycopy(objArr5, 0, objArr5, 1, size);
                Object[] objArr6 = this.A01;
                int length3 = objArr6.length - 1;
                objArr6[0] = objArr6[length3];
                System.arraycopy(objArr6, i3, objArr6, i3 + 1, length3 - i3);
            }
            this.A01[i3] = obj;
        }
        this.A02 = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Object[] objArr;
        C14360o3.A0B(collection, 1);
        C0eC.A03(i, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        ((AbstractList) this).modCount++;
        A00(size() + collection.size());
        int size = this.A00 + size();
        int length = this.A01.length;
        if (size >= length) {
            size -= length;
        }
        int i2 = this.A00 + i;
        if (i2 >= length) {
            i2 -= length;
        }
        int size2 = collection.size();
        if (i < ((size() + 1) >> 1)) {
            int i3 = this.A00;
            int i4 = i3 - size2;
            if (i2 >= i3) {
                if (i4 >= 0) {
                    Object[] objArr2 = this.A01;
                    AbstractC06960Yn.A0W(objArr2, objArr2, i4, i3, i2);
                } else {
                    Object[] objArr3 = this.A01;
                    int length2 = objArr3.length;
                    i4 += length2;
                    int i5 = i2 - i3;
                    int i6 = length2 - i4;
                    if (i6 >= i5) {
                        System.arraycopy(objArr3, i3, objArr3, i4, i5);
                    } else {
                        System.arraycopy(objArr3, i3, objArr3, i4, (i3 + i6) - i3);
                        Object[] objArr4 = this.A01;
                        AbstractC06960Yn.A0W(objArr4, objArr4, 0, this.A00 + i6, i2);
                    }
                }
            } else {
                Object[] objArr5 = this.A01;
                System.arraycopy(objArr5, i3, objArr5, i4, objArr5.length - i3);
                Object[] objArr6 = this.A01;
                int length3 = objArr6.length - size2;
                if (size2 >= i2) {
                    System.arraycopy(objArr6, 0, objArr6, length3, i2);
                } else {
                    System.arraycopy(objArr6, 0, objArr6, length3, size2);
                    Object[] objArr7 = this.A01;
                    AbstractC06960Yn.A0W(objArr7, objArr7, 0, size2, i2);
                }
            }
            this.A00 = i4;
            i2 -= size2;
            if (i2 < 0) {
                i2 += this.A01.length;
            }
        } else {
            int i7 = i2 + size2;
            if (i2 < size) {
                int i8 = size2 + size;
                objArr = this.A01;
                int length4 = objArr.length;
                if (i8 > length4) {
                    if (i7 >= length4) {
                        i7 -= length4;
                    } else {
                        int i9 = size - (i8 - length4);
                        System.arraycopy(objArr, i9, objArr, 0, size - i9);
                        Object[] objArr8 = this.A01;
                        AbstractC06960Yn.A0W(objArr8, objArr8, i7, i2, i9);
                    }
                }
                System.arraycopy(objArr, i2, objArr, i7, size - i2);
            } else {
                Object[] objArr9 = this.A01;
                AbstractC06960Yn.A0W(objArr9, objArr9, size2, 0, size);
                Object[] objArr10 = this.A01;
                int length5 = objArr10.length;
                if (i7 >= length5) {
                    System.arraycopy(objArr10, i2, objArr10, i7 - length5, length5 - i2);
                } else {
                    int i10 = length5 - size2;
                    System.arraycopy(objArr10, i10, objArr10, 0, length5 - i10);
                    objArr = this.A01;
                    size = objArr.length - size2;
                    System.arraycopy(objArr, i2, objArr, i7, size - i2);
                }
            }
        }
        A02(collection, i2);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
