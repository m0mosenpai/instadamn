package X;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [E] */
/* loaded from: classes10.dex */
public final class RQx<E> extends AbstractC60762RQy<E> {
    public final /* synthetic */ java.util.Set A00;

    public RQx(java.util.Set set) {
        this.A00 = set;
    }

    @Override // X.AbstractC451425u
    public final /* bridge */ /* synthetic */ Object A00() {
        return this.A00;
    }

    @Override // X.AbstractC451325t
    public final /* bridge */ /* synthetic */ Collection A01() {
        return this.A00;
    }

    @Override // X.AbstractC451325t, java.util.Collection
    public final boolean contains(Object object) {
        if (object != null) {
            java.util.Set set = this.A00;
            set.getClass();
            try {
                if (set.contains(object)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // X.AbstractC451325t, java.util.Collection
    public final boolean remove(Object object) {
        if (object != null) {
            java.util.Set set = this.A00;
            set.getClass();
            try {
                if (set.remove(object)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // X.AbstractC451325t, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator<E> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // X.AbstractC451325t, java.util.Collection
    public final boolean removeAll(Collection c) {
        c.getClass();
        return AbstractC103614ld.A06(c, this);
    }
}
