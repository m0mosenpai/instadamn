package com.instagram.video.live.mvvm.model.datasource.api;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class IgLiveCommentsApi {
    public final UserSession A00;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.C56803PIu r7, java.lang.String r8, X.InterfaceC23621Ds r9) {
        /*
            r6 = this;
            r3 = 32
            boolean r0 = X.PXB.A03(r9, r3)
            if (r0 == 0) goto L5b
            r5 = r9
            X.PXB r5 = (X.PXB) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5b
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r0 = r5.A01
            X.1JX r4 = X.C1JX.A02
            int r1 = r5.A00
            r3 = 1
            if (r1 == 0) goto L32
            if (r1 != r3) goto L65
            X.AbstractC09560e7.A00(r0)
        L24:
            r4 = r0
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L31
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto L60
            X.8jk r4 = X.AbstractC25227BEk.A0h()
        L31:
            return r4
        L32:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r0 = r6.A00
            X.AbstractC167007dF.A1D(r8, r3, r7)
            X.1Ms r2 = X.AbstractC167017dG.A0c(r0)
            java.lang.String r0 = r7.getPk()
            java.lang.Object[] r1 = new java.lang.Object[]{r8, r0}
            java.lang.String r0 = "live/%s/delete_comment/%s/"
            r2.A0L(r0, r1)
            X.1ON r1 = X.MSZ.A0U(r2)
            r5.A00 = r3
            r0 = 1534060280(0x5b6fe6f8, float:6.7526472E16)
            java.lang.Object r0 = r1.A00(r0, r5)
            if (r0 != r4) goto L24
            return r4
        L5b:
            X.PXB r5 = X.PXB.A00(r6, r9, r3)
            goto L16
        L60:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L65:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.datasource.api.IgLiveCommentsApi.A00(X.PIu, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.util.List r13, X.InterfaceC23621Ds r14, int r15, long r16, long r18, long r20) {
        /*
            r9 = this;
            r4 = 33
            boolean r0 = X.PXB.A03(r14, r4)
            if (r0 == 0) goto Lb4
            r2 = r14
            X.PXB r2 = (X.PXB) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto Lb4
            int r3 = r3 - r1
            r2.A00 = r3
        L16:
            java.lang.Object r0 = r2.A01
            X.1JX r3 = X.C1JX.A02
            int r1 = r2.A00
            r4 = 1
            if (r1 == 0) goto L32
            if (r1 != r4) goto Lbf
            X.AbstractC09560e7.A00(r0)
        L24:
            r3 = r0
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L31
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto Lba
            X.8jk r3 = X.AbstractC25227BEk.A0h()
        L31:
            return r3
        L32:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r8 = r9.A00
            X.AbstractC167007dF.A1I(r10, r4, r13)
            java.io.StringWriter r6 = X.AbstractC37300Gc1.A0O()
            X.17z r5 = X.AbstractC37301Gc2.A06(r6)
            java.util.Iterator r1 = r13.iterator()
        L46:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L54
            java.lang.String r0 = X.AbstractC166987dD.A1B(r1)
            r5.A0u(r0)
            goto L46
        L54:
            java.lang.String r7 = X.MSZ.A0s(r5, r6)
            r6 = 0
            X.1Ms r5 = X.AbstractC31177DnL.A0M(r8)
            java.lang.Object[] r1 = new java.lang.Object[]{r10}
            java.lang.String r0 = "live/%s/get_comment/"
            r5.A0L(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r16)
            java.lang.String r0 = "last_comment_ts"
            r5.A9s(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r18)
            java.lang.String r0 = "join_request_last_fetch_ts"
            r5.A9s(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r15)
            java.lang.String r0 = "join_request_last_total_count"
            r5.A9s(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r20)
            java.lang.String r0 = "join_request_last_seen_ts"
            r5.A9s(r0, r1)
            java.lang.String r0 = "visible_comment_ids"
            r5.A9s(r0, r7)
            java.lang.Class<X.N3I> r1 = X.N3I.class
            java.lang.Class<X.OQL> r0 = X.OQL.class
            r5.A0P(r6, r1, r0, r4)
            if (r12 == 0) goto L9d
            java.lang.String r0 = "new_supporters_min_id"
            r5.A9s(r0, r12)
        L9d:
            if (r11 == 0) goto La4
            java.lang.String r0 = "mentioned_comment_id"
            r5.A9s(r0, r11)
        La4:
            X.1ON r1 = r5.A0N()
            r2.A00 = r4
            r0 = 1845178886(0x6dfb3206, float:9.7176515E27)
            java.lang.Object r0 = r1.A00(r0, r2)
            if (r0 != r3) goto L24
            return r3
        Lb4:
            X.PXB r2 = X.PXB.A00(r9, r14, r4)
            goto L16
        Lba:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lbf:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.datasource.api.IgLiveCommentsApi.A01(java.lang.String, java.lang.String, java.lang.String, java.util.List, X.1Ds, int, long, long, long):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(java.lang.String r7, java.lang.String r8, X.InterfaceC23621Ds r9) {
        /*
            r6 = this;
            r3 = 34
            boolean r0 = X.PXB.A03(r9, r3)
            if (r0 == 0) goto L59
            r5 = r9
            X.PXB r5 = (X.PXB) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L59
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r0 = r5.A01
            X.1JX r4 = X.C1JX.A02
            int r1 = r5.A00
            r3 = 1
            if (r1 == 0) goto L32
            if (r1 != r3) goto L63
            X.AbstractC09560e7.A00(r0)
        L24:
            r4 = r0
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L31
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto L5e
            X.8jk r4 = X.AbstractC25227BEk.A0h()
        L31:
            return r4
        L32:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r0 = r6.A00
            X.1Ms r2 = X.AbstractC167017dG.A0c(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r7}
            java.lang.String r0 = "live/%s/like_comment/"
            X.AbstractC31173DnH.A1Q(r2, r0, r1)
            java.lang.String r0 = "comment_id"
            r2.A9s(r0, r8)
            X.1ON r1 = X.MSZ.A0U(r2)
            r5.A00 = r3
            r0 = 2134169783(0x7f34d8b7, float:2.4038629E38)
            java.lang.Object r0 = r1.A00(r0, r5)
            if (r0 != r4) goto L24
            return r4
        L59:
            X.PXB r5 = X.PXB.A00(r6, r9, r3)
            goto L16
        L5e:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L63:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.datasource.api.IgLiveCommentsApi.A02(java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(java.lang.String r7, java.lang.String r8, X.InterfaceC23621Ds r9) {
        /*
            r6 = this;
            r3 = 36
            boolean r0 = X.PXB.A03(r9, r3)
            if (r0 == 0) goto L59
            r5 = r9
            X.PXB r5 = (X.PXB) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L59
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r0 = r5.A01
            X.1JX r4 = X.C1JX.A02
            int r1 = r5.A00
            r3 = 1
            if (r1 == 0) goto L32
            if (r1 != r3) goto L63
            X.AbstractC09560e7.A00(r0)
        L24:
            r4 = r0
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L31
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto L5e
            X.8jk r4 = X.AbstractC25227BEk.A0h()
        L31:
            return r4
        L32:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r0 = r6.A00
            X.1Ms r2 = X.AbstractC167017dG.A0c(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r7}
            java.lang.String r0 = "live/%s/unlike_comment/"
            X.AbstractC31173DnH.A1Q(r2, r0, r1)
            java.lang.String r0 = "comment_id"
            r2.A9s(r0, r8)
            X.1ON r1 = X.MSZ.A0U(r2)
            r5.A00 = r3
            r0 = 690680456(0x292af288, float:3.7957945E-14)
            java.lang.Object r0 = r1.A00(r0, r5)
            if (r0 != r4) goto L24
            return r4
        L59:
            X.PXB r5 = X.PXB.A00(r6, r9, r3)
            goto L16
        L5e:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L63:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.datasource.api.IgLiveCommentsApi.A03(java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(java.lang.String r6, java.lang.String r7, X.InterfaceC23621Ds r8) {
        /*
            r5 = this;
            r3 = 38
            boolean r0 = X.PXB.A03(r8, r3)
            if (r0 == 0) goto L49
            r4 = r8
            X.PXB r4 = (X.PXB) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L49
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r0 = r4.A01
            X.1JX r3 = X.C1JX.A02
            int r1 = r4.A00
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L53
            X.AbstractC09560e7.A00(r0)
        L24:
            r3 = r0
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L31
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto L4e
            X.8jk r3 = X.AbstractC25227BEk.A0h()
        L31:
            return r3
        L32:
            X.AbstractC09560e7.A00(r0)
            java.lang.Integer r1 = X.C05F.A00
            com.instagram.common.session.UserSession r0 = r5.A00
            X.1ON r1 = X.AbstractC55182Odn.A04(r0, r1, r6, r7)
            r4.A00 = r2
            r0 = 1970159703(0x756e4057, float:3.0201944E32)
            java.lang.Object r0 = r1.A00(r0, r4)
            if (r0 != r3) goto L24
            return r3
        L49:
            X.PXB r4 = X.PXB.A00(r5, r8, r3)
            goto L16
        L4e:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L53:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.datasource.api.IgLiveCommentsApi.A04(java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A05(java.lang.String r8, java.lang.String r9, X.InterfaceC23621Ds r10, long r11) {
        /*
            r7 = this;
            r4 = 35
            boolean r0 = X.PXB.A03(r10, r4)
            if (r0 == 0) goto L6f
            r2 = r10
            X.PXB r2 = (X.PXB) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L6f
            int r3 = r3 - r1
            r2.A00 = r3
        L16:
            java.lang.Object r0 = r2.A01
            X.1JX r3 = X.C1JX.A02
            int r1 = r2.A00
            r4 = 1
            if (r1 == 0) goto L32
            if (r1 != r4) goto L79
            X.AbstractC09560e7.A00(r0)
        L24:
            r3 = r0
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L31
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto L74
            X.8jk r3 = X.AbstractC25227BEk.A0h()
        L31:
            return r3
        L32:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r1 = r7.A00
            r0 = 2
            X.C14360o3.A0B(r9, r0)
            r6 = 0
            X.1Ms r5 = X.AbstractC167017dG.A0c(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r9}
            java.lang.String r0 = "live/%s/pin_comment/"
            X.AbstractC31173DnH.A1Q(r5, r0, r1)
            long r0 = X.AbstractC166987dD.A0L(r11)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "offset_to_video_start"
            r5.A9s(r0, r1)
            java.lang.Class<X.1ul> r1 = X.C40781ul.class
            java.lang.Class<X.2hA> r0 = X.C55702hA.class
            r5.A0P(r6, r1, r0, r4)
            java.lang.String r0 = "comment_id"
            X.1ON r1 = X.MSY.A0I(r5, r0, r8)
            r2.A00 = r4
            r0 = 449846751(0x1ad01ddf, float:8.607504E-23)
            java.lang.Object r0 = r1.A00(r0, r2)
            if (r0 != r3) goto L24
            return r3
        L6f:
            X.PXB r2 = X.PXB.A00(r7, r10, r4)
            goto L16
        L74:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L79:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.datasource.api.IgLiveCommentsApi.A05(java.lang.String, java.lang.String, X.1Ds, long):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A06(java.lang.String r8, java.lang.String r9, X.InterfaceC23621Ds r10, long r11) {
        /*
            r7 = this;
            r4 = 37
            boolean r0 = X.PXB.A03(r10, r4)
            if (r0 == 0) goto L6f
            r2 = r10
            X.PXB r2 = (X.PXB) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L6f
            int r3 = r3 - r1
            r2.A00 = r3
        L16:
            java.lang.Object r0 = r2.A01
            X.1JX r3 = X.C1JX.A02
            int r1 = r2.A00
            r4 = 1
            if (r1 == 0) goto L32
            if (r1 != r4) goto L79
            X.AbstractC09560e7.A00(r0)
        L24:
            r3 = r0
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L31
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto L74
            X.8jk r3 = X.AbstractC25227BEk.A0h()
        L31:
            return r3
        L32:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r1 = r7.A00
            r0 = 2
            X.C14360o3.A0B(r9, r0)
            r6 = 0
            X.1Ms r5 = X.AbstractC167017dG.A0c(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r9}
            java.lang.String r0 = "live/%s/unpin_comment/"
            X.AbstractC31173DnH.A1Q(r5, r0, r1)
            long r0 = X.AbstractC166987dD.A0L(r11)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "offset_to_video_start"
            r5.A9s(r0, r1)
            java.lang.Class<X.1ul> r1 = X.C40781ul.class
            java.lang.Class<X.2hA> r0 = X.C55702hA.class
            r5.A0P(r6, r1, r0, r4)
            java.lang.String r0 = "comment_id"
            X.1ON r1 = X.MSY.A0I(r5, r0, r8)
            r2.A00 = r4
            r0 = 487759932(0x1d12a03c, float:1.9405778E-21)
            java.lang.Object r0 = r1.A00(r0, r2)
            if (r0 != r3) goto L24
            return r3
        L6f:
            X.PXB r2 = X.PXB.A00(r7, r10, r4)
            goto L16
        L74:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L79:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.datasource.api.IgLiveCommentsApi.A06(java.lang.String, java.lang.String, X.1Ds, long):java.lang.Object");
    }

    public IgLiveCommentsApi(UserSession userSession) {
        this.A00 = userSession;
    }
}
