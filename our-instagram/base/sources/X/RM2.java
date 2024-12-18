package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class RM2 extends RM5 {
    public final /* synthetic */ RM0 A00;

    public RM2(RM0 rm0) {
        this.A00 = rm0;
    }

    @Override // X.AbstractC64897TYx, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.A00.get(entry.getKey());
        if (obj2 == null) {
            return false;
        }
        return AbstractC58320PtC.A1X(obj2, entry.getValue());
    }

    @Override // X.RM5, java.util.Collection, java.util.Set
    public final int hashCode() {
        Iterator it = this.A00.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += AbstractC25235BEs.A06(it.next());
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return A08().listIterator(0);
    }

    public RM2() {
    }
}
