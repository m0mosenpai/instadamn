package com.instagram.brandedcontent.disclosure;

import X.C2GS;
import X.C2GT;
import X.MSW;
import com.instagram.brandedcontent.ads.repository.BrandedContentAdsApi;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class BrandedContentDisclosureViewModel extends BrandedContentDisclosureBaseViewModel {
    public final C2GT A00;
    public final C2GS A01;
    public final UserSession A02;
    public final BrandedContentAdsApi A03;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A09(java.lang.String r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r3 = 11
            boolean r0 = X.MAG.A01(r8, r3)
            if (r0 == 0) goto L77
            r5 = r8
            X.MAG r5 = (X.MAG) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L77
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A02
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L5d
            if (r0 != r3) goto L82
            java.lang.Object r4 = r5.A01
            X.2bZ r4 = (X.AbstractC52922bZ) r4
            X.AbstractC09560e7.A00(r1)
        L28:
            boolean r0 = r1 instanceof X.C3NX
            r3 = 0
            if (r0 == 0) goto L54
            X.6aw r2 = X.AbstractC141776au.A00(r4)
            r1 = 21
            X.MC3 r0 = new X.MC3
            r0.<init>(r4, r3, r1)
            X.1Dx r0 = X.AbstractC25226BEj.A1L(r0, r2)
            X.3NX r1 = X.AbstractC25225BEi.A0z(r0)
        L40:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto L51
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto L7d
            X.6aw r1 = X.AbstractC141776au.A00(r4)
            r0 = 22
            X.MSY.A1M(r4, r1, r0)
        L51:
            X.0eB r4 = X.C0eB.A00
        L53:
            return r4
        L54:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L40
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L5d:
            X.AbstractC09560e7.A00(r1)
            com.instagram.common.session.UserSession r0 = r6.A02
            com.instagram.brandedcontent.repository.BrandedContentApi r2 = new com.instagram.brandedcontent.repository.BrandedContentApi
            r2.<init>(r0)
            java.util.List r1 = r6.A07
            java.util.List r0 = r6.A06
            r5.A01 = r6
            r5.A00 = r3
            java.lang.Object r1 = r2.A04(r7, r1, r0, r5)
            if (r1 == r4) goto L53
            r4 = r6
            goto L28
        L77:
            X.MAG r5 = new X.MAG
            r5.<init>(r6, r8, r3)
            goto L16
        L7d:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L82:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.disclosure.BrandedContentDisclosureViewModel.A09(java.lang.String, X.1Ds):java.lang.Object");
    }

    public BrandedContentDisclosureViewModel(BrandedContentAdsApi brandedContentAdsApi, UserSession userSession) {
        super(brandedContentAdsApi, userSession);
        this.A02 = userSession;
        this.A03 = brandedContentAdsApi;
        C2GS A0E = MSW.A0E();
        this.A01 = A0E;
        this.A00 = A0E;
    }
}
