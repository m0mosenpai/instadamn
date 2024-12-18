package X;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: X.TYw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC64896TYw extends AbstractCollection implements Serializable {
    public static final Object[] A00 = AbstractC58318PtA.A1b();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public abstract boolean contains(Object obj);

    public final int A00() {
        if (this instanceof C60707RNj) {
            return 0;
        }
        if (this instanceof C60705RNh) {
            C60705RNh c60705RNh = (C60705RNh) this;
            return c60705RNh.A02.A00() + c60705RNh.A00;
        }
        throw AbstractC43592JPx.A11();
    }

    public final int A01(Object[] objArr) {
        AbstractC60708RNk abstractC60708RNk;
        if (this instanceof C60709RNl) {
            abstractC60708RNk = ((C60709RNl) this).A00;
        } else if (this instanceof C60710RNm) {
            C60710RNm c60710RNm = (C60710RNm) this;
            abstractC60708RNk = ((AbstractC60703RNf) c60710RNm).A00;
            if (abstractC60708RNk == null) {
                abstractC60708RNk = new C60704RNg(c60710RNm);
                ((AbstractC60703RNf) c60710RNm).A00 = abstractC60708RNk;
            }
        } else {
            AbstractC60708RNk abstractC60708RNk2 = (AbstractC60708RNk) this;
            if (abstractC60708RNk2 instanceof C60707RNj) {
                C60707RNj c60707RNj = (C60707RNj) abstractC60708RNk2;
                Object[] objArr2 = c60707RNj.A01;
                int i = c60707RNj.A00;
                System.arraycopy(objArr2, 0, objArr, 0, i);
                return i;
            }
            int size = abstractC60708RNk2.size();
            for (int i2 = 0; i2 < size; i2++) {
                objArr[i2] = abstractC60708RNk2.get(i2);
            }
            return size;
        }
        return abstractC60708RNk.A01(objArr);
    }

    public final Object[] A02() {
        if (this instanceof C60707RNj) {
            return ((C60707RNj) this).A01;
        }
        if (this instanceof C60705RNh) {
            return ((C60705RNh) this).A02.A02();
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
                if (this instanceof C60707RNj) {
                    A002 = ((C60707RNj) this).A00;
                } else if (this instanceof C60705RNh) {
                    C60705RNh c60705RNh = (C60705RNh) this;
                    A002 = c60705RNh.A02.A00() + c60705RNh.A00 + c60705RNh.A01;
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
