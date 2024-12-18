package X;

import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [K] */
/* renamed from: X.RPv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60752RPv<K> extends ConcurrentMapC200188tN<K, V>.AbstractCacheSet<K> {
    public final /* synthetic */ ConcurrentMapC200188tN A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60752RPv(final ConcurrentMapC200188tN this$0) {
        super(this$0);
        this.A00 = this$0;
    }

    public final boolean contains(Object o) {
        return this.A00.containsKey(o);
    }

    public final Iterator iterator() {
        return new B0V(this.A00);
    }

    public final boolean remove(Object o) {
        return AbstractC167007dF.A1W(this.A00.remove(o));
    }
}
