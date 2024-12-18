package X;

import com.google.common.collect.LinkedHashMultimap;
import java.util.Iterator;

/* renamed from: X.TSj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64750TSj implements Iterator {
    public LinkedHashMultimap.ValueEntry A00;
    public LinkedHashMultimap.ValueEntry A01;
    public final /* synthetic */ LinkedHashMultimap A02;

    public C64750TSj(final LinkedHashMultimap this$0) {
        this.A02 = this$0;
        LinkedHashMultimap.ValueEntry valueEntry = this$0.A00.successorInMultimap;
        valueEntry.getClass();
        this.A00 = valueEntry;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return AbstractC25229BEm.A1a(this.A00, this.A02.A00);
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractC58321PtD.A1T(AbstractC167007dF.A1W(this.A01));
        LinkedHashMultimap linkedHashMultimap = this.A02;
        LinkedHashMultimap.ValueEntry valueEntry = this.A01;
        linkedHashMultimap.remove(valueEntry.getKey(), valueEntry.getValue());
        this.A01 = null;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            LinkedHashMultimap.ValueEntry valueEntry = this.A00;
            this.A01 = valueEntry;
            LinkedHashMultimap.ValueEntry valueEntry2 = valueEntry.successorInMultimap;
            valueEntry2.getClass();
            this.A00 = valueEntry2;
            return valueEntry;
        }
        throw AbstractC58318PtA.A13();
    }
}
