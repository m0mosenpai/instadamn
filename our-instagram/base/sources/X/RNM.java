package X;

import java.util.Iterator;

/* loaded from: classes10.dex */
public final class RNM extends RNO {
    public final transient RNL A00;
    public final transient C64773TTh A01;

    @Override // X.AbstractC64895TYv, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return AbstractC167007dF.A1W(this.A01.get(obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.A00.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A01.size();
    }

    public RNM(RNL rnl, C64773TTh c64773TTh) {
        this.A01 = c64773TTh;
        this.A00 = rnl;
    }
}
