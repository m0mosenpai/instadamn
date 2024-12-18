package X;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
/* loaded from: classes10.dex */
public final class TZ7 extends AbstractList<String> implements InterfaceC65686Ts8, RandomAccess {
    public final InterfaceC65686Ts8 A00;

    @Override // X.InterfaceC65686Ts8
    public final InterfaceC65686Ts8 CCn() {
        return this;
    }

    @Override // X.InterfaceC65686Ts8
    public final Object BkU(int index) {
        return this.A00.BkU(index);
    }

    @Override // X.InterfaceC65686Ts8
    public final List CCQ() {
        return this.A00.CCQ();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int index) {
        return this.A00.get(index);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new TT4(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(final int index) {
        return new TT6(this, index);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00.size();
    }

    public TZ7(InterfaceC65686Ts8 list) {
        this.A00 = list;
    }

    @Override // X.InterfaceC65686Ts8
    public final void A7f(AbstractC58536Px4 element) {
        throw AbstractC43592JPx.A11();
    }
}
