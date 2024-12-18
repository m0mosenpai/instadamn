package X;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes11.dex */
public final class X21<K, V> extends AbstractSet<Map.Entry<K, V>> {
    public final /* synthetic */ C71665WyH A00;

    public X21(C71665WyH c71665WyH) {
        this.A00 = c71665WyH;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            C71665WyH c71665WyH = this.A00;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int A00 = C71665WyH.A00(c71665WyH, key);
            if (A00 >= 0) {
                Object obj2 = c71665WyH.A03[(A00 << 1) + 1];
                if (value == null) {
                    if (obj2 == null) {
                        return true;
                    }
                    return false;
                }
                if (value.equals(obj2)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new UM6(this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            C71665WyH c71665WyH = this.A00;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int A00 = C71665WyH.A00(c71665WyH, key);
            if (A00 >= 0) {
                Object obj2 = c71665WyH.A03[(A00 << 1) + 1];
                if (value == null) {
                    if (obj2 != null) {
                        return false;
                    }
                } else if (!value.equals(obj2)) {
                    return false;
                }
                C71665WyH.A03(c71665WyH, A00);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00.size();
    }
}
