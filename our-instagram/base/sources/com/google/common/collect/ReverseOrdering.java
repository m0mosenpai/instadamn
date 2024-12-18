package com.google.common.collect;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.C4VF;
import java.io.Serializable;

/* loaded from: classes10.dex */
public final class ReverseOrdering extends C4VF implements Serializable {
    public static final long serialVersionUID = 0;
    public final C4VF forwardOrder;

    @Override // X.C4VF
    public final C4VF A01() {
        return this.forwardOrder;
    }

    @Override // X.C4VF, java.util.Comparator
    public final int compare(Object a, Object b) {
        return this.forwardOrder.compare(b, a);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof ReverseOrdering) {
            return this.forwardOrder.equals(((ReverseOrdering) object).forwardOrder);
        }
        return false;
    }

    public final int hashCode() {
        return -this.forwardOrder.hashCode();
    }

    public ReverseOrdering(C4VF forwardOrder) {
        this.forwardOrder = forwardOrder;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(this.forwardOrder);
        return AbstractC166997dE.A0x(".reverse()", A1C);
    }
}
