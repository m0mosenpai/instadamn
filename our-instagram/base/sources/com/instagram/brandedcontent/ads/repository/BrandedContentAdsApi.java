package com.instagram.brandedcontent.ads.repository;

import X.AbstractC40691uc;
import X.C14360o3;
import X.C40701ud;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class BrandedContentAdsApi {
    public final UserSession A00;
    public final C40701ud A01;

    public BrandedContentAdsApi(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = AbstractC40691uc.A01(userSession);
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
            r4 = 43
            boolean r0 = X.MAR.A03(r8, r4)
            if (r0 == 0) goto L6d
            r2 = r8
            X.MAR r2 = (X.MAR) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L6d
            int r3 = r3 - r1
            r2.A00 = r3
        L16:
            java.lang.Object r0 = r2.A01
            X.1JX r3 = X.C1JX.A02
            int r1 = r2.A00
            r4 = 1
            if (r1 == 0) goto L32
            if (r1 != r4) goto L77
            X.AbstractC09560e7.A00(r0)
        L24:
            r3 = r0
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L31
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto L72
            X.8jk r3 = X.AbstractC25227BEk.A0h()
        L31:
            return r3
        L32:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r0 = r6.A00
            r1 = 0
            X.1Ms r5 = X.AbstractC167017dG.A0c(r0)
            java.lang.String r0 = "business/branded_content/create_ads_boost_post_access_token/"
            r5.A0B(r0)
            java.lang.String r0 = "_"
            java.util.List r0 = X.AbstractC167007dF.A0m(r7, r0, r1)
            java.lang.Object r1 = X.AbstractC001800i.A0J(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "media_id"
            r5.A9s(r0, r1)
            java.lang.String r1 = "not_expire"
            java.lang.String r0 = "true"
            r5.A9s(r1, r0)
            java.lang.Class<X.H9E> r1 = X.H9E.class
            java.lang.Class<X.INi> r0 = X.C41242INi.class
            X.1ON r1 = X.AbstractC25227BEk.A0e(r5, r1, r0)
            r2.A00 = r4
            r0 = 973297876(0x3a0358d4, float:5.01049E-4)
            java.lang.Object r0 = r1.A00(r0, r2)
            if (r0 != r3) goto L24
            return r3
        L6d:
            X.MAR r2 = X.MAR.A01(r6, r8, r4)
            goto L16
        L72:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L77:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.ads.repository.BrandedContentAdsApi.A00(java.lang.String, X.1Ds):java.lang.Object");
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
            r3 = 44
            boolean r0 = X.MAR.A03(r8, r3)
            if (r0 == 0) goto L5d
            r5 = r8
            X.MAR r5 = (X.MAR) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5d
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r0 = r5.A01
            X.1JX r4 = X.C1JX.A02
            int r1 = r5.A00
            r3 = 1
            if (r1 == 0) goto L32
            if (r1 != r3) goto L67
            X.AbstractC09560e7.A00(r0)
        L24:
            r4 = r0
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L31
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto L62
            X.8jk r4 = X.AbstractC25227BEk.A0h()
        L31:
            return r4
        L32:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r0 = r6.A00
            X.1Ms r2 = X.AbstractC167017dG.A0c(r0)
            java.lang.String r0 = "business/branded_content/invalidate_ads_boost_post_access_token/"
            r2.A0B(r0)
            r0 = 3825(0xef1, float:5.36E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r2.A9s(r0, r7)
            java.lang.Class<X.E9y> r1 = X.C32125E9y.class
            java.lang.Class<X.FS6> r0 = X.FS6.class
            X.1ON r1 = X.AbstractC25227BEk.A0e(r2, r1, r0)
            r5.A00 = r3
            r0 = 2122953482(0x7e89b30a, float:9.151693E37)
            java.lang.Object r0 = r1.A00(r0, r5)
            if (r0 != r4) goto L24
            return r4
        L5d:
            X.MAR r5 = X.MAR.A01(r6, r8, r3)
            goto L16
        L62:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L67:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.ads.repository.BrandedContentAdsApi.A01(java.lang.String, X.1Ds):java.lang.Object");
    }
}
