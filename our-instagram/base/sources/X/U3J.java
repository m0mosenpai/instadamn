package X;

/* loaded from: classes11.dex */
public abstract class U3J {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x007d, code lost:
    
        if (((X.C65741TtG) r8).A06().A03.ByJ() == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C66182U2x A00(X.C65956Tx8 r18) {
        /*
            r0 = 0
            r7 = r18
            java.util.ArrayList r10 = X.AbstractC166997dE.A12(r7, r0)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r6 = r7.A00
            int r5 = r6.size()
            r2 = 0
        L2c:
            if (r2 >= r5) goto Lb4
            java.lang.Object r8 = r6.get(r2)
            boolean r0 = r8 instanceof X.AbstractC65924TwV
            if (r0 == 0) goto La4
            X.TwV r8 = (X.AbstractC65924TwV) r8
            if (r8 == 0) goto La4
            java.util.List r0 = r7.A01
            java.lang.Object r9 = r0.get(r2)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.search.common.model.SearchItemState"
            X.C14360o3.A0C(r9, r0)
            X.Tx0 r9 = (X.Tx0) r9
            java.lang.String r0 = r8.A03()
            r10.add(r0)
            java.lang.String r0 = r8.A02()
            r11.add(r0)
            java.lang.String r0 = r8.A04()
            r12.add(r0)
            int r0 = r9.A00
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r13.add(r0)
            java.lang.String r0 = r9.A09
            r14.add(r0)
            boolean r9 = r8 instanceof X.C65741TtG
            if (r9 == 0) goto L7f
            r0 = r8
            X.TtG r0 = (X.C65741TtG) r0
            com.instagram.user.model.User r0 = r0.A06()
            X.17P r0 = r0.A03
            java.lang.String r1 = r0.ByJ()
            r0 = 1
            if (r1 != 0) goto L80
        L7f:
            r0 = 0
        L80:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.add(r0)
            if (r9 == 0) goto Lb2
            X.TtG r8 = (X.C65741TtG) r8
            com.instagram.user.model.User r0 = r8.A06()
            boolean r0 = r0.A26()
            if (r0 == 0) goto La7
            com.instagram.user.model.User r0 = r8.A06()
            int r0 = r0.A05()
            if (r0 <= 0) goto La7
            java.lang.String r0 = "new_post_count"
        La1:
            r3.add(r0)
        La4:
            int r2 = r2 + 1
            goto L2c
        La7:
            com.instagram.user.model.User r0 = r8.A06()
            X.17P r0 = r0.A03
            java.lang.String r0 = r0.BrG()
            goto La1
        Lb2:
            r0 = 0
            goto La1
        Lb4:
            r15 = 0
            X.0sl r16 = X.C16930sl.A00
            X.U2x r9 = new X.U2x
            r18 = r3
            r17 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U3J.A00(X.Tx8):X.U2x");
    }
}
