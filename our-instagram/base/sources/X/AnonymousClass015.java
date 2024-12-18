package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.015, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass015 extends AnonymousClass041 {
    public final C06860Yd A00;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        C14360o3.A0B(collection, 0);
        C06860Yd c06860Yd = this.A00;
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!c06860Yd.A06((Map.Entry) obj)) {
                        return false;
                    }
                } catch (ClassCastException unused) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
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
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C14360o3.A0B(entry, 0);
        return this.A00.A06(entry);
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
    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C14360o3.A0B(entry, 0);
        C06860Yd c06860Yd = this.A00;
        c06860Yd.A05();
        int A00 = C06860Yd.A00(entry.getKey(), c06860Yd);
        if (A00 < 0) {
            return false;
        }
        Object[] objArr = c06860Yd.A0C;
        C14360o3.A0A(objArr);
        if (!C14360o3.A0K(objArr[A00], entry.getValue())) {
            return false;
        }
        C06860Yd.A03(c06860Yd, A00);
        return true;
    }

    public AnonymousClass015(C06860Yd c06860Yd) {
        this.A00 = c06860Yd;
    }

    public AnonymousClass015() {
    }
}
