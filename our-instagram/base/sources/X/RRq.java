package X;

import com.google.common.collect.Maps$EntryFunction;
import java.util.Collection;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes10.dex */
public final class RRq<K, V> extends RSF<K, Collection<V>> {
    public final /* synthetic */ RRv A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RRq(final RRv this$1) {
        super(this$1);
        this.A00 = this$1;
    }

    @Override // X.RSF, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object o) {
        return AbstractC167007dF.A1W(this.A00.remove(o));
    }

    @Override // X.TZR, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection c) {
        return this.A00.A00.A08(new T84(Maps$EntryFunction.A00, new T81(c)));
    }

    @Override // X.TZR, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection c) {
        return this.A00.A00.A08(new T84(Maps$EntryFunction.A00, new T83(new T81(c))));
    }
}
