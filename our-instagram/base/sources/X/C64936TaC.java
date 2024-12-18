package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.TaC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64936TaC<K, V> extends AbstractC024709v<V> implements Collection<V>, C0YV {
    public final C58476Pw2 A00;

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
        return new TTJ(this.A00);
    }

    public C64936TaC(C58476Pw2 c58476Pw2) {
        this.A00 = c58476Pw2;
    }

    @Override // X.AbstractC024709v, java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw AbstractC43592JPx.A11();
    }
}
