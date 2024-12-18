package X;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.5Ha, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC114895Ha<E> extends AbstractC06990Yq<E> implements C5Hb<E> {
    @Override // X.C5Hc
    /* renamed from: Ep2 */
    public final C64933Ta9 subList(int i, int i2) {
        return new C64933Ta9(this, 0, i2);
    }

    @Override // X.AbstractC06990Yq, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // X.AbstractC06990Yq, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return new C64933Ta9(this, i, i2);
    }

    @Override // X.AbstractC17040sw, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC06990Yq, X.AbstractC17040sw, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }
}
