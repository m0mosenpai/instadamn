package com.google.common.collect;

import X.C18C;

/* loaded from: classes.dex */
public class RegularImmutableList<E> extends ImmutableList<E> {
    public static final ImmutableList A01 = new RegularImmutableList(new Object[0], 0);
    public final transient int A00;
    public final transient Object[] array;

    @Override // com.google.common.collect.ImmutableCollection
    public final int A09() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean A0B() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int A08() {
        return this.A00;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final Object[] A0A() {
        return this.array;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public final int copyIntoArray(Object[] dst, int dstOff) {
        Object[] objArr = this.array;
        int i = this.A00;
        System.arraycopy(objArr, 0, dst, dstOff, i);
        return dstOff + i;
    }

    @Override // java.util.List
    public final Object get(int index) {
        C18C.A01(index, this.A00);
        Object obj = this.array[index];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00;
    }

    public RegularImmutableList(Object[] array, int size) {
        this.array = array;
        this.A00 = size;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
