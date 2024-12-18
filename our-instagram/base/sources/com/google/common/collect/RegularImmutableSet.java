package com.google.common.collect;

import X.C1Jk;
import X.C1LC;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class RegularImmutableSet<E> extends ImmutableSet<E> {
    public static final RegularImmutableSet A03;
    public static final Object[] A04;
    public final transient int A00;
    public final transient int A01;
    public final transient int A02;
    public final transient Object[] elements;
    public final transient Object[] table;

    static {
        Object[] objArr = new Object[0];
        A04 = objArr;
        A03 = new RegularImmutableSet(objArr, objArr, 0, 0, 0);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int A09() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean A0B() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSet
    public final boolean A0D() {
        return true;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int A08() {
        return this.A02;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final Object[] A0A() {
        return this.elements;
    }

    @Override // com.google.common.collect.ImmutableSet
    public final ImmutableList A0C() {
        return ImmutableList.asImmutableList(this.elements, this.A02);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object target) {
        Object[] objArr = this.table;
        if (target == null || objArr.length == 0) {
            return false;
        }
        int A01 = C1Jk.A01(target.hashCode());
        while (true) {
            int i = A01 & this.A01;
            Object obj = objArr[i];
            if (obj == null) {
                return false;
            }
            if (obj.equals(target)) {
                return true;
            }
            A01 = i + 1;
        }
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int copyIntoArray(Object[] dst, int offset) {
        Object[] objArr = this.elements;
        int i = this.A02;
        System.arraycopy(objArr, 0, dst, offset, i);
        return offset + i;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.A00;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A02;
    }

    public RegularImmutableSet(Object[] elements, Object[] hashCode, int table, int mask, int size) {
        this.elements = elements;
        this.A00 = table;
        this.table = hashCode;
        this.A01 = mask;
        this.A02 = size;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final C1LC iterator() {
        return asList().iterator();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return asList().iterator();
    }
}
