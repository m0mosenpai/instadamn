package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.8fm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192448fm implements Collection<C192428fk>, InterfaceC15590qF {
    public final int[] A00;

    public final /* synthetic */ int[] A00() {
        return this.A00;
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(C192428fk c192428fk) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends C192428fk> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        C14360o3.A0B(collection, 0);
        int[] iArr = this.A00;
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if (!(obj instanceof C192428fk) || !AbstractC009903n.A0P(iArr, ((C192428fk) obj).A00)) {
                    return false;
                }
            }
        }
        return true;
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
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC13370mN.A00(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C14360o3.A0B(objArr, 0);
        return AbstractC13370mN.A01(this, objArr);
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C192428fk)) {
            return false;
        }
        return AbstractC009903n.A0P(this.A00, ((C192428fk) obj).A00);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        int[] iArr = this.A00;
        if (!(obj instanceof C192448fm) || !C14360o3.A0K(iArr, ((C192448fm) obj).A00)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        if (this.A00.length != 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new B0Y(this.A00);
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ int size() {
        return this.A00.length;
    }

    public final String toString() {
        return AnonymousClass001.A0S("UIntArray(storage=", Arrays.toString(this.A00), ')');
    }

    public /* synthetic */ C192448fm(int[] iArr) {
        this.A00 = iArr;
    }
}
