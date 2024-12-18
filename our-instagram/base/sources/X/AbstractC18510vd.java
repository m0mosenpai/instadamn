package X;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [E] */
/* renamed from: X.0vd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC18510vd<E> implements java.util.Set<E>, InterfaceC15590qF {
    public final /* synthetic */ AbstractC004801n A00;

    @Override // java.util.Set, java.util.Collection
    public abstract boolean add(Object obj);

    @Override // java.util.Set, java.util.Collection
    public abstract boolean addAll(Collection collection);

    @Override // java.util.Set, java.util.Collection
    public abstract void clear();

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        C14360o3.A0B(collection, 0);
        AbstractC004801n abstractC004801n = this.A00;
        Iterator<E> it = collection.iterator();
        while (it.hasNext()) {
            if (!abstractC004801n.A04(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public abstract Iterator iterator();

    @Override // java.util.Set, java.util.Collection
    public abstract boolean remove(Object obj);

    @Override // java.util.Set, java.util.Collection
    public abstract boolean removeAll(Collection collection);

    @Override // java.util.Set, java.util.Collection
    public abstract boolean retainAll(Collection collection);

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC13370mN.A00(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C14360o3.A0B(objArr, 0);
        return AbstractC13370mN.A01(this, objArr);
    }

    public AbstractC18510vd(AbstractC004801n abstractC004801n) {
        this.A00 = abstractC004801n;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.A00.A04(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        if (this.A00.A01 != 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return this.A00.A01;
    }
}
