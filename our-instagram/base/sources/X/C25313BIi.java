package X;

/* renamed from: X.BIi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25313BIi extends C0T6 {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final String A03;
    public final boolean A04;

    public C25313BIi(String str, C5Hc c5Hc, int i, int i2, boolean z) {
        this.A00 = i2;
        C14360o3.A0B(c5Hc, 1);
        this.A02 = c5Hc;
        this.A04 = z;
        this.A03 = str;
        this.A01 = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L24;
                case 1: goto L28;
                case 2: goto L54;
                default: goto L5;
            }
        L5:
            if (r2 == r3) goto L83
            r1 = 3
            boolean r0 = r3 instanceof X.C25313BIi
            if (r0 == 0) goto L22
            X.BIi r3 = (X.C25313BIi) r3
            int r0 = r3.A00
            if (r0 != r1) goto L22
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L22
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            if (r1 == r0) goto L76
        L22:
            r0 = 0
            return r0
        L24:
            if (r2 == r3) goto L83
            r1 = 0
            goto L2b
        L28:
            if (r2 == r3) goto L83
            r1 = 1
        L2b:
            boolean r0 = r3 instanceof X.C25313BIi
            if (r0 == 0) goto L22
            X.BIi r3 = (X.C25313BIi) r3
            int r0 = r3.A00
            if (r0 != r1) goto L22
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L22
            boolean r1 = r2.A04
            boolean r0 = r3.A04
            if (r1 != r0) goto L22
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L22
            int r1 = r2.A01
            int r0 = r3.A01
            goto L80
        L54:
            if (r2 == r3) goto L83
            r1 = 2
            boolean r0 = r3 instanceof X.C25313BIi
            if (r0 == 0) goto L22
            X.BIi r3 = (X.C25313BIi) r3
            int r0 = r3.A00
            if (r0 != r1) goto L22
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L22
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L76
            goto L22
        L76:
            int r1 = r2.A01
            int r0 = r3.A01
            if (r1 != r0) goto L22
            boolean r1 = r2.A04
            boolean r0 = r3.A04
        L80:
            if (r1 == r0) goto L83
            goto L22
        L83:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25313BIi.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 2: goto L3d;
                case 3: goto L1e;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.A02
            int r1 = X.AbstractC166987dD.A0G(r0)
            boolean r0 = r3.A04
            int r1 = X.AbstractC167007dF.A0D(r0, r1)
            java.lang.String r0 = r3.A03
            int r0 = X.AbstractC167017dG.A0O(r0)
            int r1 = r1 + r0
            int r2 = r1 * 31
            int r0 = r3.A01
        L1c:
            int r2 = r2 + r0
            return r2
        L1e:
            java.lang.String r0 = r3.A03
            int r2 = X.AbstractC166987dD.A0J(r0)
            java.lang.Object r0 = r3.A02
            int r1 = X.AbstractC166987dD.A0H(r0)
            switch(r1) {
                case 1: goto L34;
                case 2: goto L37;
                case 3: goto L3a;
                default: goto L2d;
            }
        L2d:
            java.lang.String r0 = "PERSON"
        L2f:
            int r0 = X.AbstractC25226BEj.A02(r0, r1)
            goto L49
        L34:
            java.lang.String r0 = "PET"
            goto L2f
        L37:
            java.lang.String r0 = "OTHERS"
            goto L2f
        L3a:
            java.lang.String r0 = "UNRECOGNIZED"
            goto L2f
        L3d:
            java.lang.Object r0 = r3.A02
            int r2 = X.AbstractC166987dD.A0G(r0)
            java.lang.String r0 = r3.A03
            int r0 = r0.hashCode()
        L49:
            int r2 = r2 + r0
            int r1 = r2 * 31
            int r0 = r3.A01
            int r1 = r1 + r0
            int r2 = r1 * 31
            boolean r1 = r3.A04
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L1c
            r0 = 1231(0x4cf, float:1.725E-42)
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25313BIi.hashCode():int");
    }

    public C25313BIi(AbstractC46972Dl abstractC46972Dl, String str, int i, boolean z) {
        this.A00 = 2;
        C14360o3.A0B(abstractC46972Dl, 1);
        C14360o3.A0B(str, 2);
        this.A02 = abstractC46972Dl;
        this.A03 = str;
        this.A01 = i;
        this.A04 = z;
    }

    public C25313BIi(Integer num, String str, int i, boolean z) {
        this.A00 = 3;
        C14360o3.A0B(num, 2);
        this.A03 = str;
        this.A02 = num;
        this.A01 = i;
        this.A04 = z;
    }
}
