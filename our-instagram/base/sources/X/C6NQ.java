package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.function.Predicate;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.6NQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6NQ implements Collection<Object>, InterfaceC15590qF {
    public final java.util.Set A00 = new LinkedHashSet();

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.A00.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.A00.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate<? super Object> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC13370mN.A00(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC13370mN.A01(this, objArr);
    }

    public /* synthetic */ C6NQ(java.util.Set set, DefaultConstructorMarker defaultConstructorMarker, int i) {
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return this.A00.add(obj);
    }

    @Override // java.util.Collection
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.A00.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return this.A00.remove(obj);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.A00.remove(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.A00.retainAll(collection);
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return this.A00.size();
    }

    public C6NQ() {
    }
}
