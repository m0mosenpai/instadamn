package X;

/* renamed from: X.SNl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62721SNl {
    public final int A00;
    public final String A01;
    public final String A02;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        if (r1.equals(r0) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L36
            r2 = 0
            if (r5 == 0) goto L24
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L24
            X.SNl r5 = (X.C62721SNl) r5
            int r1 = r4.A00
            int r0 = r5.A00
            if (r1 != r0) goto L24
            java.lang.String r1 = r4.A01
            java.lang.String r0 = r5.A01
            if (r1 == 0) goto L25
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L28
        L24:
            return r2
        L25:
            if (r0 == 0) goto L28
            return r2
        L28:
            java.lang.String r1 = r4.A02
            java.lang.String r0 = r5.A02
            if (r1 == 0) goto L33
            boolean r2 = r1.equals(r0)
            return r2
        L33:
            if (r0 == 0) goto L36
            r3 = 0
        L36:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62721SNl.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return ((((this.A00 * 31) + AbstractC31177DnL.A04(this.A01)) * 31) + AbstractC58321PtD.A0D(this.A02)) * 31;
    }

    public C62721SNl(String str, String str2, int i) {
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
    }
}
