package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.RNm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60710RNm extends AbstractC60703RNf {
    public final transient int A00;
    public final transient Object[] A01;
    public final transient C64774TTi A02;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00;
    }

    @Override // X.AbstractC64896TYw, java.util.AbstractCollection, java.util.Collection, java.util.List
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
        AbstractC60708RNk abstractC60708RNk = super.A00;
        if (abstractC60708RNk == null) {
            abstractC60708RNk = new C60704RNg(this);
            super.A00 = abstractC60708RNk;
        }
        return abstractC60708RNk.listIterator(0);
    }

    public C60710RNm(C64774TTi c64774TTi, Object[] objArr, int i) {
        this.A02 = c64774TTi;
        this.A01 = objArr;
        this.A00 = i;
    }
}
