package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.6MM, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6MM<E> extends AbstractC06990Yq<E> implements C6MN<E> {
    @Override // X.AbstractC17040sw, java.util.Collection
    public final boolean containsAll(Collection collection) {
        if (collection == null || !collection.isEmpty()) {
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // X.AbstractC06990Yq, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // X.AbstractC06990Yq, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return new C64932Ta8(this, i, i2);
    }

    @Override // X.AbstractC17040sw, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC06990Yq, X.AbstractC17040sw, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }
}
