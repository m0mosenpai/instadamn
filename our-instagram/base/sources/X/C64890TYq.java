package X;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.TYq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C64890TYq<K, V> extends AbstractCollection<V> {
    public final Map A00;

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object o) {
        return this.A00.containsValue(o);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new RSL(AbstractC166997dE.A15(this.A00), 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.A00.size();
    }

    public C64890TYq(Map map) {
        this.A00 = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object o) {
        try {
            return super.remove(o);
        } catch (UnsupportedOperationException unused) {
            Map map = this.A00;
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                if (AbstractC50102Ry.A00(o, A1K.getValue())) {
                    map.remove(A1K.getKey());
                    return true;
                }
            }
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection c) {
        try {
            c.getClass();
            return super.removeAll(c);
        } catch (UnsupportedOperationException unused) {
            HashSet A1H = AbstractC166987dD.A1H();
            Map map = this.A00;
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                AbstractC58323PtF.A1U(A1H, c, A15);
            }
            return map.keySet().removeAll(A1H);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection c) {
        try {
            c.getClass();
            return super.retainAll(c);
        } catch (UnsupportedOperationException unused) {
            HashSet A1H = AbstractC166987dD.A1H();
            Map map = this.A00;
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                AbstractC58323PtF.A1U(A1H, c, A15);
            }
            return map.keySet().retainAll(A1H);
        }
    }
}
