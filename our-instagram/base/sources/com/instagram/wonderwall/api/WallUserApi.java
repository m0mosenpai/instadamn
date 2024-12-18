package com.instagram.wonderwall.api;

/* loaded from: classes9.dex */
public final class WallUserApi {
    public static final WallUserApi A00 = new Object();

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(com.instagram.common.session.UserSession r9, java.lang.String r10, X.InterfaceC23621Ds r11) {
        /*
            r8 = this;
            r4 = 49
            boolean r0 = X.PX4.A02(r11, r4)
            if (r0 == 0) goto L90
            r2 = r11
            X.PX4 r2 = (X.PX4) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L90
            int r3 = r3 - r1
            r2.A00 = r3
        L16:
            java.lang.Object r1 = r2.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r2.A00
            r4 = 1
            r6 = 0
            if (r0 == 0) goto L51
            if (r0 != r4) goto L95
            X.AbstractC09560e7.A00(r1)
        L25:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L48
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r0 = r1.A00
            X.7ex r0 = (X.C168027ex) r0
            java.util.List r0 = r0.getItems()
            X.3NX r1 = X.AbstractC25225BEi.A0z(r0)
        L39:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L45
            X.3NX r1 = (X.C3NX) r1
            if (r1 == 0) goto L45
            java.lang.Object r0 = r1.A00
            if (r0 != 0) goto L47
        L45:
            X.0sl r0 = X.C16930sl.A00
        L47:
            return r0
        L48:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L39
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L51:
            X.AbstractC09560e7.A00(r1)
            r7 = 0
            X.1Ms r5 = X.AbstractC31177DnL.A0M(r9)
            java.lang.String r0 = r9.userId
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "friendships/%s/followers/"
            r5.A0L(r0, r1)
            java.lang.Class<X.7ex> r1 = X.C168027ex.class
            java.lang.Class<X.7ey> r0 = X.C168037ey.class
            r5.A0P(r6, r1, r0, r7)
            r1 = 50
            java.lang.String r0 = "page_size"
            r5.A0D(r0, r1)
            if (r10 == 0) goto L7a
            int r0 = r10.length()
            if (r0 > 0) goto L7b
        L7a:
            r10 = r6
        L7b:
            java.lang.String r0 = "query"
            r5.A0H(r0, r10)
            X.1ON r1 = r5.A0N()
            r2.A00 = r4
            r0 = 1592315407(0x5ee8ce0f, float:8.387681E18)
            java.lang.Object r1 = r1.A00(r0, r2)
            if (r1 != r3) goto L25
            return r3
        L90:
            X.PX4 r2 = X.PX4.A00(r8, r11, r4)
            goto L16
        L95:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wonderwall.api.WallUserApi.A00(com.instagram.common.session.UserSession, java.lang.String, X.1Ds):java.lang.Object");
    }
}
