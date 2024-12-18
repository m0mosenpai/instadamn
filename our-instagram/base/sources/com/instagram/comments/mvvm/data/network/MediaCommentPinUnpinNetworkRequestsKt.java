package com.instagram.comments.mvvm.data.network;

/* loaded from: classes5.dex */
public abstract class MediaCommentPinUnpinNetworkRequestsKt {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.common.session.UserSession r5, java.lang.String r6, java.lang.String r7, X.InterfaceC23621Ds r8) {
        /*
            r3 = 7
            boolean r0 = X.D3k.A02(r8, r3)
            if (r0 == 0) goto L55
            r4 = r8
            X.D3k r4 = (X.D3k) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L55
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r2 = r4.A01
            X.1JX r3 = X.C1JX.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L41
            if (r1 != r0) goto L60
            X.AbstractC09560e7.A00(r2)
        L23:
            boolean r0 = r2 instanceof X.C3NX
            if (r0 == 0) goto L38
            X.3NX r2 = X.AbstractC25227BEk.A0i()
        L2b:
            boolean r0 = r2 instanceof X.C3NX
            if (r0 != 0) goto L37
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 == 0) goto L5b
            X.8jk r2 = X.AbstractC25227BEk.A0h()
        L37:
            return r2
        L38:
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 != 0) goto L2b
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L41:
            X.AbstractC09560e7.A00(r2)
            X.1Ms r2 = X.AbstractC167017dG.A0c(r5)
            java.lang.Object[] r1 = new java.lang.Object[]{r6, r7}
            java.lang.String r0 = "media/%s/pin_comment/%s/"
            java.lang.Object r2 = X.D3k.A00(r2, r0, r4, r1)
            if (r2 != r3) goto L23
            return r3
        L55:
            X.D3k r4 = new X.D3k
            r4.<init>(r3, r8)
            goto L15
        L5b:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L60:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.network.MediaCommentPinUnpinNetworkRequestsKt.A00(com.instagram.common.session.UserSession, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

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
    public static final java.lang.Object A01(com.instagram.common.session.UserSession r5, java.lang.String r6, java.lang.String r7, X.InterfaceC23621Ds r8) {
        /*
            r3 = 8
            boolean r0 = X.D3k.A02(r8, r3)
            if (r0 == 0) goto L5d
            r4 = r8
            X.D3k r4 = (X.D3k) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5d
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r2 = r4.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L42
            if (r0 != r1) goto L68
            X.AbstractC09560e7.A00(r2)
        L24:
            boolean r0 = r2 instanceof X.C3NX
            if (r0 == 0) goto L39
            X.3NX r2 = X.AbstractC25227BEk.A0i()
        L2c:
            boolean r0 = r2 instanceof X.C3NX
            if (r0 != 0) goto L38
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 == 0) goto L63
            X.8jk r2 = X.AbstractC25227BEk.A0h()
        L38:
            return r2
        L39:
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 != 0) goto L2c
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L42:
            X.AbstractC09560e7.A00(r2)
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            X.AbstractC167007dF.A1D(r6, r1, r7)
            X.1Ms r2 = X.AbstractC167017dG.A0c(r5)
            java.lang.Object[] r1 = new java.lang.Object[]{r6, r7}
            java.lang.String r0 = "media/%s/unpin_comment/%s/"
            java.lang.Object r2 = X.D3k.A00(r2, r0, r4, r1)
            if (r2 != r3) goto L24
            return r3
        L5d:
            X.D3k r4 = new X.D3k
            r4.<init>(r3, r8)
            goto L16
        L63:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L68:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.network.MediaCommentPinUnpinNetworkRequestsKt.A01(com.instagram.common.session.UserSession, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }
}
