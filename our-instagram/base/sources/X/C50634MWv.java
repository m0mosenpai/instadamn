package X;

/* renamed from: X.MWv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50634MWv extends C0T6 {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final int A03;

    public C50634MWv(boolean z, boolean z2, boolean z3, int i) {
        this.A03 = i;
        switch (i) {
            case 0:
            case 5:
            case 9:
                this.A01 = z;
                this.A00 = z2;
                break;
            case 1:
            case 8:
                this.A00 = z;
                this.A02 = z2;
                this.A01 = z3;
                return;
            case 2:
            case 3:
            case 6:
                this.A00 = z;
                this.A01 = z2;
                break;
            case 4:
                this.A01 = z;
                this.A02 = z2;
                this.A00 = z3;
                return;
            case 7:
            default:
                this.A02 = z;
                this.A00 = z2;
                this.A01 = z3;
                return;
        }
        this.A02 = z3;
    }

    public static boolean A00(Object obj, C05A c05a, boolean z, boolean z2, boolean z3) {
        return c05a.AIi(obj, new C50634MWv(z, z2, z3, 9));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A03
            switch(r0) {
                case 1: goto La;
                case 2: goto Le;
                case 3: goto L12;
                case 4: goto L16;
                case 5: goto L34;
                case 6: goto L38;
                case 7: goto L50;
                case 8: goto L68;
                case 9: goto L87;
                default: goto L5;
            }
        L5:
            boolean r0 = super.equals(r3)
            return r0
        La:
            if (r2 == r3) goto La9
            r1 = 1
            goto L6c
        Le:
            if (r2 == r3) goto La9
            r1 = 2
            goto L3b
        L12:
            if (r2 == r3) goto La9
            r1 = 3
            goto L3b
        L16:
            if (r2 == r3) goto La9
            r1 = 4
            boolean r0 = r3 instanceof X.C50634MWv
            if (r0 == 0) goto La7
            X.MWv r3 = (X.C50634MWv) r3
            int r0 = r3.A03
            if (r0 != r1) goto La7
            boolean r1 = r2.A01
            boolean r0 = r3.A01
            if (r1 != r0) goto La7
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 != r0) goto La7
            boolean r1 = r2.A00
            boolean r0 = r3.A00
            goto La5
        L34:
            if (r2 == r3) goto La9
            r1 = 5
            goto L8b
        L38:
            if (r2 == r3) goto La9
            r1 = 6
        L3b:
            boolean r0 = r3 instanceof X.C50634MWv
            if (r0 == 0) goto La7
            X.MWv r3 = (X.C50634MWv) r3
            int r0 = r3.A03
            if (r0 != r1) goto La7
            boolean r1 = r2.A00
            boolean r0 = r3.A00
            if (r1 != r0) goto La7
            boolean r1 = r2.A01
            boolean r0 = r3.A01
            goto L9f
        L50:
            if (r2 == r3) goto La9
            r1 = 7
            boolean r0 = r3 instanceof X.C50634MWv
            if (r0 == 0) goto La7
            X.MWv r3 = (X.C50634MWv) r3
            int r0 = r3.A03
            if (r0 != r1) goto La7
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 != r0) goto La7
            boolean r1 = r2.A00
            boolean r0 = r3.A00
            goto L80
        L68:
            if (r2 == r3) goto La9
            r1 = 8
        L6c:
            boolean r0 = r3 instanceof X.C50634MWv
            if (r0 == 0) goto La7
            X.MWv r3 = (X.C50634MWv) r3
            int r0 = r3.A03
            if (r0 != r1) goto La7
            boolean r1 = r2.A00
            boolean r0 = r3.A00
            if (r1 != r0) goto La7
            boolean r1 = r2.A02
            boolean r0 = r3.A02
        L80:
            if (r1 != r0) goto La7
            boolean r1 = r2.A01
            boolean r0 = r3.A01
            goto La5
        L87:
            if (r2 == r3) goto La9
            r1 = 9
        L8b:
            boolean r0 = r3 instanceof X.C50634MWv
            if (r0 == 0) goto La7
            X.MWv r3 = (X.C50634MWv) r3
            int r0 = r3.A03
            if (r0 != r1) goto La7
            boolean r1 = r2.A01
            boolean r0 = r3.A01
            if (r1 != r0) goto La7
            boolean r1 = r2.A00
            boolean r0 = r3.A00
        L9f:
            if (r1 != r0) goto La7
            boolean r1 = r2.A02
            boolean r0 = r3.A02
        La5:
            if (r1 == r0) goto La9
        La7:
            r0 = 0
            return r0
        La9:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50634MWv.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final int hashCode() {
        int A08;
        boolean z;
        int A082;
        boolean z2;
        int A0D;
        boolean z3;
        switch (this.A03) {
            case 1:
            case 8:
                A08 = AbstractC25225BEi.A08(this.A00);
                z = this.A02;
                A0D = AbstractC167007dF.A0D(z, A08);
                z3 = this.A01;
                return AbstractC166987dD.A0K(z3, A0D);
            case 2:
            case 3:
            case 6:
                A082 = AbstractC25225BEi.A08(this.A00);
                z2 = this.A01;
                A0D = AbstractC167007dF.A0D(z2, A082);
                z3 = this.A02;
                return AbstractC166987dD.A0K(z3, A0D);
            case 4:
                A0D = AbstractC167007dF.A0D(this.A02, AbstractC25225BEi.A08(this.A01));
                z3 = this.A00;
                return AbstractC166987dD.A0K(z3, A0D);
            case 5:
            case 9:
                A082 = AbstractC25225BEi.A08(this.A01);
                z2 = this.A00;
                A0D = AbstractC167007dF.A0D(z2, A082);
                z3 = this.A02;
                return AbstractC166987dD.A0K(z3, A0D);
            case 7:
                A08 = AbstractC25225BEi.A08(this.A02);
                z = this.A00;
                A0D = AbstractC167007dF.A0D(z, A08);
                z3 = this.A01;
                return AbstractC166987dD.A0K(z3, A0D);
            default:
                return super.hashCode();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C50634MWv(int r4, int r5, boolean r6, boolean r7) {
        /*
            r3 = this;
            r3.A03 = r5
            r2 = 0
            boolean r1 = X.MSX.A1T(r4, r6)
            r0 = r4 & 2
            switch(r5) {
                case 3: goto L1e;
                case 4: goto L19;
                case 5: goto L14;
                default: goto Lc;
            }
        Lc:
            if (r0 == 0) goto Lf
            r7 = 0
        Lf:
            r0 = 6
        L10:
            r3.<init>(r1, r7, r2, r0)
            return
        L14:
            if (r0 == 0) goto L17
            r7 = 0
        L17:
            r0 = 5
            goto L10
        L19:
            if (r0 == 0) goto L1c
            r7 = 0
        L1c:
            r0 = 4
            goto L10
        L1e:
            if (r0 == 0) goto L21
            r7 = 0
        L21:
            r0 = r4 & 4
            if (r0 == 0) goto L26
            r2 = 1
        L26:
            r0 = 3
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50634MWv.<init>(int, int, boolean, boolean):void");
    }
}
