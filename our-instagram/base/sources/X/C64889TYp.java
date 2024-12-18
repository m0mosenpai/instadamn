package X;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.TYp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64889TYp extends AbstractCollection {
    public final Map A00;

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.A00.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new AbstractC64760TSu(AbstractC166997dE.A15(this.A00));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.A00.size();
    }

    public C64889TYp(Map map) {
        this.A00 = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException unused) {
            Map map = this.A00;
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                if (AbstractC62214S2j.A00(obj, A1K.getValue())) {
                    map.remove(A1K.getKey());
                    return true;
                }
            }
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        try {
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet A1H = AbstractC166987dD.A1H();
            Map map = this.A00;
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                AbstractC58323PtF.A1U(A1H, collection, A15);
            }
            return map.keySet().removeAll(A1H);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet A1H = AbstractC166987dD.A1H();
            Map map = this.A00;
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                AbstractC58323PtF.A1U(A1H, collection, A15);
            }
            return map.keySet().retainAll(A1H);
        }
    }
}
