package com.google.common.collect;

import X.AbstractC58318PtA;
import X.AbstractC58321PtD;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class Iterators$EmptyModifiableIterator implements Iterator {
    public static final /* synthetic */ Iterators$EmptyModifiableIterator[] A00;
    public static final Iterators$EmptyModifiableIterator A01;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractC58321PtD.A1T(false);
    }

    static {
        Iterators$EmptyModifiableIterator iterators$EmptyModifiableIterator = new Iterators$EmptyModifiableIterator();
        A01 = iterators$EmptyModifiableIterator;
        A00 = new Iterators$EmptyModifiableIterator[]{iterators$EmptyModifiableIterator};
    }

    public static Iterators$EmptyModifiableIterator valueOf(String name) {
        return (Iterators$EmptyModifiableIterator) Enum.valueOf(Iterators$EmptyModifiableIterator.class, name);
    }

    public static Iterators$EmptyModifiableIterator[] values() {
        return (Iterators$EmptyModifiableIterator[]) A00.clone();
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw AbstractC58318PtA.A13();
    }
}
