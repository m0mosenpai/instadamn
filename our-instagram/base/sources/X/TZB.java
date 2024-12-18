package X;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes10.dex */
public final class TZB extends AbstractList<String> implements InterfaceC65683Ts5, RandomAccess {
    public final InterfaceC65683Ts5 A00;

    @Override // X.InterfaceC65683Ts5
    public final InterfaceC65683Ts5 CCp() {
        return this;
    }

    @Override // X.InterfaceC65683Ts5
    public final List CCQ() {
        return this.A00.CCQ();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.A00.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new TT4(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new TT6(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00.size();
    }

    public TZB(InterfaceC65683Ts5 interfaceC65683Ts5) {
        this.A00 = interfaceC65683Ts5;
    }
}
