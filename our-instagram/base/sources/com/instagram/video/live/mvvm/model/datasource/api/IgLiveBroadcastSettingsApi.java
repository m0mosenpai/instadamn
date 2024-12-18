package com.instagram.video.live.mvvm.model.datasource.api;

import X.C14360o3;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class IgLiveBroadcastSettingsApi {
    public final UserSession A00;

    public IgLiveBroadcastSettingsApi(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(com.instagram.api.schemas.IGLiveBadgeSettings r8, java.lang.String r9, X.InterfaceC23621Ds r10) {
        /*
            r7 = this;
            r3 = 30
            boolean r0 = X.PXB.A03(r10, r3)
            if (r0 == 0) goto L63
            r4 = r10
            X.PXB r4 = (X.PXB) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L63
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r0 = r4.A01
            X.1JX r5 = X.C1JX.A02
            int r1 = r4.A00
            r6 = 1
            if (r1 == 0) goto L32
            if (r1 != r6) goto L6d
            X.AbstractC09560e7.A00(r0)
        L24:
            r5 = r0
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L31
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto L68
            X.8jk r5 = X.AbstractC25227BEk.A0h()
        L31:
            return r5
        L32:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r0 = r7.A00
            X.AbstractC167007dF.A1D(r9, r6, r8)
            r3 = 0
            X.1Ms r2 = X.AbstractC167017dG.A0c(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r9}
            java.lang.String r0 = "live/%s/badge_setting/"
            r2.A0L(r0, r1)
            java.lang.String r1 = r8.A00
            java.lang.String r0 = "badge_setting"
            r2.A9s(r0, r1)
            java.lang.Class<X.N2q> r1 = X.C52090N2q.class
            java.lang.Class<X.OQQ> r0 = X.OQQ.class
            X.1ON r1 = X.AbstractC31172DnG.A0R(r3, r2, r1, r0, r6)
            r4.A00 = r6
            r0 = 273469749(0x104cd135, float:4.0393073E-29)
            java.lang.Object r0 = r1.A00(r0, r4)
            if (r0 != r5) goto L24
            return r5
        L63:
            X.PXB r4 = X.PXB.A00(r7, r10, r3)
            goto L16
        L68:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L6d:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.datasource.api.IgLiveBroadcastSettingsApi.A00(com.instagram.api.schemas.IGLiveBadgeSettings, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(java.lang.String r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r3 = 27
            boolean r0 = X.PXB.A03(r8, r3)
            if (r0 == 0) goto L58
            r5 = r8
            X.PXB r5 = (X.PXB) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L58
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r0 = r5.A01
            X.1JX r4 = X.C1JX.A02
            int r1 = r5.A00
            r3 = 1
            if (r1 == 0) goto L32
            if (r1 != r3) goto L62
            X.AbstractC09560e7.A00(r0)
        L24:
            r4 = r0
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L31
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto L5d
            X.8jk r4 = X.AbstractC25227BEk.A0h()
        L31:
            return r4
        L32:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r1 = r6.A00
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            X.1Ms r2 = X.AbstractC167017dG.A0c(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r7}
            java.lang.String r0 = "live/%s/disable_request_to_join/"
            r2.A0L(r0, r1)
            X.1ON r1 = X.MSZ.A0U(r2)
            r5.A00 = r3
            r0 = 359598489(0x156f0999, float:4.8273237E-26)
            java.lang.Object r0 = r1.A00(r0, r5)
            if (r0 != r4) goto L24
            return r4
        L58:
            X.PXB r5 = X.PXB.A00(r6, r8, r3)
            goto L16
        L5d:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L62:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.datasource.api.IgLiveBroadcastSettingsApi.A01(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(java.lang.String r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r3 = 28
            boolean r0 = X.PXB.A03(r8, r3)
            if (r0 == 0) goto L58
            r5 = r8
            X.PXB r5 = (X.PXB) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L58
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r0 = r5.A01
            X.1JX r4 = X.C1JX.A02
            int r1 = r5.A00
            r3 = 1
            if (r1 == 0) goto L32
            if (r1 != r3) goto L62
            X.AbstractC09560e7.A00(r0)
        L24:
            r4 = r0
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L31
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto L5d
            X.8jk r4 = X.AbstractC25227BEk.A0h()
        L31:
            return r4
        L32:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r1 = r6.A00
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            X.1Ms r2 = X.AbstractC167017dG.A0c(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r7}
            java.lang.String r0 = "live/%s/enable_request_to_join/"
            r2.A0L(r0, r1)
            X.1ON r1 = X.MSZ.A0U(r2)
            r5.A00 = r3
            r0 = 631325602(0x25a143a2, float:2.7974878E-16)
            java.lang.Object r0 = r1.A00(r0, r5)
            if (r0 != r4) goto L24
            return r4
        L58:
            X.PXB r5 = X.PXB.A00(r6, r8, r3)
            goto L16
        L5d:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L62:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.datasource.api.IgLiveBroadcastSettingsApi.A02(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(java.lang.String r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r3 = 29
            boolean r0 = X.PXB.A03(r8, r3)
            if (r0 == 0) goto L57
            r5 = r8
            X.PXB r5 = (X.PXB) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L57
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r0 = r5.A01
            X.1JX r4 = X.C1JX.A02
            int r1 = r5.A00
            r3 = 1
            if (r1 == 0) goto L32
            if (r1 != r3) goto L61
            X.AbstractC09560e7.A00(r0)
        L24:
            r4 = r0
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L31
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto L5c
            X.8jk r4 = X.AbstractC25227BEk.A0h()
        L31:
            return r4
        L32:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r0 = r6.A00
            X.C14360o3.A0B(r7, r3)
            X.1Ms r2 = X.AbstractC167017dG.A0c(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r7}
            java.lang.String r0 = "live/%s/mute_comment/"
            r2.A0L(r0, r1)
            X.1ON r1 = X.MSZ.A0U(r2)
            r5.A00 = r3
            r0 = 1602984266(0x5f8b994a, float:2.0118305E19)
            java.lang.Object r0 = r1.A00(r0, r5)
            if (r0 != r4) goto L24
            return r4
        L57:
            X.PXB r5 = X.PXB.A00(r6, r8, r3)
            goto L16
        L5c:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L61:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.datasource.api.IgLiveBroadcastSettingsApi.A03(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(java.lang.String r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r3 = 31
            boolean r0 = X.PXB.A03(r8, r3)
            if (r0 == 0) goto L57
            r5 = r8
            X.PXB r5 = (X.PXB) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L57
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r0 = r5.A01
            X.1JX r4 = X.C1JX.A02
            int r1 = r5.A00
            r3 = 1
            if (r1 == 0) goto L32
            if (r1 != r3) goto L61
            X.AbstractC09560e7.A00(r0)
        L24:
            r4 = r0
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L31
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto L5c
            X.8jk r4 = X.AbstractC25227BEk.A0h()
        L31:
            return r4
        L32:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r0 = r6.A00
            X.C14360o3.A0B(r7, r3)
            X.1Ms r2 = X.AbstractC167017dG.A0c(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r7}
            java.lang.String r0 = "live/%s/unmute_comment/"
            r2.A0L(r0, r1)
            X.1ON r1 = X.MSZ.A0U(r2)
            r5.A00 = r3
            r0 = 711825661(0x2a6d98fd, float:2.1102907E-13)
            java.lang.Object r0 = r1.A00(r0, r5)
            if (r0 != r4) goto L24
            return r4
        L57:
            X.PXB r5 = X.PXB.A00(r6, r8, r3)
            goto L16
        L5c:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L61:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.datasource.api.IgLiveBroadcastSettingsApi.A04(java.lang.String, X.1Ds):java.lang.Object");
    }
}
