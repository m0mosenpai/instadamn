package X;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class TZU extends AbstractSet {
    public final /* synthetic */ TZK A00;

    public TZU(TZK tzk) {
        this.A00 = tzk;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.A00.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        TZK tzk = this.A00;
        Map A02 = tzk.A02();
        if (A02 != null) {
            return AbstractC43593JPy.A12(A02);
        }
        return new C60699RNb(tzk);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        TZK tzk = this.A00;
        Map A02 = tzk.A02();
        if (A02 != null) {
            return A02.keySet().remove(obj);
        }
        if (TZK.A01(tzk, obj) != TZK.A09) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00.size();
    }
}
