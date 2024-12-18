package X;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.TYm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64886TYm extends AbstractCollection {
    public final /* synthetic */ TZK A00;

    public C64886TYm(TZK tzk) {
        this.A00 = tzk;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        TZK tzk = this.A00;
        Map A02 = tzk.A02();
        if (A02 != null) {
            return AbstractC166997dE.A16(A02);
        }
        return new C60701RNd(tzk);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.A00.size();
    }
}
