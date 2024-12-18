package com.google.common.collect;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public class CompactLinkedHashMap<K, V> extends CompactHashMap<K, V> {
    public transient int A00;
    public transient int A01;
    public final boolean accessOrder;
    public transient long[] links;

    public CompactLinkedHashMap(int i) {
        super(i);
        this.accessOrder = false;
    }

    private void A02(int pred, int succ) {
        if (pred == -2) {
            this.A00 = succ;
        } else {
            long[] jArr = this.links;
            jArr.getClass();
            long j = (jArr[pred] & (-4294967296L)) | ((succ + 1) & 4294967295L);
            long[] jArr2 = this.links;
            jArr2.getClass();
            jArr2[pred] = j;
        }
        if (succ == -2) {
            this.A01 = pred;
            return;
        }
        long[] jArr3 = this.links;
        jArr3.getClass();
        long j2 = (jArr3[succ] & 4294967295L) | ((pred + 1) << 32);
        long[] jArr4 = this.links;
        jArr4.getClass();
        jArr4[succ] = j2;
    }

    @Override // com.google.common.collect.CompactHashMap
    public final int A04() {
        return this.A00;
    }

    @Override // com.google.common.collect.CompactHashMap
    public final int A05(int entry) {
        this.links.getClass();
        return ((int) r0[entry]) - 1;
    }

    @Override // com.google.common.collect.CompactHashMap
    public final LinkedHashMap A07(int tableSize) {
        return new LinkedHashMap(tableSize, 1.0f, this.accessOrder);
    }

    @Override // com.google.common.collect.CompactHashMap
    public final void A08(int index) {
        if (this.accessOrder) {
            this.links.getClass();
            A02(((int) (r0[index] >>> 32)) - 1, A05(index));
            A02(this.A01, index);
            A02(index, -2);
            super.A00 += 32;
        }
    }

    @Override // com.google.common.collect.CompactHashMap
    public final int A03() {
        int A03 = super.A03();
        this.links = new long[A03];
        return A03;
    }

    @Override // com.google.common.collect.CompactHashMap
    public final int A06(int indexBeforeRemove, int indexRemoved) {
        if (indexBeforeRemove >= size()) {
            return indexRemoved;
        }
        return indexBeforeRemove;
    }

    @Override // com.google.common.collect.CompactHashMap
    public final void A09(int expectedSize) {
        super.A09(expectedSize);
        this.A00 = -2;
        this.A01 = -2;
    }

    @Override // com.google.common.collect.CompactHashMap
    public final void A0A(int newCapacity) {
        super.A0A(newCapacity);
        long[] jArr = this.links;
        jArr.getClass();
        this.links = Arrays.copyOf(jArr, newCapacity);
    }

    @Override // com.google.common.collect.CompactHashMap
    public final void A0B(int dstIndex, int mask) {
        int size = size() - 1;
        super.A0B(dstIndex, mask);
        this.links.getClass();
        A02(((int) (r0[dstIndex] >>> 32)) - 1, A05(dstIndex));
        if (dstIndex < size) {
            this.links.getClass();
            A02(((int) (r0[size] >>> 32)) - 1, dstIndex);
            A02(dstIndex, A05(size));
        }
        long[] jArr = this.links;
        jArr.getClass();
        jArr[size] = 0;
    }

    @Override // com.google.common.collect.CompactHashMap
    public final void A0C(Object entryIndex, int key, Object value, int hash, int mask) {
        super.A0C(entryIndex, key, value, hash, mask);
        A02(this.A01, key);
        A02(key, -2);
    }

    @Override // com.google.common.collect.CompactHashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (!needsAllocArrays()) {
            this.A00 = -2;
            this.A01 = -2;
            long[] jArr = this.links;
            if (jArr != null) {
                Arrays.fill(jArr, 0, size(), 0L);
            }
            super.clear();
        }
    }

    @Override // com.google.common.collect.CompactHashMap
    public final Map convertToHashFloodingResistantImplementation() {
        Map convertToHashFloodingResistantImplementation = super.convertToHashFloodingResistantImplementation();
        this.links = null;
        return convertToHashFloodingResistantImplementation;
    }

    public CompactLinkedHashMap() {
        this(3);
    }
}
