package X;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
/* loaded from: classes10.dex */
public final class TZ4 extends AbstractList implements InterfaceC65682Ts4, RandomAccess {
    public final InterfaceC65682Ts4 A00;

    @Override // X.InterfaceC65682Ts4
    public final InterfaceC65682Ts4 FGB() {
        return this;
    }

    @Override // X.InterfaceC65682Ts4
    public final List FGR() {
        return this.A00.FGR();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((RLK) this.A00).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new TSZ(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new TTO(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00.size();
    }

    public TZ4(InterfaceC65682Ts4 interfaceC65682Ts4) {
        this.A00 = interfaceC65682Ts4;
    }
}
