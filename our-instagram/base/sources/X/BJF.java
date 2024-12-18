package X;

/* loaded from: classes5.dex */
public final class BJF extends C0T6 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BJF(java.lang.String r3, java.lang.String r4, int r5, int r6, boolean r7) {
        /*
            r2 = this;
            r2.A00 = r6
            switch(r6) {
                case 2: goto L21;
                case 3: goto Lf;
                default: goto L5;
            }
        L5:
            r0 = r5 & 4
            if (r0 == 0) goto La
            r7 = 0
        La:
            r0 = 4
        Lb:
            r2.<init>(r3, r4, r0, r7)
            return
        Lf:
            r0 = r5 & 1
            r1 = 0
            if (r0 == 0) goto L15
            r3 = r1
        L15:
            r0 = r5 & 2
            if (r0 == 0) goto L1a
            r4 = r1
        L1a:
            r0 = r5 & 4
            if (r0 == 0) goto L1f
            r7 = 0
        L1f:
            r0 = 3
            goto Lb
        L21:
            r0 = r5 & 4
            if (r0 == 0) goto L26
            r7 = 0
        L26:
            r0 = 2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BJF.<init>(java.lang.String, java.lang.String, int, int, boolean):void");
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A00) {
            case 1:
                if (this != obj) {
                    if (!(obj instanceof BJF)) {
                        return false;
                    }
                    BJF bjf = (BJF) obj;
                    if (bjf.A00 != 1 || !C14360o3.A0K(this.A01, bjf.A01) || this.A03 != bjf.A03 || !C14360o3.A0K(this.A02, bjf.A02)) {
                        return false;
                    }
                    return true;
                }
                return true;
            case 2:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
            case 3:
                if (this != obj) {
                    i = 3;
                    break;
                } else {
                    return true;
                }
            case 4:
                if (this != obj) {
                    i = 4;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 5;
                    break;
                } else {
                    return true;
                }
        }
        if (obj instanceof BJF) {
            BJF bjf2 = (BJF) obj;
            if (bjf2.A00 != i || !C14360o3.A0K(this.A01, bjf2.A01) || !C14360o3.A0K(this.A02, bjf2.A02) || this.A03 != bjf2.A03) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 1: goto L2d;
                case 2: goto L5;
                case 3: goto L1d;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = r3.A01
            int r1 = X.AbstractC166987dD.A0J(r0)
            java.lang.String r0 = r3.A02
            int r1 = X.AbstractC25226BEj.A03(r0, r1)
        L11:
            int r2 = r1 * 31
            boolean r1 = r3.A03
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L1b
            r0 = 1231(0x4cf, float:1.725E-42)
        L1b:
            int r2 = r2 + r0
            return r2
        L1d:
            java.lang.String r0 = r3.A01
            int r0 = X.AbstractC167017dG.A0O(r0)
            int r1 = r0 * 31
            java.lang.String r0 = r3.A02
            int r0 = X.AbstractC25227BEk.A07(r0)
            int r1 = r1 + r0
            goto L11
        L2d:
            java.lang.String r0 = r3.A01
            int r2 = X.AbstractC166987dD.A0J(r0)
            boolean r1 = r3.A03
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L3b
            r0 = 1231(0x4cf, float:1.725E-42)
        L3b:
            int r2 = r2 + r0
            int r2 = r2 * 31
            java.lang.String r0 = r3.A02
            int r0 = r0.hashCode()
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BJF.hashCode():int");
    }

    public BJF(String str, String str2, int i, boolean z) {
        this.A00 = i;
        switch (i) {
            case 2:
            case 4:
            case 5:
                AbstractC167017dG.A1P(str, str2);
                break;
        }
        this.A01 = str;
        this.A02 = str2;
        this.A03 = z;
    }

    public BJF(String str, boolean z, String str2) {
        this.A00 = 1;
        AbstractC167007dF.A1E(str, 1, str2);
        this.A01 = str;
        this.A03 = z;
        this.A02 = str2;
    }
}
