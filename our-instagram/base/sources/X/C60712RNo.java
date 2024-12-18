package X;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.RNo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60712RNo extends TZQ {
    public final /* synthetic */ TZG A00;

    public C60712RNo(TZG tzg) {
        this.A00 = tzg;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        java.util.Set entrySet = this.A00.A02.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C64746TSf(this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        AbstractC60698RNa abstractC60698RNa = this.A00.A03;
        Object key = entry.getKey();
        Map map = abstractC60698RNa.A01;
        map.getClass();
        try {
            obj2 = map.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            abstractC60698RNa.A00 -= size;
            return true;
        }
        return true;
    }

    @Override // X.TZQ, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        try {
            return AbstractC62213S2i.A00(collection, this);
        } catch (UnsupportedOperationException unused) {
            Iterator it = collection.iterator();
            boolean z = false;
            while (it.hasNext()) {
                z |= remove(it.next());
            }
            return z;
        }
    }

    @Override // X.TZQ, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i;
        collection.getClass();
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                if (size >= 0) {
                    i = size + 1;
                } else {
                    StringBuilder A0q = AbstractC58318PtA.A0q("expectedSize".length() + 40);
                    A0q.append("expectedSize");
                    throw AbstractC166987dD.A12(AbstractC58320PtC.A12(" cannot be negative but was: ", A0q, size));
                }
            } else if (size < 1073741824) {
                i = (int) ((size / 0.75f) + 1.0f);
            } else {
                i = Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(i);
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            AbstractC60698RNa abstractC60698RNa = this.A00.A03;
            java.util.Set set = ((T6D) abstractC60698RNa).A01;
            if (set == null) {
                set = new C60711RNn(abstractC60698RNa, abstractC60698RNa.A01);
                ((T6D) abstractC60698RNa).A01 = set;
            }
            return set.retainAll(hashSet);
        }
    }

    public C60712RNo() {
    }
}
