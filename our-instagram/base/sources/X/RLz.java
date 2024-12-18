package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes10.dex */
public abstract class RLz extends AbstractC64897TYx implements List, RandomAccess {
    public static final RMC A00 = new RMB(RLy.A02, 0);

    public static RLz A00(Object[] objArr) {
        if (objArr.length != 0) {
            Object[] objArr2 = (Object[]) objArr.clone();
            int length = objArr2.length;
            for (int i = 0; i < length; i++) {
                if (objArr2[i] == null) {
                    throw AbstractC58322PtE.A0k(i);
                }
            }
            if (length != 0) {
                return new RLy(objArr2, length);
            }
        }
        return RLy.A02;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        Object obj2 = get(i);
                        Object obj3 = list.get(i);
                        if (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) {
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
                        if (!hasNext2 || ((next = it.next()) != (next2 = it2.next()) && (next == null || !next.equals(next2)))) {
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public final RLz A08() {
        if (this instanceof RLx) {
            return ((RLx) this).A00;
        }
        if (size() <= 1) {
            return this;
        }
        return new RLx(this);
    }

    @Override // java.util.List
    /* renamed from: A09, reason: merged with bridge method [inline-methods] */
    public final RLz subList(int i, int i2) {
        if (this instanceof RLw) {
            RLw rLw = (RLw) this;
            AbstractC63065Sbm.A02(i, i2, rLw.A01);
            int i3 = rLw.A00;
            return rLw.A02.subList(i + i3, i2 + i3);
        }
        if (this instanceof RLx) {
            RLz rLz = ((RLx) this).A00;
            AbstractC63065Sbm.A02(i, i2, rLz.size());
            return rLz.subList(rLz.size() - i2, rLz.size() - i).A08();
        }
        AbstractC63065Sbm.A02(i, i2, size());
        int i4 = i2 - i;
        if (i4 == size()) {
            return this;
        }
        if (i4 == 0) {
            return RLy.A02;
        }
        return new RLw(this, i, i4);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (this instanceof RLx) {
            RLz rLz = ((RLx) this).A00;
            int lastIndexOf = rLz.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return AbstractC58318PtA.A08(rLz) - lastIndexOf;
            }
            return -1;
        }
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

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (this instanceof RLx) {
            RLz rLz = ((RLx) this).A00;
            int indexOf = rLz.indexOf(obj);
            if (indexOf >= 0) {
                return AbstractC58318PtA.A08(rLz) - indexOf;
            }
            return -1;
        }
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
    /* renamed from: A0A, reason: merged with bridge method [inline-methods] */
    public final RMC listIterator(int i) {
        int size = size();
        if (i >= 0 && i <= size) {
            if (isEmpty()) {
                return A00;
            }
            return new RMB(this, i);
        }
        throw AbstractC58318PtA.A0a(AbstractC63065Sbm.A00("index", i, size));
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

    @Override // X.AbstractC64897TYx, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
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
