package com.instagram.comments.mvvm.data.network;

/* loaded from: classes5.dex */
public abstract class DeleteCommentUpsellRequestsKt {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.common.session.UserSession r6, X.InterfaceC23621Ds r7) {
        /*
            r3 = 3
            boolean r0 = X.D3k.A02(r7, r3)
            if (r0 == 0) goto L51
            r5 = r7
            X.D3k r5 = (X.D3k) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L51
            int r2 = r2 - r1
            r5.A00 = r2
        L15:
            java.lang.Object r0 = r5.A01
            X.1JX r4 = X.C1JX.A02
            int r1 = r5.A00
            r3 = 1
            if (r1 == 0) goto L31
            if (r1 != r3) goto L5c
            X.AbstractC09560e7.A00(r0)
        L23:
            r4 = r0
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L30
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto L57
            X.8jk r4 = X.AbstractC25227BEk.A0h()
        L30:
            return r4
        L31:
            X.AbstractC09560e7.A00(r0)
            X.1Ms r2 = X.AbstractC25228BEl.A0q(r6)
            r2.A06()
            java.lang.String r0 = "media/comment/filtering/get_filter_setting/"
            r2.A0B(r0)
            java.lang.Class<X.EBZ> r1 = X.EBZ.class
            java.lang.Class<X.FVB> r0 = X.FVB.class
            X.1ON r0 = X.AbstractC25227BEk.A0e(r2, r1, r0)
            r5.A00 = r3
            java.lang.Object r0 = r0.A01(r5)
            if (r0 != r4) goto L23
            return r4
        L51:
            X.D3k r5 = new X.D3k
            r5.<init>(r3, r7)
            goto L15
        L57:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L5c:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.network.DeleteCommentUpsellRequestsKt.A00(com.instagram.common.session.UserSession, X.1Ds):java.lang.Object");
    }
}
