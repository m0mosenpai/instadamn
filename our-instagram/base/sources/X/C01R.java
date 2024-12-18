package X;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.01R, reason: invalid class name */
/* loaded from: classes.dex */
public final class C01R<T> extends C04D<T> {
    public final List A00;

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // X.C04D
    public final int A0M() {
        return this.A00.size();
    }

    @Override // X.C04D
    public final Object A0N(int i) {
        return this.A00.remove(AbstractC003400z.A11(this, i));
    }

    @Override // X.C04D, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.A00.add(AbstractC003400z.A12(this, i), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.A00.get(AbstractC003400z.A11(this, i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C09N(this, i);
    }

    @Override // X.C04D, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return this.A00.set(AbstractC003400z.A11(this, i), obj);
    }

    public C01R(List list) {
        this.A00 = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }
}
