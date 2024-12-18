package X;

/* renamed from: X.3QV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3QV {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        if (r1 == r6.A01) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r3 = 1
            if (r5 == r6) goto L28
            boolean r0 = r6 instanceof X.C3QV
            r4 = 0
            if (r0 == 0) goto L44
            X.3QV r6 = (X.C3QV) r6
            int r1 = r5.A00
            int r0 = r6.A00
            if (r1 != r0) goto L44
            r0 = 8
            if (r1 != r0) goto L29
            int r2 = r5.A01
            int r1 = r5.A02
            int r0 = r2 - r1
            int r0 = java.lang.Math.abs(r0)
            if (r0 != r3) goto L29
            int r0 = r6.A02
            if (r2 != r0) goto L29
            int r0 = r6.A01
            if (r1 != r0) goto L29
        L28:
            return r3
        L29:
            int r1 = r5.A01
            int r0 = r6.A01
            if (r1 != r0) goto L44
            int r1 = r5.A02
            int r0 = r6.A02
            if (r1 != r0) goto L44
            java.lang.Object r1 = r5.A03
            java.lang.Object r0 = r6.A03
            if (r1 == 0) goto L42
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L28
            return r4
        L42:
            if (r0 == 0) goto L28
        L44:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3QV.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return (((this.A00 * 31) + this.A02) * 31) + this.A01;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.A00;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 8) {
                        str = "??";
                    } else {
                        str = "mv";
                    }
                } else {
                    str = "up";
                }
            } else {
                str = "rm";
            }
        } else {
            str = "add";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.A02);
        sb.append("c:");
        sb.append(this.A01);
        sb.append(",p:");
        sb.append(this.A03);
        sb.append("]");
        return sb.toString();
    }
}
