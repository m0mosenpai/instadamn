package com.google.common.collect;

import X.AbstractC166987dD;
import X.C18C;
import X.C1LC;
import X.S34;
import com.google.common.collect.Range;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes10.dex */
public class ImmutableRangeMap implements Serializable {
    public static final ImmutableRangeMap A02 = new ImmutableRangeMap(ImmutableList.of(), ImmutableList.of());
    public static final long serialVersionUID = 0;
    public final transient ImmutableList A00;
    public final transient ImmutableList A01;

    /* loaded from: classes10.dex */
    public class SerializedForm implements Serializable {
        public static final long serialVersionUID = 0;
        public final ImmutableMap mapOfRanges;

        public Object readResolve() {
            if (this.mapOfRanges.isEmpty()) {
                return ImmutableRangeMap.A02;
            }
            ArrayList A1E = AbstractC166987dD.A1E();
            C1LC it = this.mapOfRanges.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(it);
                Range range = (Range) A1K.getKey();
                Object value = A1K.getValue();
                range.getClass();
                value.getClass();
                C18C.A0A(range, "Range must not be empty, but was %s", !range.lowerBound.equals(range.upperBound));
                A1E.add(new ImmutableEntry(range, value));
            }
            return S34.A00(A1E);
        }

        public SerializedForm(ImmutableMap mapOfRanges) {
            this.mapOfRanges = mapOfRanges;
        }
    }

    private void readObject(ObjectInputStream stream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public final ImmutableMap A00() {
        ImmutableList immutableList = this.A00;
        if (immutableList.isEmpty()) {
            return RegularImmutableMap.A02;
        }
        RegularImmutableSortedSet regularImmutableSortedSet = RegularImmutableSortedSet.A00;
        Range range = Range.A00;
        return new ImmutableSortedMap(this.A01, null, new RegularImmutableSortedSet(immutableList, Range.RangeLexOrdering.A00));
    }

    public final boolean equals(Object o) {
        if (o instanceof ImmutableRangeMap) {
            return A00().equals(((ImmutableRangeMap) o).A00());
        }
        return false;
    }

    public ImmutableRangeMap(ImmutableList ranges, ImmutableList values) {
        this.A00 = ranges;
        this.A01 = values;
    }

    public final int hashCode() {
        return A00().hashCode();
    }

    public final String toString() {
        return A00().toString();
    }

    public Object writeReplace() {
        return new SerializedForm(A00());
    }
}
