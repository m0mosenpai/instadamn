package X;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes10.dex */
public final class TZX<K, V> extends AbstractSet<Map.Entry<K, V>> {
    public final /* synthetic */ C5MT A00;

    public TZX(C5MT c5mt) {
        this.A00 = c5mt;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            C5MT c5mt = this.A00;
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            C5MV c5mv = null;
            if (key != null) {
                try {
                    c5mv = c5mt.A04(key, false);
                } catch (ClassCastException unused) {
                }
                if (c5mv != null && C2I7.A00(c5mv.A06, entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C60844RVh(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        C5MT c5mt = this.A00;
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        C5MV c5mv = null;
        if (key == null) {
            return false;
        }
        try {
            c5mv = c5mt.A04(key, false);
        } catch (ClassCastException unused) {
        }
        if (c5mv == null || !C2I7.A00(c5mv.A06, entry.getValue())) {
            return false;
        }
        c5mt.A05(c5mv, true);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00.A01;
    }
}
