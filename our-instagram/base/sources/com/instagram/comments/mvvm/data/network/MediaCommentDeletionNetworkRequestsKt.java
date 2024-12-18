package com.instagram.comments.mvvm.data.network;

/* loaded from: classes9.dex */
public abstract class MediaCommentDeletionNetworkRequestsKt {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.common.session.UserSession r8, java.lang.String r9, java.lang.String r10, java.util.Collection r11, X.InterfaceC23621Ds r12) {
        /*
            r3 = 6
            boolean r0 = X.D3k.A02(r12, r3)
            if (r0 == 0) goto L92
            r5 = r12
            X.D3k r5 = (X.D3k) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L92
            int r2 = r2 - r1
            r5.A00 = r2
        L15:
            java.lang.Object r1 = r5.A01
            X.1JX r6 = X.C1JX.A02
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L5f
            if (r0 != r4) goto L9e
            X.AbstractC09560e7.A00(r1)
        L23:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L56
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r0 = r1.A00
            X.N2Y r0 = (X.N2Y) r0
            X.PrO r0 = r0.F7f()
            X.3NX r1 = X.AbstractC25225BEi.A0z(r0)
        L37:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto L53
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto L99
            X.5If r0 = X.MSX.A0E(r1)
            java.lang.Object r0 = r0.A00()
            X.1up r0 = (X.InterfaceC40821up) r0
            if (r0 == 0) goto L54
            java.lang.String r0 = r0.getErrorCode()
        L4f:
            X.8jk r1 = X.AbstractC43592JPx.A0p(r0)
        L53:
            return r1
        L54:
            r0 = 0
            goto L4f
        L56:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L37
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L5f:
            X.AbstractC09560e7.A00(r1)
            r7 = 0
            r3 = 0
            X.1Ms r2 = X.AbstractC167017dG.A0c(r8)
            java.lang.Object[] r1 = new java.lang.Object[]{r9}
            java.lang.String r0 = "media/%s/comment/bulk_delete/"
            r2.A0L(r0, r1)
            java.lang.Class<X.N2Y> r1 = X.N2Y.class
            java.lang.Class<X.ONN> r0 = X.ONN.class
            r2.A0P(r3, r1, r0, r7)
            java.lang.String r0 = ","
            java.lang.String r1 = X.AbstractC25226BEj.A1H(r0, r11, r3)
            java.lang.String r0 = "comment_ids_to_delete"
            r2.A9s(r0, r1)
            java.lang.String r0 = "container_module"
            X.1ON r0 = X.MSY.A0I(r2, r0, r10)
            r5.A00 = r4
            java.lang.Object r1 = r0.A01(r5)
            if (r1 != r6) goto L23
            return r6
        L92:
            X.D3k r5 = new X.D3k
            r5.<init>(r3, r12)
            goto L15
        L99:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L9e:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.network.MediaCommentDeletionNetworkRequestsKt.A00(com.instagram.common.session.UserSession, java.lang.String, java.lang.String, java.util.Collection, X.1Ds):java.lang.Object");
    }
}
