package X;

import com.google.common.collect.TreeMultiset;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [E] */
/* loaded from: classes10.dex */
public final class RS6<E> extends RSD<E> {
    public final /* synthetic */ RQr A00;

    public RS6(final RQr this$0) {
        this.A00 = this$0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C64764TSy((TreeMultiset) this.A00.A03, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00.A03.entrySet().size();
    }
}
