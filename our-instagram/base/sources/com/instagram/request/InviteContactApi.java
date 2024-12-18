package com.instagram.request;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class InviteContactApi {
    public final UserSession A00;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.InterfaceC23621Ds r9, boolean r10) {
        /*
            r8 = this;
            r3 = 32
            boolean r0 = X.PXD.A03(r9, r3)
            if (r0 == 0) goto L65
            r6 = r9
            X.PXD r6 = (X.PXD) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L65
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r1 = r6.A01
            X.1JX r7 = X.C1JX.A02
            int r0 = r6.A00
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L3d
            if (r0 != r5) goto L77
            X.AbstractC09560e7.A00(r1)
        L25:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L6d
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r0 = r1.A00
            X.EAc r0 = (X.C32129EAc) r0
            X.Gaw r4 = r0.A00
            if (r4 != 0) goto L76
            X.AbstractC31171DnF.A0w()
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L3d:
            X.AbstractC09560e7.A00(r1)
            com.instagram.common.session.UserSession r0 = r8.A00
            X.1Ms r3 = X.AbstractC31177DnL.A0M(r0)
            java.lang.String r0 = "address_book/get_user_cps_for_invite/"
            r3.A0B(r0)
            java.lang.String r0 = "is_first_fetch"
            r3.A0I(r0, r10)
            java.lang.Class<X.EAc> r2 = X.C32129EAc.class
            java.lang.Class<X.FSY> r1 = X.FSY.class
            r0 = 0
            X.1ON r1 = X.AbstractC31172DnG.A0R(r4, r3, r2, r1, r0)
            r6.A00 = r5
            r0 = 1271648771(0x4bcbd203, float:2.6715142E7)
            java.lang.Object r1 = r1.A00(r0, r6)
            if (r1 != r7) goto L25
            return r7
        L65:
            r0 = 42
            X.PXD r6 = new X.PXD
            r6.<init>(r8, r9, r3, r0)
            goto L16
        L6d:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L76
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L76:
            return r4
        L77:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.request.InviteContactApi.A00(X.1Ds, boolean):java.lang.Object");
    }

    public InviteContactApi(UserSession userSession) {
        this.A00 = userSession;
    }
}
