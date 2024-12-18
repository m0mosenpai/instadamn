package com.google.common.collect;

import X.C62682SLv;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;

/* loaded from: classes10.dex */
public final class RegularImmutableBiMap<K, V> extends ImmutableBiMap<K, V> {
    public static final RegularImmutableBiMap A04 = new RegularImmutableBiMap();
    public final transient RegularImmutableBiMap A00;
    public final transient int A01;
    public final transient int A02;
    public final transient Object A03;
    public final transient Object[] alternatingKeysAndValues;

    @Override // com.google.common.collect.ImmutableMap
    public final boolean isPartialView() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet createEntrySet() {
        return new RegularImmutableMap.EntrySet(this, this.alternatingKeysAndValues, this.A01, this.A02);
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet createKeySet() {
        return new RegularImmutableMap.KeySet(new RegularImmutableMap.KeysOrValuesAsList(this.alternatingKeysAndValues, this.A01, this.A02), this);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final Object get(Object key) {
        Object A01 = RegularImmutableMap.A01(this.A03, key, this.alternatingKeysAndValues, this.A02, this.A01);
        if (A01 == null) {
            return null;
        }
        return A01;
    }

    @Override // java.util.Map
    public final int size() {
        return this.A02;
    }

    @Override // com.google.common.collect.ImmutableBiMap, com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        return new ImmutableMap.SerializedForm(this);
    }

    public RegularImmutableBiMap(Object[] alternatingKeysAndValues, int size) {
        int i;
        this.alternatingKeysAndValues = alternatingKeysAndValues;
        this.A02 = size;
        this.A01 = 0;
        if (size >= 2) {
            i = ImmutableSet.chooseTableSize(size);
        } else {
            i = 0;
        }
        Object A02 = RegularImmutableMap.A02(alternatingKeysAndValues, size, i, 0);
        if (!(A02 instanceof Object[])) {
            this.A03 = A02;
            A02 = RegularImmutableMap.A02(alternatingKeysAndValues, size, i, 1);
            if (!(A02 instanceof Object[])) {
                this.A00 = new RegularImmutableBiMap(this, A02, alternatingKeysAndValues, size);
                return;
            }
        }
        throw ((C62682SLv) ((Object[]) A02)[2]).A00();
    }

    public RegularImmutableBiMap(RegularImmutableBiMap valueHashTable, Object alternatingKeysAndValues, Object[] size, int inverse) {
        this.A03 = alternatingKeysAndValues;
        this.alternatingKeysAndValues = size;
        this.A01 = 1;
        this.A02 = inverse;
        this.A00 = valueHashTable;
    }

    public RegularImmutableBiMap() {
        this.A03 = null;
        this.alternatingKeysAndValues = new Object[0];
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = this;
    }
}
