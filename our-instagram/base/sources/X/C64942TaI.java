package X;

import java.util.Iterator;

/* renamed from: X.TaI, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64942TaI<K, V> extends AnonymousClass041<K> implements java.util.Set<K>, InterfaceC019007k {
    public final C58476Pw2 A00;

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
        return new TTI(this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C58476Pw2 c58476Pw2 = this.A00;
        if (c58476Pw2.containsKey(obj)) {
            c58476Pw2.remove(obj);
            return true;
        }
        return false;
    }

    public C64942TaI(C58476Pw2 c58476Pw2) {
        this.A00 = c58476Pw2;
    }

    @Override // X.AnonymousClass041, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw AbstractC43592JPx.A11();
    }
}
