package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes10.dex */
public final class RRv<K, V> extends TZF<K, Collection<V>> {
    public final /* synthetic */ RQN A00;

    public RRv(final RQN this$0) {
        this.A00 = this$0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Collection remove(Object key) {
        LinkedHashSet A0l;
        RQN rqn = this.A00;
        C46g c46g = rqn.A01;
        Collection collection = (Collection) c46g.ACe().get(key);
        if (collection != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (AbstractC58322PtE.A1V(rqn.A00, key, next)) {
                    it.remove();
                    A1E.add(next);
                }
            }
            if (!A1E.isEmpty()) {
                if (c46g instanceof InterfaceC917949d) {
                    if (A1E instanceof Collection) {
                        A0l = new LinkedHashSet(A1E);
                    } else {
                        A0l = AbstractC31171DnF.A0l();
                        AbstractC63071Sbt.A02(A0l, A1E.iterator());
                    }
                    return Collections.unmodifiableSet(A0l);
                }
                return Collections.unmodifiableList(A1E);
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object key) {
        RQN rqn = this.A00;
        Collection collection = (Collection) rqn.A01.ACe().get(key);
        if (collection != null && !RQN.A00(new C64287T7w(rqn, key), collection).isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object key) {
        RQN rqn = this.A00;
        Collection collection = (Collection) rqn.A01.ACe().get(key);
        if (collection != null) {
            Collection A00 = RQN.A00(new C64287T7w(rqn, key), collection);
            if (!A00.isEmpty()) {
                return A00;
            }
        }
        return null;
    }
}
