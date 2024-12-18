package X;

import com.google.common.collect.HashBiMap;
import java.util.AbstractSet;
import java.util.Iterator;

/* loaded from: classes10.dex */
public abstract class TZS<K, V, T> extends AbstractSet<T> {
    public final HashBiMap A00;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C64757TSr(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00.A02;
    }

    public TZS(HashBiMap biMap) {
        this.A00 = biMap;
    }
}
