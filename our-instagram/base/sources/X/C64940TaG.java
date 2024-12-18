package X;

import java.util.Iterator;

/* renamed from: X.TaG, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64940TaG<K, V> extends AnonymousClass041<K> implements java.util.Set<K>, InterfaceC019007k {
    public final C5VS A00;

    @Override // X.AnonymousClass041
    public final int A00() {
        return this.A00.size();
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
        C5VS c5vs = this.A00;
        AbstractC128315r0[] abstractC128315r0Arr = new AbstractC128315r0[8];
        int i = 0;
        do {
            abstractC128315r0Arr[i] = new AbstractC128315r0();
            i++;
        } while (i < 8);
        return new C58729Q5u(c5vs, abstractC128315r0Arr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C5VS c5vs = this.A00;
        if (c5vs.containsKey(obj)) {
            c5vs.remove(obj);
            return true;
        }
        return false;
    }

    public C64940TaG(C5VS c5vs) {
        this.A00 = c5vs;
    }

    @Override // X.AnonymousClass041, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw AbstractC43592JPx.A11();
    }
}
