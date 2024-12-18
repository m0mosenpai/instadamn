package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes10.dex */
public final class RRr<K, V> extends RSF<K, V> {
    public final /* synthetic */ RRj A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RRr(final RRj this$0) {
        super(this$0);
        this.A00 = this$0;
    }

    @Override // X.RSF, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object o) {
        RRj rRj = this.A00;
        if (rRj.containsKey(o)) {
            ((RRw) rRj).A01.remove(o);
            return true;
        }
        return false;
    }

    @Override // X.TZR, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        RRj rRj = this.A00;
        Map map = ((RRw) rRj).A01;
        InterfaceC28041Xi interfaceC28041Xi = ((RRw) rRj).A00;
        Iterator A15 = AbstractC166997dE.A15(map);
        boolean z = false;
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            if (interfaceC28041Xi.apply(A1K) && collection.contains(A1K.getKey())) {
                A15.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // X.TZR, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        RRj rRj = this.A00;
        Map map = ((RRw) rRj).A01;
        InterfaceC28041Xi interfaceC28041Xi = ((RRw) rRj).A00;
        Iterator A15 = AbstractC166997dE.A15(map);
        boolean z = false;
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            if (interfaceC28041Xi.apply(A1K) && !collection.contains(A1K.getKey())) {
                A15.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        return AbstractC63071Sbt.A00(this).toArray(array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC63071Sbt.A00(this).toArray();
    }
}
