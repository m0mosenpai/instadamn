package X;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes10.dex */
public final class TZO extends AbstractSequentialList implements Serializable {
    public final InterfaceC65418Tjp A00;
    public final List A01;

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.A01.clear();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new RNr(this, this.A01.listIterator(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A01.size();
    }

    public TZO(InterfaceC65418Tjp interfaceC65418Tjp, List list) {
        list.getClass();
        this.A01 = list;
        this.A00 = interfaceC65418Tjp;
    }
}
