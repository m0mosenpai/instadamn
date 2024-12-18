package X;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public class RQN extends AbstractC917849c implements XLJ {
    public final InterfaceC28041Xi A00;
    public final C46g A01;

    public static Collection A00(InterfaceC28041Xi collection, Collection predicate) {
        if (predicate instanceof java.util.Set) {
            return AbstractC103614ld.A04(collection, (java.util.Set) predicate);
        }
        if (predicate instanceof C64891TYr) {
            C64891TYr c64891TYr = (C64891TYr) predicate;
            return new C64891TYr(S30.A00(c64891TYr.A00, collection), c64891TYr.A01);
        }
        predicate.getClass();
        collection.getClass();
        return new C64891TYr(collection, predicate);
    }

    @Override // X.AbstractC917849c
    public final Collection A04() {
        if (this instanceof RQg) {
            return AbstractC103614ld.A04(this.A00, ((InterfaceC917949d) this.A01).ASw());
        }
        return A00(this.A00, this.A01.ASw());
    }

    @Override // X.AbstractC917849c
    public final Map A06() {
        return new RRv(this);
    }

    public final boolean A08(InterfaceC28041Xi predicate) {
        Iterator A15 = AbstractC166997dE.A15(this.A01.ACe());
        boolean z = false;
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            Object key = A1K.getKey();
            Collection A00 = A00(new C64287T7w(this, key), AbstractC58318PtA.A0y(A1K));
            if (!A00.isEmpty() && AbstractC58322PtE.A1V(predicate, key, A00)) {
                if (A00.size() == AbstractC58318PtA.A0y(A1K).size()) {
                    A15.remove();
                } else {
                    A00.clear();
                }
                z = true;
            }
        }
        return z;
    }

    @Override // X.C46g
    public Collection AXV(Object key) {
        return A00(new C64287T7w(this, key), this.A01.AXV(key));
    }

    @Override // X.XLJ
    public final C46g F98() {
        return this.A01;
    }

    public RQN(InterfaceC28041Xi unfiltered, C46g predicate) {
        predicate.getClass();
        this.A01 = predicate;
        this.A00 = unfiltered;
    }

    @Override // X.AbstractC917849c
    public final Iterator A05() {
        throw AbstractC58318PtA.A0W("should never be called");
    }

    @Override // X.AbstractC917849c
    public final java.util.Set A07() {
        return ACe().keySet();
    }

    @Override // X.C46g
    public Collection EEs(Object key) {
        Object emptyList;
        Object remove = ACe().remove(key);
        if (this.A01 instanceof InterfaceC917949d) {
            emptyList = Collections.emptySet();
        } else {
            emptyList = Collections.emptyList();
        }
        if (remove == null) {
            if (emptyList != null) {
                remove = emptyList;
            } else {
                throw AbstractC166987dD.A15("Both parameters are null");
            }
        }
        return (Collection) remove;
    }

    @Override // X.C46g
    public final void clear() {
        ASw().clear();
    }

    @Override // X.C46g
    public final boolean containsKey(Object key) {
        return AbstractC167007dF.A1W(ACe().get(key));
    }

    @Override // X.C46g
    public final int size() {
        return ASw().size();
    }
}
