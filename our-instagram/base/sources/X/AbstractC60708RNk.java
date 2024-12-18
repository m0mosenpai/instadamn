package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.RNk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC60708RNk extends AbstractC64896TYw implements List, RandomAccess {
    public static final AbstractC60714RNu A00 = new C60713RNt(C60707RNj.A02, 0);

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (AbstractC62214S2j.A00(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    boolean hasNext2 = it2.hasNext();
                    if (hasNext) {
                        if (!hasNext2 || !AbstractC62214S2j.A00(it.next(), it2.next())) {
                            break;
                        }
                    } else if (!hasNext2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj != null) {
            int size = size();
            for (int i = 0; i < size; i++) {
                if (AbstractC58319PtB.A1U(obj, this, i)) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj != null) {
            int size = size();
            do {
                size--;
                if (size >= 0) {
                }
            } while (!AbstractC58319PtB.A1U(obj, this, size));
            return size;
        }
        return -1;
    }

    @Override // java.util.List
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final AbstractC60708RNk subList(int i, int i2) {
        if (this instanceof C60705RNh) {
            C60705RNh c60705RNh = (C60705RNh) this;
            AbstractC63069Sbq.A02(i, i2, c60705RNh.A01);
            AbstractC60708RNk abstractC60708RNk = c60705RNh.A02;
            int i3 = c60705RNh.A00;
            return abstractC60708RNk.subList(i + i3, i2 + i3);
        }
        AbstractC63069Sbq.A02(i, i2, size());
        int i4 = i2 - i;
        if (i4 == size()) {
            return this;
        }
        if (i4 == 0) {
            return C60707RNj.A02;
        }
        return new C60705RNh(this, i, i4);
    }

    @Override // java.util.List
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final AbstractC60714RNu listIterator(int i) {
        int size = size();
        if (i >= 0 && i <= size) {
            if (isEmpty()) {
                return A00;
            }
            return new C60713RNt(this, i);
        }
        throw AbstractC58318PtA.A0a(AbstractC63069Sbq.A00("index", i, size));
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw AbstractC43592JPx.A11();
    }

    @Override // X.AbstractC64896TYw, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return MSY.A1R(indexOf(obj));
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = AbstractC166987dD.A0I(get(i2), i * 31);
        }
        return i;
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }
}
