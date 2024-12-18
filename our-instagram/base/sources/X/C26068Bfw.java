package X;

/* renamed from: X.Bfw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26068Bfw extends C0T6 {
    public int A00;
    public int A01;
    public String A02;
    public final int A03;

    public C26068Bfw(String str, int i, int i2) {
        this.A03 = 2;
        C14360o3.A0B(str, 1);
        this.A02 = str;
        this.A01 = i;
        this.A00 = i2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A03
            switch(r0) {
                case 0: goto L1e;
                case 1: goto L22;
                case 2: goto L26;
                case 3: goto L48;
                default: goto L5;
            }
        L5:
            if (r2 == r3) goto L6c
            r1 = 4
            boolean r0 = r3 instanceof X.C26068Bfw
            if (r0 == 0) goto L1c
            X.Bfw r3 = (X.C26068Bfw) r3
            int r0 = r3.A03
            if (r0 != r1) goto L1c
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L6c
        L1c:
            r0 = 0
            return r0
        L1e:
            if (r2 == r3) goto L6c
            r1 = 0
            goto L4b
        L22:
            if (r2 == r3) goto L6c
            r1 = 1
            goto L4b
        L26:
            if (r2 == r3) goto L6c
            r1 = 2
            boolean r0 = r3 instanceof X.C26068Bfw
            if (r0 == 0) goto L1c
            X.Bfw r3 = (X.C26068Bfw) r3
            int r0 = r3.A03
            if (r0 != r1) goto L1c
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L1c
            int r1 = r2.A01
            int r0 = r3.A01
            if (r1 != r0) goto L1c
            int r1 = r2.A00
            int r0 = r3.A00
            goto L69
        L48:
            if (r2 == r3) goto L6c
            r1 = 3
        L4b:
            boolean r0 = r3 instanceof X.C26068Bfw
            if (r0 == 0) goto L1c
            X.Bfw r3 = (X.C26068Bfw) r3
            int r0 = r3.A03
            if (r0 != r1) goto L1c
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 != r0) goto L1c
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L1c
            int r1 = r2.A01
            int r0 = r3.A01
        L69:
            if (r1 == r0) goto L6c
            goto L1c
        L6c:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26068Bfw.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final int hashCode() {
        int A0J;
        int i;
        switch (this.A03) {
            case 2:
                A0J = (AbstractC166987dD.A0J(this.A02) + this.A01) * 31;
                i = this.A00;
                return A0J + i;
            case 3:
            default:
                A0J = AbstractC166997dE.A0K(this.A02, this.A00 * 31);
                i = this.A01;
                return A0J + i;
            case 4:
                return this.A02.hashCode();
        }
    }

    public final String toString() {
        if (4 - this.A03 != 0) {
            return super.toString();
        }
        return AbstractC25235BEs.A0r("SeenState(mediaId=", this.A02);
    }

    public C26068Bfw(int i, String str, int i2, int i3) {
        this.A03 = i3;
        C14360o3.A0B(str, 2);
        this.A00 = i;
        this.A02 = str;
        this.A01 = i2;
    }

    public C26068Bfw(String str) {
        this.A03 = 4;
        this.A02 = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26068Bfw() {
        this(0, "", 0, 3);
        this.A03 = 3;
    }
}
