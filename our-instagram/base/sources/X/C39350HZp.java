package X;

/* renamed from: X.HZp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39350HZp extends IN1 {
    public final C38321qM A00;
    public final C38321qM A01;
    public final String A02;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C39350HZp(X.C38321qM r7, X.C38321qM r8, java.lang.String r9) {
        /*
            r6 = this;
            r0 = 1
            r3 = r9
            X.C14360o3.A0B(r9, r0)
            java.lang.Integer r2 = X.C05F.A01
            X.1rF r0 = r8.A0C
            java.util.List r0 = r0.B5P()
            if (r0 == 0) goto L34
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L34
            boolean r0 = r8.Cff()
            if (r0 == 0) goto L31
            java.lang.String r4 = "featured_product_video"
        L1d:
            float r5 = r8.A0m()
            X.IbL r1 = new X.IbL
            r1.<init>(r8)
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r6.A02 = r9
            r6.A01 = r7
            r6.A00 = r8
            return
        L31:
            java.lang.String r4 = "featured_product_photo"
            goto L1d
        L34:
            boolean r0 = r8.Cff()
            if (r0 == 0) goto L3d
            java.lang.String r4 = "feed_video"
            goto L1d
        L3d:
            java.lang.String r4 = "feed_photo"
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39350HZp.<init>(X.1qM, X.1qM, java.lang.String):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39350HZp) {
                C39350HZp c39350HZp = (C39350HZp) obj;
                if (!C14360o3.A0K(this.A02, c39350HZp.A02) || !C14360o3.A0K(this.A01, c39350HZp.A01) || !C14360o3.A0K(this.A00, c39350HZp.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0J(this.A02)));
    }
}
