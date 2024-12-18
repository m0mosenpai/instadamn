package X;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.093, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass093<T> extends AbstractC06990Yq<T> {
    public final List A00;

    @Override // X.AbstractC06990Yq, X.AbstractC17040sw, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // X.AbstractC17040sw
    public final int A08() {
        return this.A00.size();
    }

    @Override // X.AbstractC06990Yq, java.util.List
    public final Object get(int i) {
        return this.A00.get(AbstractC003400z.A11(this, i));
    }

    @Override // X.AbstractC06990Yq, java.util.List
    public final ListIterator listIterator(int i) {
        return new C16840sc(this, i);
    }

    public AnonymousClass093(List list) {
        this.A00 = list;
    }

    @Override // X.AbstractC06990Yq, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }
}
