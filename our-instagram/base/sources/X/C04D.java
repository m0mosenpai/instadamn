package X;

import java.util.AbstractList;
import java.util.List;

/* renamed from: X.04D, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C04D<E> extends AbstractList<E> implements List<E>, InterfaceC019807s {
    public abstract int A0M();

    public abstract Object A0N(int i);

    @Override // java.util.AbstractList, java.util.List
    public abstract void add(int i, Object obj);

    @Override // java.util.AbstractList, java.util.List
    public abstract Object set(int i, Object obj);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return A0N(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return A0M();
    }
}
