package com.google.common.collect;

import X.AnonymousClass001;
import X.C1LC;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class SingletonImmutableSet<E> extends ImmutableSet<E> {
    public final transient Object A00;

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean A0B() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public final ImmutableList asList() {
        return ImmutableList.of(this.A00);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object target) {
        return this.A00.equals(target);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int copyIntoArray(Object[] dst, int offset) {
        dst[offset] = this.A00;
        return offset + 1;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.A00.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.1LC] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.49k, X.1LC] */
    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final C1LC iterator() {
        Object obj = this.A00;
        if (obj != null) {
            ?? obj2 = new Object();
            obj2.A00 = obj;
            return obj2;
        }
        return new Object();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return AnonymousClass001.A0E(this.A00.toString(), '[', ']');
    }

    public SingletonImmutableSet(Object element) {
        element.getClass();
        this.A00 = element;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
