package X;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableEntry;
import com.google.common.collect.ImmutableMultimap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class RSU extends C1LC {
    public Object A00 = null;
    public Iterator A01 = RQ2.A01;
    public final Iterator A02;
    public final /* synthetic */ ImmutableMultimap A03;

    public RSU(final ImmutableMultimap this$0) {
        this.A03 = this$0;
        this.A02 = this$0.A01.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.A01.hasNext() && !this.A02.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.A01.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(this.A02);
            this.A00 = A1K.getKey();
            this.A01 = ((ImmutableCollection) A1K.getValue()).iterator();
        }
        Object obj = this.A00;
        obj.getClass();
        return new ImmutableEntry(obj, this.A01.next());
    }
}
