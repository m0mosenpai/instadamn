package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* renamed from: X.5Cv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C114095Cv implements Collection<C122575gs>, InterfaceC15590qF {
    public static final C114095Cv A02 = new C114095Cv(C16930sl.A00);
    public final int A00;
    public final List A01;

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(C122575gs c122575gs) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends C122575gs> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C114095Cv) && C14360o3.A0K(this.A01, ((C114095Cv) obj).A01));
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate<? super C122575gs> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
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

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C122575gs)) {
            return false;
        }
        return this.A01.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.A01.containsAll(collection);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.A01.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.A01.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.A01.iterator();
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return this.A00;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LocaleList(localeList=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public C114095Cv(List list) {
        this.A01 = list;
        this.A00 = list.size();
    }
}
