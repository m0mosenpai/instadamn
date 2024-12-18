package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.03Q, reason: invalid class name */
/* loaded from: classes.dex */
public final class C03Q<V> extends AbstractC024709v<V> implements Collection<V>, C0YV {
    public final C06860Yd A00;

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        C14360o3.A0B(collection, 0);
        this.A00.A05();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C14360o3.A0B(collection, 0);
        this.A00.A05();
        return super.retainAll(collection);
    }

    @Override // X.AbstractC024709v
    public final int A00() {
        return this.A00.size();
    }

    @Override // X.AbstractC024709v, java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.A00.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0jN, java.util.Iterator] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new AbstractC11640jN(this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        C06860Yd c06860Yd = this.A00;
        c06860Yd.A05();
        int i = c06860Yd.A01;
        while (true) {
            i--;
            if (i >= 0) {
                if (c06860Yd.A0A[i] >= 0) {
                    Object[] objArr = c06860Yd.A0C;
                    C14360o3.A0A(objArr);
                    if (C14360o3.A0K(objArr[i], obj)) {
                        C06860Yd.A03(c06860Yd, i);
                        return true;
                    }
                }
            } else {
                return false;
            }
        }
    }

    public C03Q(C06860Yd c06860Yd) {
        this.A00 = c06860Yd;
    }
}
