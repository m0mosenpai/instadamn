package com.google.common.collect;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC31175DnJ;
import X.AbstractC58318PtA;
import X.AbstractC58320PtC;
import X.AbstractC58667Pzf;
import X.C18C;
import X.C4VF;
import X.C58668Pzg;
import X.InterfaceC28041Xi;
import com.google.common.collect.Cut;
import java.io.Serializable;

/* loaded from: classes10.dex */
public final class Range extends RangeGwtSerializationDependencies implements InterfaceC28041Xi, Serializable {
    public static final Range A00 = new Range(Cut.BelowAll.A00, Cut.AboveAll.A00);
    public static final long serialVersionUID = 0;
    public final Cut lowerBound;
    public final Cut upperBound;

    /* loaded from: classes10.dex */
    public class RangeLexOrdering extends C4VF implements Serializable {
        public static final C4VF A00 = new Object();
        public static final long serialVersionUID = 0;

        @Override // X.C4VF, java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(Object left, Object right) {
            AbstractC58667Pzf abstractC58667Pzf;
            Range range = (Range) left;
            Range range2 = (Range) right;
            AbstractC58667Pzf abstractC58667Pzf2 = AbstractC58667Pzf.A00;
            int compareTo = range.lowerBound.compareTo(range2.lowerBound);
            if (compareTo < 0) {
                abstractC58667Pzf = AbstractC58667Pzf.A02;
            } else if (compareTo > 0) {
                abstractC58667Pzf = AbstractC58667Pzf.A01;
            } else {
                abstractC58667Pzf = AbstractC58667Pzf.A00;
            }
            Cut cut = range.upperBound;
            Cut cut2 = range2.upperBound;
            if (!(abstractC58667Pzf instanceof C58668Pzg)) {
                int compareTo2 = cut.compareTo(cut2);
                if (compareTo2 < 0) {
                    abstractC58667Pzf = AbstractC58667Pzf.A02;
                } else if (compareTo2 > 0) {
                    abstractC58667Pzf = AbstractC58667Pzf.A01;
                } else {
                    abstractC58667Pzf = AbstractC58667Pzf.A00;
                }
            }
            return abstractC58667Pzf.A00();
        }
    }

    public final Range A01(Range connectedRange) {
        Cut cut;
        Cut cut2;
        int A002 = this.lowerBound.A00(connectedRange.lowerBound);
        int A003 = this.upperBound.A00(connectedRange.upperBound);
        if (A002 >= 0) {
            if (A003 <= 0) {
                return this;
            }
            if (A002 > 0) {
                cut = this.lowerBound;
                cut2 = connectedRange.upperBound;
            } else {
                return connectedRange;
            }
        } else if (A003 < 0) {
            cut = connectedRange.lowerBound;
            cut2 = this.upperBound;
        } else {
            return connectedRange;
        }
        C18C.A09(this, connectedRange, "intersection is undefined for disconnected ranges %s and %s", AbstractC31175DnJ.A1S(cut.A00(cut2)));
        return new Range(cut, cut2);
    }

    @Override // X.InterfaceC28041Xi
    @Deprecated
    public final /* bridge */ /* synthetic */ boolean apply(Object input) {
        Comparable comparable = (Comparable) input;
        comparable.getClass();
        if (this.lowerBound.A04(comparable) && !this.upperBound.A04(comparable)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC28041Xi
    public final boolean equals(Object object) {
        if (!(object instanceof Range)) {
            return false;
        }
        Range range = (Range) object;
        if (!this.lowerBound.equals(range.lowerBound)) {
            return false;
        }
        return AbstractC58320PtC.A1X(this.upperBound, range.upperBound);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.upperBound, AbstractC166987dD.A0G(this.lowerBound));
    }

    public Object readResolve() {
        Range range = A00;
        if (equals(range)) {
            return range;
        }
        return this;
    }

    public final String toString() {
        Cut cut = this.lowerBound;
        Cut cut2 = this.upperBound;
        StringBuilder A0q = AbstractC58318PtA.A0q(16);
        cut.A02(A0q);
        A0q.append("..");
        cut2.A03(A0q);
        return A0q.toString();
    }

    public Range(Cut lowerBound, Cut upperBound) {
        lowerBound.getClass();
        this.lowerBound = lowerBound;
        upperBound.getClass();
        this.upperBound = upperBound;
        if (lowerBound.A00(upperBound) <= 0 && lowerBound != Cut.AboveAll.A00 && upperBound != Cut.BelowAll.A00) {
            return;
        }
        StringBuilder A0q = AbstractC58318PtA.A0q(16);
        lowerBound.A02(A0q);
        A0q.append("..");
        upperBound.A03(A0q);
        throw AbstractC167007dF.A0c("Invalid range: ", A0q.toString());
    }

    public static Range A00(Comparable lower, Comparable upper) {
        lower.getClass();
        Cut cut = new Cut(lower);
        upper.getClass();
        return new Range(cut, new Cut(upper));
    }
}
