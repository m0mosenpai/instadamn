package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.8ft, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192518ft implements Collection<C192498fr>, InterfaceC15590qF {
    public final short[] A00;

    public final /* synthetic */ short[] A00() {
        return this.A00;
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(C192498fr c192498fr) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends C192498fr> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        C14360o3.A0B(collection, 0);
        short[] sArr = this.A00;
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if (!(obj instanceof C192498fr)) {
                    return false;
                }
                short s = ((C192498fr) obj).A00;
                int length = sArr.length;
                for (int i = 0; i < length; i++) {
                    if (s == sArr[i]) {
                        if (i < 0) {
                            return false;
                        }
                    }
                }
                return false;
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
        if (obj instanceof C192498fr) {
            short s = ((C192498fr) obj).A00;
            short[] sArr = this.A00;
            int length = sArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (s == sArr[i]) {
                    if (i < 0) {
                        break;
                    }
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        short[] sArr = this.A00;
        if (!(obj instanceof C192518ft) || !C14360o3.A0K(sArr, ((C192518ft) obj).A00)) {
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
        return new C24901B0a(this.A00);
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ int size() {
        return this.A00.length;
    }

    public final String toString() {
        return AnonymousClass001.A0S("UShortArray(storage=", Arrays.toString(this.A00), ')');
    }
}
