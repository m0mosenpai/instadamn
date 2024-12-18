package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class RRu<K, V> extends C64890TYq<K, V> {
    public final InterfaceC28041Xi A00;
    public final Map A01;

    @Override // X.C64890TYq, java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object o) {
        Iterator A15 = AbstractC166997dE.A15(this.A01);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            if (this.A00.apply(A1K) && AbstractC50102Ry.A00(A1K.getValue(), o)) {
                A15.remove();
                return true;
            }
        }
        return false;
    }

    @Override // X.C64890TYq, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator A15 = AbstractC166997dE.A15(this.A01);
        boolean z = false;
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            if (this.A00.apply(A1K) && collection.contains(A1K.getValue())) {
                A15.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // X.C64890TYq, java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Iterator A15 = AbstractC166997dE.A15(this.A01);
        boolean z = false;
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            if (this.A00.apply(A1K) && !collection.contains(A1K.getValue())) {
                A15.remove();
                z = true;
            }
        }
        return z;
    }

    public RRu(InterfaceC28041Xi filteredMap, Map unfiltered, Map predicate) {
        super(unfiltered);
        this.A01 = predicate;
        this.A00 = filteredMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] array) {
        return AbstractC63071Sbt.A00(this).toArray(array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return AbstractC63071Sbt.A00(this).toArray();
    }
}
