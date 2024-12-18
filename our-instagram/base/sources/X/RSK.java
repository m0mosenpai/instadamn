package X;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [E] */
/* loaded from: classes10.dex */
public final class RSK<E> extends TZZ<E> {
    public final /* synthetic */ java.util.Set A00;
    public final /* synthetic */ java.util.Set A01;

    public RSK(final java.util.Set val$set1, final java.util.Set val$set2) {
        this.A00 = val$set1;
        this.A01 = val$set2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object object) {
        if (this.A00.contains(object) && this.A01.contains(object)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (this.A00.containsAll(collection) && this.A01.containsAll(collection)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.A01, this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new RQ4(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator<E> it = this.A00.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.A01.contains(it.next())) {
                i++;
            }
        }
        return i;
    }
}
