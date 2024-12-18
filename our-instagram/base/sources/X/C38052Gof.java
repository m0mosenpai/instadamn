package X;

/* renamed from: X.Gof, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38052Gof extends C0T6 {
    public String A00;
    public boolean A01;
    public boolean A02;
    public final int A03;

    public C38052Gof(String str, boolean z, boolean z2, int i) {
        this.A03 = i;
        switch (i) {
            case 0:
            case 3:
            case 4:
                this.A02 = z;
                this.A01 = z2;
                break;
            case 1:
            case 2:
            default:
                this.A01 = z;
                this.A02 = z2;
                break;
        }
        this.A00 = str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0028 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A03
            switch(r0) {
                case 0: goto L2a;
                case 1: goto L2e;
                case 2: goto L52;
                case 3: goto L6a;
                default: goto L5;
            }
        L5:
            if (r2 == r3) goto L6e
            r1 = 4
        L8:
            boolean r0 = r3 instanceof X.C38052Gof
            if (r0 == 0) goto L28
            X.Gof r3 = (X.C38052Gof) r3
            int r0 = r3.A03
            if (r0 != r1) goto L28
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 != r0) goto L28
            boolean r1 = r2.A01
            boolean r0 = r3.A01
        L1c:
            if (r1 != r0) goto L28
            java.lang.String r1 = r2.A00
            java.lang.String r0 = r3.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L6e
        L28:
            r0 = 0
            return r0
        L2a:
            if (r2 == r3) goto L6e
            r1 = 0
            goto L8
        L2e:
            if (r2 == r3) goto L6e
            r1 = 1
            boolean r0 = r3 instanceof X.C38052Gof
            if (r0 == 0) goto L28
            X.Gof r3 = (X.C38052Gof) r3
            int r0 = r3.A03
            if (r0 != r1) goto L28
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 != r0) goto L28
            java.lang.String r1 = r2.A00
            java.lang.String r0 = r3.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L28
            boolean r1 = r2.A01
            boolean r0 = r3.A01
            if (r1 == r0) goto L6e
            goto L28
        L52:
            if (r2 == r3) goto L6e
            r1 = 2
            boolean r0 = r3 instanceof X.C38052Gof
            if (r0 == 0) goto L28
            X.Gof r3 = (X.C38052Gof) r3
            int r0 = r3.A03
            if (r0 != r1) goto L28
            boolean r1 = r2.A01
            boolean r0 = r3.A01
            if (r1 != r0) goto L28
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            goto L1c
        L6a:
            if (r2 == r3) goto L6e
            r1 = 3
            goto L8
        L6e:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38052Gof.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int A0K;
        int i;
        int A08;
        boolean z;
        switch (this.A03) {
            case 1:
                A0K = AbstractC166997dE.A0K(this.A00, AbstractC25225BEi.A08(this.A02));
                i = 1237;
                if (this.A01) {
                    i = 1231;
                    break;
                }
                break;
            case 2:
                A08 = AbstractC25225BEi.A08(this.A01);
                z = this.A02;
                A0K = AbstractC167007dF.A0D(z, A08);
                i = AbstractC167017dG.A0O(this.A00);
                break;
            default:
                A08 = AbstractC25225BEi.A08(this.A02);
                z = this.A01;
                A0K = AbstractC167007dF.A0D(z, A08);
                i = AbstractC167017dG.A0O(this.A00);
                break;
        }
        return A0K + i;
    }

    public C38052Gof(String str, boolean z, boolean z2) {
        this.A03 = 1;
        C14360o3.A0B(str, 2);
        this.A02 = z;
        this.A00 = str;
        this.A01 = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C38052Gof(int r3, int r4, boolean r5, boolean r6) {
        /*
            r2 = this;
            r1 = 0
            r2.A03 = r4
            switch(r4) {
                case 0: goto L17;
                case 1: goto L6;
                case 2: goto Lb;
                default: goto L6;
            }
        L6:
            r0 = 4
        L7:
            r2.<init>(r1, r5, r6, r0)
            return
        Lb:
            r0 = r3 & 1
            if (r0 == 0) goto L10
            r5 = 0
        L10:
            r0 = r3 & 2
            if (r0 == 0) goto L15
            r6 = 0
        L15:
            r0 = 2
            goto L7
        L17:
            r0 = r3 & 1
            if (r0 == 0) goto L1c
            r5 = 0
        L1c:
            r0 = r3 & 2
            if (r0 == 0) goto L21
            r6 = 0
        L21:
            r0 = 0
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38052Gof.<init>(int, int, boolean, boolean):void");
    }
}
