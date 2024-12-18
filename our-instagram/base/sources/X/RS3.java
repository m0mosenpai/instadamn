package X;

import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [E] */
/* loaded from: classes10.dex */
public final class RS3<E> extends RSH<E> {
    public final /* synthetic */ AbstractC75163Zh A00;

    public RS3(final AbstractC75163Zh this$0) {
        this.A00 = this$0;
    }

    @Override // X.RSH, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.A00.A05();
    }
}
