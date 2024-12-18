package com.instagram.video.live.mvvm.model.datasource.api;

import X.C14360o3;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class IgLiveJoinRequestsApi {
    public final UserSession A00;

    public IgLiveJoinRequestsApi(UserSession userSession) {
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
    public final java.lang.Object A00(java.lang.String r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r3 = 42
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
            com.instagram.common.session.UserSession r1 = r6.A00
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            X.1Ms r2 = X.AbstractC167017dG.A0c(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r7}
            java.lang.String r0 = "live/%s/cancel_request_to_join/"
            r2.A0L(r0, r1)
            X.1ON r1 = X.MSZ.A0U(r2)
            r5.A00 = r3
            r0 = 1111374943(0x423e3c5f, float:47.558956)
            java.lang.Object r0 = r1.A00(r0, r5)
            if (r0 != r4) goto L24
            return r4
        L58:
            X.PXB r5 = new X.PXB
            r5.<init>(r6, r8, r3, r3)
            goto L16
        L5e:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L63:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.datasource.api.IgLiveJoinRequestsApi.A00(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(java.lang.String r10, X.InterfaceC23621Ds r11, int r12, long r13) {
        /*
            r9 = this;
            r7 = 0
            r4 = 43
            boolean r0 = X.PXB.A03(r11, r4)
            if (r0 == 0) goto L79
            r2 = r11
            X.PXB r2 = (X.PXB) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L79
            int r3 = r3 - r1
            r2.A00 = r3
        L18:
            java.lang.Object r0 = r2.A01
            X.1JX r3 = X.C1JX.A02
            int r1 = r2.A00
            r4 = 1
            if (r1 == 0) goto L34
            if (r1 != r4) goto L83
            X.AbstractC09560e7.A00(r0)
        L26:
            r3 = r0
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L33
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto L7e
            X.8jk r3 = X.AbstractC25227BEk.A0h()
        L33:
            return r3
        L34:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r0 = r9.A00
            X.C14360o3.A0B(r10, r4)
            r6 = 0
            X.1Ms r5 = X.AbstractC31177DnL.A0M(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r10}
            java.lang.String r0 = "live/%s/get_join_request_counts/"
            r5.A0L(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r13)
            java.lang.String r0 = "last_fetch_ts"
            r5.A9s(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r12)
            java.lang.String r0 = "last_total_count"
            r5.A9s(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r7)
            java.lang.String r0 = "last_seen_ts"
            r5.A9s(r0, r1)
            java.lang.Class<X.N3B> r1 = X.N3B.class
            java.lang.Class<X.OQM> r0 = X.OQM.class
            X.1ON r1 = X.AbstractC31172DnG.A0R(r6, r5, r1, r0, r4)
            r2.A00 = r4
            r0 = 999437006(0x3b9232ce, float:0.004461623)
            java.lang.Object r0 = r1.A00(r0, r2)
            if (r0 != r3) goto L26
            return r3
        L79:
            X.PXB r2 = X.PXB.A00(r9, r11, r4)
            goto L18
        L7e:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L83:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.datasource.api.IgLiveJoinRequestsApi.A01(java.lang.String, X.1Ds, int, long):java.lang.Object");
    }
}
