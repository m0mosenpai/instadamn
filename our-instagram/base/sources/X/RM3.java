package X;

import java.util.Iterator;

/* loaded from: classes10.dex */
public final class RM3 extends RM5 {
    public static final RM3 A05;
    public static final Object[] A06;
    public final transient int A00;
    public final transient Object[] A01;
    public final transient Object[] A02;
    public final transient int A03;
    public final transient int A04;

    static {
        Object[] objArr = new Object[0];
        A06 = objArr;
        A05 = new RM3(objArr, objArr, 0, 0, 0);
    }

    @Override // X.AbstractC64897TYx, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.A02;
        if (objArr.length == 0) {
            return false;
        }
        int A052 = AbstractC58321PtD.A05(obj.hashCode());
        while (true) {
            int i = A052 & this.A04;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            A052 = i + 1;
        }
    }

    @Override // X.RM5, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.A03;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00;
    }

    public RM3(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        this.A01 = objArr;
        this.A03 = i;
        this.A02 = objArr2;
        this.A04 = i2;
        this.A00 = i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return A08().listIterator(0);
    }
}
