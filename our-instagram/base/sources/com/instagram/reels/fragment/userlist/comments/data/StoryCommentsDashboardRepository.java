package com.instagram.reels.fragment.userlist.comments.data;

import X.O42;

/* loaded from: classes9.dex */
public final class StoryCommentsDashboardRepository {
    public final O42 A00;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(java.lang.String r7, java.lang.String r8, X.InterfaceC23621Ds r9) {
        /*
            r6 = this;
            r5 = 0
            r4 = 11
            boolean r0 = X.PXD.A03(r9, r4)
            if (r0 == 0) goto L69
            r3 = r9
            X.PXD r3 = (X.PXD) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L69
            int r2 = r2 - r1
            r3.A00 = r2
        L17:
            java.lang.Object r0 = r3.A01
            X.1JX r4 = X.C1JX.A02
            int r2 = r3.A00
            r1 = 1
            if (r2 == 0) goto L33
            if (r2 != r1) goto L73
            X.AbstractC09560e7.A00(r0)
        L25:
            r4 = r0
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L32
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto L6e
            X.8jk r4 = X.AbstractC25227BEk.A0h()
        L32:
            return r4
        L33:
            X.AbstractC09560e7.A00(r0)
            X.O42 r0 = r6.A00
            r3.A00 = r1
            com.instagram.common.session.UserSession r1 = r0.A00
            r0 = 0
            X.1Ms r2 = X.AbstractC31177DnL.A0M(r1)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = "media/story_comment/fetch/"
            X.AbstractC31173DnH.A1Q(r2, r0, r1)
            java.lang.Class<X.N2X> r1 = X.N2X.class
            java.lang.Class<X.OPm> r0 = X.C54891OPm.class
            r2.A0R(r1, r0)
            java.lang.String r0 = "media_id"
            r2.A9s(r0, r7)
            java.lang.String r0 = "min_id"
            r2.A9s(r0, r8)
            java.lang.String r0 = "max_id"
            X.1ON r1 = X.AbstractC31172DnG.A0T(r2, r0, r5)
            r0 = 766426260(0x2daebc94, float:1.9865255E-11)
            java.lang.Object r0 = r1.A00(r0, r3)
            if (r0 != r4) goto L25
            return r4
        L69:
            X.PXD r3 = X.PXD.A00(r6, r9, r4)
            goto L17
        L6e:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L73:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.reels.fragment.userlist.comments.data.StoryCommentsDashboardRepository.A01(java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(java.lang.String r7, java.lang.String r8, X.InterfaceC23621Ds r9) {
        /*
            r6 = this;
            r4 = 10
            boolean r0 = X.PXD.A03(r9, r4)
            if (r0 == 0) goto L64
            r3 = r9
            X.PXD r3 = (X.PXD) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L64
            int r2 = r2 - r1
            r3.A00 = r2
        L16:
            java.lang.Object r0 = r3.A01
            X.1JX r4 = X.C1JX.A02
            int r1 = r3.A00
            r5 = 1
            if (r1 == 0) goto L32
            if (r1 != r5) goto L6e
            X.AbstractC09560e7.A00(r0)
        L24:
            r4 = r0
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L31
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto L69
            X.8jk r4 = X.AbstractC25227BEk.A0h()
        L31:
            return r4
        L32:
            X.AbstractC09560e7.A00(r0)
            X.O42 r0 = r6.A00
            r3.A00 = r5
            com.instagram.common.session.UserSession r0 = r0.A00
            X.1Ms r2 = X.AbstractC31177DnL.A0M(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r7}
            java.lang.String r0 = "hidden_comments/%s/hidden_comments/"
            r2.A0L(r0, r1)
            java.lang.Class<X.N33> r1 = X.N33.class
            java.lang.Class<X.OOL> r0 = X.OOL.class
            r2.A0R(r1, r0)
            java.lang.String r0 = "directly_hidden_only"
            r2.A0D(r0, r5)
            java.lang.String r0 = "next_min_id"
            X.1ON r1 = X.AbstractC31172DnG.A0T(r2, r0, r8)
            r0 = 1130747822(0x4365d7ae, float:229.8425)
            java.lang.Object r0 = r1.A00(r0, r3)
            if (r0 != r4) goto L24
            return r4
        L64:
            X.PXD r3 = X.PXD.A00(r6, r9, r4)
            goto L16
        L69:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L6e:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.reels.fragment.userlist.comments.data.StoryCommentsDashboardRepository.A00(java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    public StoryCommentsDashboardRepository(O42 o42) {
        this.A00 = o42;
    }
}
