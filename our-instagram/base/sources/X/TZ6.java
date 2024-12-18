package X;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
/* loaded from: classes10.dex */
public final class TZ6 extends AbstractList implements InterfaceC65685Ts7, RandomAccess {
    public final InterfaceC65685Ts7 A00;

    @Override // X.InterfaceC65685Ts7
    public final InterfaceC65685Ts7 FGD() {
        return this;
    }

    @Override // X.InterfaceC65685Ts7
    public final Object FGK(int i) {
        return this.A00.FGK(i);
    }

    @Override // X.InterfaceC65685Ts7
    public final List FGW() {
        return this.A00.FGW();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((ROA) this.A00).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C64742TSb(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new TTP(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00.size();
    }

    public TZ6(InterfaceC65685Ts7 interfaceC65685Ts7) {
        this.A00 = interfaceC65685Ts7;
    }

    @Override // X.InterfaceC65685Ts7
    public final void FGd(AbstractC64539TIv abstractC64539TIv) {
        throw AbstractC43592JPx.A11();
    }
}
