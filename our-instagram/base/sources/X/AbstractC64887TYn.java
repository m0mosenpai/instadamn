package X;

import java.util.AbstractCollection;
import java.util.Map;

/* renamed from: X.TYn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC64887TYn<K, V> extends AbstractCollection<Map.Entry<K, V>> {
    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        ((RRz) this).A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return ((RRz) this).A00.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object o) {
        if (o instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) o;
            return ((RRz) this).A00.AJj(entry.getKey(), entry.getValue());
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object o) {
        if (o instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) o;
            return ((RRz) this).A00.remove(entry.getKey(), entry.getValue());
        }
        return false;
    }
}
