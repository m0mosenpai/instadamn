package X;

import java.util.Iterator;

/* renamed from: X.RNl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60709RNl extends AbstractC60703RNf {
    public final transient AbstractC60708RNk A00;
    public final transient C64774TTi A01;

    @Override // X.AbstractC64896TYw, java.util.AbstractCollection, java.util.Collection, java.util.List
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

    public C60709RNl(AbstractC60708RNk abstractC60708RNk, C64774TTi c64774TTi) {
        this.A01 = c64774TTi;
        this.A00 = abstractC60708RNk;
    }
}
