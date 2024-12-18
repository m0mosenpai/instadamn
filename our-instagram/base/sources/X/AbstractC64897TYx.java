package X;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;

/* renamed from: X.TYx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC64897TYx extends AbstractCollection implements Serializable {
    public static final Object[] A00 = AbstractC58318PtA.A1b();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public abstract boolean contains(Object obj);

    public final int A03() {
        if (this instanceof RM4) {
            return ((RM4) this).A01.A03();
        }
        if (this instanceof RM3) {
            return ((RM3) this).A00;
        }
        if (this instanceof RLy) {
            return ((RLy) this).A00;
        }
        if (this instanceof RLw) {
            RLw rLw = (RLw) this;
            return rLw.A02.A04() + rLw.A00 + rLw.A01;
        }
        throw AbstractC43592JPx.A11();
    }

    public final int A04() {
        if (this instanceof RM4) {
            return ((RM4) this).A01.A04();
        }
        if (!(this instanceof RM3) && !(this instanceof RLy)) {
            if (this instanceof RLw) {
                RLw rLw = (RLw) this;
                return rLw.A02.A04() + rLw.A00;
            }
            throw AbstractC43592JPx.A11();
        }
        return 0;
    }

    public final int A05(Object[] objArr) {
        Object[] objArr2;
        int i;
        if (this instanceof RM1) {
            objArr[0] = ((RM1) this).A00;
            return 1;
        }
        if (this instanceof RM4) {
            return ((RM4) this).A01.A05(objArr);
        }
        if (this instanceof RM3) {
            RM3 rm3 = (RM3) this;
            objArr2 = rm3.A01;
            i = rm3.A00;
        } else if (this instanceof RLz) {
            RLz rLz = (RLz) this;
            if (rLz instanceof RLy) {
                RLy rLy = (RLy) rLz;
                objArr2 = rLy.A01;
                i = rLy.A00;
            } else {
                int size = rLz.size();
                for (int i2 = 0; i2 < size; i2++) {
                    objArr[i2] = rLz.get(i2);
                }
                return size;
            }
        } else {
            TSQ A06 = A06();
            int i3 = 0;
            while (A06.hasNext()) {
                objArr[i3] = A06.next();
                i3++;
            }
            return i3;
        }
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.TSQ, java.lang.Object, X.RMA] */
    public final TSQ A06() {
        RLz A08;
        if (this instanceof RM1) {
            Object obj = ((RM1) this).A00;
            ?? obj2 = new Object();
            obj2.A00 = obj;
            return obj2;
        }
        if (this instanceof RM4) {
            A08 = ((RM4) this).A01;
        } else if (!(this instanceof RM3) && !(this instanceof RM2)) {
            A08 = (RLz) this;
        } else {
            A08 = ((RM5) this).A08();
        }
        return A08.listIterator(0);
    }

    public final Object[] A07() {
        if (this instanceof RM4) {
            return ((RM4) this).A01.A07();
        }
        if (this instanceof RM3) {
            return ((RM3) this).A01;
        }
        if (this instanceof RLy) {
            return ((RLy) this).A01;
        }
        if (this instanceof RLw) {
            return ((RLw) this).A02.A07();
        }
        return null;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(Object obj) {
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection collection) {
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] A07 = A07();
            if (A07 == null) {
                if (length != 0) {
                    objArr = Arrays.copyOf(objArr, 0);
                }
                objArr = Arrays.copyOf(objArr, size);
            } else {
                return Arrays.copyOfRange(A07, A04(), A03(), objArr.getClass());
            }
        } else if (length > size) {
            objArr[size] = null;
        }
        A05(objArr);
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(A00);
    }
}
