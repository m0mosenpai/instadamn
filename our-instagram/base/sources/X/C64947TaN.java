package X;

import java.util.Iterator;

/* renamed from: X.TaN, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64947TaN<K, V> extends AbstractC06970Yo<K> implements InterfaceC65696TsI<K> {
    public final C6LT A00;

    @Override // X.AbstractC17040sw
    public final int A08() {
        return this.A00.size();
    }

    @Override // X.AbstractC17040sw, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.A00.containsKey(obj);
    }

    @Override // X.AbstractC17040sw, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new TT9(this.A00);
    }

    public C64947TaN(C6LT c6lt) {
        this.A00 = c6lt;
    }
}
