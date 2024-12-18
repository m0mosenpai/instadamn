package X;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class YDP implements YRP {
    public ArrayList A00;

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof YDP) {
            return this.A00.equals(((YDP) obj).A00);
        }
        return false;
    }

    public final void A00(Object obj) {
        this.A00.add(obj);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.YRP, java.lang.Iterable
    public final Iterator iterator() {
        return this.A00.iterator();
    }

    @Override // X.YRP
    public final int size() {
        return this.A00.size();
    }

    public YDP(YRP yrp) {
        this.A00 = AbstractC25225BEi.A17(yrp.size());
        Iterator it = yrp.iterator();
        while (it.hasNext()) {
            A00(it.next());
        }
    }

    public YDP() {
        this.A00 = AbstractC166987dD.A1E();
    }
}
