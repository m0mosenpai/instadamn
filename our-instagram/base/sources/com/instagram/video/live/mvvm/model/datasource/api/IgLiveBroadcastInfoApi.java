package com.instagram.video.live.mvvm.model.datasource.api;

import com.instagram.common.session.UserSession;

/* loaded from: classes3.dex */
public final class IgLiveBroadcastInfoApi {
    public final UserSession A00;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(java.lang.String r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r5 = 0
            r3 = 26
            boolean r0 = X.PXB.A03(r8, r3)
            if (r0 == 0) goto L4b
            r4 = r8
            X.PXB r4 = (X.PXB) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4b
            int r2 = r2 - r1
            r4.A00 = r2
        L17:
            java.lang.Object r0 = r4.A01
            X.1JX r3 = X.C1JX.A02
            int r1 = r4.A00
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L59
            X.AbstractC09560e7.A00(r0)
        L25:
            r3 = r0
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L35
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto L53
            X.0eB r0 = X.C0eB.A00
            X.8jk r3 = new X.8jk
            r3.<init>(r0)
        L35:
            return r3
        L36:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r0 = r6.A00
            X.1ON r1 = X.AbstractC55182Odn.A05(r0, r7, r5)
            r4.A00 = r2
            r0 = 1226062008(0x491438b8, float:607115.5)
            java.lang.Object r0 = r1.A00(r0, r4)
            if (r0 != r3) goto L25
            return r3
        L4b:
            r0 = 42
            X.PXB r4 = new X.PXB
            r4.<init>(r6, r8, r3, r0)
            goto L17
        L53:
            X.B4Z r1 = new X.B4Z
            r1.<init>()
            throw r1
        L59:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.datasource.api.IgLiveBroadcastInfoApi.A00(java.lang.String, X.1Ds):java.lang.Object");
    }

    public IgLiveBroadcastInfoApi(UserSession userSession) {
        this.A00 = userSession;
    }
}
