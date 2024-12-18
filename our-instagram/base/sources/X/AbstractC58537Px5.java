package X;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.Px5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58537Px5<E> extends AbstractList<E> implements InterfaceC65690TsC<E> {
    public boolean A00;

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object o) {
        if (o != this) {
            if (!(o instanceof List)) {
                return false;
            }
            if (!(o instanceof RandomAccess)) {
                return super.equals(o);
            }
            List list = (List) o;
            int size = size();
            if (size != list.size()) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (!AbstractC58319PtB.A1U(get(i), list, i)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void A01() {
        if (this.A00) {
        } else {
            throw AbstractC43592JPx.A11();
        }
    }

    public AbstractC58537Px5(boolean isMutable) {
        this.A00 = isMutable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object e) {
        A01();
        return super.add(e);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, Collection c) {
        A01();
        return super.addAll(index, c);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        A01();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = AbstractC166987dD.A0I(get(i2), i * 31);
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object o) {
        A01();
        return AbstractC58323PtF.A1Y(o, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection c) {
        A01();
        return super.removeAll(c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection c) {
        A01();
        return super.retainAll(c);
    }

    public AbstractC58537Px5() {
        this(true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection c) {
        A01();
        return super.addAll(c);
    }
}
