package X;

import java.util.Iterator;

/* renamed from: X.RQj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60757RQj extends AbstractC58576Pxu {
    public final Iterable A00;

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.A00.iterator();
        it.getClass();
        if (it instanceof C1LC) {
            return it;
        }
        return new RSQ(it);
    }

    @Override // X.AbstractC58576Pxu
    public final String toString() {
        return this.A00.toString();
    }

    public C60757RQj(Iterable iterable) {
        this.A00 = iterable;
    }
}
