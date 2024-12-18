package X;

import java.util.Map;

/* loaded from: classes10.dex */
public final class RRk<K, V> extends RRw<K, V> {
    public final InterfaceC28041Xi A00;

    @Override // X.RRw, java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object key) {
        if (((RRw) this).A01.containsKey(key) && this.A00.apply(key)) {
            return true;
        }
        return false;
    }

    public RRk(InterfaceC28041Xi unfiltered, InterfaceC28041Xi keyPredicate, Map entryPredicate) {
        super(keyPredicate, entryPredicate);
        this.A00 = unfiltered;
    }
}
