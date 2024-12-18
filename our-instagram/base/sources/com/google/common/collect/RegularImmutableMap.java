package com.google.common.collect;

import X.C18C;
import X.C1Jk;
import X.C1LC;
import X.C62682SLv;
import com.google.common.collect.ImmutableMap;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class RegularImmutableMap<K, V> extends ImmutableMap<K, V> {
    public static final ImmutableMap A02 = new RegularImmutableMap(null, new Object[0], 0);
    public static final long serialVersionUID = 0;
    public final transient int A00;
    public final transient Object A01;
    public final transient Object[] alternatingKeysAndValues;

    /* loaded from: classes2.dex */
    public class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {
        public final transient int A00;
        public final transient int A01;
        public final transient Object[] A02;
        public final transient ImmutableMap A03;

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean A0B() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableSet
        public final ImmutableList A0C() {
            return new ImmutableList<Map.Entry<K, V>>() { // from class: com.google.common.collect.RegularImmutableMap.EntrySet.1
                @Override // com.google.common.collect.ImmutableCollection
                public final boolean A0B() {
                    return true;
                }

                @Override // java.util.List
                /* renamed from: A0C, reason: merged with bridge method [inline-methods] */
                public final AbstractMap.SimpleImmutableEntry get(int index) {
                    C18C.A01(index, EntrySet.this.A01);
                    EntrySet entrySet = EntrySet.this;
                    int i = index * 2;
                    Object obj = entrySet.A02[entrySet.A00 + i];
                    obj.getClass();
                    EntrySet entrySet2 = EntrySet.this;
                    Object obj2 = entrySet2.A02[i + (entrySet2.A00 ^ 1)];
                    obj2.getClass();
                    return new AbstractMap.SimpleImmutableEntry(obj, obj2);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
                    return EntrySet.this.A01;
                }

                @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
                public Object writeReplace() {
                    return super.writeReplace();
                }
            };
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object object) {
            if (!(object instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) object;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.A03.get(key))) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.A01;
        }

        public EntrySet(ImmutableMap map, Object[] alternatingKeysAndValues, int keyOffset, int size) {
            this.A03 = map;
            this.A02 = alternatingKeysAndValues;
            this.A00 = keyOffset;
            this.A01 = size;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int copyIntoArray(Object[] dst, int offset) {
            return asList().copyIntoArray(dst, offset);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final /* bridge */ /* synthetic */ Iterator iterator() {
            return asList().iterator();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final C1LC iterator() {
            return asList().iterator();
        }
    }

    /* loaded from: classes3.dex */
    public final class KeySet<K> extends ImmutableSet<K> {
        public final transient ImmutableList A00;
        public final transient ImmutableMap A01;

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean A0B() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public final ImmutableList asList() {
            return this.A00;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object object) {
            if (this.A01.get(object) == null) {
                return false;
            }
            return true;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int copyIntoArray(Object[] dst, int offset) {
            return this.A00.copyIntoArray(dst, offset);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final /* bridge */ /* synthetic */ Iterator iterator() {
            return this.A00.iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.A01.size();
        }

        public KeySet(ImmutableList map, ImmutableMap list) {
            this.A01 = list;
            this.A00 = map;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final C1LC iterator() {
            return this.A00.iterator();
        }
    }

    /* loaded from: classes3.dex */
    public final class KeysOrValuesAsList extends ImmutableList<Object> {
        public final transient int A00;
        public final transient int A01;
        public final transient Object[] A02;

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean A0B() {
            return true;
        }

        @Override // java.util.List
        public final Object get(int index) {
            C18C.A01(index, this.A01);
            Object obj = this.A02[(index * 2) + this.A00];
            obj.getClass();
            return obj;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.A01;
        }

        public KeysOrValuesAsList(Object[] alternatingKeysAndValues, int offset, int size) {
            this.A02 = alternatingKeysAndValues;
            this.A00 = offset;
            this.A01 = size;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static Object A01(Object hashTableObject, Object alternatingKeysAndValues, Object[] size, int keyOffset, int key) {
        int i;
        if (alternatingKeysAndValues == null) {
            return null;
        }
        if (keyOffset == 1) {
            Object obj = size[key];
            obj.getClass();
            if (!obj.equals(alternatingKeysAndValues)) {
                return null;
            }
            Object obj2 = size[key ^ 1];
            obj2.getClass();
            return obj2;
        }
        if (hashTableObject == null) {
            return null;
        }
        if (hashTableObject instanceof byte[]) {
            byte[] bArr = (byte[]) hashTableObject;
            int length = bArr.length - 1;
            int A01 = C1Jk.A01(alternatingKeysAndValues.hashCode());
            while (true) {
                int i2 = A01 & length;
                i = bArr[i2] & 255;
                if (i == 255) {
                    return null;
                }
                if (alternatingKeysAndValues.equals(size[i])) {
                    break;
                }
                A01 = i2 + 1;
            }
        } else if (hashTableObject instanceof short[]) {
            short[] sArr = (short[]) hashTableObject;
            int length2 = sArr.length - 1;
            int A012 = C1Jk.A01(alternatingKeysAndValues.hashCode());
            while (true) {
                int i3 = A012 & length2;
                i = sArr[i3] & 65535;
                if (i == 65535) {
                    return null;
                }
                if (alternatingKeysAndValues.equals(size[i])) {
                    break;
                }
                A012 = i3 + 1;
            }
        } else {
            int[] iArr = (int[]) hashTableObject;
            int length3 = iArr.length - 1;
            int A013 = C1Jk.A01(alternatingKeysAndValues.hashCode());
            while (true) {
                int i4 = A013 & length3;
                i = iArr[i4];
                if (i == -1) {
                    return null;
                }
                if (alternatingKeysAndValues.equals(size[i])) {
                    break;
                }
                A013 = i4 + 1;
            }
        }
        return size[i ^ 1];
    }

    public static Object A02(Object[] alternatingKeysAndValues, int n, int tableSize, int keyOffset) {
        C62682SLv c62682SLv = null;
        if (n == 1) {
            alternatingKeysAndValues[keyOffset].getClass();
            alternatingKeysAndValues[keyOffset ^ 1].getClass();
            return null;
        }
        int i = tableSize - 1;
        if (tableSize <= 128) {
            byte[] bArr = new byte[tableSize];
            Arrays.fill(bArr, (byte) -1);
            int i2 = 0;
            for (int i3 = 0; i3 < n; i3++) {
                int i4 = (i3 * 2) + keyOffset;
                int i5 = (i2 * 2) + keyOffset;
                Object obj = alternatingKeysAndValues[i4];
                obj.getClass();
                Object obj2 = alternatingKeysAndValues[i4 ^ 1];
                obj2.getClass();
                int A01 = C1Jk.A01(obj.hashCode());
                while (true) {
                    int i6 = A01 & i;
                    int i7 = bArr[i6] & 255;
                    if (i7 == 255) {
                        bArr[i6] = (byte) i5;
                        if (i2 < i3) {
                            alternatingKeysAndValues[i5] = obj;
                            alternatingKeysAndValues[i5 ^ 1] = obj2;
                        }
                        i2++;
                    } else {
                        if (obj.equals(alternatingKeysAndValues[i7])) {
                            int i8 = i7 ^ 1;
                            Object obj3 = alternatingKeysAndValues[i8];
                            obj3.getClass();
                            c62682SLv = new C62682SLv(obj, obj2, obj3);
                            alternatingKeysAndValues[i8] = obj2;
                            break;
                        }
                        A01 = i6 + 1;
                    }
                }
            }
            if (i2 != n) {
                return new Object[]{bArr, Integer.valueOf(i2), c62682SLv};
            }
            return bArr;
        }
        if (tableSize <= 32768) {
            short[] sArr = new short[tableSize];
            Arrays.fill(sArr, (short) -1);
            int i9 = 0;
            for (int i10 = 0; i10 < n; i10++) {
                int i11 = (i10 * 2) + keyOffset;
                int i12 = (i9 * 2) + keyOffset;
                Object obj4 = alternatingKeysAndValues[i11];
                obj4.getClass();
                Object obj5 = alternatingKeysAndValues[i11 ^ 1];
                obj5.getClass();
                int A012 = C1Jk.A01(obj4.hashCode());
                while (true) {
                    int i13 = A012 & i;
                    int i14 = sArr[i13] & 65535;
                    if (i14 == 65535) {
                        sArr[i13] = (short) i12;
                        if (i9 < i10) {
                            alternatingKeysAndValues[i12] = obj4;
                            alternatingKeysAndValues[i12 ^ 1] = obj5;
                        }
                        i9++;
                    } else {
                        if (obj4.equals(alternatingKeysAndValues[i14])) {
                            int i15 = i14 ^ 1;
                            Object obj6 = alternatingKeysAndValues[i15];
                            obj6.getClass();
                            c62682SLv = new C62682SLv(obj4, obj5, obj6);
                            alternatingKeysAndValues[i15] = obj5;
                            break;
                        }
                        A012 = i13 + 1;
                    }
                }
            }
            if (i9 != n) {
                return new Object[]{sArr, Integer.valueOf(i9), c62682SLv};
            }
            return sArr;
        }
        int[] iArr = new int[tableSize];
        Arrays.fill(iArr, -1);
        int i16 = 0;
        for (int i17 = 0; i17 < n; i17++) {
            int i18 = (i17 * 2) + keyOffset;
            int i19 = (i16 * 2) + keyOffset;
            Object obj7 = alternatingKeysAndValues[i18];
            obj7.getClass();
            Object obj8 = alternatingKeysAndValues[i18 ^ 1];
            obj8.getClass();
            int A013 = C1Jk.A01(obj7.hashCode());
            while (true) {
                int i20 = A013 & i;
                int i21 = iArr[i20];
                if (i21 == -1) {
                    iArr[i20] = i19;
                    if (i16 < i17) {
                        alternatingKeysAndValues[i19] = obj7;
                        alternatingKeysAndValues[i19 ^ 1] = obj8;
                    }
                    i16++;
                } else {
                    if (obj7.equals(alternatingKeysAndValues[i21])) {
                        int i22 = i21 ^ 1;
                        Object obj9 = alternatingKeysAndValues[i22];
                        obj9.getClass();
                        c62682SLv = new C62682SLv(obj7, obj8, obj9);
                        alternatingKeysAndValues[i22] = obj8;
                        break;
                    }
                    A013 = i20 + 1;
                }
            }
        }
        if (i16 != n) {
            return new Object[]{iArr, Integer.valueOf(i16), c62682SLv};
        }
        return iArr;
    }

    @Override // com.google.common.collect.ImmutableMap
    public final boolean isPartialView() {
        return false;
    }

    public static RegularImmutableMap A00(ImmutableMap.Builder n, Object[] alternatingKeysAndValues, int builder) {
        if (builder == 0) {
            return (RegularImmutableMap) A02;
        }
        if (builder == 1) {
            alternatingKeysAndValues[0].getClass();
            alternatingKeysAndValues[1].getClass();
            return new RegularImmutableMap(null, alternatingKeysAndValues, 1);
        }
        C18C.A02(builder, alternatingKeysAndValues.length >> 1);
        Object A022 = A02(alternatingKeysAndValues, builder, ImmutableSet.chooseTableSize(builder), 0);
        if (A022 instanceof Object[]) {
            Object[] objArr = (Object[]) A022;
            C62682SLv c62682SLv = (C62682SLv) objArr[2];
            if (n != null) {
                n.duplicateKey = c62682SLv;
                Object obj = objArr[0];
                builder = ((Number) objArr[1]).intValue();
                alternatingKeysAndValues = Arrays.copyOf(alternatingKeysAndValues, builder * 2);
                A022 = obj;
            } else {
                throw c62682SLv.A00();
            }
        }
        return new RegularImmutableMap(A022, alternatingKeysAndValues, builder);
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet createEntrySet() {
        return new EntrySet(this, this.alternatingKeysAndValues, 0, this.A00);
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet createKeySet() {
        return new KeySet(new KeysOrValuesAsList(this.alternatingKeysAndValues, 0, this.A00), this);
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableCollection createValues() {
        return new KeysOrValuesAsList(this.alternatingKeysAndValues, 1, this.A00);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final Object get(Object key) {
        Object A01 = A01(this.A01, key, this.alternatingKeysAndValues, this.A00, 0);
        if (A01 == null) {
            return null;
        }
        return A01;
    }

    @Override // java.util.Map
    public final int size() {
        return this.A00;
    }

    @Override // com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        return new ImmutableMap.SerializedForm(this);
    }

    public RegularImmutableMap(Object hashTable, Object[] alternatingKeysAndValues, int size) {
        this.A01 = hashTable;
        this.alternatingKeysAndValues = alternatingKeysAndValues;
        this.A00 = size;
    }
}
