package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class RN7 extends RN8 {
    public final transient int A00;
    public final transient Object[] A01;
    public final transient C64772TTg A02;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00;
    }

    @Override // X.AbstractC64894TYu, java.util.AbstractCollection, java.util.Collection, java.util.List
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
        RN5 rn5 = super.A00;
        if (rn5 == null) {
            rn5 = new RN1(this);
            super.A00 = rn5;
        }
        return rn5.listIterator(0);
    }

    public RN7(C64772TTg c64772TTg, Object[] objArr, int i) {
        this.A02 = c64772TTg;
        this.A01 = objArr;
        this.A00 = i;
    }
}
