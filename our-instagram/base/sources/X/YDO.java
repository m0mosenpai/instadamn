package X;

import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class YDO implements YRP {
    public HashSet A00 = AbstractC166987dD.A1H();

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof YDO) {
            return this.A00.equals(((YDO) obj).A00);
        }
        return false;
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
}
