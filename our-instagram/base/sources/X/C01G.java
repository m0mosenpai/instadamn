package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.01G, reason: invalid class name */
/* loaded from: classes.dex */
public final class C01G<E> extends AnonymousClass041<E> implements java.util.Set<E>, Serializable, InterfaceC019007k {
    public static final C01G A01 = new C01G(C06860Yd.A0D);
    public final C06860Yd A00;

    public C01G(C06860Yd c06860Yd) {
        C14360o3.A0B(c06860Yd, 1);
        this.A00 = c06860Yd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        C14360o3.A0B(collection, 0);
        this.A00.A05();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        C14360o3.A0B(collection, 0);
        this.A00.A05();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        C14360o3.A0B(collection, 0);
        this.A00.A05();
        return super.retainAll(collection);
    }

    @Override // X.AnonymousClass041
    public final int A00() {
        return this.A00.size();
    }

    @Override // X.AnonymousClass041, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        if (this.A00.A04(obj) < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.A00.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0jN, java.util.Iterator] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new AbstractC11640jN(this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C06860Yd c06860Yd = this.A00;
        c06860Yd.A05();
        int A00 = C06860Yd.A00(obj, c06860Yd);
        if (A00 < 0) {
            return false;
        }
        C06860Yd.A03(c06860Yd, A00);
        return true;
    }

    public C01G() {
        this(new C06860Yd());
    }
}
