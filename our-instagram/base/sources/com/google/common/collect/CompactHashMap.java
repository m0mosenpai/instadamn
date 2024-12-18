package com.google.common.collect;

import X.AbstractC111324zv;
import X.AbstractC38301qK;
import X.AbstractC50102Ry;
import X.AnonymousClass001;
import X.C18C;
import X.C1Jk;
import X.C49W;
import X.C49e;
import X.TZW;
import com.google.common.collect.CompactHashMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class CompactHashMap<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Object A06 = new Object();
    public static final double HASH_FLOODING_FPP = 0.001d;
    public transient int A00;
    public transient int A01;
    public transient Object A02;
    public transient Collection A03;
    public transient Set A04;
    public transient Set A05;
    public transient int[] entries;
    public transient Object[] keys;
    public transient Object[] values;

    public int A06(int indexBeforeRemove, int indexRemoved) {
        return indexBeforeRemove - 1;
    }

    public void A08(int index) {
    }

    public void A09(int expectedSize) {
        this.A00 = AbstractC38301qK.A00(expectedSize, 1, 1073741823);
    }

    public static int A00(CompactHashMap compactHashMap, Object obj) {
        boolean z = false;
        if (compactHashMap.A02 == null) {
            z = true;
        }
        if (!z) {
            int A02 = C1Jk.A02(obj);
            int i = (1 << (compactHashMap.A00 & 31)) - 1;
            Object obj2 = compactHashMap.A02;
            obj2.getClass();
            int A00 = C49W.A00(obj2, A02 & i);
            if (A00 != 0) {
                int i2 = i ^ (-1);
                int i3 = A02 & i2;
                do {
                    int i4 = A00 - 1;
                    int[] iArr = compactHashMap.entries;
                    iArr.getClass();
                    int i5 = iArr[i4];
                    if ((i5 & i2) == i3) {
                        Object[] objArr = compactHashMap.keys;
                        objArr.getClass();
                        if (AbstractC50102Ry.A00(obj, objArr[i4])) {
                            return i4;
                        }
                    }
                    A00 = i5 & i;
                } while (A00 != 0);
            }
        }
        return -1;
    }

    public static Object A01(CompactHashMap compactHashMap, Object obj) {
        Object obj2 = compactHashMap.A02;
        if (obj2 != null) {
            int i = (1 << (compactHashMap.A00 & 31)) - 1;
            int[] iArr = compactHashMap.entries;
            iArr.getClass();
            Object[] objArr = compactHashMap.keys;
            objArr.getClass();
            int A01 = C49W.A01(obj, null, obj2, iArr, objArr, null, i);
            if (A01 != -1) {
                Object[] objArr2 = compactHashMap.values;
                objArr2.getClass();
                Object obj3 = objArr2[A01];
                compactHashMap.A0B(A01, i);
                compactHashMap.A01--;
                compactHashMap.A00 += 32;
                return obj3;
            }
        }
        return A06;
    }

    public int A03() {
        boolean z = false;
        if (this.A02 == null) {
            z = true;
        }
        C18C.A0H(z, "Arrays already allocated");
        int i = this.A00;
        int max = Math.max(4, C1Jk.A00(i + 1));
        this.A02 = C49W.A02(max);
        this.A00 = (this.A00 & (-32)) | ((32 - Integer.numberOfLeadingZeros(max - 1)) & 31);
        this.entries = new int[i];
        this.keys = new Object[i];
        this.values = new Object[i];
        return i;
    }

    public int A05(int entryIndex) {
        int i = entryIndex + 1;
        if (i >= this.A01) {
            return -1;
        }
        return i;
    }

    public LinkedHashMap A07(int tableSize) {
        return new LinkedHashMap(tableSize, 1.0f);
    }

    public void A0A(int newCapacity) {
        int[] iArr = this.entries;
        iArr.getClass();
        this.entries = Arrays.copyOf(iArr, newCapacity);
        Object[] objArr = this.keys;
        objArr.getClass();
        this.keys = Arrays.copyOf(objArr, newCapacity);
        Object[] objArr2 = this.values;
        objArr2.getClass();
        this.values = Arrays.copyOf(objArr2, newCapacity);
    }

    public void A0B(int dstIndex, int mask) {
        int i;
        int i2;
        Object obj = this.A02;
        obj.getClass();
        int[] iArr = this.entries;
        iArr.getClass();
        Object[] objArr = this.keys;
        objArr.getClass();
        Object[] objArr2 = this.values;
        objArr2.getClass();
        int size = size() - 1;
        if (dstIndex < size) {
            Object obj2 = objArr[size];
            objArr[dstIndex] = obj2;
            objArr2[dstIndex] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            iArr[dstIndex] = iArr[size];
            iArr[size] = 0;
            int A02 = C1Jk.A02(obj2) & mask;
            int A00 = C49W.A00(obj, A02);
            int i3 = size + 1;
            if (A00 == i3) {
                C49W.A03(obj, A02, dstIndex + 1);
                return;
            }
            do {
                i = A00 - 1;
                i2 = iArr[i];
                A00 = i2 & mask;
            } while (A00 != i3);
            iArr[i] = (i2 & (mask ^ (-1))) | ((dstIndex + 1) & mask);
            return;
        }
        objArr[dstIndex] = null;
        objArr2[dstIndex] = null;
        iArr[dstIndex] = 0;
    }

    public void A0C(Object entryIndex, int key, Object value, int hash, int mask) {
        int[] iArr = this.entries;
        iArr.getClass();
        iArr[key] = hash & (mask ^ (-1));
        Object[] objArr = this.keys;
        objArr.getClass();
        objArr[key] = entryIndex;
        Object[] objArr2 = this.values;
        objArr2.getClass();
        objArr2[key] = value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (this.A02 != null) {
            this.A00 += 32;
            Map delegateOrNull = delegateOrNull();
            if (delegateOrNull != null) {
                this.A00 = AbstractC38301qK.A00(size(), 3, 1073741823);
                delegateOrNull.clear();
                this.A02 = null;
            } else {
                Object[] objArr = this.keys;
                objArr.getClass();
                Arrays.fill(objArr, 0, this.A01, (Object) null);
                Object[] objArr2 = this.values;
                objArr2.getClass();
                Arrays.fill(objArr2, 0, this.A01, (Object) null);
                Object obj = this.A02;
                obj.getClass();
                if (obj instanceof byte[]) {
                    Arrays.fill((byte[]) obj, (byte) 0);
                } else if (obj instanceof short[]) {
                    Arrays.fill((short[]) obj, (short) 0);
                } else {
                    Arrays.fill((int[]) obj, 0);
                }
                int[] iArr = this.entries;
                iArr.getClass();
                Arrays.fill(iArr, 0, this.A01, 0);
            }
            this.A01 = 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Map convertToHashFloodingResistantImplementation() {
        LinkedHashMap A07 = A07(((1 << (this.A00 & 31)) - 1) + 1);
        int A04 = A04();
        while (A04 >= 0) {
            Object[] objArr = this.keys;
            objArr.getClass();
            Object obj = objArr[A04];
            Object[] objArr2 = this.values;
            objArr2.getClass();
            A07.put(obj, objArr2[A04]);
            A04 = A05(A04);
        }
        this.A02 = A07;
        this.entries = null;
        this.keys = null;
        this.values = null;
        this.A00 += 32;
        return A07;
    }

    public Map delegateOrNull() {
        Object obj = this.A02;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.A04;
        if (set == null) {
            AbstractSet<Map.Entry<K, V>> abstractSet = new AbstractSet<Map.Entry<K, V>>() { // from class: X.49X
                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final void clear() {
                    CompactHashMap.this.clear();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean contains(Object o) {
                    CompactHashMap compactHashMap = CompactHashMap.this;
                    Map delegateOrNull = compactHashMap.delegateOrNull();
                    if (delegateOrNull != null) {
                        return delegateOrNull.entrySet().contains(o);
                    }
                    if (!(o instanceof Map.Entry)) {
                        return false;
                    }
                    Map.Entry entry = (Map.Entry) o;
                    int A00 = CompactHashMap.A00(compactHashMap, entry.getKey());
                    if (A00 == -1) {
                        return false;
                    }
                    Object[] objArr = compactHashMap.values;
                    objArr.getClass();
                    if (!AbstractC50102Ry.A00(objArr[A00], entry.getValue())) {
                        return false;
                    }
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public final Iterator iterator() {
                    CompactHashMap compactHashMap = CompactHashMap.this;
                    Map delegateOrNull = compactHashMap.delegateOrNull();
                    if (delegateOrNull != null) {
                        return delegateOrNull.entrySet().iterator();
                    }
                    return new C49e(compactHashMap);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean remove(Object o) {
                    CompactHashMap compactHashMap = CompactHashMap.this;
                    Map delegateOrNull = compactHashMap.delegateOrNull();
                    if (delegateOrNull != null) {
                        return delegateOrNull.entrySet().remove(o);
                    }
                    if (o instanceof Map.Entry) {
                        Map.Entry entry = (Map.Entry) o;
                        if (compactHashMap.A02 != null) {
                            int i = (1 << (compactHashMap.A00 & 31)) - 1;
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            Object obj = compactHashMap.A02;
                            obj.getClass();
                            int[] iArr = compactHashMap.entries;
                            iArr.getClass();
                            Object[] objArr = compactHashMap.keys;
                            objArr.getClass();
                            Object[] objArr2 = compactHashMap.values;
                            objArr2.getClass();
                            int A01 = C49W.A01(key, value, obj, iArr, objArr, objArr2, i);
                            if (A01 != -1) {
                                compactHashMap.A0B(A01, i);
                                compactHashMap.A01--;
                                compactHashMap.A00 += 32;
                                return true;
                            }
                        }
                    }
                    return false;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final int size() {
                    return CompactHashMap.this.size();
                }
            };
            this.A04 = abstractSet;
            return abstractSet;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.A05;
        if (set == null) {
            TZW tzw = new TZW(this);
            this.A05 = tzw;
            return tzw;
        }
        return set;
    }

    public boolean needsAllocArrays() {
        if (this.A02 != null) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d9  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object put(java.lang.Object r21, java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.CompactHashMap.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.A03;
        if (collection == null) {
            AbstractCollection<V> abstractCollection = new AbstractCollection<V>() { // from class: X.5eX
                @Override // java.util.AbstractCollection, java.util.Collection
                public final void clear() {
                    CompactHashMap.this.clear();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
                public final Iterator iterator() {
                    final CompactHashMap compactHashMap = CompactHashMap.this;
                    Map delegateOrNull = compactHashMap.delegateOrNull();
                    if (delegateOrNull != null) {
                        return delegateOrNull.values().iterator();
                    }
                    return new C49f() { // from class: X.5eY
                        {
                            super(CompactHashMap.this);
                        }

                        @Override // X.C49f
                        public final Object A00(int entry) {
                            Object[] objArr = CompactHashMap.this.values;
                            objArr.getClass();
                            return objArr[entry];
                        }
                    };
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public final int size() {
                    return CompactHashMap.this.size();
                }
            };
            this.A03 = abstractCollection;
            return abstractCollection;
        }
        return collection;
    }

    public CompactHashMap(int expectedSize) {
        A09(expectedSize);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream stream) {
        stream.defaultReadObject();
        int readInt = stream.readInt();
        if (readInt >= 0) {
            A09(readInt);
            for (int i = 0; i < readInt; i++) {
                put(stream.readObject(), stream.readObject());
            }
            return;
        }
        throw new InvalidObjectException(AnonymousClass001.A0O(AbstractC111324zv.A00(648), readInt));
    }

    private void writeObject(ObjectOutputStream stream) {
        Iterator<Map.Entry<K, V>> c49e;
        stream.defaultWriteObject();
        stream.writeInt(size());
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            c49e = delegateOrNull.entrySet().iterator();
        } else {
            c49e = new C49e(this);
        }
        while (c49e.hasNext()) {
            Map.Entry<K, V> next = c49e.next();
            stream.writeObject(next.getKey());
            stream.writeObject(next.getValue());
        }
    }

    public int A04() {
        if (!isEmpty()) {
            return 0;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object key) {
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.containsKey(key);
        }
        if (A00(this, key) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object value) {
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.containsValue(value);
        }
        for (int i = 0; i < this.A01; i++) {
            Object[] objArr = this.values;
            objArr.getClass();
            if (AbstractC50102Ry.A00(value, objArr[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object key) {
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.get(key);
        }
        int A00 = A00(this, key);
        if (A00 == -1) {
            return null;
        }
        A08(A00);
        Object[] objArr = this.values;
        objArr.getClass();
        return objArr[A00];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (size() != 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object key) {
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.remove(key);
        }
        Object A01 = A01(this, key);
        if (A01 != A06) {
            return A01;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.size();
        }
        return this.A01;
    }

    public CompactHashMap() {
        A09(3);
    }
}
