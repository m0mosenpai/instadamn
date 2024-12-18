package com.google.common.collect;

import X.C4VF;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class ReverseNaturalOrdering extends C4VF implements Serializable {
    public static final ReverseNaturalOrdering A00 = new Object();
    public static final long serialVersionUID = 0;

    public final String toString() {
        return "Ordering.natural().reverse()";
    }

    private Object readResolve() {
        return A00;
    }

    @Override // X.C4VF
    public final C4VF A01() {
        return NaturalOrdering.A00;
    }

    @Override // X.C4VF, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object left, Object right) {
        Comparable comparable = (Comparable) right;
        left.getClass();
        if (left == comparable) {
            return 0;
        }
        return comparable.compareTo(left);
    }
}
