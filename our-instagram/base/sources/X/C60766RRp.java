package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: X.RRp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60766RRp<K, V> extends RSG<K, Collection<V>> {
    public final /* synthetic */ RRv A00;

    public C60766RRp(final RRv this$1) {
        this.A00 = this$1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new RQ4(this);
    }

    @Override // X.RSG, X.TZR, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection c) {
        return this.A00.A00.A08(new T81(c));
    }

    @Override // X.RSG, X.TZR, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection c) {
        return this.A00.A00.A08(new T83(new T81(c)));
    }

    @Override // X.RSG, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator<Map.Entry<K, V>> it = iterator();
        long j = 0;
        while (it.hasNext()) {
            it.next();
            j++;
        }
        return AbstractC38301qK.A02(j);
    }
}
