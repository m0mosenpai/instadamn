package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes10.dex */
public final class RRn<K, V> extends RSG<K, Collection<V>> {
    public final /* synthetic */ RRx A00;

    public RRn(final RRx this$0) {
        this.A00 = this$0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new RSM(new C64285T7u(this, 2), this.A00.A00.keySet().iterator(), 1);
    }

    @Override // X.RSG, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object o) {
        if (!contains(o)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) o;
        entry.getClass();
        RRx rRx = this.A00;
        rRx.A00.keySet().remove(entry.getKey());
        return true;
    }
}
