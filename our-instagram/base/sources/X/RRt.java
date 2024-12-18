package X;

import com.google.common.collect.Maps$EntryFunction;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes10.dex */
public final class RRt<K, V> extends C64890TYq<K, Collection<V>> {
    public final /* synthetic */ RRv A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RRt(final RRv this$1) {
        super(this$1);
        this.A00 = this$1;
    }

    @Override // X.C64890TYq, java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object o) {
        if (o instanceof Collection) {
            Collection collection = (Collection) o;
            RQN rqn = this.A00.A00;
            Iterator A15 = AbstractC166997dE.A15(rqn.A01.ACe());
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                Object key = A1K.getKey();
                Collection A00 = RQN.A00(new C64287T7w(rqn, key), AbstractC58318PtA.A0y(A1K));
                if (!A00.isEmpty() && collection.equals(A00)) {
                    if (A00.size() == AbstractC58318PtA.A0y(A1K).size()) {
                        A15.remove();
                        return true;
                    }
                    A00.clear();
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // X.C64890TYq, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection c) {
        return this.A00.A00.A08(new T84(Maps$EntryFunction.A01, new T81(c)));
    }

    @Override // X.C64890TYq, java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection c) {
        return this.A00.A00.A08(new T84(Maps$EntryFunction.A01, new T83(new T81(c))));
    }
}
