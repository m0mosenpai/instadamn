package com.instagram.comments.mvvm.data.network;

/* loaded from: classes5.dex */
public abstract class RestrictedCommentNetworkRequestsKt {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.C167297di r6, com.instagram.common.session.UserSession r7, X.InterfaceC23621Ds r8) {
        /*
            r3 = 11
            boolean r0 = X.D3k.A02(r8, r3)
            if (r0 == 0) goto L73
            r5 = r8
            X.D3k r5 = (X.D3k) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L73
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A01
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L42
            if (r0 != r3) goto L7e
            X.AbstractC09560e7.A00(r1)
        L24:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L39
            X.3NX r1 = X.AbstractC25227BEk.A0i()
        L2c:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto L38
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto L79
            X.8jk r1 = X.AbstractC25227BEk.A0h()
        L38:
            return r1
        L39:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L2c
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L42:
            X.AbstractC09560e7.A00(r1)
            X.1Xt r0 = X.C28151Xt.A02
            if (r0 != 0) goto L4e
            X.8jk r4 = X.AbstractC25227BEk.A0h()
            return r4
        L4e:
            java.lang.String r1 = r6.A0K
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            X.1Ms r2 = X.AbstractC167017dG.A0c(r7)
            java.lang.String r0 = "restrict_action/approve_restricted_comment/"
            r2.A0B(r0)
            java.lang.String r0 = "comment_id"
            r2.A9s(r0, r1)
            java.lang.Class<X.1ul> r1 = X.C40781ul.class
            java.lang.Class<X.2hA> r0 = X.C55702hA.class
            X.1ON r0 = X.AbstractC25227BEk.A0e(r2, r1, r0)
            r5.A00 = r3
            java.lang.Object r1 = r0.A01(r5)
            if (r1 != r4) goto L24
            return r4
        L73:
            X.D3k r5 = new X.D3k
            r5.<init>(r3, r8)
            goto L16
        L79:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L7e:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.network.RestrictedCommentNetworkRequestsKt.A00(X.7di, com.instagram.common.session.UserSession, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.instagram.common.session.UserSession r5, java.lang.String r6, java.lang.String r7, X.InterfaceC23621Ds r8) {
        /*
            r3 = 10
            boolean r0 = X.D3k.A02(r8, r3)
            if (r0 == 0) goto L6e
            r4 = r8
            X.D3k r4 = (X.D3k) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6e
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A01
            X.1JX r2 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L4e
            if (r0 != r1) goto L79
            X.AbstractC09560e7.A00(r3)
        L24:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L45
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r0 = r3.A00
            X.7ex r0 = (X.C168027ex) r0
            java.util.List r0 = r0.getItems()
            X.3NX r3 = X.AbstractC25225BEi.A0z(r0)
        L38:
            boolean r0 = r3 instanceof X.C3NX
            if (r0 != 0) goto L44
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 == 0) goto L74
            X.8jk r3 = X.AbstractC25227BEk.A0h()
        L44:
            return r3
        L45:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 != 0) goto L38
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L4e:
            X.AbstractC09560e7.A00(r3)
            X.1Xt r0 = X.C28151Xt.A02
            if (r0 != 0) goto L5a
            X.8jk r2 = X.AbstractC25227BEk.A0h()
            return r2
        L5a:
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            X.AbstractC167007dF.A1D(r6, r1, r7)
            X.1ON r0 = X.AbstractC166547cQ.A01(r5, r6, r7)
            r4.A00 = r1
            java.lang.Object r3 = r0.A01(r4)
            if (r3 != r2) goto L24
            return r2
        L6e:
            X.D3k r4 = new X.D3k
            r4.<init>(r3, r8)
            goto L16
        L74:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L79:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.network.RestrictedCommentNetworkRequestsKt.A01(com.instagram.common.session.UserSession, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }
}
