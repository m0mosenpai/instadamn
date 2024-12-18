package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class RO0 extends RO1 {
    public final transient int A00;
    public final transient C64775TTj A01;
    public final transient Object[] A02;

    @Override // X.AbstractC64898TYy
    public final boolean A07() {
        throw C00O.createAndThrow();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00;
    }

    @Override // X.RO1
    public final RO3 A0A() {
        return new C60716RNw(this);
    }

    @Override // X.AbstractC64898TYy, java.util.AbstractCollection, java.util.Collection, java.util.Set
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
        return AbstractC58320PtC.A1X(value, this.A01.get(key));
    }

    public RO0(C64775TTj c64775TTj, Object[] objArr, int i) {
        this.A01 = c64775TTj;
        this.A02 = objArr;
        this.A00 = i;
    }

    @Override // X.AbstractC64898TYy
    public final int A08(Object[] objArr, int i) {
        return A09().A08(objArr, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return A09().listIterator(0);
    }
}
