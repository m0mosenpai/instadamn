package X;

import java.util.Iterator;

/* renamed from: X.TaH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64941TaH<K, V> extends AnonymousClass041<K> implements java.util.Set<K>, InterfaceC019007k {
    public final Pw1 A00;

    @Override // X.AnonymousClass041
    public final int A00() {
        return this.A00.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.A00.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Pw1 pw1 = this.A00;
        if (pw1.containsKey(obj)) {
            pw1.remove(obj);
            return true;
        }
        return false;
    }

    public C64941TaH(Pw1 pw1) {
        this.A00 = pw1;
    }

    @Override // X.AnonymousClass041, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw AbstractC43592JPx.A11();
    }
}
