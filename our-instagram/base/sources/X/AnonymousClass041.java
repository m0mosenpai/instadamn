package X;

import java.util.AbstractSet;

/* renamed from: X.041, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass041<E> extends AbstractSet<E> implements java.util.Set<E>, InterfaceC019007k {
    public abstract int A00();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean add(Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return A00();
    }
}
