package X;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0yX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C20030yX<K, V> extends C005001p<K, V> implements Map<K, V> {
    public C002500p A00;
    public C002600q A01;
    public C002800s A02;

    public C20030yX() {
        super(0);
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        C002500p c002500p = this.A00;
        if (c002500p == null) {
            AbstractSet<Map.Entry<K, V>> abstractSet = new AbstractSet<Map.Entry<K, V>>() { // from class: X.00p
                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public final Iterator iterator() {
                    return new C002700r(C20030yX.this);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final int size() {
                    return C20030yX.this.size();
                }
            };
            this.A00 = abstractSet;
            return abstractSet;
        }
        return c002500p;
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        C002600q c002600q = this.A01;
        if (c002600q == null) {
            java.util.Set<K> set = new java.util.Set<K>() { // from class: X.00q
                @Override // java.util.Set, java.util.Collection
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj instanceof java.util.Set) {
                        java.util.Set set2 = (java.util.Set) obj;
                        try {
                            if (size() == set2.size()) {
                                return containsAll(set2);
                            }
                            return false;
                        } catch (ClassCastException | NullPointerException unused) {
                        }
                    }
                    return false;
                }

                @Override // java.util.Set, java.util.Collection
                public final boolean add(Object obj) {
                    throw new UnsupportedOperationException();
                }

                @Override // java.util.Set, java.util.Collection
                public final boolean addAll(Collection collection) {
                    throw new UnsupportedOperationException();
                }

                @Override // java.util.Set, java.util.Collection
                public final void clear() {
                    C20030yX.this.clear();
                }

                @Override // java.util.Set, java.util.Collection
                public final boolean contains(Object obj) {
                    return C20030yX.this.containsKey(obj);
                }

                @Override // java.util.Set, java.util.Collection
                public final boolean containsAll(Collection collection) {
                    C20030yX c20030yX = C20030yX.this;
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        if (!c20030yX.containsKey(it.next())) {
                            return false;
                        }
                    }
                    return true;
                }

                @Override // java.util.Set, java.util.Collection
                public final int hashCode() {
                    int hashCode;
                    C20030yX c20030yX = C20030yX.this;
                    int i = 0;
                    for (int size = c20030yX.size() - 1; size >= 0; size--) {
                        Object A05 = c20030yX.A05(size);
                        if (A05 == null) {
                            hashCode = 0;
                        } else {
                            hashCode = A05.hashCode();
                        }
                        i += hashCode;
                    }
                    return i;
                }

                @Override // java.util.Set, java.util.Collection
                public final boolean isEmpty() {
                    return C20030yX.this.isEmpty();
                }

                @Override // java.util.Set, java.util.Collection, java.lang.Iterable
                public final Iterator iterator() {
                    final C20030yX c20030yX = C20030yX.this;
                    return new AbstractC12580l3() { // from class: X.0Se
                        {
                            super.A00 = C20030yX.this.size();
                        }

                        @Override // X.AbstractC12580l3
                        public final Object A00(int i) {
                            return C20030yX.this.A05(i);
                        }

                        @Override // X.AbstractC12580l3
                        public final void A01(int i) {
                            C20030yX.this.A04(i);
                        }
                    };
                }

                @Override // java.util.Set, java.util.Collection
                public final boolean remove(Object obj) {
                    C20030yX c20030yX = C20030yX.this;
                    int A03 = c20030yX.A03(obj);
                    if (A03 >= 0) {
                        c20030yX.A04(A03);
                        return true;
                    }
                    return false;
                }

                @Override // java.util.Set, java.util.Collection
                public final boolean removeAll(Collection collection) {
                    C20030yX c20030yX = C20030yX.this;
                    int size = c20030yX.size();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        c20030yX.remove(it.next());
                    }
                    if (size == c20030yX.size()) {
                        return false;
                    }
                    return true;
                }

                @Override // java.util.Set, java.util.Collection
                public final boolean retainAll(Collection collection) {
                    return C20030yX.this.A0A(collection);
                }

                @Override // java.util.Set, java.util.Collection
                public final int size() {
                    return C20030yX.this.size();
                }

                @Override // java.util.Set, java.util.Collection
                public final Object[] toArray(Object[] objArr) {
                    int size = size();
                    if (objArr.length < size) {
                        objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
                    }
                    for (int i = 0; i < size; i++) {
                        objArr[i] = C20030yX.this.A05(i);
                    }
                    if (objArr.length > size) {
                        objArr[size] = null;
                    }
                    return objArr;
                }

                @Override // java.util.Set, java.util.Collection
                public final Object[] toArray() {
                    C20030yX c20030yX = C20030yX.this;
                    int size = c20030yX.size();
                    Object[] objArr = new Object[size];
                    for (int i = 0; i < size; i++) {
                        objArr[i] = c20030yX.A05(i);
                    }
                    return objArr;
                }
            };
            this.A01 = set;
            return set;
        }
        return c002600q;
    }

    @Override // java.util.Map
    public final Collection values() {
        C002800s c002800s = this.A02;
        if (c002800s == null) {
            Collection<V> collection = new Collection<V>() { // from class: X.00s
                @Override // java.util.Collection
                public final boolean add(Object obj) {
                    throw new UnsupportedOperationException();
                }

                @Override // java.util.Collection
                public final boolean addAll(Collection collection2) {
                    throw new UnsupportedOperationException();
                }

                @Override // java.util.Collection
                public final void clear() {
                    C20030yX.this.clear();
                }

                @Override // java.util.Collection
                public final boolean contains(Object obj) {
                    if (C20030yX.this.A02(obj) < 0) {
                        return false;
                    }
                    return true;
                }

                @Override // java.util.Collection
                public final boolean isEmpty() {
                    return C20030yX.this.isEmpty();
                }

                @Override // java.util.Collection, java.lang.Iterable
                public final Iterator iterator() {
                    final C20030yX c20030yX = C20030yX.this;
                    return new AbstractC12580l3() { // from class: X.0Sd
                        {
                            super.A00 = C20030yX.this.size();
                        }

                        @Override // X.AbstractC12580l3
                        public final Object A00(int i) {
                            return C20030yX.this.A06(i);
                        }

                        @Override // X.AbstractC12580l3
                        public final void A01(int i) {
                            C20030yX.this.A04(i);
                        }
                    };
                }

                @Override // java.util.Collection
                public final boolean remove(Object obj) {
                    C20030yX c20030yX = C20030yX.this;
                    int A02 = c20030yX.A02(obj);
                    if (A02 >= 0) {
                        c20030yX.A04(A02);
                        return true;
                    }
                    return false;
                }

                @Override // java.util.Collection
                public final boolean removeAll(Collection collection2) {
                    C20030yX c20030yX = C20030yX.this;
                    int size = c20030yX.size();
                    int i = 0;
                    boolean z = false;
                    while (i < size) {
                        if (collection2.contains(c20030yX.A06(i))) {
                            c20030yX.A04(i);
                            i--;
                            size--;
                            z = true;
                        }
                        i++;
                    }
                    return z;
                }

                @Override // java.util.Collection
                public final boolean retainAll(Collection collection2) {
                    C20030yX c20030yX = C20030yX.this;
                    int size = c20030yX.size();
                    int i = 0;
                    boolean z = false;
                    while (i < size) {
                        if (!collection2.contains(c20030yX.A06(i))) {
                            c20030yX.A04(i);
                            i--;
                            size--;
                            z = true;
                        }
                        i++;
                    }
                    return z;
                }

                @Override // java.util.Collection
                public final int size() {
                    return C20030yX.this.size();
                }

                @Override // java.util.Collection
                public final boolean containsAll(Collection collection2) {
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        if (!contains(it.next())) {
                            return false;
                        }
                    }
                    return true;
                }

                @Override // java.util.Collection
                public final Object[] toArray(Object[] objArr) {
                    int size = size();
                    if (objArr.length < size) {
                        objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
                    }
                    for (int i = 0; i < size; i++) {
                        objArr[i] = C20030yX.this.A06(i);
                    }
                    if (objArr.length > size) {
                        objArr[size] = null;
                    }
                    return objArr;
                }

                @Override // java.util.Collection
                public final Object[] toArray() {
                    C20030yX c20030yX = C20030yX.this;
                    int size = c20030yX.size();
                    Object[] objArr = new Object[size];
                    for (int i = 0; i < size; i++) {
                        objArr[i] = c20030yX.A06(i);
                    }
                    return objArr;
                }
            };
            this.A02 = collection;
            return collection;
        }
        return c002800s;
    }

    public final boolean A0A(Collection collection) {
        int size = size();
        for (int i = size - 1; i >= 0; i--) {
            if (!collection.contains(A05(i))) {
                A04(i);
            }
        }
        if (size != size()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        A08(size() + map.size());
        for (Map.Entry<K, V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }
}
