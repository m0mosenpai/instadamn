package X;

import java.util.Iterator;

/* loaded from: classes10.dex */
public final class RN6 extends RN8 {
    public final transient RN5 A00;
    public final transient C64772TTg A01;

    @Override // X.AbstractC64894TYu, java.util.AbstractCollection, java.util.Collection, java.util.List
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

    public RN6(RN5 rn5, C64772TTg c64772TTg) {
        this.A01 = c64772TTg;
        this.A00 = rn5;
    }
}
