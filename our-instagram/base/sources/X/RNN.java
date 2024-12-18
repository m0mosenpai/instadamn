package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class RNN extends RNO {
    public final transient int A00;
    public final transient Object[] A01;
    public final transient C64773TTh A02;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00;
    }

    @Override // X.AbstractC64895TYv, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        if (value == null) {
            return false;
        }
        return AbstractC58320PtC.A1X(value, this.A02.get(key));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        RNL rnl = super.A00;
        if (rnl == null) {
            rnl = new RNH(this);
            super.A00 = rnl;
        }
        return rnl.listIterator(0);
    }

    public RNN(C64773TTh c64773TTh, Object[] objArr, int i) {
        this.A02 = c64773TTh;
        this.A01 = objArr;
        this.A00 = i;
    }
}
