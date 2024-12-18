package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.TaB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64935TaB<K, V> extends AbstractC024709v<V> implements Collection<V>, C0YV {
    public final Pw1 A00;

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
        Pw1 pw1 = this.A00;
        C14360o3.A0B(pw1, 1);
        TT7[] tt7Arr = new TT7[8];
        int i = 0;
        do {
            tt7Arr[i] = new TT7();
            i++;
        } while (i < 8);
        return new C65131Te6(pw1, tt7Arr);
    }

    public C64935TaB(Pw1 pw1) {
        this.A00 = pw1;
    }

    @Override // X.AbstractC024709v, java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw AbstractC43592JPx.A11();
    }
}
