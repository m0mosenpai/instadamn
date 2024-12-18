package com.google.common.collect;

import X.AbstractC166987dD;
import X.AbstractC31175DnJ;
import X.AbstractC50102Ry;
import X.AbstractC58322PtE;
import X.C18C;
import X.MSX;
import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes10.dex */
public final class GeneralRange implements Serializable {
    public final Comparator comparator;
    public final boolean hasLowerBound;
    public final boolean hasUpperBound;
    public final BoundType lowerBoundType;
    public final Object lowerEndpoint;
    public final BoundType upperBoundType;
    public final Object upperEndpoint;

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        if (r10.upperBoundType == com.google.common.collect.BoundType.OPEN) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
    
        if (r10.lowerBoundType == com.google.common.collect.BoundType.OPEN) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.common.collect.GeneralRange A00(com.google.common.collect.GeneralRange r10) {
        /*
            r9 = this;
            java.util.Comparator r1 = r9.comparator
            java.util.Comparator r0 = r10.comparator
            boolean r0 = r1.equals(r0)
            X.C18C.A0E(r0)
            boolean r7 = r9.hasLowerBound
            java.lang.Object r4 = r9.lowerEndpoint
            com.google.common.collect.BoundType r2 = r9.lowerBoundType
            if (r7 != 0) goto L5f
            boolean r7 = r10.hasLowerBound
        L15:
            java.lang.Object r4 = r10.lowerEndpoint
            com.google.common.collect.BoundType r2 = r10.lowerBoundType
        L19:
            boolean r8 = r9.hasUpperBound
            java.lang.Object r5 = r9.upperEndpoint
            com.google.common.collect.BoundType r3 = r9.upperBoundType
            if (r8 != 0) goto L48
            boolean r8 = r10.hasUpperBound
        L23:
            java.lang.Object r5 = r10.upperEndpoint
            com.google.common.collect.BoundType r3 = r10.upperBoundType
        L27:
            if (r7 == 0) goto L40
            if (r8 == 0) goto L40
            java.util.Comparator r0 = r9.comparator
            int r0 = r0.compare(r4, r5)
            if (r0 > 0) goto L3b
            if (r0 != 0) goto L40
            com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.OPEN
            if (r2 != r0) goto L40
            if (r3 != r0) goto L40
        L3b:
            com.google.common.collect.BoundType r2 = com.google.common.collect.BoundType.OPEN
            com.google.common.collect.BoundType r3 = com.google.common.collect.BoundType.CLOSED
            r4 = r5
        L40:
            java.util.Comparator r6 = r9.comparator
            com.google.common.collect.GeneralRange r1 = new com.google.common.collect.GeneralRange
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        L48:
            boolean r0 = r10.hasUpperBound
            if (r0 == 0) goto L27
            java.util.Comparator r1 = r9.comparator
            java.lang.Object r0 = r10.upperEndpoint
            int r0 = r1.compare(r5, r0)
            if (r0 > 0) goto L23
            if (r0 != 0) goto L27
            com.google.common.collect.BoundType r1 = r10.upperBoundType
            com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.OPEN
            if (r1 != r0) goto L27
            goto L23
        L5f:
            boolean r0 = r10.hasLowerBound
            if (r0 == 0) goto L19
            java.util.Comparator r1 = r9.comparator
            java.lang.Object r0 = r10.lowerEndpoint
            int r0 = r1.compare(r4, r0)
            if (r0 < 0) goto L15
            if (r0 != 0) goto L19
            com.google.common.collect.BoundType r1 = r10.lowerBoundType
            com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.OPEN
            if (r1 != r0) goto L19
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.GeneralRange.A00(com.google.common.collect.GeneralRange):com.google.common.collect.GeneralRange");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (r0 != 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A02(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r5.hasUpperBound
            r4 = 0
            if (r0 != 0) goto L6
            return r4
        L6:
            java.lang.Object r1 = r5.upperEndpoint
            java.util.Comparator r0 = r5.comparator
            int r0 = r0.compare(r6, r1)
            r3 = 1
            if (r0 > 0) goto L15
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L16
        L15:
            r2 = 0
        L16:
            com.google.common.collect.BoundType r1 = r5.upperBoundType
            com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.OPEN
            if (r1 != r0) goto L1d
            r4 = 1
        L1d:
            r2 = r2 & r4
            r2 = r2 | r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.GeneralRange.A02(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (r0 != 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A03(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r5.hasLowerBound
            r4 = 0
            if (r0 != 0) goto L6
            return r4
        L6:
            java.lang.Object r1 = r5.lowerEndpoint
            java.util.Comparator r0 = r5.comparator
            int r0 = r0.compare(r6, r1)
            r3 = 1
            if (r0 < 0) goto L15
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L16
        L15:
            r2 = 0
        L16:
            com.google.common.collect.BoundType r1 = r5.lowerBoundType
            com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.OPEN
            if (r1 != r0) goto L1d
            r4 = 1
        L1d:
            r2 = r2 & r4
            r2 = r2 | r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.GeneralRange.A03(java.lang.Object):boolean");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GeneralRange)) {
            return false;
        }
        GeneralRange generalRange = (GeneralRange) obj;
        if (!this.comparator.equals(generalRange.comparator) || this.hasLowerBound != generalRange.hasLowerBound || this.hasUpperBound != generalRange.hasUpperBound || !this.lowerBoundType.equals(generalRange.lowerBoundType) || !this.upperBoundType.equals(generalRange.upperBoundType) || !AbstractC50102Ry.A00(this.lowerEndpoint, generalRange.lowerEndpoint) || !AbstractC50102Ry.A00(this.upperEndpoint, generalRange.upperEndpoint)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC58322PtE.A09(this.comparator, this.lowerEndpoint, this.lowerBoundType, this.upperEndpoint, this.upperBoundType);
    }

    public GeneralRange(BoundType comparator, BoundType hasLowerBound, Object lowerEndpoint, Object lowerBoundType, Comparator hasUpperBound, boolean upperEndpoint, boolean upperBoundType) {
        hasUpperBound.getClass();
        this.comparator = hasUpperBound;
        this.hasLowerBound = upperEndpoint;
        this.hasUpperBound = upperBoundType;
        this.lowerEndpoint = lowerEndpoint;
        comparator.getClass();
        this.lowerBoundType = comparator;
        this.upperEndpoint = lowerBoundType;
        hasLowerBound.getClass();
        this.upperBoundType = hasLowerBound;
        if (upperEndpoint) {
            hasUpperBound.compare(lowerEndpoint, lowerEndpoint);
        }
        if (upperBoundType) {
            hasUpperBound.compare(lowerBoundType, lowerBoundType);
        }
        if (upperEndpoint && upperBoundType) {
            int compare = hasUpperBound.compare(lowerEndpoint, lowerBoundType);
            boolean z = true;
            C18C.A09(lowerEndpoint, lowerBoundType, "lowerEndpoint (%s) > upperEndpoint (%s)", AbstractC31175DnJ.A1S(compare));
            if (compare == 0) {
                BoundType boundType = BoundType.OPEN;
                if (comparator == boundType && hasLowerBound == boundType) {
                    z = false;
                }
                C18C.A0E(z);
            }
        }
    }

    public final boolean A01(Object t) {
        if (!A03(t) && !A02(t)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        Object obj;
        Object obj2;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(this.comparator);
        A1C.append(":");
        BoundType boundType = this.lowerBoundType;
        BoundType boundType2 = BoundType.CLOSED;
        char c = '(';
        if (boundType == boundType2) {
            c = '[';
        }
        A1C.append(c);
        if (this.hasLowerBound) {
            obj = this.lowerEndpoint;
        } else {
            obj = "-∞";
        }
        A1C.append(obj);
        A1C.append(',');
        if (this.hasUpperBound) {
            obj2 = this.upperEndpoint;
        } else {
            obj2 = "∞";
        }
        A1C.append(obj2);
        char c2 = ')';
        if (this.upperBoundType == boundType2) {
            c2 = ']';
        }
        return MSX.A0l(A1C, c2);
    }
}
