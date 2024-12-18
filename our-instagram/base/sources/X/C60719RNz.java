package X;

import java.util.Iterator;

/* renamed from: X.RNz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60719RNz extends RO1 {
    public final transient RO3 A00;
    public final transient C64775TTj A01;

    @Override // X.AbstractC64898TYy
    public final boolean A07() {
        throw C00O.createAndThrow();
    }

    @Override // X.RO1, X.AbstractC64898TYy
    public final RO3 A09() {
        return this.A00;
    }

    @Override // X.AbstractC64898TYy
    public final int A08(Object[] objArr, int i) {
        return this.A00.A08(objArr, 0);
    }

    @Override // X.AbstractC64898TYy, java.util.AbstractCollection, java.util.Collection, java.util.Set
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

    public C60719RNz(RO3 ro3, C64775TTj c64775TTj) {
        this.A01 = c64775TTj;
        this.A00 = ro3;
    }
}
