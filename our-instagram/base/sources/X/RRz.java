package X;

import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes10.dex */
public class RRz<K, V> extends AbstractC64887TYn<K, V> {
    public final /* synthetic */ AbstractC917849c A00;

    public RRz(final AbstractC917849c this$0) {
        this.A00 = this$0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.A00.A05();
    }
}
