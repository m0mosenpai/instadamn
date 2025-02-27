package com.google.common.collect;

import X.C4VF;
import java.io.Serializable;

/* loaded from: classes10.dex */
public final class NaturalOrdering extends C4VF implements Serializable {
    public static final NaturalOrdering A00 = new Object();
    public static final long serialVersionUID = 0;

    public final String toString() {
        return "Ordering.natural()";
    }

    private Object readResolve() {
        return A00;
    }

    @Override // X.C4VF
    public final C4VF A01() {
        return ReverseNaturalOrdering.A00;
    }

    @Override // X.C4VF, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object left, Object right) {
        Comparable comparable = (Comparable) left;
        comparable.getClass();
        right.getClass();
        return comparable.compareTo(right);
    }
}
