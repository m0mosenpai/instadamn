package X;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class RSG<K, V> extends TZR<Map.Entry<K, V>> {
    public final Map A00() {
        if (this instanceof RRn) {
            return ((RRn) this).A00;
        }
        if (this instanceof C60766RRp) {
            return ((C60766RRp) this).A00;
        }
        return ((RRo) this).A00;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object o) {
        Object obj;
        if (!(o instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) o;
        Object key = entry.getKey();
        Map A00 = A00();
        try {
            obj = A00.get(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj = null;
        }
        if (!AbstractC50102Ry.A00(obj, entry.getValue())) {
            return false;
        }
        if (obj == null && !A00.containsKey(key)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        A00().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return A00().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object o) {
        if (contains(o) && (o instanceof Map.Entry)) {
            return A00().keySet().remove(((Map.Entry) o).getKey());
        }
        return false;
    }

    @Override // X.TZR, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection c) {
        try {
            c.getClass();
            return super.removeAll(c);
        } catch (UnsupportedOperationException unused) {
            Iterator it = c.iterator();
            boolean z = false;
            while (it.hasNext()) {
                z |= remove(it.next());
            }
            return z;
        }
    }

    @Override // X.TZR, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection c) {
        try {
            c.getClass();
            return super.retainAll(c);
        } catch (UnsupportedOperationException unused) {
            HashSet A02 = AbstractC103614ld.A02(c.size());
            for (Object obj : c) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    A02.add(((Map.Entry) obj).getKey());
                }
            }
            return A00().keySet().retainAll(A02);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return A00().size();
    }
}
