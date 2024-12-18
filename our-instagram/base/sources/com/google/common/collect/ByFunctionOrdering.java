package com.google.common.collect;

import X.AbstractC166987dD;
import X.AbstractC37301Gc2;
import X.AbstractC58323PtF;
import X.C2n2;
import X.C4VF;
import java.io.Serializable;

/* loaded from: classes10.dex */
public final class ByFunctionOrdering extends C4VF implements Serializable {
    public static final long serialVersionUID = 0;
    public final C2n2 function;
    public final C4VF ordering;

    @Override // java.util.Comparator
    public final boolean equals(Object object) {
        if (object != this) {
            if (!(object instanceof ByFunctionOrdering)) {
                return false;
            }
            ByFunctionOrdering byFunctionOrdering = (ByFunctionOrdering) object;
            if (!this.function.equals(byFunctionOrdering.function) || !this.ordering.equals(byFunctionOrdering.ordering)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.C4VF, java.util.Comparator
    public final int compare(Object left, Object right) {
        return this.ordering.compare(this.function.apply(left), this.function.apply(right));
    }

    public final int hashCode() {
        return AbstractC37301Gc2.A02(this.function, this.ordering);
    }

    public ByFunctionOrdering(C2n2 function, C4VF ordering) {
        this.function = function;
        ordering.getClass();
        this.ordering = ordering;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(this.ordering);
        A1C.append(".onResultOf(");
        return AbstractC58323PtF.A0q(this.function, A1C);
    }
}
