package X;

import com.google.common.collect.TreeMultiset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.TSy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64764TSy implements Iterator {
    public Object A00;
    public Object A01;
    public final int A02;
    public final Object A03;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        if (r7.comparator.compare(r3, r2.A08) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
    
        if (r7.comparator.compare(r3, r2.A08) == 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C64764TSy(com.google.common.collect.TreeMultiset r7, int r8) {
        /*
            r6 = this;
            r6.A02 = r8
            r6.A03 = r7
            r6.<init>()
            X.SKi r0 = r7.A02
            java.lang.Object r1 = r0.A00
            X.SjH r1 = (X.C63393SjH) r1
            r5 = 0
            int r8 = 1 - r8
            if (r8 == 0) goto L4f
            if (r1 == 0) goto L46
            com.google.common.collect.GeneralRange r4 = r7.A00
            boolean r0 = r4.hasUpperBound
            if (r0 == 0) goto L4c
            java.lang.Object r3 = r4.upperEndpoint
            java.util.Comparator r0 = r7.comparator
            X.SjH r2 = X.C63393SjH.A05(r1, r3, r0)
            if (r2 == 0) goto L46
            com.google.common.collect.BoundType r1 = r4.upperBoundType
            com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.OPEN
            if (r1 != r0) goto L39
            java.util.Comparator r1 = r7.comparator
            java.lang.Object r0 = r2.A08
            int r0 = r1.compare(r3, r0)
            if (r0 != 0) goto L39
        L34:
            X.SjH r2 = r2.A05
            r2.getClass()
        L39:
            X.SjH r0 = r7.A01
            if (r2 == r0) goto L46
            java.lang.Object r0 = r2.A08
            boolean r0 = r4.A01(r0)
            if (r0 == 0) goto L46
            r5 = r2
        L46:
            r6.A00 = r5
            r0 = 0
            r6.A01 = r0
            return
        L4c:
            X.SjH r2 = r7.A01
            goto L34
        L4f:
            if (r1 == 0) goto L83
            com.google.common.collect.GeneralRange r4 = r7.A00
            boolean r0 = r4.hasLowerBound
            if (r0 == 0) goto L86
            java.lang.Object r3 = r4.lowerEndpoint
            java.util.Comparator r0 = r7.comparator
            X.SjH r2 = X.C63393SjH.A04(r1, r3, r0)
            if (r2 == 0) goto L83
            com.google.common.collect.BoundType r1 = r4.lowerBoundType
            com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.OPEN
            if (r1 != r0) goto L76
            java.util.Comparator r1 = r7.comparator
            java.lang.Object r0 = r2.A08
            int r0 = r1.compare(r3, r0)
            if (r0 != 0) goto L76
        L71:
            X.SjH r2 = r2.A07
            r2.getClass()
        L76:
            X.SjH r0 = r7.A01
            if (r2 == r0) goto L83
            java.lang.Object r0 = r2.A08
            boolean r0 = r4.A01(r0)
            if (r0 == 0) goto L83
            r5 = r2
        L83:
            r6.A00 = r5
            return
        L86:
            X.SjH r2 = r7.A01
            goto L71
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64764TSy.<init>(com.google.common.collect.TreeMultiset, int):void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z;
        boolean A02;
        switch (this.A02) {
            case 0:
                return ((Iterator) this.A03).hasNext();
            case 1:
                C63393SjH c63393SjH = (C63393SjH) this.A00;
                z = false;
                if (c63393SjH != null) {
                    A02 = ((TreeMultiset) this.A03).A00.A02(c63393SjH.A08);
                    break;
                }
                return z;
            default:
                C63393SjH c63393SjH2 = (C63393SjH) this.A00;
                z = false;
                if (c63393SjH2 != null) {
                    A02 = ((TreeMultiset) this.A03).A00.A03(c63393SjH2.A08);
                    break;
                }
                return z;
        }
        if (A02) {
            this.A00 = null;
            return z;
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // java.util.Iterator
    public final Object next() {
        RS0 rs0;
        C63393SjH c63393SjH;
        switch (this.A02) {
            case 0:
                Map.Entry A1K = AbstractC166987dD.A1K((Iterator) this.A03);
                this.A00 = A1K;
                return A1K.getKey();
            case 1:
                if (hasNext()) {
                    TreeMultiset treeMultiset = (TreeMultiset) this.A03;
                    C63393SjH c63393SjH2 = (C63393SjH) this.A00;
                    c63393SjH2.getClass();
                    rs0 = new RS0(c63393SjH2, treeMultiset);
                    this.A01 = rs0;
                    C63393SjH c63393SjH3 = ((C63393SjH) this.A00).A07;
                    c63393SjH3.getClass();
                    if (c63393SjH3 != treeMultiset.A01) {
                        c63393SjH = ((C63393SjH) this.A00).A07;
                        c63393SjH.getClass();
                        this.A00 = c63393SjH;
                        return rs0;
                    }
                    c63393SjH = null;
                    this.A00 = c63393SjH;
                    return rs0;
                }
                throw AbstractC58318PtA.A13();
            default:
                if (hasNext()) {
                    this.A00.getClass();
                    TreeMultiset treeMultiset2 = (TreeMultiset) this.A03;
                    C63393SjH c63393SjH4 = (C63393SjH) this.A00;
                    rs0 = new RS0(c63393SjH4, treeMultiset2);
                    this.A01 = rs0;
                    C63393SjH c63393SjH5 = c63393SjH4.A05;
                    c63393SjH5.getClass();
                    if (c63393SjH5 != treeMultiset2.A01) {
                        c63393SjH = ((C63393SjH) this.A00).A05;
                        c63393SjH.getClass();
                        this.A00 = c63393SjH;
                        return rs0;
                    }
                    c63393SjH = null;
                    this.A00 = c63393SjH;
                    return rs0;
                }
                throw AbstractC58318PtA.A13();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.A02 != 0) {
            AbstractC58321PtD.A1T(AbstractC167007dF.A1W(this.A01));
            TreeMultiset treeMultiset = (TreeMultiset) this.A03;
            Object A01 = ((AbstractC62759SPq) this.A01).A01();
            if (treeMultiset.A00.A01(A01)) {
                C62649SKi c62649SKi = treeMultiset.A02;
                C63393SjH c63393SjH = (C63393SjH) c62649SKi.A00;
                if (c63393SjH != null) {
                    c62649SKi.A00(c63393SjH, c63393SjH.A09(A01, treeMultiset.comparator, new int[1]));
                }
            }
            this.A01 = null;
            return;
        }
        AbstractC58321PtD.A1T(AbstractC167007dF.A1W(this.A00));
        Collection A0y = AbstractC58318PtA.A0y((Map.Entry) this.A00);
        ((Iterator) this.A03).remove();
        ((RRs) this.A01).A00.A00 -= A0y.size();
        A0y.clear();
        this.A00 = null;
    }

    public C64764TSy(final RRs this$1, final Iterator val$entryIterator) {
        this.A02 = 0;
        this.A01 = this$1;
        this.A03 = val$entryIterator;
    }
}
