package com.google.common.collect;

import X.AbstractC103614ld;
import X.AbstractC166987dD;
import X.AbstractC24841Jd;
import X.AbstractC24851Je;
import X.C1LC;
import X.C62682SLv;
import X.RRE;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableSortedMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes.dex */
public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable {
    public static final Map.Entry[] EMPTY_ENTRY_ARRAY = new Map.Entry[0];
    public static final long serialVersionUID = 912559;
    public transient ImmutableSet entrySet;
    public transient ImmutableSet keySet;
    public transient ImmutableCollection values;

    /* loaded from: classes.dex */
    public class Builder {
        public Object[] alternatingKeysAndValues;
        public C62682SLv duplicateKey;
        public boolean entriesUsed;
        public int size;

        public ImmutableMap buildOrThrow() {
            C62682SLv c62682SLv = this.duplicateKey;
            if (c62682SLv == null) {
                int i = this.size;
                Object[] objArr = this.alternatingKeysAndValues;
                this.entriesUsed = true;
                RegularImmutableMap A00 = RegularImmutableMap.A00(this, objArr, i);
                c62682SLv = this.duplicateKey;
                if (c62682SLv == null) {
                    return A00;
                }
            }
            throw c62682SLv.A00();
        }

        public Builder put(Object key, Object value) {
            int i = (this.size + 1) * 2;
            Object[] objArr = this.alternatingKeysAndValues;
            int length = objArr.length;
            if (i > length) {
                this.alternatingKeysAndValues = Arrays.copyOf(objArr, AbstractC24851Je.A00(length, i));
                this.entriesUsed = false;
            }
            AbstractC24841Jd.A01(key, value);
            Object[] objArr2 = this.alternatingKeysAndValues;
            int i2 = this.size;
            int i3 = i2 * 2;
            objArr2[i3] = key;
            objArr2[i3 + 1] = value;
            this.size = i2 + 1;
            return this;
        }

        public Builder putAll(Iterable entries) {
            int size;
            Object[] objArr;
            int length;
            if ((entries instanceof Collection) && (size = (this.size + ((Collection) entries).size()) * 2) > (length = (objArr = this.alternatingKeysAndValues).length)) {
                this.alternatingKeysAndValues = Arrays.copyOf(objArr, AbstractC24851Je.A00(length, size));
                this.entriesUsed = false;
            }
            Iterator it = entries.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                put(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public Builder(int initialCapacity) {
            this.alternatingKeysAndValues = new Object[initialCapacity * 2];
            this.size = 0;
            this.entriesUsed = false;
        }

        /* renamed from: build */
        public ImmutableMap buildOrThrow() {
            return buildOrThrow();
        }

        public Builder() {
            this(4);
        }

        public Builder putAll(Map map) {
            putAll(map.entrySet());
            return this;
        }
    }

    /* loaded from: classes10.dex */
    public class SerializedForm implements Serializable {
        public static final long serialVersionUID = 0;
        public final Object keys;
        public final Object values;

        public final Object readResolve() {
            Builder builder;
            Object obj = this.keys;
            if (!(obj instanceof ImmutableSet)) {
                Object[] objArr = (Object[]) obj;
                Object[] objArr2 = (Object[]) this.values;
                int length = objArr.length;
                if (this instanceof ImmutableSortedMap.SerializedForm) {
                    builder = new RRE(((ImmutableSortedMap.SerializedForm) this).comparator);
                } else if (this instanceof ImmutableBiMap.SerializedForm) {
                    builder = new Builder(length);
                } else {
                    builder = new Builder(length);
                }
                for (int i = 0; i < objArr.length; i++) {
                    builder.put(objArr[i], objArr2[i]);
                }
            } else {
                ImmutableCollection immutableCollection = (ImmutableCollection) obj;
                ImmutableCollection immutableCollection2 = (ImmutableCollection) this.values;
                int size = immutableCollection.size();
                if (this instanceof ImmutableSortedMap.SerializedForm) {
                    builder = new RRE(((ImmutableSortedMap.SerializedForm) this).comparator);
                } else if (this instanceof ImmutableBiMap.SerializedForm) {
                    builder = new Builder(size);
                } else {
                    builder = new Builder(size);
                }
                C1LC it = immutableCollection.iterator();
                C1LC it2 = immutableCollection2.iterator();
                while (it.hasNext()) {
                    builder.put(it.next(), it2.next());
                }
            }
            return builder.buildOrThrow();
        }

        public SerializedForm(ImmutableMap map) {
            Object[] objArr = new Object[map.size()];
            Object[] objArr2 = new Object[map.size()];
            C1LC it = map.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(it);
                objArr[i] = A1K.getKey();
                objArr2[i] = A1K.getValue();
                i++;
            }
            this.keys = objArr;
            this.values = objArr2;
        }
    }

    public abstract ImmutableSet createEntrySet();

    public abstract ImmutableSet createKeySet();

    public abstract ImmutableCollection createValues();

    @Override // java.util.Map
    public abstract Object get(Object key);

    public abstract boolean isPartialView();

    public abstract Object writeReplace();

    public static ImmutableMap copyOf(Map map) {
        int i;
        if ((map instanceof ImmutableMap) && !(map instanceof SortedMap)) {
            ImmutableMap immutableMap = (ImmutableMap) map;
            if (!immutableMap.isPartialView()) {
                return immutableMap;
            }
        }
        Set<Map.Entry<K, V>> entrySet = map.entrySet();
        if (entrySet instanceof Collection) {
            i = entrySet.size();
        } else {
            i = 4;
        }
        Builder builder = new Builder(i);
        builder.putAll(entrySet);
        return builder.buildOrThrow();
    }

    private void readObject(ObjectInputStream stream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public ImmutableSet entrySet() {
        ImmutableSet immutableSet = this.entrySet;
        if (immutableSet == null) {
            ImmutableSet createEntrySet = createEntrySet();
            this.entrySet = createEntrySet;
            return createEntrySet;
        }
        return immutableSet;
    }

    @Override // java.util.Map
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof Map) {
            return entrySet().equals(((Map) object).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public ImmutableSet keySet() {
        ImmutableSet immutableSet = this.keySet;
        if (immutableSet == null) {
            ImmutableSet createKeySet = createKeySet();
            this.keySet = createKeySet;
            return createKeySet;
        }
        return immutableSet;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object k, Object v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public ImmutableCollection values() {
        ImmutableCollection immutableCollection = this.values;
        if (immutableCollection == null) {
            ImmutableCollection createValues = createValues();
            this.values = createValues;
            return createValues;
        }
        return immutableCollection;
    }

    public static ImmutableMap of(Object k1, Object v1, Object k2, Object v2) {
        AbstractC24841Jd.A01(k1, v1);
        AbstractC24841Jd.A01(k2, v2);
        return RegularImmutableMap.A00(null, new Object[]{k1, v1, k2, v2}, 2);
    }

    @Override // java.util.Map
    public boolean containsKey(Object key) {
        if (get(key) == null) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return values().contains(value);
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object key, Object defaultValue) {
        Object obj = get(key);
        if (obj != null) {
            return obj;
        }
        return defaultValue;
    }

    @Override // java.util.Map
    public int hashCode() {
        return AbstractC103614ld.A00(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        if (size() != 0) {
            return false;
        }
        return true;
    }

    public String toString() {
        int size = size();
        AbstractC24841Jd.A00(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            z = false;
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
        }
        sb.append('}');
        return sb.toString();
    }

    public static ImmutableMap of(Object k1, Object v1) {
        AbstractC24841Jd.A01(k1, v1);
        return RegularImmutableMap.A00(null, new Object[]{k1, v1}, 1);
    }

    public static ImmutableMap of(Object k1, Object v1, Object k2, Object v2, Object k3, Object v3) {
        AbstractC24841Jd.A01(k1, v1);
        AbstractC24841Jd.A01(k2, v2);
        AbstractC24841Jd.A01(k3, v3);
        return RegularImmutableMap.A00(null, new Object[]{k1, v1, k2, v2, k3, v3}, 3);
    }
}
