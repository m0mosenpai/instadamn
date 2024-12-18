package X;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [K] */
/* loaded from: classes10.dex */
public final class TZY<K> extends AbstractSet<K> {
    public final /* synthetic */ C5MT A00;

    public TZY(C5MT c5mt) {
        this.A00 = c5mt;
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
        return new C60845RVi(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C5MT c5mt = this.A00;
        C5MV c5mv = null;
        if (obj != null) {
            try {
                c5mv = c5mt.A04(obj, false);
            } catch (ClassCastException unused) {
            }
            if (c5mv != null) {
                c5mt.A05(c5mv, true);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00.A01;
    }
}
