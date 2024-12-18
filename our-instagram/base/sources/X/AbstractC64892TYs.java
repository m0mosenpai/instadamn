package X;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.TYs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC64892TYs extends AbstractCollection {
    public Collection A00;
    public final AbstractC64892TYs A01;
    public final Object A02;
    public final Collection A03;
    public final /* synthetic */ AbstractC60698RNa A04;

    public AbstractC64892TYs(AbstractC64892TYs abstractC64892TYs, AbstractC60698RNa abstractC60698RNa, Object obj, Collection collection) {
        Collection collection2;
        this.A04 = abstractC60698RNa;
        this.A02 = obj;
        this.A00 = collection;
        this.A01 = abstractC64892TYs;
        if (abstractC64892TYs == null) {
            collection2 = null;
        } else {
            collection2 = abstractC64892TYs.A00;
        }
        this.A03 = collection2;
    }

    public final void A00() {
        AbstractC64892TYs abstractC64892TYs = this.A01;
        if (abstractC64892TYs != null) {
            abstractC64892TYs.A00();
        } else {
            this.A04.A01.put(this.A02, this.A00);
        }
    }

    public final void A01() {
        Collection collection;
        AbstractC64892TYs abstractC64892TYs = this.A01;
        if (abstractC64892TYs != null) {
            abstractC64892TYs.A01();
            if (abstractC64892TYs.A00 != this.A03) {
                throw AbstractC58318PtA.A0z();
            }
        } else if (this.A00.isEmpty() && (collection = (Collection) this.A04.A01.get(this.A02)) != null) {
            this.A00 = collection;
        }
    }

    public final void A02() {
        AbstractC64892TYs abstractC64892TYs = this.A01;
        if (abstractC64892TYs != null) {
            abstractC64892TYs.A02();
        } else {
            if (!this.A00.isEmpty()) {
                return;
            }
            this.A04.A01.remove(this.A02);
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        A01();
        return this.A00.equals(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        A01();
        boolean isEmpty = this.A00.isEmpty();
        boolean add = this.A00.add(obj);
        if (add) {
            this.A04.A00++;
            if (isEmpty) {
                A00();
                return true;
            }
            return add;
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.A00.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.A00.size();
        this.A04.A00 += size2 - size;
        if (size != 0) {
            return addAll;
        }
        A00();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size != 0) {
            this.A00.clear();
            this.A04.A00 -= size;
            A02();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        A01();
        return this.A00.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        A01();
        return this.A00.containsAll(collection);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        A01();
        return this.A00.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        A01();
        return new TT1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        A01();
        boolean remove = this.A00.remove(obj);
        if (remove) {
            AbstractC60698RNa abstractC60698RNa = this.A04;
            abstractC60698RNa.A00--;
            A02();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.A00.removeAll(collection);
        if (!removeAll) {
            return removeAll;
        }
        int size2 = this.A00.size();
        this.A04.A00 += size2 - size;
        A02();
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.A00.retainAll(collection);
        if (retainAll) {
            int size2 = this.A00.size();
            this.A04.A00 += size2 - size;
            A02();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        A01();
        return this.A00.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        A01();
        return this.A00.toString();
    }
}
