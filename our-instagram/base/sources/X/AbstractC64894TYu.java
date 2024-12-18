package X;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: X.TYu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC64894TYu extends AbstractCollection implements Serializable {
    public static final Object[] A00 = AbstractC58318PtA.A1b();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public abstract boolean contains(Object obj);

    public final int A00() {
        if (this instanceof RN4) {
            return 0;
        }
        if (this instanceof RN2) {
            RN2 rn2 = (RN2) this;
            return rn2.A02.A00() + rn2.A00;
        }
        throw AbstractC43592JPx.A11();
    }

    public final int A01(Object[] objArr) {
        RN5 rn5;
        if (this instanceof RN6) {
            rn5 = ((RN6) this).A00;
        } else if (this instanceof RN7) {
            RN7 rn7 = (RN7) this;
            rn5 = ((RN8) rn7).A00;
            if (rn5 == null) {
                rn5 = new RN1(rn7);
                ((RN8) rn7).A00 = rn5;
            }
        } else {
            RN5 rn52 = (RN5) this;
            if (rn52 instanceof RN4) {
                RN4 rn4 = (RN4) rn52;
                Object[] objArr2 = rn4.A01;
                int i = rn4.A00;
                System.arraycopy(objArr2, 0, objArr, 0, i);
                return i;
            }
            int size = rn52.size();
            for (int i2 = 0; i2 < size; i2++) {
                objArr[i2] = rn52.get(i2);
            }
            return size;
        }
        return rn5.A01(objArr);
    }

    public final Object[] A02() {
        if (this instanceof RN4) {
            return ((RN4) this).A01;
        }
        if (this instanceof RN2) {
            return ((RN2) this).A02.A02();
        }
        return null;
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
        int A002;
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] A02 = A02();
            if (A02 == null) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            } else {
                int A003 = A00();
                if (this instanceof RN4) {
                    A002 = ((RN4) this).A00;
                } else if (this instanceof RN2) {
                    RN2 rn2 = (RN2) this;
                    A002 = rn2.A02.A00() + rn2.A00 + rn2.A01;
                } else {
                    throw AbstractC43592JPx.A11();
                }
                return Arrays.copyOfRange(A02, A003, A002, objArr.getClass());
            }
        } else if (length > size) {
            objArr[size] = null;
        }
        A01(objArr);
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(A00);
    }
}
