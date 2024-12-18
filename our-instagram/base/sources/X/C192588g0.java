package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.8g0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192588g0 implements Collection<C192568fy>, InterfaceC15590qF {
    public final byte[] A00;

    public final /* synthetic */ byte[] A00() {
        return this.A00;
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(C192568fy c192568fy) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends C192568fy> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        C14360o3.A0B(collection, 0);
        byte[] bArr = this.A00;
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if (!(obj instanceof C192568fy)) {
                    return false;
                }
                byte b = ((C192568fy) obj).A00;
                int length = bArr.length;
                for (int i = 0; i < length; i++) {
                    if (b == bArr[i]) {
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
        if (obj instanceof C192568fy) {
            byte b = ((C192568fy) obj).A00;
            byte[] bArr = this.A00;
            int length = bArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (b == bArr[i]) {
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
        byte[] bArr = this.A00;
        if (!(obj instanceof C192588g0) || !C14360o3.A0K(bArr, ((C192588g0) obj).A00)) {
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
        return new B0X(this.A00);
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ int size() {
        return this.A00.length;
    }

    public final String toString() {
        return AnonymousClass001.A0S("UByteArray(storage=", Arrays.toString(this.A00), ')');
    }
}
