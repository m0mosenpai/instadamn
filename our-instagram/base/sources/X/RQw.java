package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes10.dex */
public final class RQw<K, V> extends AbstractC60762RQy<Map.Entry<K, V>> {
    public final /* synthetic */ RRj A00;

    public RQw(final RRj this$0) {
        this.A00 = this$0;
    }

    @Override // X.AbstractC451425u
    public final /* bridge */ /* synthetic */ Object A00() {
        return this.A00.A00;
    }

    @Override // X.AbstractC451325t
    public final /* bridge */ /* synthetic */ Collection A01() {
        return this.A00.A00;
    }

    @Override // X.AbstractC451325t, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new RSM(this, this.A00.A00.iterator(), 2);
    }
}
