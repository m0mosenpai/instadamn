package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* renamed from: X.5BP, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5BP implements List<C58J>, InterfaceC15590qF {
    public int A01;
    public Object[] A04 = new Object[16];
    public long[] A03 = new long[16];
    public int A00 = -1;
    public boolean A02 = true;

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, C58J c58j) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends C58J> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.A00 = -1;
        A01(this);
        this.A02 = true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new TTT(this, 0, 0, size());
    }

    @Override // java.util.List
    public final ListIterator<C58J> listIterator(int i) {
        return new TTT(this, i, 0, size());
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ C58J remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<C58J> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ C58J set(int i, C58J c58j) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void sort(Comparator<? super C58J> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC13370mN.A00(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC13370mN.A01(this, objArr);
    }

    public static final long A00(C5BP c5bp) {
        long floatToIntBits = Float.floatToIntBits(Float.POSITIVE_INFINITY) << 32;
        int i = c5bp.A00 + 1;
        int size = c5bp.size() - 1;
        if (i <= size) {
            while (true) {
                long j = c5bp.A03[i];
                if (AbstractC25296BHp.A00(j, floatToIntBits) < 0) {
                    floatToIntBits = j;
                }
                if ((Float.intBitsToFloat((int) (floatToIntBits >> 32)) < 0.0f && ((int) (floatToIntBits & 4294967295L)) != 0) || i == size) {
                    break;
                }
                i++;
            }
        }
        return floatToIntBits;
    }

    public static final void A01(C5BP c5bp) {
        int i = c5bp.A00 + 1;
        int size = c5bp.size() - 1;
        if (i <= size) {
            while (true) {
                c5bp.A04[i] = null;
                if (i == size) {
                    break;
                } else {
                    i++;
                }
            }
        }
        c5bp.A01 = i;
    }

    public final void A02(C58J c58j, InterfaceC16820sZ interfaceC16820sZ, float f, boolean z) {
        long j;
        int i = this.A00;
        int i2 = i + 1;
        this.A00 = i2;
        Object[] objArr = this.A04;
        int length = objArr.length;
        if (i2 >= length) {
            int i3 = length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, i3);
            C14360o3.A07(copyOf);
            this.A04 = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.A03, i3);
            C14360o3.A07(copyOf2);
            this.A03 = copyOf2;
        }
        Object[] objArr2 = this.A04;
        int i4 = this.A00;
        objArr2[i4] = c58j;
        long[] jArr = this.A03;
        long floatToIntBits = Float.floatToIntBits(f);
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        jArr[i4] = (j & 4294967295L) | (floatToIntBits << 32);
        A01(this);
        interfaceC16820sZ.invoke();
        this.A00 = i;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C58J) || indexOf(obj) == -1) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List
    public final /* bridge */ /* synthetic */ C58J get(int i) {
        C114325Dw c114325Dw = this.A04[i];
        C14360o3.A0C(c114325Dw, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return c114325Dw;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r2 < 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (X.C14360o3.A0K(r3.A04[r1], r4) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        r0 = r1;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r0 != r2) goto L15;
     */
    @Override // java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ int indexOf(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof X.C58J
            if (r0 == 0) goto Ld
            int r0 = r3.size()
            int r2 = r0 + (-1)
            r1 = 0
            if (r2 >= 0) goto Lf
        Ld:
            r1 = -1
        Le:
            return r1
        Lf:
            java.lang.Object[] r0 = r3.A04
            r0 = r0[r1]
            boolean r0 = X.C14360o3.A0K(r0, r4)
            if (r0 != 0) goto Le
            r0 = r1
            int r1 = r1 + 1
            if (r0 != r2) goto Lf
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5BP.indexOf(java.lang.Object):int");
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C58J) {
            for (int size = size() - 1; -1 < size; size--) {
                if (C14360o3.A0K(this.A04[size], obj)) {
                    return size;
                }
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return this.A01;
    }

    @Override // java.util.List
    public final List<C58J> subList(int i, int i2) {
        return new TTL(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        if (size() != 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.List
    public final ListIterator<C58J> listIterator() {
        return new TTT(this, 0, 0, size());
    }
}
