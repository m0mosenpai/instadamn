package X;

/* renamed from: X.MSe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50525MSe extends C0T6 {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final int A04;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public C50525MSe(boolean z, int i, boolean z2, boolean z3, boolean z4) {
        this.A04 = i;
        switch (i) {
            case 0:
                this.A01 = z;
                this.A03 = z2;
                this.A00 = z3;
                this.A02 = z4;
                return;
            case 1:
                this.A02 = z;
                this.A01 = z2;
                this.A03 = z3;
                this.A00 = z4;
                return;
            case 2:
            case 4:
                this.A01 = z;
                this.A00 = z2;
                this.A03 = z3;
                this.A02 = z4;
                return;
            case 3:
                this.A00 = z;
                this.A03 = z2;
                this.A01 = z3;
                this.A02 = z4;
                return;
            case 5:
                this.A01 = z;
                this.A02 = z2;
                this.A03 = z3;
                this.A00 = z4;
                return;
            default:
                this.A00 = z;
                this.A01 = z2;
                this.A02 = z3;
                this.A03 = z4;
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A04
            switch(r0) {
                case 0: goto La;
                case 1: goto L28;
                case 2: goto L40;
                case 3: goto L5;
                case 4: goto L44;
                case 5: goto L68;
                case 6: goto L8c;
                default: goto L5;
            }
        L5:
            boolean r0 = super.equals(r3)
            return r0
        La:
            if (r2 == r3) goto Lb3
            r1 = 0
            boolean r0 = r3 instanceof X.C50525MSe
            if (r0 == 0) goto Lb1
            X.MSe r3 = (X.C50525MSe) r3
            int r0 = r3.A04
            if (r0 != r1) goto Lb1
            boolean r1 = r2.A01
            boolean r0 = r3.A01
            if (r1 != r0) goto Lb1
            boolean r1 = r2.A03
            boolean r0 = r3.A03
            if (r1 != r0) goto Lb1
            boolean r1 = r2.A00
            boolean r0 = r3.A00
            goto L61
        L28:
            if (r2 == r3) goto Lb3
            r1 = 1
            boolean r0 = r3 instanceof X.C50525MSe
            if (r0 == 0) goto Lb1
            X.MSe r3 = (X.C50525MSe) r3
            int r0 = r3.A04
            if (r0 != r1) goto Lb1
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 != r0) goto Lb1
            boolean r1 = r2.A01
            boolean r0 = r3.A01
            goto L7f
        L40:
            if (r2 == r3) goto Lb3
            r1 = 2
            goto L47
        L44:
            if (r2 == r3) goto Lb3
            r1 = 4
        L47:
            boolean r0 = r3 instanceof X.C50525MSe
            if (r0 == 0) goto Lb1
            X.MSe r3 = (X.C50525MSe) r3
            int r0 = r3.A04
            if (r0 != r1) goto Lb1
            boolean r1 = r2.A01
            boolean r0 = r3.A01
            if (r1 != r0) goto Lb1
            boolean r1 = r2.A00
            boolean r0 = r3.A00
            if (r1 != r0) goto Lb1
            boolean r1 = r2.A03
            boolean r0 = r3.A03
        L61:
            if (r1 != r0) goto Lb1
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            goto Laf
        L68:
            if (r2 == r3) goto Lb3
            r1 = 5
            boolean r0 = r3 instanceof X.C50525MSe
            if (r0 == 0) goto Lb1
            X.MSe r3 = (X.C50525MSe) r3
            int r0 = r3.A04
            if (r0 != r1) goto Lb1
            boolean r1 = r2.A01
            boolean r0 = r3.A01
            if (r1 != r0) goto Lb1
            boolean r1 = r2.A02
            boolean r0 = r3.A02
        L7f:
            if (r1 != r0) goto Lb1
            boolean r1 = r2.A03
            boolean r0 = r3.A03
            if (r1 != r0) goto Lb1
            boolean r1 = r2.A00
            boolean r0 = r3.A00
            goto Laf
        L8c:
            if (r2 == r3) goto Lb3
            r1 = 6
            boolean r0 = r3 instanceof X.C50525MSe
            if (r0 == 0) goto Lb1
            X.MSe r3 = (X.C50525MSe) r3
            int r0 = r3.A04
            if (r0 != r1) goto Lb1
            boolean r1 = r2.A00
            boolean r0 = r3.A00
            if (r1 != r0) goto Lb1
            boolean r1 = r2.A01
            boolean r0 = r3.A01
            if (r1 != r0) goto Lb1
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 != r0) goto Lb1
            boolean r1 = r2.A03
            boolean r0 = r3.A03
        Laf:
            if (r1 == r0) goto Lb3
        Lb1:
            r0 = 0
            return r0
        Lb3:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50525MSe.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final int hashCode() {
        int A0D;
        boolean z;
        int A08;
        boolean z2;
        int A0D2;
        boolean z3;
        switch (this.A04) {
            case 0:
                A0D = AbstractC167007dF.A0D(this.A03, AbstractC25225BEi.A08(this.A01));
                z = this.A00;
                A0D2 = AbstractC167007dF.A0D(z, A0D);
                z3 = this.A02;
                return AbstractC166987dD.A0K(z3, A0D2);
            case 1:
                A08 = AbstractC25225BEi.A08(this.A02);
                z2 = this.A01;
                A0D2 = AbstractC167007dF.A0D(this.A03, AbstractC167007dF.A0D(z2, A08));
                z3 = this.A00;
                return AbstractC166987dD.A0K(z3, A0D2);
            case 2:
            case 4:
                A0D = AbstractC167007dF.A0D(this.A00, AbstractC25225BEi.A08(this.A01));
                z = this.A03;
                A0D2 = AbstractC167007dF.A0D(z, A0D);
                z3 = this.A02;
                return AbstractC166987dD.A0K(z3, A0D2);
            case 3:
            default:
                return super.hashCode();
            case 5:
                A08 = AbstractC25225BEi.A08(this.A01);
                z2 = this.A02;
                A0D2 = AbstractC167007dF.A0D(this.A03, AbstractC167007dF.A0D(z2, A08));
                z3 = this.A00;
                return AbstractC166987dD.A0K(z3, A0D2);
            case 6:
                A0D2 = AbstractC167007dF.A0D(this.A02, AbstractC167007dF.A0D(this.A01, AbstractC25225BEi.A08(this.A00)));
                z3 = this.A03;
                return AbstractC166987dD.A0K(z3, A0D2);
        }
    }

    public final String toString() {
        if (1 - this.A04 != 0) {
            return super.toString();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AccessTokenRequestState(shouldCheckUserEligibility=");
        A1C.append(this.A02);
        A1C.append(", shouldCheckAccessTokenValidity=");
        A1C.append(this.A01);
        A1C.append(", shouldFetchAccessToken=");
        A1C.append(this.A03);
        A1C.append(", isBuatDeprecationEligible=");
        return AbstractC25236BEt.A0a(A1C, this.A00);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C50525MSe(int r8, int r9, boolean r10, boolean r11, boolean r12, boolean r13) {
        /*
            r7 = this;
            r1 = r7
            r6 = r13
            r5 = r12
            r4 = r11
            r7.A04 = r9
            r2 = r10
            switch(r9) {
                case 0: goto L4a;
                case 1: goto L43;
                case 2: goto La;
                case 3: goto L2e;
                case 4: goto La;
                case 5: goto L22;
                default: goto La;
            }
        La:
            boolean r2 = X.MSX.A1T(r8, r10)
            r0 = r8 & 2
            if (r0 == 0) goto L13
            r4 = 0
        L13:
            r0 = r8 & 4
            if (r0 == 0) goto L18
            r5 = 0
        L18:
            r0 = r8 & 8
            if (r0 == 0) goto L1d
            r6 = 0
        L1d:
            r3 = 6
        L1e:
            r1.<init>(r2, r3, r4, r5, r6)
            return
        L22:
            r0 = r8 & 4
            if (r0 == 0) goto L27
            r5 = 0
        L27:
            r0 = r8 & 8
            if (r0 == 0) goto L2c
            r6 = 0
        L2c:
            r3 = 5
            goto L1e
        L2e:
            boolean r2 = X.MSX.A1T(r8, r10)
            r0 = r8 & 2
            if (r0 == 0) goto L37
            r4 = 0
        L37:
            r0 = r8 & 4
            if (r0 == 0) goto L3c
            r5 = 0
        L3c:
            r0 = r8 & 8
            if (r0 == 0) goto L41
            r6 = 0
        L41:
            r3 = 3
            goto L1e
        L43:
            r0 = r8 & 8
            if (r0 == 0) goto L48
            r6 = 0
        L48:
            r3 = 1
            goto L1e
        L4a:
            boolean r2 = X.MSX.A1T(r8, r10)
            r0 = r8 & 2
            if (r0 == 0) goto L53
            r4 = 0
        L53:
            r0 = r8 & 4
            if (r0 == 0) goto L58
            r5 = 0
        L58:
            r0 = r8 & 8
            if (r0 == 0) goto L5d
            r6 = 0
        L5d:
            r3 = 0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50525MSe.<init>(int, int, boolean, boolean, boolean, boolean):void");
    }
}
