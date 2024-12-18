package X;

import java.util.AbstractSet;
import java.util.ArrayList;

/* renamed from: X.6Sn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC139326Sn<E> extends AbstractSet<E> {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] a) {
        ArrayList arrayList = new ArrayList(size());
        AbstractC63071Sbt.A02(arrayList, iterator());
        return arrayList.toArray(a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        ArrayList arrayList = new ArrayList(size());
        AbstractC63071Sbt.A02(arrayList, iterator());
        return arrayList.toArray();
    }
}
