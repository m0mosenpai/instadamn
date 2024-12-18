package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.TaA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64934TaA<K, V> extends AbstractC024709v<V> implements Collection<V>, C0YV {
    public final C5VS A00;

    @Override // X.AbstractC024709v
    public final int A00() {
        return this.A00.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.A00.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C5VS c5vs = this.A00;
        AbstractC128315r0[] abstractC128315r0Arr = new AbstractC128315r0[8];
        int i = 0;
        do {
            abstractC128315r0Arr[i] = new AbstractC128315r0();
            i++;
        } while (i < 8);
        return new C58729Q5u(c5vs, abstractC128315r0Arr);
    }

    public C64934TaA(C5VS c5vs) {
        this.A00 = c5vs;
    }

    @Override // X.AbstractC024709v, java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw AbstractC43592JPx.A11();
    }
}
