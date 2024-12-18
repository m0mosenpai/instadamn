package com.google.common.collect;

import X.C4VF;
import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class ComparatorOrdering extends C4VF implements Serializable {
    public static final long serialVersionUID = 0;
    public final Comparator comparator;

    @Override // java.util.Comparator
    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof ComparatorOrdering) {
            return this.comparator.equals(((ComparatorOrdering) object).comparator);
        }
        return false;
    }

    public final int hashCode() {
        return this.comparator.hashCode();
    }

    public final String toString() {
        return this.comparator.toString();
    }

    public ComparatorOrdering(Comparator comparator) {
        comparator.getClass();
        this.comparator = comparator;
    }
}
