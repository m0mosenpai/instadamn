package X;

import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [E] */
/* loaded from: classes10.dex */
public final class RSJ<E> extends TZZ<E> {
    public final /* synthetic */ java.util.Set A00;
    public final /* synthetic */ java.util.Set A01;

    public RSJ(final java.util.Set val$set1, final java.util.Set val$set2) {
        this.A00 = val$set1;
        this.A01 = val$set2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object element) {
        if (this.A00.contains(element) && !this.A01.contains(element)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.A01.containsAll(this.A00);
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
            if (!this.A01.contains(it.next())) {
                i++;
            }
        }
        return i;
    }
}
