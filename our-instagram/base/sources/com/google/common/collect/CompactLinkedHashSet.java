package com.google.common.collect;

import X.AbstractC58318PtA;
import X.C1LH;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes10.dex */
public class CompactLinkedHashSet<E> extends CompactHashSet<E> {
    public transient int[] A00;
    public transient int[] A01;
    public transient int A02;
    public transient int A03;

    private void A00(int pred, int succ) {
        if (pred == -2) {
            this.A02 = succ;
        } else {
            int[] iArr = this.A01;
            iArr.getClass();
            iArr[pred] = succ + 1;
        }
        if (succ == -2) {
            this.A03 = pred;
            return;
        }
        int[] iArr2 = this.A00;
        iArr2.getClass();
        iArr2[succ] = pred + 1;
    }

    @Override // com.google.common.collect.CompactHashSet
    public final int A02() {
        return this.A02;
    }

    @Override // com.google.common.collect.CompactHashSet
    public final int A03(int entry) {
        this.A01.getClass();
        return r0[entry] - 1;
    }

    @Override // com.google.common.collect.CompactHashSet
    public final int A01() {
        int A01 = super.A01();
        this.A00 = new int[A01];
        this.A01 = new int[A01];
        return A01;
    }

    @Override // com.google.common.collect.CompactHashSet
    public final int A04(int indexBeforeRemove, int indexRemoved) {
        if (indexBeforeRemove >= size()) {
            return indexRemoved;
        }
        return indexBeforeRemove;
    }

    @Override // com.google.common.collect.CompactHashSet
    public final void A05(int expectedSize) {
        super.A05(expectedSize);
        this.A02 = -2;
        this.A03 = -2;
    }

    @Override // com.google.common.collect.CompactHashSet
    public final void A06(int newCapacity) {
        super.A06(newCapacity);
        int[] iArr = this.A00;
        iArr.getClass();
        this.A00 = Arrays.copyOf(iArr, newCapacity);
        int[] iArr2 = this.A01;
        iArr2.getClass();
        this.A01 = Arrays.copyOf(iArr2, newCapacity);
    }

    @Override // com.google.common.collect.CompactHashSet
    public final void A07(int dstIndex, int mask) {
        int A08 = AbstractC58318PtA.A08(this);
        super.A07(dstIndex, mask);
        this.A00.getClass();
        A00(r0[dstIndex] - 1, A03(dstIndex));
        if (dstIndex < A08) {
            this.A00.getClass();
            A00(r0[A08] - 1, dstIndex);
            A00(dstIndex, A03(A08));
        }
        int[] iArr = this.A00;
        iArr.getClass();
        iArr[A08] = 0;
        int[] iArr2 = this.A01;
        iArr2.getClass();
        iArr2[A08] = 0;
    }

    @Override // com.google.common.collect.CompactHashSet
    public final void A08(Object entryIndex, int object, int hash, int mask) {
        super.A08(entryIndex, object, hash, mask);
        A00(this.A03, object);
        A00(object, -2);
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (!needsAllocArrays()) {
            this.A02 = -2;
            this.A03 = -2;
            int[] iArr = this.A00;
            if (iArr != null && this.A01 != null) {
                Arrays.fill(iArr, 0, size(), 0);
                Arrays.fill(this.A01, 0, size(), 0);
            }
            super.clear();
        }
    }

    @Override // com.google.common.collect.CompactHashSet
    public final Set convertToHashFloodingResistantImplementation() {
        Set convertToHashFloodingResistantImplementation = super.convertToHashFloodingResistantImplementation();
        this.A00 = null;
        this.A01 = null;
        return convertToHashFloodingResistantImplementation;
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] a) {
        return C1LH.A01(this, a);
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = new Object[size()];
        Iterator<E> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return objArr;
    }
}
