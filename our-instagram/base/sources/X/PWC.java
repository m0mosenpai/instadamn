package X;

import java.util.List;

/* loaded from: classes9.dex */
public final class PWC<T> extends AbstractC06990Yq<T> {
    public final List A00;
    public final int A01;
    public final int A02;

    @Override // X.AbstractC17040sw
    public final int A08() {
        return AbstractC31172DnG.A02(this.A00, this.A02) + this.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0005, code lost:
    
        if (r5 >= r4.A02) goto L5;
     */
    @Override // X.AbstractC06990Yq, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(int r5) {
        /*
            r4 = this;
            if (r5 < 0) goto L7
            int r1 = r4.A02
            r0 = 1
            if (r5 < r1) goto L8
        L7:
            r0 = 0
        L8:
            r3 = 0
            if (r0 != 0) goto L1d
            int r2 = r4.A02
            java.util.List r1 = r4.A00
            int r0 = r1.size()
            int r0 = r0 + r2
            if (r5 >= r0) goto L1e
            if (r2 > r5) goto L1e
            int r5 = r5 - r2
            java.lang.Object r3 = r1.get(r5)
        L1d:
            return r3
        L1e:
            int r1 = X.AbstractC31172DnG.A02(r1, r2)
            int r0 = r4.size()
            if (r5 >= r0) goto L2b
            if (r1 > r5) goto L2b
            return r3
        L2b:
            java.lang.String r2 = "Illegal attempt to access index "
            java.lang.String r1 = " in ItemSnapshotList of size "
            int r0 = r4.size()
            java.lang.IndexOutOfBoundsException r0 = X.AbstractC25229BEm.A0l(r2, r1, r5, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PWC.get(int):java.lang.Object");
    }

    public PWC(List list, int i, int i2) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = list;
    }
}
