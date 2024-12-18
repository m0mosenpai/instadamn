package X;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes10.dex */
public final class RQM<K, V> extends AbstractC917849c<K, V>.Entries implements java.util.Set<Map.Entry<K, V>> {
    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        return AbstractC103614ld.A05(obj, this);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return AbstractC103614ld.A00(this);
    }
}
