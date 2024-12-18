package X;

import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [E] */
/* loaded from: classes10.dex */
public class RS5<E> extends RSD<E> {
    public final /* synthetic */ AbstractC75163Zh A00;

    public RS5(final AbstractC75163Zh this$0) {
        this.A00 = this$0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.A00.A06();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00.A03();
    }
}
