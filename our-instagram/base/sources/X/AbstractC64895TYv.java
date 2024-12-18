package X;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: X.TYv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC64895TYv extends AbstractCollection implements Serializable {
    public static final Object[] A00 = AbstractC58318PtA.A1b();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public abstract boolean contains(Object obj);

    public final int A00() {
        if (this instanceof RNK) {
            return 0;
        }
        if (this instanceof RNI) {
            RNI rni = (RNI) this;
            return rni.A02.A00() + rni.A00;
        }
        throw AbstractC43592JPx.A11();
    }

    public final int A01(Object[] objArr) {
        RNL rnl;
        if (this instanceof RNM) {
            rnl = ((RNM) this).A00;
        } else if (this instanceof RNN) {
            RNN rnn = (RNN) this;
            rnl = ((RNO) rnn).A00;
            if (rnl == null) {
                rnl = new RNH(rnn);
                ((RNO) rnn).A00 = rnl;
            }
        } else {
            RNL rnl2 = (RNL) this;
            if (rnl2 instanceof RNK) {
                RNK rnk = (RNK) rnl2;
                Object[] objArr2 = rnk.A01;
                int i = rnk.A00;
                System.arraycopy(objArr2, 0, objArr, 0, i);
                return i;
            }
            int size = rnl2.size();
            for (int i2 = 0; i2 < size; i2++) {
                objArr[i2] = rnl2.get(i2);
            }
            return size;
        }
        return rnl.A01(objArr);
    }

    public final Object[] A02() {
        if (this instanceof RNK) {
            return ((RNK) this).A01;
        }
        if (this instanceof RNI) {
            return ((RNI) this).A02.A02();
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
                if (this instanceof RNK) {
                    A002 = ((RNK) this).A00;
                } else if (this instanceof RNI) {
                    RNI rni = (RNI) this;
                    A002 = rni.A02.A00() + rni.A00 + rni.A01;
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
